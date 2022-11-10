package ExtraAssignments.mymodel;

public enum Currency {
    One_Dollar(1), Two_Dollar(2), Five_Dollar(5), Ten_Dollar(10),  Twenty_Dollar(20), Fifty_Dollar(50), OneHundred_Dollar(100), TwoHundred_Dollar(200), FiveHundred_Dollar(500),Thousand_Dollar(1000);

    private final int value;

    Currency(int value){
        this.value = value;
    }

    public static int[] parseBills(String Bills){
        String[] numberBillsInText = Bills.split(",");
        int[] result = new int[numberBillsInText.length];
        for(int index=0;index<numberBillsInText.length;index++){
            result[index] = Integer.parseInt(numberBillsInText[index]);
        }
        if(numberBillsInText.length <= 11) {
            System.out.println("OOPS! You must enter (least) 10 numbers, ex: 0,0,0,3,0,1,0,0,0,0" + " Try again!");}
        else
            System.out.println();
        return result;
    }

    public int getValue(){
        return this.value;
    }
}