package geral;

public class Filme extends Obra {
    private String faturamento;
    private String diretor_a;
    private String estudio;

Filme(String nome, String paisOrigem, String genero, String classificacaoIndicativa, String faturamento, String diretor_a, String estudio ){
    super(nome,paisOrigem, genero, classificacaoIndicativa);

    this.faturamento = faturamento;
    this.diretor_a = diretor_a;
    this.estudio = estudio;
}
    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }

    
    public String getDiretor_a() {
        return diretor_a;
    }

    public void setDiretor_a(String diretor_a) {
        this.diretor_a = diretor_a;
    }

    
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;

    }

}
