package chapter10;
import java.util.ArrayList;

public class CarbonFootPrintTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<CarbonFootPrint> emissions = new ArrayList();
        Building solarHeidelberg = new Building(26,50);
        Car mustang = new Car(50,500);
        Bicycle caloi = new Bicycle(1000);
        double totalEmissions = 0;

        emissions.add(solarHeidelberg);
        emissions.add(mustang);
        emissions.add(caloi);

        for(CarbonFootPrint emissor : emissions) {
            System.out.printf("Emissor %s%nEmites: %.2f%n%n",
                    emissor.toString(), emissor.getCarbonFootPrint());
            totalEmissions += emissor.getCarbonFootPrint();
        }
        System.out.printf("Total of C02 emissons: %.2f", totalEmissions);
    }

}
