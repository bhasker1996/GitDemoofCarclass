import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Car class Demo");

        Car c1 = new Car(100000, 1200);
        Car c2 = new Car(200000, 1000);
        Car c3 = new Car(300000, 800);
        Car c4 = new Car(400000, 600);

        List<Car> carList = new ArrayList<>(Arrays.asList(c2,c1,c4,c3));
        carList.sort(new CarPriceComparator());

        System.out.println(carList);
    }
}