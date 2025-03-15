package vn.edu.iuh.fit.observer_pattern.stock_market;

import vn.edu.iuh.fit.observer_pattern.stock_market.concrete_observer.IndividualInvestor;
import vn.edu.iuh.fit.observer_pattern.stock_market.subject.Stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Apple", 150.0);

        IndividualInvestor investor1 = new IndividualInvestor("Alice");
        IndividualInvestor investor2 = new IndividualInvestor("Bob");

        stock.attach(investor1);
        stock.attach(investor2);

        System.out.println("Thay đổi giá cổ phiếu...");
        stock.setPrice(155.5);
        stock.setPrice(160.0);
    }
}

