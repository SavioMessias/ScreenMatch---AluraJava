package br.com.kiqsavio.screenmatch.principal;

import br.com.kiqsavio.screenmatch.modelos.Filme;
import br.com.kiqsavio.screenmatch.modelos.Serie;
import br.com.kiqsavio.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2015);
        outroFilme.avalia(4);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(7);
        Serie serie = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(serie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Comparando por data de lançamento: ");
        System.out.println(lista);
    }
}
