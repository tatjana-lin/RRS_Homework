package Homeworks.HW21_generics;

public class Main {
    public static void main(String[] args) {
        Repository<Order, Integer> testOrderRepository = new TestRepository<>();
        testOrderRepository.save(new Order(1, 100, 1000));
        System.out.println(testOrderRepository.findAll());

        Repository<Customer, Long> testCustomerRepository = new TestRepository<>();
        testCustomerRepository.save(new Customer(2L, "TestCustomerName"));
        System.out.println(testCustomerRepository.findAll());
    }
}
