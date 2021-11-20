import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //EX 5 a

        Administrativo adm = new Administrativo();
        Tecnico tec = new Tecnico();

        adm.setNumMatricula(123456);
        adm.setNome("Joaquim");
        tec.setNumMatricula(235689);
        tec.setNome("João");

        System.out.println("Administrador: " + adm.getNumMatricula() + " - " + adm.getNome());
        System.out.println("Tecnico: " + tec.getNumMatricula() + " - " + tec.getNome());

        //Ex 5 e
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para imóvel novo e 2 para imóvel velho");
        int escolha = sc.nextInt();
        Novo novo = new Novo();
        novo.setPreco(100000.00);
        Velho velho = new Velho();
        velho.setPreco(60000.00);
        Double total = 0.0;
        switch (escolha){
            case 1:
                novo.setAdicional(20000.00);
                total = novo.getPreco() + novo.getAdicional();
                System.out.println("Valor final: " + total);
                break;
            case 2:
                velho.setDesconto(15000.00);
                total = velho.getPreco() + velho.getDesconto();
                System.out.println("Valor final: " + total);
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
