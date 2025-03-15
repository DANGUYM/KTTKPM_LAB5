package vn.edu.iuh.fit.observer_pattern.stock_market;

public class StockObserverDemo {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.0);

        Investor investor1 = new IndividualInvestor("Nguyễn Văn A");
        Investor investor2 = new IndividualInvestor("Trần Thị B");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        // Thay đổi giá cổ phiếu -> Thông báo sẽ được gửi đến nhà đầu tư
        appleStock.setPrice(155.0);
        appleStock.setPrice(160.5);
    }
}
