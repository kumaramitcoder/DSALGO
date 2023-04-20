package string;

public class ReverseWord {

    static String Reverse(String s){

        String[] str = s.split("\\.");
        String result = "";

        for (int i=str.length-1; i>=0;i--){
            result = result + str[i];
            if (i!=0){
                result = result+".";
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(s);
        System.out.print(Reverse(s));
    }
}
