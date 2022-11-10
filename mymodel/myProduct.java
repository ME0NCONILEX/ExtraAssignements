package ExtraAssignments.mymodel;

public enum myProduct {
    Adidas(1,199), Asics(2,89), Jordan(3,105), Nike(4,189), Puma(5,209), Reebok(6,169), Empty(0,0);
    private int selectionNumber;
    private int price;

    myProduct(int selectionNumber, int price){
        this.selectionNumber = selectionNumber;
        this.price = price;
    }

    public int getSelectionNumber(){
        return selectionNumber;
    }

    public int getPrice(){
        return this.price;
    }

    public static myProduct valueOf(int numberSelection){
        for(myProduct myproduct: myProduct.values()){
            if(numberSelection == myproduct.getSelectionNumber()){
                return myproduct;
            }
        }
        return Empty;
    }
}
