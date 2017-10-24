import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HallowFitLidKaartTest {

    @Test
    public void kostPrijs_BasisPrijsIs10() throws Exception {
        HallowFitLidKaart hallowFitLidKaart = new HallowFitLidKaart();
        assertThat(hallowFitLidKaart.kostprijs()).isEqualTo(10);
    }

    @Test
    public void omschrijving_HeeftHallowFit() throws Exception {
        HallowFitLidKaart hallowFitLidKaart = new HallowFitLidKaart();
        assertThat(hallowFitLidKaart.omschrijving()).contains("HallowFit\n");
    }

    @Test
    public void lidkaartMetZwembadKlimmuurEnGroepslessen_GebruiktKortingOpTotaal() throws Exception {
        LidKaart lidkaart = new GroepslessenKorting(new ZwembadActiviteit(new KlimmuurActiviteit(new HallowFitLidKaart())));

        assertThat(lidkaart.kostprijs()).isEqualTo((10 + 5 + 3) * 0.9);
    }

    @Test
    public void lidkaartMetZwembadKlimmuurEnGroepslessen_EnBevatVolledigeOmschrijving() throws Exception {
        LidKaart lidkaart = new GroepslessenKorting(new ZwembadActiviteit(new KlimmuurActiviteit(new HallowFitLidKaart())));

        assertThat(lidkaart.omschrijving()).isEqualTo("HallowFit\n" +
                "Activiteit - Klimmuur: 5\n" +
                "Activiteit - Zwembad: 3\n" +
                "Korting - Groepslessen: 10%\n");
    }

    @Test
    public void lidkaartMetZwembadIndividueelEnKlimmuurInGroep_GebruiktKortingVerkeerd() throws Exception {
        LidKaart lidkaart = new ZwembadActiviteit(new GroepslessenKorting(new KlimmuurActiviteit(new HallowFitLidKaart())));

        assertThat(lidkaart.kostprijs()).isEqualTo(((10 + 5) * 0.9) + 3);
    }
}