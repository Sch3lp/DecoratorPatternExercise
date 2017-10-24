import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZwembadActiviteitTest {

    private HallowFitLidKaart lidKaart;

    @Before
    public void setUp() throws Exception {
        lidKaart = new HallowFitLidKaart();
    }

    @Test
    public void kostprijs_ZwembadKost3() throws Exception {
        LidKaart lidKaartMetZwembadActiviteit = new ZwembadActiviteit(lidKaart);

        assertThat(lidKaartMetZwembadActiviteit.kostprijs()).isEqualTo(13);
    }

    @Test
    public void omschrijving_VoegtZwembadActiviteitToe() throws Exception {
        LidKaart lidKaartMetZwembadActiviteit = new ZwembadActiviteit(lidKaart);

        assertThat(lidKaartMetZwembadActiviteit.omschrijving()).isEqualTo("HallowFit\nActiviteit - Zwembad: 3\n");
    }
}