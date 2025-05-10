public class App {
    public static void main(String[] args) throws Exception {
        int [][] mA={{1,2,3},{4,4,5},{3,7,8}};
        int [][] mB={{1,5,3},{3,4,3},{6,5,4}};
        
    for(int i=0;i<3;i++)
    {
        Thread T =new Thread(new Matrix_multiplication(mA,mB));
        T.start();
        Thread.sleep(1000);
        T.join();

    }
    }
}
