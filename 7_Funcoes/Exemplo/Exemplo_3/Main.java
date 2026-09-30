public class Main{

    static boolean ligarInterruptor(){
        if (passarEletricidade()==true){
            if (acenderLampada()==true){
            System.out.println("A lampada acendeu!");
            return true;
            }else{
            System.out.println("A lampada queimou!");
            return false;
        }
    }else{
        System.out.println("Problema no circuito!");
        return false;
    }
        }
static boolean passarEletricidade(){
    return true;
}

static boolean acenderLampada(){
    return true;
}
    public static void main(String[]args){
        if (ligarInterruptor()==true){
            System.out.println("O processo funcionou!");
        }else{
            System.out.println("O processo falhou!");
        }
        
    }
}