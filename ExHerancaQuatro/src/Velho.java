public class Velho  extends Imovel{

    private Double desconto;

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public void mostraDesconto(){
        this.getDesconto();
    }
}
