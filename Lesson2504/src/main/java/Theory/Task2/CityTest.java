package Theory.Task2;

import java.util.Arrays;

public class CityTest {
    public static void main(String[] args) {
        //City.valueOf("BERLIN");
        City[] cities = City.values();
        System.out.println(Arrays.toString(cities));
        City berlin = City.BERLIN;
        System.out.println(berlin);
        City lisbon = City.LISBON;
        System.out.println("lisbon.isPopular() - " + lisbon.isPopular());
    }
}
