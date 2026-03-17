package ua.uni;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class Car {
    String model;

    public static void main(String[] args) {
        Engine engine = new Engine(150);
        System.out.println(engine);
    }

    @ToString
    @AllArgsConstructor
    static class Engine {
        int horsepower;
    }

    Engine spec() {
        return new Engine(150);
    }
}
