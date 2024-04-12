import java.util.Date;

interface TicketOperations {
    void findTicket(String searchQuery);
    boolean reserveTicket(TravelTicket ticket);
    boolean withdrawTicket(int ticketIdentifier);
    boolean processPayment(double paymentAmount);
    void updateCustomerDetails(Traveler customer);
}

class Traveler {
    private String travelerId;
    private String fullName;
    private String residentialAddress;
    private String contactNumber; 
    private int currentAge;

    public Traveler(String travelerId, String fullName, String residentialAddress, String contactNumber, int currentAge) {
        this.travelerId = travelerId;
        this.fullName = fullName;
        this.residentialAddress = residentialAddress;
        this.contactNumber = contactNumber;
        this.currentAge = currentAge;
    }

    public void provideDetails(String fullName, String residentialAddress, String contactNumber, int currentAge) {
        this.fullName = fullName;
        this.residentialAddress = residentialAddress;
        this.contactNumber = contactNumber;
        this.currentAge = currentAge;
    }

    public void alterDetails(String fullName, String residentialAddress, String contactNumber, int currentAge) {
        provideDetails(fullName, residentialAddress, contactNumber, currentAge);
    }

}

class TravelAgent implements TicketOperations {
    private String agentId;
    private String agentName;

    public TravelAgent(String agentId, String agentName) {
        this.agentId = agentId;
        this.agentName = agentName;
    }

    public void findTicket(String searchQuery) {
    }

    public boolean reserveTicket(TravelTicket ticket) {
        return true;
    }

    public boolean withdrawTicket(int ticketIdentifier) {
        return true;
    }

    public boolean processPayment(double paymentAmount) {
        return true;
    }

    public void updateCustomerDetails(Traveler customer) {
    }

}

class TicketDesk {
    private String deskId;
    private String deskLocation;

    public TicketDesk(String deskId, String deskLocation) {
        this.deskId = deskId;
        this.deskLocation = deskLocation;
    }
}

class TravelTicket {
    private String departurePoint;
    private String arrivalPoint;
    private Date journeyDate;
    private String departureTime;
    private String vehicleNumber; 
    private String assignedSeat;

    public TravelTicket(String departurePoint, String arrivalPoint, Date journeyDate, String departureTime, String vehicleNumber, String assignedSeat) {
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.journeyDate = journeyDate;
        this.departureTime = departureTime;
        this.vehicleNumber = vehicleNumber;
        this.assignedSeat = assignedSeat;
    }

}

class abc {
    private double refundAmount;
    private String travelerId;

    public PaymentRefund(double refundAmount, String travelerId) {
        this.refundAmount = refundAmount;
        this.travelerId = travelerId;
    }

    public boolean initiateRefund() {
        return true;
    }

}
