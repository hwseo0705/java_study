package datastructure.chapter11;

// 인접행렬 방식 그래프 구현 : adjacency matrix
public class GraphMatrix {

    // 최대 정점 개수
    public static final int MAX = 50;

    // 그래프의 인접방향을 저장할 인접 행렬
    private int[][] adjMatrix;

    // 정점들을 모아둘 배열
    private Vertex[] vertices;

    // 현재 그래프에 저장되어 있는 정점의 수
    private int numOfVertices;

    public GraphMatrix() {
        adjMatrix = new int[MAX][MAX];
        vertices = new Vertex[MAX];
        numOfVertices = 0;
    }

    // 그래프에 정점을 추가하는 메서드
    public void addVertex(Vertex v) {

        // 정점 객체에 id부여 -부터 순차적 증가
        v.setId(numOfVertices);

        // 정점 배열에 추가
        vertices[numOfVertices++] = v;
    }

    // 간선 연결하기 (무방향 그래프)
    public void addEdge(Vertex departure, Vertex destination) {

        // 인접 행렬에 연결정보 저장
        adjMatrix[departure.getId()][destination.getId()] = 1;
        adjMatrix[destination.getId()][departure.getId()] = 1;

    }

    // 인접 행렬 출력
    public void showGraph() {
        System.out.print("    ");
        for (int i = 0; i < numOfVertices; i++) {
            System.out.print(vertices[i].getData() + " ");
        }
        System.out.println();

        for (int i = 0; i < numOfVertices; i++) {
            System.out.printf("%s | ", vertices[i].getData());
            for (int j = 0; j < numOfVertices; j++) {
                System.out.printf("%d ", adjMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
