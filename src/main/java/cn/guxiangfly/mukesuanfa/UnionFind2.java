package cn.guxiangfly.mukesuanfa;

/**
 * UnionFind2
 *
 * @author guxiang
 * @date 2018/3/17
 */
public class UnionFind2 {
    int [] parent;
    int count;

    public UnionFind2(int count){
        parent = new int[count];
        this.count = count;
        for (int i = 0; i < count; i++) {
            parent[i] = i;
        }
    }

    int find(int p){
        assert (p>=0 &&p <count);

        while (p != parent[p]){
            p = parent[p];
        }
        return p;
    }

    boolean isConnected(int p,int q){
        return find(p) == find(q);
    }

    void unionElement(int p , int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot){
            return;
        }
        parent[pRoot] = qRoot;
    }

}
