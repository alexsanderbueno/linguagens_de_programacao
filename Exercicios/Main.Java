public class Main{
    public static void main (String[] args){
        //Exercicio Pratico
        //Crie um Script para exibir se a luz está acessa ou apagada.
         boolean luz =false;
        if (luz){
        System.out.println ("fique no quarto");
        }else {
            System.out.println ("Fechar a porta e sair do quarto");
        }

        
        String mensagem = (false)? "Fique no quarto" : "Fechar a porta e sair do quarto";
        System.out.println(mensagem);

        //Faça um algoritmo em JAVA que irá analisar a idade e exibir se a pessoa é
        // * Criança, *Adolecente, *Adulto, *Idoso
        int idade = 66;
        if(idade<=12)
        System.out.println("Criança");
        else if (idade<=18)
        System.out.println("Adolecente");
        else if (idade<=65)
        System.out.println("Adulto");
        else
        System.out.println("Idoso");


        //
    }
}
