package chapter10;

public class Bicycle  implements CarbonFootPrint{
    private double Kilometers;
    private final double  averageHuman = .005;

    public Bicycle(double k) {
        this.setKilometers(k);
    }


    public double getKilometers() {
        return Kilometers;
    }


    public void setKilometers(double kilometers) {
        if(kilometers < 0)
            throw new IllegalArgumentException(
                    "Kiometers must be >= 0");

        Kilometers = kilometers;
    }


    public double getAverageHuman() {
        return averageHuman;
    }

    @Override
    public double getCarbonFootPrint() {
        return this.getKilometers() * this.getAverageHuman();
    }

    @Override
    public String toString() {
        return String.format("Bicycle riding %.2f kilometers with an average human emission of %.2f per kilometer",
                this.getKilometers(), this.getAverageHuman());
    }
}
