
package Wk3Assignment2;

public class HotelReservation extends Reservation {

    /**
     * constructor without parameter
     */
    public HotelReservation() {
    }


    public Reservation hotelReservation;

    public String accountNumber;// It should start with "H'

    public Address hotelAddress; //mailing Address or physicalAddress

    public Integer numberOfBeds; //default is 2

    public float numberOfBathrooms; //default is 1

    public Integer lodgingSizeInSF;//

    public Boolean kichenette;//

    // constructor with the following parameters

    public HotelReservation(Reservation hotelReservation, String confirmationNumber,
                            String confirmationType, String accountNumber, Address hotelAddress,
                            Boolean kichenette) {
        super();
        /*call parent's constructor and assign value to parameter
         * Validate parameters
         * Assign parameters's values to attributes
         */

    }

    //format and return object's data in XML format
    public String toString() {

        /*
         *  return "<hotelReservation>" + "<confirmationNumber>" + confirmationNumber + "</hotelAddress>" + ...
         * + "</hotelReservation>";
         */
        return null;
    }

    //create and return a copy of the object

    public HotelReservation clone() {

        return null;
    }

}