import java.util.*;

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    private final boolean[] seats;
    private final int totalSeats;

    public Reservation(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats + 1];
    }

    public void reserveSeat(int seatNumber) throws SeatAlreadyBookedException, IllegalArgumentException {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            throw new IllegalArgumentException("Invalid seat number! Please choose a seat between 1 and " + totalSeats + ".");
        }
        if (seats[seatNumber]) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked!");
        }
        seats[seatNumber] = true;
        System.out.println("Success: Seat " + seatNumber + " has been successfully reserved.");
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation system = new Reservation(10);
        System.out.println("Dhruv Prakash - 1BM25CS114");
        while(true){
           System.out.println("=== RAILWAY RESERVATION SYSTEM ===");
           System.out.print("Enter seat number to reserve (1-10), press 0 to exit: ");
   
           try {
               
               int seatNumber = scanner.nextInt(); 
               if (seatNumber == 0) break;
               system.reserveSeat(seatNumber);
   
           } 
          
           catch (InputMismatchException e) {
               
               System.err.println("Error: Invalid input type.");
           } 
           catch (IllegalArgumentException e) {
               
               System.err.println("Error: " + e.getMessage());
           } 
           catch (SeatAlreadyBookedException e) {
               
               System.err.println("Error: " + e.getMessage());
           } 
           
           finally {
               System.out.println("\n[Transaction Status]: Reservation attempt process completed.");
           }
        } 
    }
}