public abstract class HallowFitActiviteitenDecorator implements LidKaart {

    private LidKaart lidkaart;

    public HallowFitActiviteitenDecorator(LidKaart lidkaart) {
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
