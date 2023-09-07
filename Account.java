package Wk3Assignment2;

import java.util.*;


public abstract class Account extends Manager {

    public Character accountUniqueID;//unique account number for the reservation created by UI

    public Integer phoneNumber;// contact number for the reservation

    public Vector<Reservation> accounts;//List of reservation accounts


    public String emailAddress;

    //constructor Account with parameters:

    public Account(Character accountUniqueID, Integer phoneNumber, String emailAddress) {
        /* Validate parameters
         * Assign parameters's values to attributes
         */
    }

    public Account() {
        //create new object/s
    }

    //create new account
    public String createNewAccount() {
        // create new Account object
        return null;

    }

    public Account(String reservataionNumber, Integer phoneNumber, String emailAddress) {
        /*
         * Validate parameters
         * validate the account
         */
    }

    //format and return object's data in XML format
    public String toString() {
        /*
         *return  "<reservationNumber>" + ... "</emailAddress>" ;
         */
        return null;
    }

//create and return a copy of the object

    public abstract Account clone();// Note: abstract class cannot have a body

}