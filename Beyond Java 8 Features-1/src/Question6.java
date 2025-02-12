//Q6) You are tasked with writing a processOrderStatus method that takes an OrderStatus enum as input and returns a descriptive string based on the order status.
//Here's the OrderStatus enum:
//
//public enum OrderStatus {
//    PENDING,
//    PROCESSING,
//    SHIPPED,
//    DELIVERED,
//    CANCELLED,
//    REFUNDED
//}
//Your processOrderStatus method should adhere to the following rules:
//
//For PENDING orders, return: "Order is awaiting confirmation."
//For PROCESSING orders, return: "Order is being prepared."
//For SHIPPED orders, return: "Order has been dispatched."
//For DELIVERED orders, return: "Order has been successfully delivered."
//For CANCELLED orders, return: "Order has been canceled."
//For REFUNDED orders, return: "Refund has been issued for the order."
//Use a single switch expression to achieve this.
//
//Enhancements:
//
//yield Keyword: If your logic requires more complex processing within a case, demonstrate the use of the yield keyword to return a value from the switch expression.

public class Question6 {
    public enum OrderStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
    }

    public static String processOrderStatus(OrderStatus status) {
        return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> "Order has been canceled.";
            case REFUNDED -> {
                String message = "Refund has been issued for the order.";
                yield message;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(processOrderStatus(OrderStatus.PENDING));
        System.out.println(processOrderStatus(OrderStatus.PROCESSING));
        System.out.println(processOrderStatus(OrderStatus.SHIPPED));
        System.out.println(processOrderStatus(OrderStatus.DELIVERED));
        System.out.println(processOrderStatus(OrderStatus.CANCELLED));
        System.out.println(processOrderStatus(OrderStatus.REFUNDED));
    }
}