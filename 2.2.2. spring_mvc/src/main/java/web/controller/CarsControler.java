package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsControler {

    @GetMapping("/cars")
    public String cars(HttpServletRequest request, Model model) {
        String countString = request.getParameter("count");
        int count = 0;
        if (countString == null) {
            count = 999;
        } else {
            count = Integer.parseInt(countString);
        }

/*        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(WebConfig.class);*/

       // ArrayList<Car> allCars = new ArrayList<>();

        CarServiceImp carServiceImp = new CarServiceImp();

/*

        for (int i = 0; i < 5; i++) {
            //Car car = applicationContext.getBean(Car.class);
            Car car = new Car();
            car.setName(String.valueOf(i));
            car.setSeries(String.valueOf(i));
            car.setVin(String.valueOf(i));
            allCars.add(car);
            //cars.add(applicationContext.getBean(Car.class));
        }*/

       /* ArrayList<Car> cars = new ArrayList<>();*/

        int maxCount = Math.min(5, count);

        List<Car> cars = carServiceImp.getCars(maxCount);

/*        for (int i = 0; i < maxCount; i++) {

            cars.add(allCars.get(i));
*//*            StringBuilder stringBuilder = new StringBuilder();
            Car currentCar = cars.get(i);
            stringBuilder.append("Car " + (i+1) + ". Name: " + currentCar.getName()
                    + ". Series: " + currentCar.getSeries()
                    + ". Vin: " + currentCar.getVin());
            carsString.add(stringBuilder.toString());*//*
        }*/

        model.addAttribute("cars", cars);

        return "cars";
    }
}
