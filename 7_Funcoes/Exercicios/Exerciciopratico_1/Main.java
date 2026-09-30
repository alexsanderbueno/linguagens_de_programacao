public class Main{
    public static void valor(int n){
        if (n>0){
            System.out.println("O valor é POSITIVO!");
        }else if (n<0){
            System.out.println("O valor é NEGATIVO!");
        }else{
            System.out.println("O valor igual a ZERO!");
        }
    }
    public static void main (String[]args){
        valor(0);
    }
}