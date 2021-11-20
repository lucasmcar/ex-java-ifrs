package poo.heranca.b;

import poo.heranca.b.Pessoa;

public class Rica extends Pessoa {

    private double dinheiro;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void fazCompras(){
        System.out.println("Fazendo compras");
    }
}
