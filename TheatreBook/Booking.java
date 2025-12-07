public class Booking {
    private int ticketNo;
    private String name;
    private String date;
    private String movieName;
    private String seatNo;
    private int password;
    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
      public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
    public int getTicketNo() {
        return ticketNo;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getSeatNo() {
        return seatNo;
    }
  
    @Override
    public String toString() {
        return "TicketNo: " + ticketNo + "| Name: " + name + "| Date: " + date + "| MovieName: " + movieName
                + "| seatNo: " + seatNo + "|";
    }
   



}
