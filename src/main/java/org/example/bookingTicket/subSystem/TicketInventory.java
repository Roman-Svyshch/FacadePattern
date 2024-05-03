package org.example.bookingTicket.subSystem;

public class TicketInventory {
    public boolean checkAvailability(String eventName,int quantity){
        if (eventName != null && quantity > 0){
            return true;
        }else return false;
    }

    public void updateInventory(String eventName, int quantity) {
        System.out.println("Inventory updated after booking " + quantity + " tickets for event: " + eventName);
    }

}
