public  class Matrix_multiplication implements Runnable {
int[][] MatrixA;
int[][] MatrixB;
int[][] result;
static int threadNum=0;
int count;
Matrix_multiplication(int[][] MatrixA,int[][] MatrixB){
this.MatrixA=MatrixA;
this.MatrixB=MatrixB;
this.result=new int[MatrixA.length][MatrixB[0].length];
count =threadNum;
threadNum++;
}


@Override
public void run() {
   System.out.print("Thread "+count+":  ");
        for(int j=0;j<MatrixB[0].length;j++)
    {
                for(int k=0;k<MatrixA.length;k++)
                {
                   result[count][j] +=MatrixA[count][k]*MatrixB[k][j];

                }
                System.out.print(result[count][j]+"  ");
    }

    System.out.println();
}
}