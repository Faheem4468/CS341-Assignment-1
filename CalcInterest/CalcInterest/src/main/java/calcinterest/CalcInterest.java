package calcinterest;

import java.util.Scanner;

public class CalcInterest {

    /**
     * Method to calculate loan interest based on loan type, loan amount, and loan duration.
     *
     * @param loanAmount the amount of the loan
     * @param yearLoan the number of years for the loan
     * @param loanType 1 for Home Loan, 2 for Property Loan
     * @return the total interest to be paid, or -1 in case of an error
     */
    public static float computeLoanInterest(double loanAmount, int yearLoan, int loanType) {
       
        if (loanAmount <= 0 || yearLoan <= 0) {
            return -1; // Error case: invalid input
        }

        float interestRate = -1;

        // Case for Home Loan
        if (loanType == 1) {
            if (loanAmount < 100000) {
                if (yearLoan <= 5) {
                    interestRate = 8.0f;
                } else if (yearLoan <= 10) {
                    interestRate = 6.5f;
                } else if (yearLoan >= 11) {
                    interestRate = 5.5f;
                }
            } else if (loanAmount >= 100000 && loanAmount < 500000) {
                if (yearLoan <= 10) {
                    interestRate = 6.5f;
                } else if (yearLoan >= 11) {
                    interestRate = 5.5f;
                }
            } else if (loanAmount >= 500000) {
                if (yearLoan >= 11) {
                    interestRate = 5.5f;
                }
            }
        }

        // Case for Property Loan
        else if (loanType == 2) {
            if (loanAmount < 100000) {
                if (yearLoan <= 5) {
                    interestRate = 12.0f;
                } else if (yearLoan <= 10) {
                    interestRate = 8.5f;
                } else if (yearLoan >= 11) {
                    interestRate = 7.0f;
                }
            } else if (loanAmount >= 100000 && loanAmount < 500000) {
                if (yearLoan < 10) {
                    interestRate = 8.5f;
                } else if (yearLoan >= 11) {
                    interestRate = 7.0f;
                }
            } else if (loanAmount >= 500000) {
                if (yearLoan >= 11) {
                    interestRate = 7.0f;
                }
            }
        }

        // If no valid interest rate was determined, return -1 as an error
        if (interestRate == -1) {
            return -1;
        }

        // Calculate the total interest using the simple interest formula
        return (float) ((loanAmount * interestRate * yearLoan) / 100);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        boolean calculateAgain = true;

        // Start the while loop to allow repeated calculations
        while (calculateAgain) {
            // Ask the user for loan amount
            System.out.print("Enter the loan amount: ");
            double loanAmount = scanner.nextDouble();

            
            System.out.print("Enter the loan term (in years): ");
            int yearLoan = scanner.nextInt();

            
            System.out.print("Enter the loan type (1 for Home Loan, 2 for Property Loan): ");
            int loanType = scanner.nextInt();

            // Compute the loan interest
            float totalInterest = computeLoanInterest(loanAmount, yearLoan, loanType);

            
            if (totalInterest == -1) {
                System.out.println("Invalid input. Please check the loan amount, term, or loan type.");
            } else {
                // Displaying only the interest part in 2 decimal places
                System.out.printf("The total interest for the loan is: %.2f\n", totalInterest);
                System.out.printf("The total loan amount with interest is: %.2f\n", loanAmount + totalInterest);
            }

            
            System.out.print("Do you want to calculate interest for another loan? (y/n): ");
            String userResponse = scanner.next().toLowerCase();

            
            if (!userResponse.equals("y")) {
                calculateAgain = false;
            }
        }

        
        scanner.close();
        System.out.println("Program terminated.");
    }
}
