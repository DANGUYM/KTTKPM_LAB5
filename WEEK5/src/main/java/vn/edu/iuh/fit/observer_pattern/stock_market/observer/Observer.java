package vn.edu.iuh.fit.observer_pattern.stock_market.observer;

public interface Observer {
    void update(String stockName, double price);
}
