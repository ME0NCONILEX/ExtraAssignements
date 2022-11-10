package ExtraAssignments.mymodel;

public class mySimplyVendingMachineController implements VendingMachineController {

    private myCalculator myCalculator = new mySimplyCalculator();

    @Override
    public BillBundle calculateChange(VendingMachineRequest request) {
        int total = myCalculator.calculateTotal(request.enteredBills);
        int totalChange = total - request.product.getPrice();
        return myCalculator.calculateChange(totalChange);
    }
}
