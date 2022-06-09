public class Apple extends Food implements Discountable{
    String colour;



    public Apple(int amount, int price, String colour) {
        this.amount = amount;
        this.price = price;
        isVegetarian = true;
    }


    @Override
    public int getDiscount(int discount) {
        return 0;
    }
}
