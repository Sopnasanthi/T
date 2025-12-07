import java.util.*;
class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        boolean run=true;
        while(run){
            System.out.println("1.CREATE BOOKING \n2.SHOW ALL THE BOOKING DETAILS \n3.CHANGE SEAT \n4.CANCEL BOOKING \n5.EXIT");
            System.out.print("\nCHOOSE: ");
            int choice=scan.nextInt();
            switch (choice) {
                case 1:
                    TicketBooking.ticketBooking();
                    System.out.println("Ticket Booked Successfully... ");
                    break;
                case 2:
                    TicketBooking.viewDetails();
                    break;
                case 3:
                    //booking();
                    break;
                case 4:
                    TicketBooking.delete();
                    break;
                case 5:
                    System.out.println("THANK YOU.......");
                    run=false;
                    break;
                default:
                    System.out.println("INVALID CHOICE!");
                    break;
            }
        }
    }
}