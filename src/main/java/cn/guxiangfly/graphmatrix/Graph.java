package cn.guxiangfly.graphmatrix;

/**
 * Graph
 *
 * @author guxiang
 * @date 2017/11/12
 */
public class Graph {
    /**顶点的数量*/
    private int vertexSize;

    /** 顶点的数组*/
    private int[] vertexs;

    /**二维矩阵*/
    private int [][] matrix;

    /**是否被遍历过*/
    private boolean[] isVisited;

    /**/
    private final static int MAX_WEIGHT = 1000;


    public Graph(int[][] matrix) {
        this.matrix = matrix;
        this.vertexSize = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            //TODO
            vertexs[i] = i;
        }
    }

    public Graph(int vertexSize) {
        this.vertexSize = vertexSize;
        isVisited = new boolean[vertexSize];
        matrix  = new int[vertexSize][vertexSize];
        vertexs = new int[vertexSize];
        for (int i = 0; i <vertexSize ; i++) {
            vertexs[i] = i;
        }
    }

    public void setVertexs(int[] vertexs) {
        this.vertexs = vertexs;
    }

    /**
     * 获取某个顶点的出度
     * @param index
     * @return
     */
    public int getOutDegree(int index){
        int degree=0;
        for (int i = 0; i <matrix[index].length; i++) {
            int weight = matrix[index][i];
            if (weight!=0&&weight!=MAX_WEIGHT){
                degree++;
            }
        }
        return degree;
    }

    /**
     * 获取某个顶点的入度
     * @param index
     * @return
     */
    public int getInDegree(int index){
        int degree=0;
        for (int i = 0; i <vertexSize; i++) {
            int weight = matrix[i][index];
            if (weight!=0&&weight!=MAX_WEIGHT){
                degree++;
            }
        }
        return degree;
    }

    /**
     * 获取两个顶点的权值
     * @param v1
     * @param v2
     * @return
     */
    public int getWeight(int v1,int v2){
        int weight = matrix[v1][v2];
        return weight == 0?0:(weight==MAX_WEIGHT?-1:weight);
    }

    /**
     * 获取第一个邻接点
     * @param index
     * @return
     */
    public int getFirstNeighbor(int index){

        System.out.println("访问到了："+index);

        for (int i = 0; i <vertexSize; i++) {
            int weight = matrix[index][i];
            if (weight>0 && weight<MAX_WEIGHT){
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据前一个邻接点V2来获取v的下一个邻接点
     * @param v
     * @param v2
     * @return
     */
    public int getNextNeighbor(int v,int v2){
        for (int i = v2+1; i <vertexSize; i++) {
            int weight = matrix[v2][i];
            if (weight>0 && weight<MAX_WEIGHT){
                return i;
            }
        }
        return -1;
    }


    /**
     * 深度优先搜索
     * @param i
     */
    public void DFS(int i){
        isVisited[i]=true;
        int w = getFirstNeighbor(i);
        while (w!=-1){
            if (!isVisited[w]){
              /*  System.out.println("访问到了"+w);*/
                DFS(w);
            }
             w = getNextNeighbor(i, w);
        }
    }

    public void DFS(){
        // 在有向图中需要做此操作， 怕回路无法遍历到， 无向图无需
        isVisited = new boolean[vertexSize];
        for (int i = 0; i < vertexSize; i++) {
            if (!isVisited[i]){
                DFS(i);
            }
        }
        isVisited = new boolean[vertexSize];
    }




    public void broadFirstSearch(){
        isVisited = new boolean[vertexSize];
        for (int i = 0; i <vertexSize; i++) {
            if (!isVisited[i]){
                broadFirstSearch(i);
            }
        }
    }

    private void broadFirstSearch(int i) {
    }


    public static void main(String[] args) {
        Graph graph = new Graph(9);

        int [] a1 = new int[]{0,10,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,11,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT};
        int [] a2 = new int[]{10,0,18,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,16,MAX_WEIGHT,12};
        int [] a3 = new int[]{MAX_WEIGHT,MAX_WEIGHT,0,22,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,8};
        int [] a4 = new int[]{MAX_WEIGHT,MAX_WEIGHT,22,0,20,MAX_WEIGHT,MAX_WEIGHT,16,21};
        int [] a5 = new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,20,0,26,MAX_WEIGHT,7,MAX_WEIGHT};
        int [] a6 = new int[]{11,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,26,0,17,MAX_WEIGHT,MAX_WEIGHT};
        int [] a7 = new int[]{MAX_WEIGHT,16,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,17,0,19,MAX_WEIGHT};
        int [] a8 = new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,16,7,MAX_WEIGHT,19,0,MAX_WEIGHT};
        int [] a9 = new int[]{MAX_WEIGHT,12,8,21,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0};

        graph.matrix[0] = a1;
        graph.matrix[1] = a2;
        graph.matrix[2] = a3;
        graph.matrix[3] = a4;
        graph.matrix[4] = a5;
        graph.matrix[5] = a6;
        graph.matrix[6] = a7;
        graph.matrix[7] = a8;
        graph.matrix[8] = a9;

        int degree = graph.getOutDegree(1);
        System.out.println(degree);
        graph.DFS();

    }
}
