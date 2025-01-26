/*
package designPattern.behavioralDesignPattern.sagaDesignPattern.orchestration;

@Service
public class OrderOrchestrationSaga {
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private InventoryService inventoryService;

    public void placeOrder(Order order) {
        try {
            paymentService.processPayment(order);
            inventoryService.reserveStock(order);
        } catch (Exception e) {
            // Compensating Transactions
            paymentService.refundPayment(order);
            inventoryService.releaseStock(order);
        }
    }
}*/
