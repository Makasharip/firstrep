public class Meat extends Food implements Discountable {
    boolean isVegetarian = false;


    public Meat(int amount, int price) {
        this.amount = amount;
        this.price = price;

    }

    @Override
    public int getDiscount(int discount) {
        return 0;
    }
}

