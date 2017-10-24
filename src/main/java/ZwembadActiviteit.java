public class ZwembadActiviteit extends HallowFitActiviteitOptie {

    private static final int KOSTPRIJS = 3;

    public ZwembadActiviteit(LidKaart lidkaart) {
        super(lidkaart);
    }

    @Override
    public double kostprijs() {
        return getLidKaart().kostprijs() + KOSTPRIJS;
    }

    @Override
    public String omschrijving() {
        return super.omschrijving() + String.format("Zwembad: %d\n", KOSTPRIJS);
    }
}
