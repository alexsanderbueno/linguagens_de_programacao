import java.util.List;
import java.util.ArrayList;

public class Main {
    
        private static List<Professor> professores =new ArrayList<>();
        private static List<Aluno> alunos =new ArrayList<>();

        public static void main(String[] args) {
            professores.add(new Professor("Anderson"));
            professores.add(new Professor("Joao"));


            alunos.add(new Aluno("Joana"));
            alunos.add(new Aluno("Juca"));
            
            for (Professor prof: professores){
                System.out.println("Nome:"+ prof.getNome());

            }

            for (Aluno al : alunos){
                System.out.println("Nome Aluno: "+ al.getNome());
            }
        }
}
