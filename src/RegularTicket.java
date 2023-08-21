public class RegularTicket extends Ticket {

    private double totalPrice =0;
    public RegularTicket(Show show, int rowNumber, int seatNumber, Customer ticketsCustomer, double price) {
        super(show, rowNumber, seatNumber, ticketsCustomer, price);
        totalPrice = calculateTotalPrice();
    }

    @Override
    public double calculateTotalPrice() {
        return this.getPrice();
    }

    public double getTotalPrice(){
        return totalPrice;
    }
}
