package Wk3Assignment2;

import java.util.*;


public class Reservation extends Manager {

    public String reservationNumber;//  reservation number unique for the type of reservation

    public String lodgingMailingAddress;// lodging mailing address

    public String lodgingPhysicalAddress;//lodging physical address

    public Date reseravtionStartDate; //cabin reservation start date

    public Integer numberOfNights;//number of nights reserved

    public Integer numberofBedrooms; //number of cabin bedroom

    public Integer numberOfBathroom;// number of bathroom

    public Double lodgingSizeInSF;// lodging size in square feet

    public String contactPhoneNumber; // reservation contact phone


    public String basePrice;//Reservation base price

    //create and return a reservation price parameters
    public Reservation(String basePrice, final Integer addedPrice, float lodgingSizeInSF,
                       Integer numberOfBathRoom, Integer numberOffBedRooms) {
        //validate the parameters and assign value to the parameters.

    }

    public Reservation(String confirmationNumber, String lodgingPhysicalAddress) {
    }

    public Reservation() {
    }

    // calculate and return the reservation price
    public float calculatePrice() {
        /* calculate number of days for the reservation( from start date of reservation
         * and number of reservation per night)
         *reservationPricePeNight = basePrice + additional fees for each reservation type.
         * return total price number of nights * basePrice + additional fees
         */
        return 0.0f;
    }

// cancel the reservation using the account number

    public boolean cancelReservation(String accountNumber) {
        /* validate the parameter
         *Assign the parameter tobe canceled
         * return Reservation.cancelReservation()
         */
        return false;
    }

    public Reservation(String reservationNumber, String confirmationNumber,
                       Date reservationStartDate, String lodgingPhysicalAddress,
                       Integer numberOfNights) {
        /*
         * Validate parameters
         * Assign parameters's value to attributes
         */
    }

    //format and return object's data in XML format
    public String toString() {
        // return  "<reservationNumber>" + ... "</contactPhoneNumber>" ;
        return null;
    }

    //create and return a copy of the object
    public Reservation clone() {
        /* return new Reservation.(this.reservationNumber, this.lodgingMailingAddress,...+this.basePrice )
         *and any additional parent behavior.
         */
        return null;
    }
}