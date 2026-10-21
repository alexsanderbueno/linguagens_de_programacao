public class Personagem {
        String nome = "";
        int vida = 0;
        List<Tipo> tipo;
        List<Poder> poder;
        //MÉTODO CONSTRUTOR
     public Personagem(String nome,int vida, String tipo, String poder){
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = new Tipo (tipo);
        this.tipo.add(tipo1);
        Poder poder1 = new Poder (poder);
        this.poder.add(poder1);
        }
    //Funções Setters e Getters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNome() {
        return this.nome;
    }
    public int getVida() {
        return this.vida;
    }

    public static void main (String[]args){


      Personagem  persona_1 = new Personagem("Picachu",100, "Eletrico", "Choque do trovão");
      Personagem  persona_2 = new Personagem("Flash", 1000, "velocista", "velociade");
     // Personagem[] personagem = {persona_1,persona_2};
      //for(Personagem personage:personagem){
      List<Personagem>personagens;
      personagens.add(persona_1);
      personagens.add(persona_2);
      for(Personagem personagem:personagens){
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Vida: " + personagem.getVida());
        //System.out.println("Tipo: " + personage.getNome());
        //System.out.println("Poder: " + personage.getDescricao());
      }
      }
    }


