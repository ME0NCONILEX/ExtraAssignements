package ExtraAssignments.mymodel;

public class BillBundle {
    public int number1$Bill;
    public int number2$Bill;
    public int number5$Bill;
    public int number10$Bill;
    public int number20$Bill;
    public int number50$Bill;
    public int number100$Bill;
    public int number200$Bill;
    public int number500$Bill;
    public int number1000$Bill;

    public BillBundle(int... enteredBills) {
        this.number1$Bill = enteredBills[0];
        this.number2$Bill = enteredBills[1];
        this.number5$Bill = enteredBills[2];
        this.number10$Bill = enteredBills[3];
        this.number20$Bill = enteredBills[4];
        this.number50$Bill = enteredBills[5];
        this.number100$Bill = enteredBills[6];
        this.number200$Bill = enteredBills[7];
        this.number500$Bill = enteredBills[8];
        this.number1000$Bill = enteredBills[9];
    }

    public int getTotal(){
        int total = 0;
        total = total+this.number1$Bill* Currency.One_Dollar.getValue();
        total = total+this.number2$Bill* Currency.Two_Dollar.getValue();
        total = total+this.number5$Bill* Currency.Five_Dollar.getValue();
        total = total+this.number10$Bill* Currency.Ten_Dollar.getValue();
        total = total+this.number20$Bill* Currency.Twenty_Dollar.getValue();
        total = total+this.number50$Bill* Currency.Fifty_Dollar.getValue();
        total = total+this.number100$Bill* Currency.OneHundred_Dollar.getValue();
        total = total+this.number200$Bill* Currency.TwoHundred_Dollar.getValue();
        total = total+this.number500$Bill* Currency.FiveHundred_Dollar.getValue();
        total = total+this.number1000$Bill* Currency.Thousand_Dollar.getValue();
        return total;
    }
}
