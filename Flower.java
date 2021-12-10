package aud_6_1_package;

public abstract class Flower implements Comparable<Flower> {

    private float price;
    private int color;
    private float length;
    private String date;

    public Flower() {
    }

    public Flower(float p, int c, float l, String s) {
        price = p;
        color = c;
        length = l;
        date = s;

    }

    void setPrice(float x) {
        price = x;
    }

    float getPrice() {
        return price;
    }

    void setColor(int x) {
        color = x;
    }

    float getColor() {
        return color;
    }

    void setLength(float x) {
        length = x;
    }

    Float getLength() {
        return length;
    }

    void setDate(String x) {
        date = x;
    }

    String getDate() {
        return date;
    }

    public boolean equals(Flower obj) {
        return this.price == obj.price & this.color == obj.color && this.length == obj.length;
    }


    @Override
    public int compareTo(Flower o){
        return getDate().compareTo(o.getDate());
    }

}