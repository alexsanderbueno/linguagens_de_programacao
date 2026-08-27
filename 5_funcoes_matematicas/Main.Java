public class Main{
    public static void main (String[] args){
        System.out.println(Math.max(5, 10));//Maximo
        System.out.println(Math.min(5, 10));//Minimo
        System.out.println(Math.sqrt(64)); //Raiz Quadrada
        System.out.println(Math.abs(-4.7)); //Transforma numero negativo em positivo
        System.out.println(Math.pow(2,8)); //Potencia
        System.out.println(Math.round(4.6)); // Arredondamento para o mais proximo
        System.out.println(Math.ceil(4.6)); // Arredondamento para cima
        System.out.println(Math.floor(4.6)); // Arredondamento para baixo
        System.out.println(Math.random()); // Gera um numero aleatorio

//Para duplicar usar Shift alt seta para baixo
//cd .. para sair da pasta
// cd "nome da pasta" para entrar em uma nova pasta
// java Main.java para executar o codigo
       
        //Exercicio Pratico
        //Crie um Script para exibir se a luz está acessa ou apagada.

         boolean luz =false;
        if (luz){
        System.out.println ("fique no quarto");
        }else {
            System.out.println ("Fechar a porta e sair do quarto");
        }
    }
}