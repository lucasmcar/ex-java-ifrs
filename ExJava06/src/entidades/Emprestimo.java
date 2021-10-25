package entidades;

import java.util.Date;

public class Emprestimo {

    private Date dtEmprestimo;
    private Date hEmprestimo;

    private Livro livro; //
    private Usuario usuario; //

    public Emprestimo() {
    }

    public Emprestimo(Date dtEmprestimo, Date hEmprestimo, Livro livro, Usuario usuario) {
        this.dtEmprestimo = dtEmprestimo;
        this.hEmprestimo = hEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Date getDtEmprestimo() {
        return dtEmprestimo;
    }

    public Date gethEmprestimo() {
        return hEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
