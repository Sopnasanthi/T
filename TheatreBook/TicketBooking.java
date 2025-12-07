import java.util.*;
public class TicketBooking {
    static Scanner scan=new Scanner(System.in);


    static void ticketBooking(){
        System.out.print("Enter your Name: ");
        String name=scan.next();
        System.out.print("Enter Date: ");
        String date=scan.next();
        System.out.print("Enter Movie Name: ");
        String movieName=scan.next();
        System.out.print("Enter Your Seat No: ");
        String seatNo=scan.next();
        System.out.print("Enter Your Password(3 Digits): ");
        int password=scan.nextInt();
        Booking ticketBooking=new Booking();

        ticketBooking.setName(name);
        ticketBooking.setDate(date);
        ticketBooking.setMovieName(movieName);
        ticketBooking.setSeatNo(seatNo);
        int ticketNo=StoreBookingDetail.getMap().size()+1;
        ticketBooking.setTicketNo(ticketNo);
        ticketBooking.setPassword(password);
        StoreBookingDetail.getMap().put(ticketNo,ticketBooking);

    }
    static void viewDetails(){
        System.out.println("1.View All the details \n2.View specific details \n3.Back");
        System.out.print("\nChoose: ");
        int option=scan.nextInt();
        switch (option) {
            case 1:
                 if (StoreBookingDetail.getMap().size()==0) {
                    System.out.println("List is Empty");
                 }
                 else{
                     for(Booking i:StoreBookingDetail.getMap().values()){
                        System.out.println(i);
                    }
                 }
                break;
            case 2:
                    System.out.print("\nGive Ticket No to view the specific details:");
                    int t=scan.nextInt();
                    if (!StoreBookingDetail.getMap().containsKey(t)) {
                        System.out.println("Ticket number is not found in booked list.");
                    }
                    else{
                        System.out.println(StoreBookingDetail.getMap().get(t));
                    }

            case 3:
                break;
        }
    }
    static void delete(){
        System.out.print("\nGive Ticket No to delete the specific detail: ");
        int t=scan.nextInt();
        System.out.print("Enter you password to delete detail: ");
        int password=scan.nextInt();
        if (StoreBookingDetail.getMap().size()==0) {
                    System.out.println("List is Already Empty");
        }
        else{
             if (!StoreBookingDetail.getMap().containsKey(t)) {
                 System.out.println("Ticket number is not found in booked list.");
            }
             else{
                 if(StoreBookingDetail.getMap().get(t).getPassword()!=password){
                      System.out.println("Incorrect Password");
                 }
                else{
                    StoreBookingDetail.getMap().remove(t);
                    System.out.println("Deleted successfully...");
                }
            }
        }
       
    }
}
