public abstract class HallowFitActiviteitOptie implements LidKaart {

    private LidKaart lidkaart;

    public HallowFitActiviteitOptie(LidKaart lidkaart) {
        this.lidkaart = lidkaart;
    }

    @Override
    public String omschrijving() {
        return lidkaart.omschrijving() + "Activiteit - ";
    }

    protected LidKaart getLidKaart() {
        return lidkaart;
    }
}
