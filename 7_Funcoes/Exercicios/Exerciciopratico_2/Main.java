public class Main{
    public static void alunoNota(String A, float N){
        if (N>=7.0){
            System.out.println("Parabéns " + A + " Você está aprovado(a)");
        }
        else {
            System.out.println("Sinto muito " + A + " Você está reprovado(a)");
        }

    }
    public static void main(String[]args){
        alunoNota("Evilyn",6);
    }
}