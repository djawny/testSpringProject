package pl.sda;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car.Builder("123").withBrand("Opel").withModel("Vectra").build();
    }
}
