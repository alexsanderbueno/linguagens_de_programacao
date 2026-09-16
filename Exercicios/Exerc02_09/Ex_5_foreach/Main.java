public class Main{
    public static void main(String[] args){
       /* String[]alunos= {"Miranata", "Savalo", "Aeronauta"};
        alunos[0] = "Livia";
        System.out.println("Qtde de alunos:" + alunos.length);
        for(String estudante : alunos){
            System.out.println(estudante);
        }*/
       //Crie uma lista com 5 produtos 
       //Exiba cada produto utilizando foreach
       //e tambem for
    //    String[]Legumes= {"Batata","Beterraba","Berinjela", "Mandioca", "Cenoura"};
    //    for (String Hortifruti:Legumes){
    //     System.out.println(Hortifruti);
    //    }

    //     System.out.println()

    //    for (int i=0; i<Legumes.length; i++)
    //    System.out.println(Legumes[i]);
    //crie um array contendo 5 numeros
    //use foreach para exibir se cada numero é negativo, positivo ou igual a zero
        int[] num = {10,20,30,40,0};
        for (int numero:num){
            if (numero<0)
            
            System.out.println("O valor de "+ numero + "Eh Negativo");
            if (numero==0)
            System.out.println("O valor de "+ numero + "Eh Zero");
            if (numero>0)
            System.out.println("O valor de "+ numero + "Eh Positivo");
    }
    
    }
}