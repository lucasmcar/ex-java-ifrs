public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro meuCarro2 = new Carro("Vermelho", "Passeio", "GGG-0000", 2);
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa("Fulano", "Ectomorfo", "Loiro", 25);

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

        System.out.println("-----CARRO2-----");
        System.out.println("Cor: " + meuCarro2.getCor());
        System.out.println("Tipo: " + meuCarro2.getTipo());
        System.out.println("Placa: " + meuCarro2.getPlaca());
        System.out.println("Portas: " +meuCarro2.getNumPortas());


        System.out.println("-----Pessoa-----");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Biotipo: " + p.getBiotipo());
        System.out.println("Cor do cabelo: " + p.getCorDoCabelo());

        /**
         * Exercicio 3
         */
        System.out.println("-----Pessoa 2-----");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        System.out.println("Biotipo: " + p2.getBiotipo());
        System.out.println("Cor do cabelo: " + p2.getCorDoCabelo());
    }
}
