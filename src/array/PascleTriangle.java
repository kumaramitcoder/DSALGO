package array;

public class PascleTriangle {


    public static int factorial(int n){
        if (n==0)
            return 1;
        return n*factorial(n-1);
    }


    public static void main(String[] args) {
        System.out.println("Pascal's Triangle");

        PascleTriangle pascleTriangle = new PascleTriangle();

        int n=4, i,j;
        for (i=0;i<=n;i++){
            for (j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print(" "+pascleTriangle.factorial(i)/(pascleTriangle.factorial(i-j)*pascleTriangle.factorial(j)));
            }
            System.out.println();
        }



    }
}
