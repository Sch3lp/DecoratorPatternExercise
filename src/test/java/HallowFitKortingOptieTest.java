import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HallowFitKortingOptieTest {

    private HallowFitLidKaart hallowFitLidKaart;

    @Before
    public void setUp() throws Exception {
        hallowFitLidKaart = new HallowFitLidKaart();
    }

    @Test
    public void omschrijving_VoegtKortingToe() throws Exception {
        DummyHallowFitKortingOptie hallowFitKortingOptie = new DummyHallowFitKortingOptie(hallowFitLidKaart);

        assertThat(hallowFitKortingOptie.omschrijving()).isEqualTo("HallowFit\nKorting - ");
    }

    private class DummyHallowFitKortingOptie extends HallowFitKortingOptie {
        public DummyHallowFitKortingOptie(HallowFitLidKaart lidKaart) {
            super(lidKaart);
        }

        @Override
        public double kostprijs() {
            return 0;
        }
    }
}