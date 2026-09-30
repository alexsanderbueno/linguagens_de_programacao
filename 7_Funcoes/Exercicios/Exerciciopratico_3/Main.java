public class Main{
    public static void tabuada(int n){
        System.out.println("___ Tabuada do " + n +"___");
         for (int i=1;i<11;i++)
        {
          //  for (int j=1;j<11;j++){
            System.out.println(i+"x"+n+"="+(i*n));
        }
        //}
        
    }
    public static void main(String[]args){
        tabuada(5);
    }
}