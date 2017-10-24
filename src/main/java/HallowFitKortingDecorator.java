public abstract class HallowFitKortingDecorator implements LidKaart {

    private LidKaart lidkaart;

    public HallowFitKortingDecorator(LidKaart lidkaart) {
        this.lidkaart = lidkaart;
    }

    @Override
    public String omschrijving() {
        return lidkaart.omschrijving() + "Korting - ";
    }

    protected LidKaart getLidkaart() {
        return lidkaart;
    }
}
