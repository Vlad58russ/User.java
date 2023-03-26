package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiseImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "o007oo58", 1999));
        cars.add(new Car("VAZ", "е123кх58", 2008));
        cars.add(new Car("Mazda", "р234от58", 2002));
        cars.add(new Car("MAN", "р544ут58", 2015));
        cars.add(new Car("UAZ", "о731са58", 2012));
    }

    public List<Car> printCarTable(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
