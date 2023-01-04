/**
* File: Lab1a.java
* Description: Java Basics Review
* Lessons Learned: This helped me to review what I've learned last semester.
* Instructor's Name: Barbara Chamberlin
*
* @author: Miguel Elizalde
* @since: 01/02/2022
*/

package week1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lab1a {
    public static void main(String[] args) {

        Scanner sIn = new Scanner(System.in);
        boolean dW1 = true;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        String input;


        do {
            System.out.print("\nPlease enter a number (or hit the <Enter> key to stop): ");
            input = sIn.nextLine();
            if (!"".equals(input)) {
                try {
                    numList.add(Integer.parseInt(input));
                } catch (Exception e) {
                    System.out.println("Invalid response.  '"+input+"' is not a number.");
                }
            } else {
                dW1 = false;
            }
        } while (dW1);

        int sum = addNumbers(numList);
        System.out.println("The total of the list of numbers is: "+sum);

        int largest = largestNumber(numList);
        System.out.println("The biggest number in the list is: "+largest);
        // Scanner Close
        sIn.close();
    }

    public static int addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int num : numList) {
            sum =+ num;
        }
        return sum;
    }

    public static int largestNumber(ArrayList<Integer> numList) {
        int lar;
        Collections.sort(numList);
        lar = numList.get(numList.size()-1);
        return lar;
    }
}
