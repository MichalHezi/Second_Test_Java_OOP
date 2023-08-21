public class VipTicket extends Ticket {

    private final double discount;
    private double totalPrice = 0;



    public VipTicket(Show show, int rowNumber, int seatNumber, Customer ticketsCustomer, double price, double discount) {
        super(show, rowNumber, seatNumber, ticketsCustomer, price);
        this.discount = discount;

        try {
            totalPrice = calculateTotalPrice();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double calculateTotalPrice() throws Exception {
        if (getTicketCustomer().getCustomerType() != CustomerType.VIP){
            throw new Exception();
        }
        return this.getPrice() - discount;
    }

    public double getTotalPrice(){
        return totalPrice;
    }
}
