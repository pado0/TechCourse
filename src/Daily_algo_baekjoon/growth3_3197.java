package Daily_algo_baekjoon;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//BFS
public class growth3_3197 {
    static char[][] map = new char[1502][1502];
    static int[][] bird = new int[2][2];
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int R, C;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        scanner.nextLine();
        int x = 0, y = 0;

        for (int i = 1; i <= R; i++) {
            String s = scanner.nextLine();

            for (int j = 1; j <= C; j++) {
                map[i][j] = s.charAt(j-1);
                // 0. 백조를 넣고
                if(map[i][j] == 'L') {
                    map[i][j] = '.';
                    bird[x][y++] = i;
                    bird[x++][y--] = j;
                }

            }
        }

        boolean isIce = true;
        int sol = 0;
        while(isIce) {

            // 1. 백조끼리 만날 수 있는지 확인
            int chk = bfs();
            //System.out.println("chk = " + chk);
            if(chk != -1 ) break;
            // 2. 빙하를 녹이고
            isIce = melt();
            sol++;
        }

        System.out.println(sol);
    }
    static boolean melt() {
        boolean isIcd = false;

        int[][] flag = new int[1502][1502];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (map[i][j] == 'X') {
                    for (int t = 0; t < 4; t++) {
                        int tx = i + dx[t];
                        int ty = j + dy[t];
                        if (tx <= 0 || ty <= 0 || tx > R || ty > C) continue;
                        if (map[tx][ty] == '.') {
                            isIcd = true;
                            flag[i][j] = 1; continue;
                        }
                    }
                }
            }
        }

        if(isIcd == false) return false;
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if(flag[i][j] == 1) map[i][j] = '.';
            }
        }
//        for (int i = 1; i <= R; i++) {
//            for (int j = 1; j <= C; j++) {
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }
        return true;
    }

    // todo : 빙하에 막히면 막힌 빙하부터 다시 탐색할 수 있도록 조치.
    static int bfs(){
        int count = 0;
        char[][] flag = new char[1502][1502];
        Queue<Integer> q = new LinkedList<>();

        q.add(count);
        q.add(bird[0][0]);
        q.add(bird[0][1]);
        flag[bird[0][0]][bird[0][1]] = 1;

        while (!q.isEmpty()) {
            int c = q.poll();
            int x = q.poll();
            int y = q.poll();
            //System.out.println("x = " + x +"  y = " + y +"   c = " + c);

            // 백조 찾으면 c를 리턴
            if(x == bird[1][0] && y == bird[1][1]) return c;


            for (int t = 0; t < 4; t++) {
                int tx = x + dx[t];
                int ty = y + dy[t];
                if(tx<= 0 || ty <= 0 || tx > R || ty > C) continue;
                if (map[tx][ty] == '.' && flag[tx][ty] == 0) {
                    flag[tx][ty] = 1;
                    q.add(++c);
                    q.add(tx);
                    q.add(ty);
                }
            }
        }

        return -1;
    }
}
