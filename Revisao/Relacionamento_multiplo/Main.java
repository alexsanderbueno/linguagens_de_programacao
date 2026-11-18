import java.util.List;
import java.util.ArrayList;
public class Main {
    private static List< Professor> professor= new ArrayList<>();
    private static List<Aluno>aluno = new ArrayList<>();
    public static void main(String[] args) {
        professor.add(new Professor ("Amarilo"));
        professor.add(new Professor ("Joao"));
        professor.add(new Professor ("Jubileu"));

        aluno.add(new Aluno("Alexsander"));
        aluno.add(new Aluno("Matheus"));
        

        for (Professor prof : professor){
            System.out.println("Nome: " + prof.getNome());
        }

        for (Aluno al: aluno){
            System.out.println("Nome do Aluno: " + al.getNome());
        }


        
        
    }
    
}
