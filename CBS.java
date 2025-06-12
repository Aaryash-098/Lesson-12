import java.util.Scanner; 

class CBS {
    public static void main(String[] args) {
        boolean infiniteloop = true;
        double[] accountbalance = new double[1000];
        String[] AN = new String[1000];
        int option, size = 100; 

        while (infiniteloop) {
            System.out.println("Welcome to BBS");
            System.out.println("Banking menu");
            System.out.println("Select 1 option from the following :");
            System.out.println("1 -> Add customer");
            System.out.println("2 -> Change customer name");
            System.out.println("3 -> Check balance");
            System.out.println("4 -> Update account balance");
            System.out.println("5 -> Summary of all accounts");
            System.out.println("6 -> Quit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Please select an option and proceed");

            option = sc.nextInt();

            if (option == 1) {
                System.out.println("\n Add customer \n Menu ->");
                sc.nextLine();
                System.out.println("\n Enter customer name");
               String name =  sc.nextLine();  
                AN[size] = name;
                System.out.println("Entering opening balance amount : ");
                double amt = sc.nextDouble();
                accountbalance[size] = amt; 

                System.out.println("Account created successfully \n");
                System.out.println("Account details - \n");
                System.out.println("Account number" + (size));
                System.out.println("Accout name" + AN[size]);
                System.out.println("Account balance - " + accountbalance[size] + "\n");
                System.out.println("___________________________________________________________");
            }
            size = size + 1;

        
            }
        
        else if (option == 2) {

                System.out.println("\nChange Customer Name Menu");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                String temp;

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    temp = accountName[accountIndex];
                    System.out.print("Enter the new name: ");
                    String name = sc.nextLine();
                    accountName[accountIndex] = name;
                    System.out.println("Name is successfully updated from " + temp + " to " + name + ". \n"); System.out.println("Name is successfully updated from " + temp + " to " + name + ". \n");
                }

                System.out.println("_______________________________________________________________");
        }
            else if (option == 3) {
            ystem.out.println("\nCheck Account Balance Menu");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.println(
                            accountName[accountIndex] + " your balance is " + accountBalance[accountIndex] + "Rs.");
                }
			System.out.println("________________________________________________");
        }
        else if (option == 4) {
            System.out.println("\nUpdate Account Balance Menu ");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.print("Enter the amount to be deposited: ");
                    double amt = sc.nextDouble();


                    accountbalance[accountIndex] += amt; 
                     System.out.println(accountName[accountIndex] + " your updated balance is : "
                            + accountBalance[accountIndex] + " RS. \n ");
        }
         }

         else if (option == 5) {
				System.out.println("Accounts registered\n");

                for (int i = 100; i < size; i++) {
                    System.out.println("Account Number: " + i + ", Name: " + accountName[i] + ", Balance: "
                            + accountBalance[i] + "Rs. \n ");
                }
                }


                else if (option == 6) {

                System.out.println("Terminating...");
                infiniteLoop=false;
            } else {

                System.out.println("\n Invalid input.");
                System.out.println("Terminating...");
                System.exit(0);
    }
}
}
