package ua.uni;

import lombok.Builder;
import lombok.Value;

@Builder
public class Checkoutrequest {
    private int value;
    private int id;

    @Override
    public String toString() {
        return "Checkoutrequest{" +
                "value=" + value +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Checkoutrequest checkoutrequest = new Checkoutrequest(56,45);
        System.out.println(checkoutrequest.toString());
    }
}

