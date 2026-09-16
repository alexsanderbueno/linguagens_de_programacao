public class Main{
    public static void main (String[]args){
        int[] numeros= { 15, 8, 32, 4, 19, 27, 11 };
         int maior=numeros[0];
         int menor=numeros[0];
        for (int num:numeros){
            if (num>maior){
              maior=num;}
        }
         for (int num:numeros){
            if (num<menor){
              menor=num;}}
        System.out.println("O maior número é: "+maior);
         System.out.println("O menor número é: "+menor);
    
}
}
