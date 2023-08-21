import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("a","b","c","d",CustomerType.VIP,50);
        Customer customer2 = new Customer("a","b","c","d",CustomerType.VIP,50);
        Show show1 = new Show("duduAharon",LocalDate.now());

        VipTicket ticket1 = new VipTicket(show1,5,16,customer1,50, 10);
        RegularTicket ticket2 = new RegularTicket(show1,5,16,customer2,50);

        System.out.println(ticket1.getTotalPrice());
        System.out.println(ticket2.getTotalPrice());


    }
}