package aud_6_1_package;

public class Rose extends Flower{
    public Rose() {
        super();
    }

    public Rose(float p, int c, float U, String d) {
        super(p, c, U, d);
    }

    @Override
    public String toString() {
        return "Rose " + super.getColor() + " | price: " + super.getPrice() + " | date: " + super.getDate();
    }

}