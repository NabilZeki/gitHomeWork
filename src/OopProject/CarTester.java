package OopProject;

public class CarTester {

    public static void main(String[] args) {

        Truck truck = new Truck(50000,"Red", 60000);
        System.out.println("Truck  "+truck.calculateSalePrice());

        Sedan sedan = new Sedan(20000,"Silver", 21);
        System.out.println("Sedan "+sedan.calculateSalePrice());

    }
}