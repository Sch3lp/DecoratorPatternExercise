public abstract class HallowFitKortingOptie implements LidKaart {

    private LidKaart lidkaart;

    public HallowFitKortingOptie(LidKaart lidkaart) {
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
