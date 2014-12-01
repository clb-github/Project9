package edu.cofc.csci221.ui;
/**
 * A class Line with two attributes to describe it,
 *  the start and end point objects with get/set methods to modify it.
 * @author      Cory Brown
 * @version     1.0
 * @since       2014-10-8
 */

public class Line {

    /** ------------------
     * Instance variables
     * -------------------
     * @param start
     * @param end
    */

    private Point start = null;
    private Point end = null;

    public Line( Point start, Point end ) {

        setStart( start );
        setEnd( end );

    } // end constructor


    /**
     * Get the start point value
     * @return start Point object
     * Precondition: None
     * Postcondition: returns point object
     */
    public Point getStart() { return start; }

    /**
     * Get the end point value
     * @return end Point object
     * Precondition: None
     * Postcondition: returns point object
     */
    public Point getEnd() { return end; }

    /**
     * Set the start point value
     * @param start checks that start Point object is not null
     * Precondition: if start != null
     * Postcondition: set start instance variable to start object parameter, otherwise do nothing
     */
    public void setStart(Point start) {

        if ( start != null ) {

            this.start = start;

        }

    } // end setStart() method

    /**
     * Set the end point value
     * @param end checks that end Point object is not null
     * Precondition: if end != null
     * Postcondition: set end instance variable to end object parameter, otherwise do nothing
     */
    public void setEnd(Point end) {
        if ( end != null ) {

            this.end = end;

        }

    } // end setEnd() method

    /**
     * Checks to see if start and end values are valid
     * @param start checks start Point object's validity
     * @param end checks end Point object's validity
     * @return boolean
     * Precondition: None
     * Postcondition: if start != null and end != null return true, otherwise return false.
     */
    public boolean isValid() {
        boolean valid = true;

        if ( getStart() == null || getEnd() == null )
            valid = false;

        return valid;

    } // end isValid() method


} // end Line class definition
