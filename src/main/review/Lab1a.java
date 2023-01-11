/**
* File: Lab1a.java
* Description: Java review
* Lessons Learned: This helped me to review what I've learned last semester.
* Instructor's Name: Barbara Chamberlin
*
* @author: Miguel Elizalde
* @since: 01/02/2022
*/

package main.review;

// Importing Libraries
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lab1a {
    public static void main(String[] args) {

        // Initializing variables
        Scanner sIn = new Scanner(System.in);
        boolean dW1 = true;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        String input;

        // Loop to add int numbers to the ArrayList. Try Catch added to let the user
        // know if something else is added
        do {
            System.out.print("\nPlease enter a number (or hit the <Enter> key to stop): ");
            input = sIn.nextLine();
            try {
                if (!"".equals(input)) {
                    numList.add(Integer.parseInt(input));
                } else {
                    dW1 = false;
                }
            } catch (Exception e) {
                System.out.println("Invalid response.  '" + input + "' is not a number.");
            }
        } while (dW1);

        // Calling functions addNumbers and largestNumber
        int sum = addNumbers(numList);
        System.out.println("The total of the list of numbers is: " + sum);
        int largest = largestNumber(numList);
        System.out.println("The biggest number in the list is: " + largest);

        // Scanner Close
        sIn.close();
    }

    /**
     * Method Name: addNumbers
     * Description: This method adds the numbers in the given array
     * Returns: It returns the total of the sum of the numbers in the List.
     * 
     * @parm sum / Used to store the sum of the List
     * @parm num  / Used as a placer for the For each
     * 
     * @return sum / Returned the sum
     */
    public static int addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int num : numList) {
            sum = num + sum;
        }
        return sum;
    }

    /**
     * Method Name: largestNumber
     * Description: This method returns the largest number in the given array.
     * Returns: Returns an integer number
     * 
     * @parm lar / Temp variable to store the largest number in a list
     * 
     * @return lar / Returned the largest whole number
     */
    public static int largestNumber(ArrayList<Integer> numList) {
        int lar;
        Collections.sort(numList);
        lar = numList.get(numList.size() - 1);
        return lar;
    }
}
