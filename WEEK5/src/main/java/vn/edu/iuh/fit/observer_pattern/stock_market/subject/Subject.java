package vn.edu.iuh.fit.observer_pattern.stock_market.subject;

import vn.edu.iuh.fit.observer_pattern.stock_market.observer.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
