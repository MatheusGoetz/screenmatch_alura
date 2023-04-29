package br.com.alura.screemmatch;

import br.com.alura.screemmatch.calculos.CalculoDeTempo;
import br.com.alura.screemmatch.calculos.FiltroRecomenda;
import br.com.alura.screemmatch.modelos.Episodio;
import br.com.alura.screemmatch.modelos.Filme;
import br.com.alura.screemmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Star Wars: episode I", 1999);
        meuFilme.setDuracaoEmMinutos(136);
        meuFilme.descricao();
        System.out.println("Duracao em minutos: " + meuFilme.getDuracaoEmMinutos() + " minutos.");

        meuFilme.avaliar(8);
        meuFilme.avaliar(8.7);
        meuFilme.avaliar(10);
        System.out.println("Total de avaliacões: " + meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        Series lost = new Series("Lost", 2004);
        lost.setTemporada(6);
        lost.setEpisodiosPorTemporada(18);
        lost.setMinutosPorEpisodio(42);
        lost.descricao();
        System.out.println("Duracao em minutos: " + lost.getDuracaoEmMinutos() + " minutos.");

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(180);
        outroFilme.descricao();

        CalculoDeTempo calcular = new CalculoDeTempo();
        calcular.incluir(meuFilme);
        calcular.incluir(outroFilme);
        calcular.incluir(lost);
        System.out.println(calcular.getTempoTotal());

        FiltroRecomenda filtro = new FiltroRecomenda();
        filtro.filtrar(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setEpisodio(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(200);
        filtro.filtrar(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        //filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avaliar(10);

        ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(meuFilme);
        ListaDeFilmes.add(outroFilme);
        ListaDeFilmes.add(filmeDoPaulo);

        System.out.println("Tamanho da lista: " + ListaDeFilmes.size());
        System.out.println("Primeiro filme: " + ListaDeFilmes.get(0).getNome());
        System.out.println(ListaDeFilmes);
        System.out.println("toString : " + ListaDeFilmes.get(0).toString());
    }
}
