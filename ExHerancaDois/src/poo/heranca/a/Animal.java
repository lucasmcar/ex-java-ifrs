package poo.heranca.a;

public class Animal {

    private String nome;
    private String raca;

    public Animal(){

    }

    public Animal(String nome){
        this.nome = nome;
    }

    public String caminha(){
        return "Animal caminhando";
    }
}
