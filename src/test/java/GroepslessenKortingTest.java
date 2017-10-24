import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GroepslessenKortingTest {

    private HallowFitLidKaart lidKaart;

    @Before
    public void setUp() throws Exception {
        lidKaart = new HallowFitLidKaart();
    }

    @Test
    public void kostprijs_GroepslessenKrijgen10PercentKorting() throws Exception {
        LidKaart lidKaartMetGroepslessenKorting = new GroepslessenKorting(lidKaart);

        assertThat(lidKaartMetGroepslessenKorting.kostprijs()).isEqualTo(9);
    }

    @Test
    public void omschrijving_VoegGroepslessenKortingToe() throws Exception {
        LidKaart lidKaartMetGroepslessenKorting = new GroepslessenKorting(lidKaart);

        assertThat(lidKaartMetGroepslessenKorting.omschrijving()).isEqualTo("HallowFit\nKorting - Groepslessen: 10%\n");
    }
}