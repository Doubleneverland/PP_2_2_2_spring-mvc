package web.dao;


import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Mondeo", 2013));
        cars.add(new Car("Toyota", "Corolla", 2014));
        cars.add(new Car("Fiat", "Doblo", 2008));
        cars.add(new Car("Daewoo", "Sens", 2005));
        cars.add(new Car("Volvo", "C90", 2020));
    }

    public List<Car> carByCount(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
    public List<Car> carList() {
        return cars;
    }
}
