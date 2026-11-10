public class Filme {
    String nomeDofilme;
    int idadeMinima;
    double notaTotal;// 0 a 10
    int anoDeLancamento;
    int duracaodofilme;
    int quantidadeAvaliacoes;
    double avaliacao;
    double mediaDaNota;
    boolean incluidoNoplano;

    void exibirFichaTecnica() {
        System.out.printf("""
                nome do filem: %s
                Ano de lancamento: %d
                duracao em minutos; %d
                incleuido no plano:  %b
                idadeMinima: %d
                """,nomeDofilme,anoDeLancamento,duracaodofilme,incluidoNoplano,idadeMinima);
    }
    void avaliar(double nota){
        notaTotal += nota;
        quantidadeAvaliacoes++;
    }
    double mediaDaNota(){
        return notaTotal / quantidadeAvaliacoes;
    }
}
