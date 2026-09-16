public class Main{
    public static void main (String[]args){
        int num[]= {-4,-3,-2,-1,0,1,2,3,4,5};
        int negativo=0;
        int positivo=0;
        int zero=0;

        for (int numeros:num){
            if(numeros<0)//Negativo
            negativo++;
             if  (numeros>0)//Positivo
            positivo++;
             if (numeros==0)//Zero
            zero++;
        }
        System.out.println("São negativos: "+negativo+ " numeros");
        System.out.println("Sõa positivos: " + positivo+ " numeros");
        System.out.println("São zeros: "+zero + " numeros");
    
}
}