package programs.designPattern.behavioralDesignPattern.sagaDesignPattern.choreography;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
    private double amount;
}

/*@Data
@AllArgsConstructor
class OrderCreatedEvent {
    private final Order order;
}*/

// OR

record OrderCreatedEvent(Order order) {
}

/*@Component
public class InventoryService {
    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("Reserving inventory for order: " + event.getOrder().getId());
        System.out.println("Inventory reserved for order: " + event.getOrder().getId());
    }
}*/

/*@Component
public class PaymentService {
    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("Processing payment for order: " + event.getOrder().getId());
        // Simulate success or failure
        if (event.getOrder().getAmount() > 1000) {
            throw new RuntimeException("Payment failed");
        }
        System.out.println("Payment processed for order: " + event.getOrder().getId());
    }
}*/

/*
@Component
public class OrderService {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void createOrder(Order order) {
        System.out.println("Order created: " + order.getId());
        eventPublisher.publishEvent(new OrderCreatedEvent(order));
    }
}*/
