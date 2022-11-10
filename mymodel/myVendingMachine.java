package ExtraAssignments.mymodel;
import java.util.Scanner;

public class myVendingMachine {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        menuVendingMachineInterface machineInterface = new menuVendingMachineInterface() {

            @Override
            public void selectmyProduct(int myproduct) {

            }
        };
        machineInterface.displayProducts();

        String selectedmyProduct = scanner.nextLine();
        machineInterface.selectmyProduct(Integer.parseInt(selectedmyProduct));

        machineInterface.displayEnterBillsMessage();

        String userEnteredBills = scanner.nextLine();
        int[] enteredBills = Currency.parseBills(userEnteredBills);
        machineInterface.enterBills(enteredBills);

        machineInterface.displayChangeMessage();
    }
}