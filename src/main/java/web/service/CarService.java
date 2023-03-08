package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> carsList = Arrays.asList(
            new Car("BMW", "o007oo58", 1999),
            new Car("VAZ", "е123кх58", 2008),
            new Car("Mazda", "р234от58", 2002),
            new Car("MAN", "р544ут58", 2015),
            new Car("UAZ", "о731са58", 2012));

    public List<Car> getCarsList() {
        return carsList;
    }

    public List<Car> getCountCars(List<Car> carList, Integer size) {
        return carList.stream()
                .limit(size)
                .collect(Collectors.toList());
    }
}
