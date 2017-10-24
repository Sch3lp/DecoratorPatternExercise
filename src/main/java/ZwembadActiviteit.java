public class ZwembadActiviteit extends HallowFitActiviteitOptie {

    private final int kostprijs = 3;

    public ZwembadActiviteit(LidKaart lidkaart) {
        super(lidkaart);
    }

    @Override
    public double kostprijs() {
        return getLidKaart().kostprijs() + kostprijs;
    }

    @Override
    public String omschrijving() {
        return super.omschrijving() + String.format("Zwembad: %d\n",kostprijs);
    }
}
