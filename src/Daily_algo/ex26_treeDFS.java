package Daily_algo;

import java.util.ArrayList;

public class ex26_treeDFS {
    public static void main(String[] args) {
        Solution_DFS.tree root = new Solution_DFS.tree("1");
        Solution_DFS.tree rootChild1 = root.addChildNode(new Solution_DFS.tree("2"));
        Solution_DFS.tree rootChild2 = root.addChildNode(new Solution_DFS.tree("3"));
        Solution_DFS.tree leaf1 = rootChild1.addChildNode(new Solution_DFS.tree("4"));
        Solution_DFS.tree leaf2 = rootChild1.addChildNode(new Solution_DFS.tree("5"));
        leaf1.addChildNode(new Solution_DFS.tree("6"));
        rootChild2.addChildNode(new Solution_DFS.tree("7"));
        ArrayList<String> output = Solution_DFS.dfs(root);

        System.out.println("output = " + output);
    }
}


class Solution_DFS {
    public static ArrayList<String> dfs(tree node) {

        ArrayList<String> arrayList = new ArrayList<>();

        // parent 노드를 arrayList에 기록한다.
        arrayList.add(node.getValue());
        ArrayList<tree> treeNode = node.getChildrenNode();

        // 더이상 child가 없으면 쌓은 arrList 리턴처리
        if (treeNode == null) return arrayList;

        // 자식노드별로 순회를 반복하고, 리턴받은 누적 리스트를 합친다.
        for (tree t : treeNode) {
            arrayList.addAll(dfs(t));
        }

        // 합친 리스트를 리턴해서 부모에 보내준다.
        return arrayList;
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
            if(children == null) children = new ArrayList<>();
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

