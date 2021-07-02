package Calisma;

public class odev1 {
    public static void main(String[] args) {


        System.out.println( method("k", 5));


    }


     public static String method(String input, int numberOfWriting) {
if(input.length()>3)
    return "\""+input.substring(0,3).repeat(numberOfWriting)+"\"";
else
    return "\""+input.substring(0).repeat(numberOfWriting)+"\"";


    }
}
