package controller;

import racingcar.Car;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RaceController {
    public void start() {
        Car car = new Car();
        setCars(car);
    }


    public void setCars(Car car) {
        try {
            car.addCar(InputView.printSetCarsNameMessage());
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e);
            setcars(car);
        }
    }


}
