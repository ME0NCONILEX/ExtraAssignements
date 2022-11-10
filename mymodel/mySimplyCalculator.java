package ExtraAssignments.mymodel;

public class mySimplyCalculator implements myCalculator {

    @Override
    public int calculateTotal(BillBundle enteredBills) {
        return enteredBills.getTotal();
    }

    @Override
    public BillBundle calculateChange(int amountMoneyToReturn) {
        BillBundle change = new BillBundle(new int[10]);
        int remainingAmount = amountMoneyToReturn;
        change.number1000$Bill = remainingAmount / Currency.Thousand_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.Thousand_Dollar.getValue();

        change.number500$Bill = remainingAmount / Currency.FiveHundred_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.FiveHundred_Dollar.getValue();

        change.number200$Bill = remainingAmount / Currency.TwoHundred_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.TwoHundred_Dollar.getValue();

        change.number100$Bill = remainingAmount / Currency.OneHundred_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.OneHundred_Dollar.getValue();

        change.number50$Bill = remainingAmount / Currency.Fifty_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.Fifty_Dollar.getValue();

        change.number20$Bill = remainingAmount / Currency.Twenty_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.Twenty_Dollar.getValue();

        change.number10$Bill = remainingAmount / Currency.Ten_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.Ten_Dollar.getValue();

        change.number5$Bill = remainingAmount / Currency.Five_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.Five_Dollar.getValue();

        change.number2$Bill = remainingAmount / Currency.Two_Dollar.getValue();
        remainingAmount = remainingAmount % Currency.Two_Dollar.getValue();

        change.number1$Bill = remainingAmount / Currency.One_Dollar.getValue();

        return change;
    }
}
