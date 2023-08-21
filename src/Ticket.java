public abstract class Ticket {

    private static int counter = 1;
    private int id;
    private Show show;
    private int rowNumber;
    private int seatNumber;
    private Customer ticketCustomer;
    private double price;

    public Ticket(Show show, int rowNumber, int seatNumber, Customer ticketsCustomer, double price) {
        this.id = counter++;
        this.show = show;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.ticketCustomer = ticketsCustomer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Customer getTicketCustomer() {
        return ticketCustomer;
    }

    public void setTicketCustomer(Customer ticketCustomer) {
        this.ticketCustomer = ticketCustomer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateTotalPrice() throws Exception;

}
