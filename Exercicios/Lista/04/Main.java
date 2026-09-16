public class Main{
    public static void main(String[]args){
        int A=10;
        int B=10;
        int C=10;
        if (A>B&&A>C)
        System.out.println("O valor maior é: + A");
        else if(B>A&&B>C)
        System.out.println("O valor maior é: + B");
        else if(C>A&&C>B)
        System.out.println("O valor maior é: + C");
        else
        System.out.println("Os valores são iguais");
    }
}