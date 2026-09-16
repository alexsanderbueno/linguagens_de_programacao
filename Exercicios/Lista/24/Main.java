public class Main{
    public static void main(String[]args){
        String[] produtos = { "Mouse", "Teclado", "Monitor", "Notebook", "Impressora" };
        int[] estoque = { 10, 3, 0, 5, 2 };
        int i=0;
        for(String produto:produtos){
            int qtd=estoque[i];
            if (qtd==0){
            System.out.println(produto + " --> " +" SEM ESTOQUE!");}
            else{
            System.out.println(produto +" --> "+ qtd+ " unidades tem em estoque");}
            i++;
        }

    }
}