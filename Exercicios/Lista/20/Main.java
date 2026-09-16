public class Main{
    public static void main (String[]args){
        double[] notas = { 7.5, 4.0, 8.5, 5.5, 9.0, 3.5 };
        for (double valores:notas){
            if (valores>7)
            System.out.println(valores + " Aprovado!");
            else if (valores>=4)
            System.out.println(valores + " Recuperação!");
            else 
             System.out.println(valores + " Reprovado!");
        }
    }
}