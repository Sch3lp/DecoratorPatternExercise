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

    public static HallowFitLidKaartBuilder eenLidKaart() {
        return new HallowFitLidKaartBuilder();
    }

    public static class HallowFitLidKaartBuilder {
        private LidKaart hallowFitLidKaartToBeBuilt;

        private HallowFitLidKaartBuilder(){
            hallowFitLidKaartToBeBuilt = new HallowFitLidKaart();
        }

        public HallowFitLidKaartBuilder metKlimmuur() {
            hallowFitLidKaartToBeBuilt = new KlimmuurActiviteit(hallowFitLidKaartToBeBuilt);
            return this;
        }

        public HallowFitLidKaartBuilder alsGroeples() {
            hallowFitLidKaartToBeBuilt = new GroepslessenKorting(hallowFitLidKaartToBeBuilt);
            return this;
        }

        public HallowFitLidKaartBuilder metZwembad() {
            hallowFitLidKaartToBeBuilt = new ZwembadActiviteit(hallowFitLidKaartToBeBuilt);
            return this;
        }

        public LidKaart build() {
            return hallowFitLidKaartToBeBuilt;
        }
    }
}
