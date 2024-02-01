import br.com.kiqsavio.screenmatch.calculos.CalculadoraDeTempo;
import br.com.kiqsavio.screenmatch.modelos.Filme;
import br.com.kiqsavio.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);



        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(1920);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(20);
        serie.setMinutosPorEpisodio(50);
        System.out.println("tempo de maratona " + serie.getDuracaoEmMinutos());

        serie.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();


        Filme outroFilme = new Filme();
        outroFilme.setNome("O poderoso chefão");
        outroFilme.setAnoDeLancamento(1970);
        outroFilme.setDuracaoEmMinutos(280);

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}