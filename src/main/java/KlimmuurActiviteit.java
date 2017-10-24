public class KlimmuurActiviteit extends HallowFitActiviteitOptie {

    private final int kostprijs = 5;

    public KlimmuurActiviteit(LidKaart lidkaart) {
        super(lidkaart);
    }

    @Override
    public double kostprijs() {
        return getLidKaart().kostprijs() + kostprijs;
    }

    @Override
    public String omschrijving() {
        return super.omschrijving() + String.format("Klimmuur: %d\n",kostprijs);
    }
}
