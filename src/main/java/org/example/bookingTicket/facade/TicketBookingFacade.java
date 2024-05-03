package org.example.bookingTicket.facade;

import org.example.bookingTicket.subSystem.BookingConfirmation;
import org.example.bookingTicket.subSystem.PaymentProccesor;
import org.example.bookingTicket.subSystem.TicketInventory;

public class TicketBookingFacade {
    private PaymentProccesor paymentProccesor;
    private TicketInventory ticketInventory;
    private BookingConfirmation bookingConfirmation;

    public TicketBookingFacade(PaymentProccesor paymentProccesor, TicketInventory ticketInventory, BookingConfirmation bookingConfirmation) {
        this.paymentProccesor = paymentProccesor;
        this.ticketInventory = ticketInventory;
        this.bookingConfirmation = bookingConfirmation;
    }

    public boolean bookTicket(String eventName, int quantity, String paymentMethod) {
        // Перевірка наявності квитків
        if (ticketInventory.checkAvailability(eventName, quantity)) {
            // Обробка платежу
            if (paymentProccesor.processPayment(paymentMethod)) {
                // Надсилання підтвердження бронювання
                bookingConfirmation.sendConfirmation(eventName, quantity);
                // Оновлення інвентарю квитків
                ticketInventory.updateInventory(eventName, quantity);
                // Повертаємо true, якщо все пройшло успішно
                return true;
            } else {
                // Платіж не був успішним
                return false;
            }
        } else {
            // Квитки не доступні
            return false;
        }
    }

}
