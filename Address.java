package Wk3Assignment2;

import java.util.*;


public abstract class Address extends Account {

    public String streetNumber;

    public String street;

    public String city;

    public String state;

    public Integer zip;

    //the constructor Address with parameters

    public Address(String streetNumber, String street, String city, String state, Integer zip) {

        /* Validate parameters
         * Assign parameters's values to attributes for example:
         * this.streetNumber=StreetNumber;
         * this.street= street;
         * this.city=city;
         * this.zip=zip;
         */

    }
    public Address(Character accountUniqueID, Integer phoneNumber, String emailAddress) {
        super(accountUniqueID, phoneNumber, emailAddress);

        /* call parent's constructor
         * Validate parameters
         * Assign parameters's values to attributes
         */
    }


    //format and return object's data in XML format

    public String toString() {
        /*
         *  return "<address>" + "<street>" + street + "</street>" + ... + "</address>";
         */
        return null;
    }

    //create and return a copy of the object

    public Address clone() {
        /* return new Address.(this.streetNumber, this.street, this.city, this.state, this. zip )
         *and any additional parent behavior.

         */
        return null;
    }


}
