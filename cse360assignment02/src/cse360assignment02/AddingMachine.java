package cse360assignment02;
import java.lang.String;

/**
 * @author Joel Wade 
 */
public class AddingMachine {
	  private int total;
	  private String history;
	  
	  /**
	   * <p> Main method to run the class methods
	   */
	  /*public static void main(String[] args) {
		  AddingMachine myCalculator = new AddingMachine();
		  //can run methods and test methods here
		  myCalculator.add (4); 
		  myCalculator.subtract (2); 
		  myCalculator.add(5);
		  System.out.println(myCalculator.toString());
		}*/
	  
	  /**
	   * <p>initializes our private variables to 0
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0"; //variable to hold the history of our additions and subtractions
	  }
	  
	  /**
	   * <p> accessor method for the total variable
	   * @return the total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * <p> adds the passed in parameter to the total
	   * @param value is the value we want to add
	   */
	  public void add (int value) {
		  total = total + value;
		  history = history + " + " + String.valueOf(value);
	  }

	  /**
	   * <p> subtracts the passed in parameter to the total
	   * @param value is the value we want to subtract
	   */
	  public void subtract (int value) {
		  total = total - value;
		  history = history + " - " + String.valueOf(value);
	  }

	  /**
	   * <p> accessor method for the history variable
	   * @return the history of our additions and subtractions
	   */
	  public String toString () {
	    return history;
	  }

	  /**
	   * <p> clears the history of our additions and subtractions
	   */
	  public void clear() {
		  history = "0";
	  }
}
