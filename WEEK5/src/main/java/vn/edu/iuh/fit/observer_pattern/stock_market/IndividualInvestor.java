package vn.edu.iuh.fit.observer_pattern.stock_market;

public class IndividualInvestor implements Investor {
    private String name;

    public IndividualInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println(name + " nhận thông báo: Giá cổ phiếu " + stockName + " đã thay đổi thành: $" + newPrice);
    }
}
