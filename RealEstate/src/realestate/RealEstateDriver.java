/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

import java.util.Scanner;

/**
 *
 * @author denis.manning
 */
public class RealEstateDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        RealEstateCompany company = new RealEstateCompany();
        boolean finish = false;
        int menuChoice = 0;
        String userChoice = null;
           
        do {
            System.out.println("Please choose an option from the following menu:"
                    + "\n1. Add an agent to the system"
                    + "\n2. Add a property to the system"
                    + "\n3. Assign a property to an agent"
                    + "\n4. Sell a property"
                    + "\n5. Exit");

            menuChoice = input.nextInt();

            if (menuChoice == 1) {
                company.addAgent();
            } else if (menuChoice == 2) {
                company.addProperty();
            } else if (menuChoice == 3) {
                company.assignProperty();
            } else if (menuChoice == 4) {
                company.sellProperty();
            }else if (menuChoice == 5) {
                finish = true;
            }
        } while (finish == false);
    }
    
}
