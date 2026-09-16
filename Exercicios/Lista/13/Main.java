public class Main{
    public static void main(String[]args){
        int numeros[]={1,2,3,4,5,6,7,8,9,0};
        int primeiro = 0;
        int ultimo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                primeiro = numeros[i]; // Guarda o primeiro elemento
            }
            if (i == numeros.length - 1) {
                ultimo = numeros[i]; // Guarda o último elemento
            }
        }
        System.out.println("Primeiro elemento: " + primeiro);
        System.out.println("Último elemento: " + ultimo);
    }
}