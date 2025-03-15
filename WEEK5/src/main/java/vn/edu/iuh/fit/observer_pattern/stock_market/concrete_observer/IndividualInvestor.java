package vn.edu.iuh.fit.observer_pattern.stock_market.concrete_observer;

import vn.edu.iuh.fit.observer_pattern.stock_market.observer.Observer;

public class IndividualInvestor implements Observer {
    private String name;

    public IndividualInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Nhà đầu tư " + name + " nhận được thông báo: Giá cổ phiếu "
                + stockName + " đã thay đổi thành " + price);
    }
}
