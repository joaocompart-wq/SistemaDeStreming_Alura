package meuFilmes;

public class ModeloParaFilme {
   private String nome;
    private int dataDeLancamento;
   private double totalDeAvaliacao;
    private double maiorAvaliacao;
    private boolean temNoPlano;
   private String Resumo;
   private int duracaoEmMinutos;
   private double somaAvaliacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setDataDeLancamento(int dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public void setTemNoPlano(boolean temNoPlano) {
        this.temNoPlano = temNoPlano;
    }

    public void setResumo(String resumo) {
        Resumo = resumo;
    }

    public int getTotalDeAvaliacao() {
    return (int) totalDeAvaliacao;
}

    void exibirFichaTecnica() {
        String fichaTecnica = String.format("""
                Nome do filme: %s
                ano de lancamento: %d
                duaracao do filme: %d
                incluso no plano: %b
                """, nome, dataDeLancamento, duracaoEmMinutos,temNoPlano);
    }

    void avalia(double notas){
    somaAvaliacao += notas;
    totalDeAvaliacao++;
    }
}
