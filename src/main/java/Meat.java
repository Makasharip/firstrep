public class Meat extends Food implements Discountable {



    public Meat(int amount, int price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
    }

    @Override
    public int getDiscount(int discount) {
        return 0;
    }
}

