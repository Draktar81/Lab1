package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Room room = new Room("Lux", 5, 277, "Best room of our hotel", 260);

        Customer customer = new Customer("Antonio", "Banderos", "passport", "10.08.1960");

        Rent rent = new RentBuilder()
                .setRoom(room)
                .setCustomer(customer)
                .setDateOfStart("10.07.2024")
                .setDateOfEnd("15.07.2024")
                .setPaymentDetails("card")
                .build();
        
        System.out.println(rent);
    }
}