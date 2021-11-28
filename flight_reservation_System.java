class Passenger {
  private String id;  
 private int phoneNo;
 private String emailId;
 private String name;
 
 public Passenger( String id ,int phoneNo, String emailid, String name){
    this.id;
    this.phoneNo;
    this.emailId;
    this.name;
    
} 
 
    public int getPassengerCount() {
        return passengerCount;
  
    }



     public void setId(String id) {
        this.id =id;
    }

    
    public void setPhoneNo(String phoneNo) {
        this.phoneNo= phoneNo;
    }

     public void setEmailId(String emailId) {
        this.emailId= emailId;
   }

     public void setName(String name) {
        this.name= name;
  
   
    
    class Address{
        
        private String houseNo;
        private String streetNo;
        private String city;
        
       public Address(String houseNo, String streetNo, String city){
    this.houseNo;
    this.streetNo;
    this.city;
       }
       
      
    public void setHouseNo(String houseNo) {
        this.houseNo= houseo;
    }

     public void setStreetNo(String StreetNo) {
        this.streetNo= streetNo;
   }

     public void setCity(String city) {
        this.city= city;
     }
  
        
        
        
        
        
        
    }
    
    
    class Contact{
    private String name;
    private int  phoneNo;
    
    
     public Contact(String name, int phoneNo){
    this.name;
    this.phoneNo;
       }
    
      
    public void setName(String name) {
        this.name= name;
    }




     public void setPhoneNo(String phoneNo) {
        this.phoneNo= phoneNo;
   }

    
    
}
}
}



public class Flight {
    // atrributes = value
    private int trackFlightNumbe;
    private String flightName;
    private int flightCapacity;
    private int numberOfSeatBooked;

   
    // constructor
    public Flight() {
    }


    public Flight(int trackFlightNumber, String flightName, int flightCapacity, int numberOfSeatBooked) {
        this.trackFlightNumber = trackFlightNumber;
        this.flightName = flightName;
        this.flightCapacity = flightCapacity;
        this.seatBooked = numberOfSeatBooked;

    }

   
    public int getTrackFlightNumber() {
        return trackFlightNumber;
    }

  
    public int getFlightName() {
        return flightName;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }

    public int getNumberOfSeatBooked() {
        return numberOfSeatBooked;
    }

    public void setNumberOfSeatBooked(int numberOfSeatBooked) {
        this.numberOfSeatBooked = numberOfSeatBooked;
    }

}


 
class Ticket {
    private int pnrNo;
    private int destinationLocation;
    private String nameOfFlightBooked;
    private int dateAndTimeOfArrival;
    private int dateAndTimeOfDeparture;
    private int seatNumber;
    private int priceOfTicket;
    private int checkStatusOfFlight;
    private int cancelTicket;
    private Flight ad1;
    private Passenger ad2;
    
    //constructor parametrise
    public Ticket (int trackPnrNo ,String destinationLocation, int nameOfFlightBooked, int dateAndTimeOfArrival ,int dateAndTimeOfDeparture, int seatNumber,int priceOfTicket,int checkStatusOfFlight ,int cancelTicket,Flight ad1,Passenger ad2){
           this.pnrNo;
           this.destinationLocation;
           this.nameOfFlightBooked;
           this.dateAndTimeOfArrival;
           this.dateAndTimeOfDeparture;
           this.seatNumber;
           this.priceOfTicket;
           this.checkStatusOfFlight;
           this.cancelTicket;
           this.Flight ad1;
           this.Passenger ad2;
           }

    //method 
     public int getPnrNo(){
       return pnrNo;
   }
  
    public int getDestinationLocation() {
        return destinationLocation;
  
  
    }
     public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation= destinationLocation;
   }
 
  
   public String getNameOfFlightBooked(){
        return nameOfFlightBooked;
    }
    
 
    public int getDateAndTimeOfArrival(){
        return dateAndTimeOfArrival;
    }
 
     public void setDateAndTimeOfArrival(String dateAndTimeOfArrival){
        this.dateAndTimeOfArrival= dateANdTimeOfArrival;
     }
   
    public String getDateAndTimeOfDeparture(){
        return dateAndTimeOfDeparture ;
    }
    
    
     public void setDateAndTimeOfDeparture(int dateAndTimeOfDeparture){
        this.dateAndTimeOfDeparture=dateAndTimeOfDeparture;
   }
 
 
   public String getSeatNo(){
        return seatNo;
    }
    
  
     public void setSeatNo(int seatNo){
        this.seatNo= seatNo;
     }
    
    
   public String getPriceOfTicket(){
        return priceOfTicket;
    }
 
     public void setPriceOfTicket(int priceOfTicket){
        this.priceOfTicket =priceOfTicket;
     }
    public String getCheckStatusOfFlight(){
        return checkstatusOfFlight;
    }
    public String getCancelFlight(){
        return cancelFlight;
    }
    
        
    
}

public class RegularTicket extends Ticket{

private String seatNo;
private String ticketType;
private String specialFood;
private String specialWater;
private String specialSnacks;


 public RegularTicket(){
    super();
    this.seatNo;
    this.ticketType;
    this.specialFood;
    this.specialWater;
    this.specialSnacks;
    
} 
  
   public String getSeatNo(){
       return seatNo;
   }
 
    public void setSeatNo(String seatNo) {
        this.seatNo= seatNo;
    }
   
   
    public int getTicktType() {
        return ticketType;
  
    }
  
  
     public void setTicketType(String ticketType) {
        this.ticketType= ticketType;
   }
 
   public String getSpecialFood(){
        return specialFood;
    }
    
    
     public void setSpecialFood(String specialFood) {
        this.specialFood= specialFood;
     }
     
     
    public String getSpecialWater(){
        return specialWater;
    }
  
  
     public void setSpecialWater(String specialWater) {
        this.specialWater= specialWater;
     }
  
  
    public String getSpecialSnacks(){
        return specialSnacks;
    }
     
      public void setSpecialSnacks(String specialSnacks) {
        this.specialSnacks= specialSnacks;
    }
    }
    

public class TouristTicket extends Ticket{

private int seatNo;
private String ticketType;
private String touristHotel;
private String touristHotelAddress;

TouristTicket(){
    super();
    this.seatNo;
    this.ticketType;
    this.touristHotel;
    this.touristHotelAddress;
    
} 
   public String getSeatNo(){
       return seatNo;
   }
    public void setSeatNo(String seatNo) {
        this.seatNo= seatNo;
    }
    public int getTicktType() {
        return ticketType;
  
  
  
    }
    
     public void setTicketType(String ticketType) {
        this.ticketType= ticketType;
     }
     
     
     public String gettouristHotel(){
        return touristHotel;
    }
    
    
     public void setTouristHotel(String touristHotel) {
        this.touristHotel=touristHotel;
     }
     
    public String getTouristHotelAddress(){
        return touristHotelAddress;
    }
  
  
  
     
    }