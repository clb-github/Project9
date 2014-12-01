package edu.cofc.csci221.ui;

/**
 * 
 * @author CSCI 221 - Programming Assignment 9
 * @since 18 Nov 2014
 * 
 * Test Driver for Fractal UI Application
 *
 */
public class TestFractalUI {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// --------------------------------
		// Level test cases 0, 1, 2, 3
		// See output in assignment PDF
		// --------------------------------

		int level  = 0;
		int level1 = 1;
		int level2 = 2;
		int level3 = 3;
		
		FractalUI ui = new FractalUI( level );
		
		ui.addLine( new KochLine( new Point( 100, 300 ), new Point( 300, 300 ) ) );
		ui.addLine( new KochLine( new Point( 300, 300 ), new Point( 200, 100 ) ) );
		ui.addLine( new KochLine( new Point( 200, 100 ), new Point( 100, 300 ) ) );

		ui.draw();

		FractalUI ui1 = new FractalUI( level1 );

		ui1.addLine( new KochLine( new Point( 100, 300 ), new Point( 300, 300 ) ) );
		ui1.addLine( new KochLine( new Point( 300, 300 ), new Point( 200, 100 ) ) );
		ui1.addLine( new KochLine( new Point( 200, 100 ), new Point( 100, 300 ) ) );

		ui1.draw();

		FractalUI ui2 = new FractalUI( level2 );

		ui2.addLine( new KochLine( new Point( 100, 300 ), new Point( 300, 300 ) ) );
		ui2.addLine( new KochLine( new Point( 300, 300 ), new Point( 200, 100 ) ) );
		ui2.addLine( new KochLine( new Point( 200, 100 ), new Point( 100, 300 ) ) );

		ui2.draw();

		FractalUI ui3 = new FractalUI( level3 );

		ui3.addLine( new KochLine( new Point( 100, 300 ), new Point( 300, 300 ) ) );
		ui3.addLine( new KochLine( new Point( 300, 300 ), new Point( 200, 100 ) ) );
		ui3.addLine( new KochLine( new Point( 200, 100 ), new Point( 100, 300 ) ) );

		ui3.draw();
		
	} // end main() method

} // end TestFractalUI class definition
