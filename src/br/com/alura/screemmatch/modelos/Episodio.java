package br.com.alura.screemmatch.modelos;

import br.com.alura.screemmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int episodio;
    private String nome;
    private Series serie;
    private int totalVisualizacao;

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacao >= 100){
            return 4;
        } else {
            return 2;
        }
    }
}
