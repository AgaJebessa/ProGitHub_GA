package Wk3Assignment2;

import java.util.*;

public class HouseReservation extends Reservation {

    public Address houseAddress;

    public String accountNumber;

    public Integer numberOfFloor;

    public Boolean fullKitchen;

    public HouseReservation(String reservationNumber, String confirmationNumber,
                            Date reservationStartDate, String lodgingPhysicalAddress,
                            Integer numberOfNights) {
        super(confirmationNumber, lodgingPhysicalAddress);
    }

    public void houseReservation() {

    }

    public void houseReservation(Address houseAddress, String confirmationNumber, Integer numberOfFloor) {
        /*
        *validate parameter
        * Assign value to parameter
         */
    }

    //format and return object's data in XML format
    public String toString() {

        return null;
    }

    //create and return a copy of the object
    public HouseReservation clone() {

        return null;
    }

}