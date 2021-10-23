public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Pessoa p = new Pessoa();


        meuCarro.setCor("Preto");
        meuCarro.setTipo("Passeio");
        meuCarro.setPlaca("GGG-1111");
        meuCarro.setNumPortas(4);

        p.setNome("Fulano");
        p.setBiotipo("Ectomorfo");
        p.setCorDoCabelo("Castanho");
        p.setIdade(30);

        System.out.println("-----CARRO-----");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Portas: " +meuCarro.getNumPortas());

        System.out.println("-----Pessoa-----");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Biotipo: " + p.getBiotipo());
        System.out.println("Cor do cabelo: " + p.getCorDoCabelo());

    }
}
