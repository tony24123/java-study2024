package chap1_6.practice.q3;

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("글래디에이터2", "C1");
        MovieTicket ticket2 = new MovieTicket("글래디에이터2", "C2");
        MovieTicket ticket3 = new MovieTicket("글래디에이터2", "C3");

        ticket1.cancelBooking();
        ticket2.bookSeat();
        ticket2.bookSeat();
        ticket3.cancelBooking();
        ticket3.bookSeat();
        ticket3.bookSeat();
    }
}
