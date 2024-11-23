package geral;

public class Livro extends Obra {
    private String autor;
    private String qtdPaginas;

    Livro(String nome, String paisOrigem, String genero, String classificacaoIndicativa, String qtdPaginas,String autor){
        super(nome, paisOrigem, genero,classificacaoIndicativa);

        this.qtdPaginas = qtdPaginas;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumeroPaginas() {
        return qtdPaginas;
    }

    public void setqtdPaginas(String qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

}
