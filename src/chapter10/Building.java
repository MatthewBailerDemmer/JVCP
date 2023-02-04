package chapter10;

public class Building implements CarbonFootPrint {
    private int nApartments;
    private  double cOper;

    public Building(int nApartments, double cOper) {
        this.setnApartments(nApartments);
        this.cOper = cOper;
    }

    public int getnApartments() {
        return nApartments;
    }
    public void setnApartments(int nApartments) {
        if(nApartments < 0)
            throw new IllegalArgumentException(
                    "Number of apartments must be > 0");

        this.nApartments = nApartments;
    }

    public double getcOper() {
        return cOper;
    }

    public void setcOper(double cOper) {
        this.cOper = cOper;
    }

    @Override
    public double getCarbonFootPrint() {
        return cOper * nApartments;
    }
    @Override
    public String toString() {
        return String.format("Building with %d apartments, with %.2f C02 emissions per apartment",
                this.getnApartments(),this.getcOper());
    }

}
