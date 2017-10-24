public class GroepslessenKorting extends HallowFitKortingOptie {

    public GroepslessenKorting(LidKaart lidkaart) {
        super(lidkaart);
    }

    @Override
    public double kostprijs() {
        return getLidkaart().kostprijs() * 0.9;
    }

    @Override
    public String omschrijving() {
        return super.omschrijving() + "Groepslessen: 10%\n";
    }
}
