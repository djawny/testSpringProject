package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarService carService;

    @RequestMapping
    public List<Car> getAllCars(){
        return carService.getCars();
    }

    @RequestMapping("/{id}")
//    public Car getById(@PathVariable String id){
    public Car getById(@PathVariable("id") String id) throws CarNotFoundException {
        return carService.getById(id);
    }


    @RequestMapping("/car")
//    public Car getById(@PathVariable String id){
    public List<Car> getByBrand(@RequestParam("brand") String brand)  {
        return carService.getByBrand(brand);
    }

}
