package ExtraAssignments.mymodel;

public class VendingMachineRequest {
    public myProduct product;
    public BillBundle enteredBills;

    public VendingMachineRequest(int selectedmyProduct, int... enteredBills){
        this.product = myProduct.valueOf(selectedmyProduct);
        this.enteredBills = new BillBundle(enteredBills);
    }
}
