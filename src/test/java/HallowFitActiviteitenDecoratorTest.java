import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HallowFitActiviteitenDecoratorTest {

    private HallowFitLidKaart hallowFitLidKaart;

    @Before
    public void setUp() throws Exception {
        hallowFitLidKaart = new HallowFitLidKaart();
    }

    @Test
    public void omschrijving_VoegtActiviteitenToe() throws Exception {
        DummyHallowFitActiviteitenDecorator hallowFitDecorator = new DummyHallowFitActiviteitenDecorator(hallowFitLidKaart);

        assertThat(hallowFitDecorator.omschrijving()).isEqualTo("HallowFit\nActiviteit - ");
    }

    private class DummyHallowFitActiviteitenDecorator extends HallowFitActiviteitenDecorator {
        public DummyHallowFitActiviteitenDecorator(HallowFitLidKaart lidKaart) {
            super(lidKaart);
        }

        @Override
        public double kostprijs() {
            return 0;
        }
    }
}