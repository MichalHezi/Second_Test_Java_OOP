import java.time.LocalDate;
import java.util.ArrayList;

public class Show {
    private static int counter = 1;
    private int id;
    private String showName;
    private LocalDate showDate;
    private ArrayList<Ticket>listOfShowTickets;

    public Show(String showName, LocalDate showDate) {
        this.id = counter++;
        this.showName = showName;
        this.showDate = LocalDate.now();
        this.listOfShowTickets = new ArrayList<Ticket>();
    }

    public int getId() {
        return id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public ArrayList<Ticket> getListOfShowTickets() {
        return listOfShowTickets;
    }

    public void setListOfShowTickets(ArrayList<Ticket> listOfShowTickets) {
        this.listOfShowTickets = listOfShowTickets;
    }

    public void addTicketsToListOfShow(Ticket ticket){
        this.listOfShowTickets.add(ticket);
    }

    public void removeTicketsFromListOfShow(Ticket ticket){
        this.listOfShowTickets.remove(ticket);
    }
}
