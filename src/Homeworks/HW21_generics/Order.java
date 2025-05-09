package Homeworks.HW21_generics;

public class Order implements EntityWithId<Integer>{

    private final Integer orderId;
    private final int customerId;
    private final double amount;

    public Order(Integer orderId, int customerId, double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public Integer getId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", amount=" + amount +
                '}';
    }
}
