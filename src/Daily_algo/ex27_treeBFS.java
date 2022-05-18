package Daily_algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ex27_treeBFS {
    public static void main(String[] args) {
        Solution_BFS.tree root = new Solution_BFS.tree("1");
        Solution_BFS.tree rootChild1 = root.addChildNode(new Solution_BFS.tree("2"));
        Solution_BFS.tree rootChild2 = root.addChildNode(new Solution_BFS.tree("3"));
        Solution_BFS.tree leaf1 = rootChild1.addChildNode(new Solution_BFS.tree("4"));
        Solution_BFS.tree leaf2 = rootChild1.addChildNode(new Solution_BFS.tree("5"));
        leaf1.addChildNode(new Solution_BFS.tree("6"));
        rootChild2.addChildNode(new Solution_BFS.tree("7"));
        ArrayList<String> output = Solution_BFS.bfs(root);

        System.out.println("output = " + output);
    }

}

class Solution_BFS {
    static Queue<tree> q = new LinkedList<>();
    static ArrayList<String> sol = new ArrayList<>();

    public static ArrayList<String> bfs(tree node) {

        // 입력받은 노드를 트리거로 큐를 시작한다.
        q.offer(node);

        // 큐가 다 비워질 때 (모든것을 순회 했을 때) 까지 반복
        while (!q.isEmpty()) {

            // 큐의 제일 앞에있는 애를 읽어와서, 그 값을 어레이리스트에 넣는다.
            tree n = q.poll();
            sol.add(n.getValue());

            // 앞에있는 애 기준 자식노드를 전부 큐에 넣는다.
            ArrayList<tree> nextNode = n.getChildrenNode();
            if(nextNode != null) {
                for (tree t : nextNode) {
                    q.offer(t);
                }
            }
        }

        return sol;

    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if (children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
