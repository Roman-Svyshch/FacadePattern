package org.example.bookingTicket.subSystem;

public class PaymentProccesor {
    public boolean processPayment(String paymentMethod) {
        System.out.println("Payment processed successfully using: " + paymentMethod);
        return true;
    }
}
