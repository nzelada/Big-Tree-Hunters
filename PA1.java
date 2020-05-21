import java.util.Scanner;

  /**
   *
   * Programming assignment 1
   * 
   *
   * @author Nick Zelada
   * @version 05/16/2018
   *
   */
public class PA1 {

    /**
     *
     * A tool written to help "Big Tree Hunters" 
     * calculate the Total Point value of a big tree.
     *
     */
   
   public static void main(String[] args)
    
    {
    
      String name;
      String scientificName;
      
      int circumference;
      int height;
      int largestCrown;
      int smallestCrown;
      int average;
      double totalPoints;
      
      Scanner in;
      
      in = new Scanner(System.in);
      
      System.out.print("Enter the name: "); 
      name = in.nextLine();
      
      System.out.print("Enter the scientific name: ");
      scientificName = in.nextLine();
      
      System.out.print("Enter the circumference in inches: ");
      circumference = in.nextInt();
      
      System.out.print("Enter the height in feet: ");
      height = in.nextInt();
      
      System.out.print("Enter the largest crown spread in feet: ");
      largestCrown = in.nextInt();
      
      System.out.print("Enter the smallest crown spread in feet: ");
      smallestCrown = in.nextInt();
      
      average = ((largestCrown + smallestCrown)/2);
       
      totalPoints = (circumference + height + average*(1.0/4.0));
  
      totalPoints = Math.round(totalPoints);
      
      System.out.println("\nBig Tree Report:\n\n"
      + "     Common Name: " + name + "\n"
      + " Scientific Name: " + scientificName + "\n\n"
      + "   Circumference: " + circumference + "\n"
      + "          Height: " + height + "\n"  
      + "   Average Crown: " + average + "\n\n"
      + "    Total points: " + totalPoints );
      
    
    }
    
  }
   