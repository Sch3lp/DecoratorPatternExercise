import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KlimmuurActiviteitTest {

    private HallowFitLidKaart lidKaart;

    @Before
    public void setUp() throws Exception {
        lidKaart = new HallowFitLidKaart();
    }

    @Test
    public void kostprijs_KlimmuurKost5() throws Exception {
        LidKaart lidKaartMetKlimmuurActiviteit = new KlimmuurActiviteit(lidKaart);

        assertThat(lidKaartMetKlimmuurActiviteit.kostprijs()).isEqualTo(15);
    }

    @Test
    public void omschrijving_VoegtKlimmuurActiviteitToe() throws Exception {
        LidKaart lidKaartMetKlimmuurActiviteit = new KlimmuurActiviteit(lidKaart);

        assertThat(lidKaartMetKlimmuurActiviteit.omschrijving()).isEqualTo("HallowFit\nActiviteit - Klimmuur: 5\n");
    }
}