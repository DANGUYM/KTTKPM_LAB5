package vn.edu.iuh.fit.observer_pattern.stock_market.subject;

import vn.edu.iuh.fit.observer_pattern.stock_market.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String name;
    private double price;
    private List<Observer> investors = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void attach(Observer observer) {
        investors.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        investors.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : investors) {
            observer.update(name, price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
