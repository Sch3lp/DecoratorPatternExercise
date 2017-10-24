public class HallowFitLidKaart implements LidKaart {

    private double basisPrijs = 10;
    private String omschrijving = "HallowFit\n";

    @Override
    public double kostprijs() {
        return basisPrijs;
    }

    @Override
    public String omschrijving() {
        return omschrijving;
    }
}
