package aud_6_1_package;

public class Daisy extends Flower {

    public Daisy() {
        super();
    }

    public Daisy(float p, int c, float l, String s) {
        super(p, c, l, s);
    }

    @Override
    public String toString() {
        return "Daisy " + super.getColor() + " | price: " + super.getPrice() + " | date: " + super.getDate();
    }
}