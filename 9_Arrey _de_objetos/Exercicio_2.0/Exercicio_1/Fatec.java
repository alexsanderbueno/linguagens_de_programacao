public class Fatec{
    public static void main(String[]args){
        Aluno aluno_1 = new Aluno ("Jubileu","Jubileu@gmail.com");
        Aluno aluno_2 = new Aluno ("Irineu","Irineu@gmail.com");
        Aluno aluno_3 = new Aluno ("Tiburcio","Tiburcio@gmail.com");
        Aluno aluno_4 = new Aluno ("Pamonha","Pamonha@gmail.com");
        Aluno[] estudante = {aluno_1,aluno_2,aluno_3,aluno_4};
        for (Aluno universitario:estudante){
            System.out.println("Nome: "+ universitario.nome + " Email: " + universitario.email);
        }
    }
}