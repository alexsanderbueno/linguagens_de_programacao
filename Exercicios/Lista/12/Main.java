public class Main{
    public static void main(String[]args){
        int num[]={5,-2,10,-8,3,0,7};
        int positivos=0;
        for (int numeros:num){
            if (numeros>0)
            positivos++;}
            
            System.out.println("O valor de numeros positivos é: "+ positivos );
    }
}