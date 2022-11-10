package ExtraAssignments.mymodel;

public interface VendingMachineInterface {

    void displayProducts();

//    void selectProduct(int product);

    void selectmyProduct(int product);

    void displayEnterBillsMessage();

    void enterBills(int... bills);

    void displayChangeMessage();
}
