import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HallowFitActiviteitOptieTest {

    private HallowFitLidKaart hallowFitLidKaart;

    @Before
    public void setUp() throws Exception {
        hallowFitLidKaart = new HallowFitLidKaart();
    }

    @Test
    public void omschrijving_VoegtActiviteitenToe() throws Exception {
        DummyHallowFitActiviteitOptie hallowFitActiviteitOpties = new DummyHallowFitActiviteitOptie(hallowFitLidKaart);

        assertThat(hallowFitActiviteitOpties.omschrijving()).isEqualTo("HallowFit\nActiviteit - ");
    }

    private class DummyHallowFitActiviteitOptie extends HallowFitActiviteitOptie {
        public DummyHallowFitActiviteitOptie(HallowFitLidKaart lidKaart) {
            super(lidKaart);
        }

        @Override
        public double kostprijs() {
            return 0;
        }
    }
}