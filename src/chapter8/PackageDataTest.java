package chapter8;

public class PackageDataTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PackageData packageData = new PackageData();

        System.out.printf("After instantiation:%n%s%n", packageData);

        packageData.number = 77;
        packageData.string = "Goodbye";

        System.out.printf("%n After changing values:%n%s%n",packageData);
    }

}
