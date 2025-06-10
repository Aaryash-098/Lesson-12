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
    }
}