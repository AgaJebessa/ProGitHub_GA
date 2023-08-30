
import java.util.*;

//class Reservation inherit attributes and methods from class Manager
public class  Reservation extends   Manager {

public String reservationNumber;


public  String lodgingMailingAddress;


public  String lodgingPhysicalAddress;


public  Date reseravtionStartDate;


public Integer numberOfNights;


public  Integer numberofBedrooms;


public  Integer numberOfBathroom;


public  Double lodgingSizeInSF;


public  String contactPhoneNumber;

//calculate the reservation price.
public float calculatePrice() {
        // TODO implement here
        return 0.0f;
}
        // cancel the reservation
public  Boolean cancelReservation( String accountNumber) {
        // TODO implement here
        return null;
}


 //format and return object's data in XML format

public  String toString() {
        return null;
        // TODO implement here
        }

//create and return a copy of the object
public  Reservation clone() {
        // TODO implement here

return null;

        }

        }