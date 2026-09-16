public class Main{
    public static void main(String[]args){
        int [] [] numeros={
            {2,4,6,8},
            {3,6,9,12},
            {4,8,12,16},
            {5,10,15,20},
        };
       // System.out.println(numeros[2] [3]);
       for(int i=0; i<4;i++){
            for (int j=0; j<4; j++)
                 System.out.println(numeros[i] [j]);
       }
    }
}
