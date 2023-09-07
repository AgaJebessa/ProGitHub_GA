package Wk3Assignment2;

import java.util.*;

public class CabinReservation extends Reservation {
    public String accountNumber;//Store account number

    public Date startDate;//Store reservation start date

    public Integer numberOfNights; //Store number of nights.

    public Boolean fullKitchen;//store  true for fullKitchen

    public Boolean cabinLoft;// Stores true if there is cabin loft

    public Address cabinAddress; //Store cabin address

    //generate reservation number begin with letter "C"
    public void reservationNumber() {
        /* validate reservation number and generate object.
         * call CabinReservation reservationNumber=new reservationNumber();
         */
    }
    public CabinReservation() {
// create new object/s
    }

     // create cabin reservation parameter
    public CabinReservation(String accountNumber, boolean fullKitchen,
                            String confirmationNumber) {
        /* call parent's constructor
         * Validate parameters
         * Assign parameters's values to attributes:
         * this.accountNumber=accountnumber;
         * this.fullkitchen= true;
         * this. confirmationNumber = confirmationNumber;
         */
    }

    //format and return object's data in XML format
    public String toString() {
        //return  "<accountNumber>" + ... "</confirmationNumber>" ;
        return null;
    }

    //create and return a copy of the object
    public CabinReservation clone() {
        /*
         * return new reservation.CabinReservation(this.accountNumber, ...);
         */
        return null;
    }

}