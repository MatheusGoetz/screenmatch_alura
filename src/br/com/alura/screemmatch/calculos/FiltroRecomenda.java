package br.com.alura.screemmatch.calculos;

public class FiltroRecomenda {

    public void filtrar(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos no momento!");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Coloque em sua lista para assistir depois.");
        }
    }
}
