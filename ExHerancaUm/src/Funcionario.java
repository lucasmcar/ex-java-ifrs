public class Funcionario {

    private String nome;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double addAumento(Double valor){
        Double total;
        total = this.getSalario() + valor;
        return  total;
    }

    public void ganhoAnual(){

    }

    public String exibeDados(){
        return "";
    }
}
