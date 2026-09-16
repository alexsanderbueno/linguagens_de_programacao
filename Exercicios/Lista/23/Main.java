public class Main{
    public static void main (String[]args){
        double[] notas= { 7.5, 8.0, 4.5, 6.0, 9.0, 3.5, 5.0, 8.5, 10.0, 6.5 };
        double soma=0;
        double menor=notas[0];
        double maior=notas[0];
        int  reprovado=0;
        int aprovado=0;
        for (double nota:notas){
            if(menor<nota){
                menor=nota;
            }
            if (maior>nota){
                maior=nota;
            }
            soma+=nota;
            if (nota>6){
                aprovado++;
            }
            if (nota<6){
                reprovado++;
            }
            }
            double media= soma/notas.length;
            
        
        System.out. println("A menor nota é: "+ menor);
        System.out.println("A maior nota é: "+ maior);
        System.out.println("A média das notas é: "+ media);
        System.out.println( "O numero de alunos reprovados é: "+ reprovado);
        System.out.println(" O numero de alunos aprovados é: " + aprovado);
    }
}