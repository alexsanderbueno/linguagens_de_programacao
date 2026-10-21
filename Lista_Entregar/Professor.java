public class Professor{
    String nome = "";
    int quantidadeCafe = 0;
    String humor = "";
    String nivelDePaciencia = "";
    boolean usaDatashow = true;
    String fraseFavorita = "";

    public Professor (String nome, int quantidadeCafe, String humor, String nivelDePaciencia, boolean usaDatashow, String fraseFavorita){
        this.nome = nome;
        this.quantidadeCafe = quantidadeCafe;
        this.humor = humor;
        this.usaDatashow = usaDatashow;
        this.nivelDePaciencia = nivelDePaciencia;
        this.fraseFavorita = fraseFavorita;
    }
    public void setNome(String nome){
	  this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

     public void setQuantidadeCafe(int quantidadeCafe){
	  this.quantidadeCafe = quantidadeCafe;
    }
    public int getQantidadeCafe(){
        return this.quantidadeCafe;
    }

     public void setHumor(String humor){
	  this.humor = humor;
    }
    public String getHumor(){
        return this.humor;
    }

     public void setNivelDePaciencia(String nivelDePaciencia){
	  this.nivelDePaciencia = nivelDePaciencia;
    }
    public String getNivelDePaciencia(){
        return this.nivelDePaciencia;
    }

     public void setUsaDatashow(boolean usaDatashow){
	  this.usaDatashow = usaDatashow;
    }
    public boolean getUsaDatashow(){
        return this.usaDatashow;
    }

     public void setFraseFavorita(String fraseFavorita){
	  this.fraseFavorita = fraseFavorita;
    }
    public String getFraseFavorita(){
        return this.fraseFavorita;
    }

    public void ensinar(){
        System.out.println("professor finge ensinar");
    }

    public void tomarCafe(){
        System.out.println("professor toma café");
    }


}