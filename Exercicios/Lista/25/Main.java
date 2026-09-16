public class Main{
    public static void main (String[]args){
        String[] alunos= {"Ana","Carlos","Mariana","João","Pedro"};
       double[] notas= {8.5,5.0,9.0,3.5,7.0};
       int i=0;
       for(String aluno:alunos){
        double nota=notas[i];
        if (nota>6){
            System.out.println("O aluno(a) " + aluno + " foi APROVADO ");
        }
        else{
            System.out.println("O aluno(a) " + aluno + " foi REPROVADO ");
        }
        i++;
       }
    }
}