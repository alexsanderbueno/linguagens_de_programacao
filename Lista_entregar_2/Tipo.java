//NOME DA CLASSE É PascalCase
public class Tipo{
    //Variavel em snake_case
    String nome = "";
    //MÉTODO CONSTRUTOR
    /*É UMA FUNÇÃO DA CLASSE*/public Tipo(String nome){
        this.nome = nome;
        }
    //Funções Setters e Getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


}