package pl.sda;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("1", "Opel", "Vectra", 2001, "Silver"));
        cars.add(new Car("2", "Mazda", "6", 2005, "Black"));
        cars.add(new Car("3", "Ford", "Mondeo", 2010, "Red"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getById(String id) throws CarNotFoundException {
        return cars.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new CarNotFoundException());
    }

    public List<Car> getByBrand(String brand) {
        return cars.stream().filter(x -> x.getBrand().equals(brand)).collect(Collectors.toList());
    }
}
