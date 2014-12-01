package edu.cofc.csci221.ui;
import java.lang.Math;

/**
 * Class KochLine inherits from line and performs necessary calculations on
 *  the given points to construct a KochLine segment.
 *
 * @author Cory Brown
 * @since 11/24/14
 *
 */
public class KochLine extends Line{

        private Point p1 = null;
        private Point p2 = null;
        private Point p3 = null;
        private Point p4 = null;
        private Point p5 = null;

    /**
     * Create KochLine object from Line superclass
     * @param start
     * @param end
     */
    public KochLine( Point start, Point end ) {

        super(start, end);

        p1 = super.getStart();
        p5 = super.getEnd();

    }

    /**
     * Get fractal KochLine segment A.
     * @return A
     * PreCondition: none
     * PostCondition: returns KochLine segment A.
     */
    public KochLine getLineA() {

        KochLine A = new KochLine(p1,p2);
        return A;

    } // end getLineA() method

    /**
     * Get fractal KochLine segment B.
     * @return B
     * PreCondition: none
     * PostCondition: returns KochLine segment B.
     */
    public KochLine getLineB() {

        KochLine B = new KochLine(p2,p3);
        return B;

    } // end getLineB() method

    /**
     * Get fractal KochLine segment C.
     * @return C
     * PreCondition: none
     * PostCondition: returns KochLine segment C.
     */
    public KochLine getLineC() {

        KochLine C = new KochLine(p3,p4);
        return C;

    } // end getLineC() method

    /**
     * Get fractal KochLine segment D.
     * @return D
     * PreCondition: none
     * PostCondition: returns KochLine segment D.
     */
    public KochLine getLineD() {

        KochLine D = new KochLine(p4,p5);
        return D;

    } // end getLineD() method

    /**
     * Computes p2,p3,and p4 (x,y) values.
     * PreCondition: none
     * PostCondition: the computed p2,p3,and p4 (x,y) values.
     */
    public void computeFractal() {

        p2 = new Point();
        p3 = new Point();
        p4 = new Point();

        int deltaX = p5.getX() - p1.getX();
        int deltaY = p5.getY() - p1.getY();

        p2.setX((p1.getX() + (deltaX/3)));
        p2.setY((p1.getY() + (deltaY/3)));

        int x3 = (int) ((p1.getX() + p5.getX())/2 + (Math.sqrt(3) * (p1.getY() - p5.getY())/6));
        int y3 = (int) ((p1.getY() + p5.getY())/2 + (Math.sqrt(3) * (p5.getX() - p1.getX())/6));
        p3.setX(x3);
        p3.setY(y3);

        p4.setX(p1.getX() + (2 * (deltaX/3)));
        p4.setY(p1.getY() + (2 * (deltaY/3)));

    } // end computeFractal() method

    /**
     * Check validity of KochLine objects.
     * @return boolean
     * PreCondition: none
     * PostCondition: returns boolean after checking validity of KochLine
     *                  segment objects.
     */
    public boolean isKochLineValid() {

        KochLine A = getLineA();
        KochLine B = getLineB();
        KochLine C = getLineC();
        KochLine D = getLineD();

        if (A.isValid() && B.isValid() && C.isValid() && D.isValid() ) {

            return true;

        }else {

            return false;
        }

    } // end isKochLineValid() method
}
