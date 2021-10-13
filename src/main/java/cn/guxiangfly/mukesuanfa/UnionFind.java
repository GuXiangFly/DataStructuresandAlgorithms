package cn.guxiangfly.mukesuanfa;

/**
 * UnionFind
 *
 * @author guxiang
 * @date 2018/3/17
 */
public class UnionFind {
    private int count;
    private int[] id;

    public UnionFind(int n){
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    int find(int p){
        return id[p];
    }

    boolean isConnected(int p, int q){
        return find(p) == find(q);
    }
    public void unionElement(int p,int q){
        int pID = find(p);
        int qID = find(q);

        if (pID ==qID){
            return;
        }
        for (int i = 0; i < count; i++) {
            if (id[i] == pID){
                id[i] = qID;
            }
        }
    }

    public static void main(String[] args) {

    }
}
