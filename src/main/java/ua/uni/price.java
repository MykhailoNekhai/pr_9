package ua.uni;

import lombok.Value;

@Value
public class price{
    private int value;
    @Override
    public String toString() {
        return "price{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        price price = new price(56);
        System.out.println(price.toString());
    }
}

