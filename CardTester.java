/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card cards[] = {new Card("Jack", "Clubs", 2), new Card("King", "Hearts", 4), new Card("King", "Hearts", 4)};

		for (Card c : cards) {
			System.out.println(c.rank());
			System.out.println(c.suit());
			System.out.println(c.pointValue());
			for (Card d: cards) {
				System.out.println(c + " is equal to " + d + "? " + c.matches(d));
			}
			System.out.println(c);
		}	
	}
}