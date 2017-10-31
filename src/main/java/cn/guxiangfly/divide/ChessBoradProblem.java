package cn.guxiangfly.divide;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * ChessBoradProblem
 *
 * @author guxiang
 * @date 2017/10/28
 */
public class ChessBoradProblem {
    private int[][] board;//棋盘
    private int specialRow;//特殊点的行下标
    private int specialCol;//特殊点的列下标
    private int size;
    private int type=0;

    public ChessBoradProblem(int specialRow, int specialCol, int size) {
        super();
        this.specialRow = specialRow;
        this.specialCol = specialCol;
        this.size = size;
        board = new int[size][size];
    }

    /**
     * @param specialRow   特殊点的行下标
     * @param specialCol   特殊点的列下标
     * @param leftRow      矩阵的左边起点行下标
     * @param leftCol      矩阵左边起点的列下标
     * @param size         矩阵的宽或者高
     */
    private void ChessBoard(int specialRow,int specialCol,int leftRow,int leftCol,int size){
        if (size==1){
            return;
        }

        int subSize = size/2;

        //哪几种类型的骨牌
        type=type%4+1;
        int n= type;

        //假设点在左上角
        if (specialRow<leftRow+subSize && specialCol<leftCol+subSize){
            ChessBoard(specialRow,specialCol,leftRow,leftCol,subSize);
        }
    }
}
