package edu.cofc.csci221.ui;
/**
 * A class Point with two attributes to describe it,
 *  the x and y values, and get/set methods to modify them.
 * @author      Cory Brown
 * @version     1.0
 * @since       2014-10-8
 */

public class Point {

    /** ------------------
     * Instance variables
     * -------------------
     * @param x
     * @param y
     */

    private int x = 0;
    private int y = 0;

    /**
     *
     */
    public Point() {

        this( 0, 0 );

    } // end overloaded constructor

    /**
     *
     * @param point
     */
    public Point( Point point ) {

        setPoint( point );

    } // end overloaded constructor

    /**
     *
     * @param x
     * @param y
     */
    public Point( int x, int y ) {

        setX( x );
        setY( y );

    } // end overloaded constructor

    /**
     * Set the point object to existing point object if conditions met
     * @param point
     * Precondition: point != null and x y values are valid
     * Postcondition: set parameter object Point to value of Point point
     */
    public void setPoint(Point point) {
        if ( point != null ) {

            setX( point.getX() );
            setY( point.getY() );

        }

    } // end setPoint() method


    /**
     * Get the x-coordinate instance variable, returns int
     * @return int x
     * Precondition: None
     * Postcondition: returns x value for the object Point
     */
    public int getX() {

        return x;

    } // end getX() method


    /**
     * Get the y-coordinate instance variable, returns int
     * @return int y
     * Precondition: None
     * Postcondition: returns y value for the object Point
     */
    public int getY() {

        return y;

    } // end getY() method


    /**
     * Set the x-coordinate instance variable
     * @param x
     * Precondition: x >= 0 and x <= GridConstants.MAX_PANEL_WIDTH
     * Postcondition: set param x to arg x
     */
    public void setX(int x) {

        if ( x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH ) {

            this.x = x;

        } else {

            this.x = 0;

        }

    } // end setX() method

    /**
     * Set the y-coordinate instance variable
     * @param y
     * Precondition: y >= 0 and GridConstants.MAX_PANEL_WIDTH
     * Postcondition: set param y to arg y
     */
    public void setY(int y) {
        if ( y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT ) {

            this.y = y;

        } else {

            this.y = 0;

        }

    } // end setY() method


}
