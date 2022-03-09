/**
 * 
 */
package anOverviewaOfJava.TwoControlStatements;

/**
 * @author dathr
 *
 */
public class IfSample {

	public static void main(String[] args) {
		System.out.println("Inside IfSample");
		int x, y;
		x = 10;
		y = 20;
		if(x < y) {
			System.out.println("X is less than Y");
		}
		//
		x = x * 2;
		if(x == y) {
			System.out.println("X now equal to Y");
		}
		//
		x = x*2;
		if(x > y) {
			System.out.println("X now greater than Y");
		}
		//
		if(x == y) {
			System.out.println("You won't see this...");
		}

	}

}
