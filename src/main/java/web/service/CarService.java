package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;
@Component
public class CarService {
    CarDao carDao = new CarDao();

    public CarService() {
    }

    public List<Car> carByCount(int count) {
        return carDao.carByCount(count);
    }

    public List<Car> carList() {
        return carDao.carList();
    }
}
