public class Main{
    public static void main(String[]args){
        double[] notas = { 7.5, 8.0, 6.5, 9.0, 5.5 };
        double soma=0.0;
        for(double num:notas){
        soma +=num;}
        double media=soma/notas.length;
        System.out.println("A média das notas é:"+ media);
    }
}
