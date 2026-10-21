public class Cesta{
    public static void main(String[]args){
        Itens item_1 = new Itens ("Panetonne","12345678",5,19.99f);
        Itens item_2 = new Itens ("Vinho", "23456789",2,59.99f);

        Itens[] produto = {item_1,item_2};
        for (Itens mercadoria:produto){
            System.out.println("Produto: "+mercadoria.nome);
        }
        
    }
}