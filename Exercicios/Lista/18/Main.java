public class Main{
    public static void main (String[]args){
        String[] nomes = {
	"Letsgo Daqui Silva",
	"César Teio",
	"Bispo de Paris",
	"Antônio Morrendo das Dores",
	"Rolando Escada Abaixo Santos",
	"Amazonas Rio do Brasil Pimpão",
	"Amin Amou Amado Pinto",
	"Amado Amoroso",
	"Inocêncio Coitadinho",
	"Maria Privada de Jesus",
	"Zélia Tocafundo Pinto"
    };
        String nomeaprocurar="Bispo de Paris";
        boolean encontrado= false;
        for (String nome:nomes)
        {
            if (nome.equalsIgnoreCase(nomeaprocurar)){
                encontrado=true;
            }}
            if (encontrado){
                System.out.println("Nome encontrado!");
            }else{
                System.out.println("Nome não encontrado!");
                }
            }
             }
            
        