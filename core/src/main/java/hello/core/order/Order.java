package hello.core.order;

public class Order {

    private Long memberid;

    private String itemName;

    private int itemPrice;

    private int discountPrice;

    public Order(Long memberid, String itemName, int itemPrice, int discountPrice) {
        this.memberid = memberid;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    private int calculatePrice() {
        return itemPrice - discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberid=" + memberid +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
