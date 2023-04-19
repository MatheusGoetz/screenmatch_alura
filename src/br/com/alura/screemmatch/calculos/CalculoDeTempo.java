package br.com.alura.screemmatch.calculos;

import br.com.alura.screemmatch.modelos.Titulo;

public class CalculoDeTempo {

    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void incluir(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
