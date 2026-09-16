public class Main{
    public static void main(String[]args){
        int numeros[] = {15,8,32,4,19,27};
       int maior=numeros[0];
        for (int num:numeros){
            if (num>maior){
              maior=num;}
        }
        System.out.println("O maior número é: "+maior);
    }
}