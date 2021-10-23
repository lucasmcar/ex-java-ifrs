public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro meuCarro2 = new Carro("Azul", "Passeio", "GGG-0000", 2);
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa("Marcia", "Magro", "Loira", 25);

        meuCarro.setCor("Preto");
        meuCarro.setTipo("Passeio");
        meuCarro.setPlaca("GGG-1111");
        meuCarro.setNumPortas(4);

        p.setNome("Fulano");
        p.setBiotipo("Magro");
        p.setCorDoCabelo("Castanho");
        p.setIdade(30);

        p.setCarro(meuCarro);

        meuCarro.setDono(p);
        meuCarro2.setDono(p2);

        System.out.println("-----CARRO-----");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Portas: " + meuCarro.getNumPortas());
        System.out.println("Dono: " + meuCarro.getDono().getNome());

        System.out.println("-----CARRO2-----");
        System.out.println("Cor: " + meuCarro2.getCor());
        System.out.println("Tipo: " + meuCarro2.getTipo());
        System.out.println("Placa: " + meuCarro2.getPlaca());
        System.out.println("Portas: " +meuCarro2.getNumPortas());
        System.out.println("Dono: " + meuCarro2.getDono().getNome());

        p.ligarCarro();
        p.setCambioMarcha(1);
        p.desligarCarro();
        p.getCarro().getCambio();
        p.acelerarCarro();

        System.out.println();

        p.ligarCarro();
        p.setCambioMarcha(1);
        p.getCarro().getCambio();
        p.acelerarCarro();

        System.out.println();

        p.setCambioMarcha(2);
        p.getCarro().getCambio();
        p.acelerarCarro();

        System.out.println();

        p.setCambioMarcha(3);
        p.getCarro().getCambio();
        p.acelerarCarro();

        System.out.println();

        p.setCambioMarcha(2);
        p.getCarro().getCambio();
        p.acelerarCarro();

        System.out.println();


        p.setCambioMarcha(1);
        p.getCarro().getCambio();
        p.acelerarCarro();

        System.out.println();


        p.setCambioMarcha(0);
        p.frearCarro();
        p.desligarCarro();

        System.out.println();

    }
}
