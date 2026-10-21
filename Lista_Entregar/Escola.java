public class Escola{
    public static void main (String[]args){
        Aluno aluno_1 = new Aluno("Jubileu","jubileu_arrow@gmail.com",true,50,false);
        Aluno aluno_2 = new Aluno("Irineu","irineu_ar@gmail.com",false,100,true);
        Aluno[] alunos={aluno_1,aluno_2};
        for(Aluno estudante:alunos){
            System.out.println("Nome: "+ estudante.getNome());
            System.out.println("Email: "+ estudante.getEmail());
            System.out.println("Inteligente: "+ estudante.getInteligente());
            System.out.println("Nivel de sono: "+ estudante.getNivel_sono());
            System.out.println("Piscando lento: "+ estudante.getPiscando_lento());
            System.out.println("------------------------------------------------------------------------------------- ");
        }
       Professor professor_1 = new Professor("João",3,"Ranzinza","Pouco Paciente",false,"Aqui não tem moleza");
       Professor professor_2 = new Professor("Rozica",6,"Normal","Paciente",false,"Aqui não tem como chamar a mamãe");
       Professor[] prof={professor_1,professor_2};
        for (Professor professores:prof ){
            System.out.println("Professor: " + professores.getNome());
            System.out.println("Quantidede de café: " + professores.getQantidadeCafe());
            System.out.println("Humor: " + professores.getHumor());
            System.out.println("Usa datashow: " + professores.getUsaDatashow());
            System.out.println(" Frase favorita: " + professores.getFraseFavorita());
            System.out.println("------------------------------------------------------------------------------------- ");
        }
    }
}