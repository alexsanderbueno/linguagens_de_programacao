public class Main{
    public static void main (String[]args){
              String[] alunos= {"Ana","Carlos","Mariana","João"};
       double[] notas= {8.5,5.0,9.0,3.5};
       int i=0;
       double soma=0;
       double menor=nota[0];
       double maior=nota[0];

       for(String aluno:alunos){
        double nota=notas[i];
        if (nota>6){
            System.out.println( aluno +" -- "+ nota + " -- " + APROVADO ");
        }
        else if (nota>=4){
        System.out.println( aluno +" -- "+ nota + " -- " + RECUPERAÇÃO ");
        }
        else{
            System.out.println( aluno +" -- "+ nota + " -- " + REPROVADO ");
        }
        i++;
       }
    
    }
}