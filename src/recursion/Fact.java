package recursion;

public class Fact {

    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }

        int abc = factorial(n-1);
        int tot = n * abc;
        return tot;
    }

    public static void main(String[] args) {
        int n = 5;

        int fact = factorial(n);
        System.out.println(fact);
    }
}
