package org.example.bookingTicket;

import org.example.bookingTicket.facade.TicketBookingFacade;
import org.example.bookingTicket.subSystem.BookingConfirmation;
import org.example.bookingTicket.subSystem.PaymentProccesor;
import org.example.bookingTicket.subSystem.TicketInventory;

public class ClientMain {
    public static void main(String[] args) {
        // Створюємо об'єкти підсистем: PaymentProccesor, TicketInventory та BookingConfirmation
        PaymentProccesor paymentProccesor = new PaymentProccesor();
        TicketInventory ticketInventory = new TicketInventory();
        BookingConfirmation bookingConfirmation = new BookingConfirmation();

        // Створюємо об'єкт класу TicketBookingFacade з використанням вже існуючих об'єктів підсистем
        TicketBookingFacade ticketBookingFacade = new TicketBookingFacade(paymentProccesor, ticketInventory, bookingConfirmation);

        // Викликаємо метод bookTicket для здійснення бронювання квитків
        String eventName = "Concert";
        int quantity = 2;
        String paymentMethod = "CreditCard";

        boolean bookingResult = ticketBookingFacade.bookTicket(eventName, quantity, paymentMethod);

        // Перевіряємо результат бронювання та виводимо відповідне повідомлення
        if (bookingResult) {
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed!");
        }
    }
}
