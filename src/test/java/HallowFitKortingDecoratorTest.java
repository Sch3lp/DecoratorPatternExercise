import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HallowFitKortingDecoratorTest {

    private HallowFitLidKaart hallowFitLidKaart;

    @Before
    public void setUp() throws Exception {
        hallowFitLidKaart = new HallowFitLidKaart();
    }

    @Test
    public void omschrijving_VoegtKortingToe() throws Exception {
        DummyHallowFitKortingDecorator hallowFitDecorator = new DummyHallowFitKortingDecorator(hallowFitLidKaart);

        assertThat(hallowFitDecorator.omschrijving()).isEqualTo("HallowFit\nKorting - ");
    }

    private class DummyHallowFitKortingDecorator extends HallowFitKortingDecorator {
        public DummyHallowFitKortingDecorator(HallowFitLidKaart lidKaart) {
            super(lidKaart);
        }

        @Override
        public double kostprijs() {
            return 0;
        }
    }
}