import ru.yandex.model.constants.Discount;
import ru.yandex.model.constants.Colour;

public class Apple extends Food implements Discountable{
    boolean isVegetarian = true;



    public Apple(int amount, int price, String colour) {
        this.amount = amount;
        this.price = price;
    }


    @Override
    public int getDiscount(int discount) {
        return 0;
    }
}
