package entidades;

public class Livro {

    private String titulo;
    private String autor;
    private String area;
    private String editora;
    private int ano;
    private String edicao;
    private int nmFolhas;
    private boolean emprestimo;

    public Livro() {
    }

    public Livro(String titulo, String autor, String area, String editora, int ano, String edicao, int nmFolhas) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.nmFolhas = nmFolhas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getNmFolhas() {
        return nmFolhas;
    }

    public void setNmFolhas(int nmFolhas) {
        this.nmFolhas = nmFolhas;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
}
