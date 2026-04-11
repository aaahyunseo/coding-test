import java.util.*;
import java.io.*;

public class Main {
    static char[][] map;
    static boolean[][][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int N, M;
    static int answer;

    static class Node {
        int x, y, key, dist;

        Node(int x, int y, int key, int dist) {
            this.x = x;
            this.y = y;
            this.key = key;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        visited = new boolean[N][M][64];

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == '0') {
                    answer = BFS(i, j);
                }
            }
        }

        System.out.println(answer);
    }

    public static int BFS(int x, int y) {
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(x, y, 0, 0));
        visited[x][y][0] = true;

        while(!q.isEmpty()) {
            Node cur = q.poll();

            if(map[cur.x][cur.y] == '1') return cur.dist;

            for(int i=0; i<4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                int key = cur.key;

                if(nx<0 || ny<0 || nx>=N || ny>=M) continue;

                char next = map[nx][ny];

                if(next == '#') continue;
                if(next >= 'a' && next <= 'f') {
                    key |= (1 << (next - 'a'));
                }
                if(next >= 'A' && next <='F') {
                    if((key & (1 << (next - 'A'))) == 0) continue;
                }
                if(visited[nx][ny][key]) continue;

                visited[nx][ny][key] = true;
                q.add(new Node(nx, ny, key, cur.dist+1));
            }
        }

        return -1;
    }
}