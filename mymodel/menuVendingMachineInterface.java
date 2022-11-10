package ExtraAssignments.mymodel;

public abstract class menuVendingMachineInterface implements VendingMachineInterface {

    private final VendingMachineController controller = new mySimplyVendingMachineController();
    private int selectedmyProduct;
    private BillBundle change;



    @Override
    public void displayProducts() {
        System.out.println(" =================================");
        System.out.println("         VENDING MACHINE          ");
        System.out.println("       (self-service store)          ");
        System.out.println(" =================================");
        System.out.println("         Products available:               ");
        System.out.println("                                              ");
        for(myProduct product: myProduct.values()){
            if(!myProduct.Empty.equals(product)) {
                System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Plese choose your desired product (1-6): ");


    }

    @Override
    public void selectmyProduct(int product) {
        this.selectedmyProduct = product;
    }

    @Override
    public void displayEnterBillsMessage() {
        System.out.println(" Please enter bills as follows: ");
        System.out.println(" number of 1 dollar bills,number of 2 dollar bills, number of 5 dollar bills,number of 10 dollar bills, number of 50 dollar bills, number of 100 dollar bills,number of 200 dollar bills, number of 500 dollar bills, number of 1000 dollar bills ");
        System.out.println(" Example: If you would like to enter 5 ten dollar bills and only one hundred dollar bill: 0,0,0,3,0,1,0,0,0,0");
        System.out.println("Please enter bills:");

    }

    @Override
    public void enterBills(int... bills) {
        VendingMachineRequest request = new VendingMachineRequest(selectedmyProduct, bills);
        change = controller.calculateChange(request);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("After approved payment, you will receive your shoes and :"+ change.getTotal()+" dollars left, divided as follows: ");
        System.out.println("    1000 $ Bills: "+ change.number1000$Bill);
        System.out.println("    500 $ Bills: "+ change.number500$Bill);
        System.out.println("    200 $ Bills: "+ change.number200$Bill);
        System.out.println("    100 $ Bills: "+ change.number100$Bill);
        System.out.println("    50 $ Bills: "+ change.number50$Bill);
        System.out.println("    20 $ Bills: "+ change.number20$Bill);
        System.out.println("    10 $ Bills: "+ change.number10$Bill);
        System.out.println("    5 $ Bills: "+ change.number5$Bill);
        System.out.println("    2 $ Bills: "+ change.number2$Bill);
        System.out.println("    1 $ Bill: "+ change.number1$Bill);
        System.out.println("Have a nice day!");
    }
}