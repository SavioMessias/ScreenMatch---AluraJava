package br.com.kiqsavio.screenmatch.principal;

import br.com.kiqsavio.screenmatch.calculos.CalculadoraDeTempo;
import br.com.kiqsavio.screenmatch.calculos.FiltroRecomendacao;
import br.com.kiqsavio.screenmatch.modelos.Episodio;
import br.com.kiqsavio.screenmatch.modelos.Filme;
import br.com.kiqsavio.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie("Lost", 2000);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(20);
        serie.setMinutosPorEpisodio(50);
        System.out.println("tempo de maratona " + serie.getDuracaoEmMinutos());

        serie.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();


        Filme outroFilme = new Filme("Avatar", 2015);
        outroFilme.setDuracaoEmMinutos(280);

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        filmeDoPaulo.setDuracaoEmMinutos(200);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);


    }
}