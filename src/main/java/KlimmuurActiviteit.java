public class KlimmuurActiviteit extends HallowFitActiviteitOptie {

    private final static int KOSTPRIJS = 5;

    public KlimmuurActiviteit(LidKaart lidkaart) {
        super(lidkaart);
    }

    @Override
    public double kostprijs() {
        return getLidKaart().kostprijs() + KOSTPRIJS;
    }

    @Override
    public String omschrijving() {
        return super.omschrijving() + String.format("Klimmuur: %d\n", KOSTPRIJS);
    }
}
