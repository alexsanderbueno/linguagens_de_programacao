public class Main{
    public static void main(String[] args){
        Professor prof = new Professor();
        Diretor dire = new Diretor();
        Aluno estudante = new Aluno();

        prof.nome = "Diogo";
        dire.nome = "João";
        estudante.nome = "Alex";

         prof.idade =  32 ;

        prof.profissao();
        estudante.profissao();
    }
}
        