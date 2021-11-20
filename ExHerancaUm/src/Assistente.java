public class Assistente extends Funcionario{

    private int numMatricula;

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String exibeDados() {
        super.exibeDados();
        return "Assistente" + this.getNumMatricula() + " - " + this.getNome();
    }
}
