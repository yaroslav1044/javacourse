package aud_6_1_package;

import java.util.Arrays;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet() {
    }

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Flower[] get_flowers(){
        return flowers;
    }

    public void addFlower(Flower f) {
        Flower[] tmp = Arrays.copyOf(flowers, flowers.length);
        int n = tmp.length;
        flowers = new Flower[n + 1];
        for (int i = 0; i < n; i++) {
            flowers[i] = tmp[i];
        }

        flowers[n] = f;
    }


    public void sortByDate() {
        Arrays.sort(flowers);
    }

    public Flower getByLength(float a, float b) {

        for (Flower f : flowers) {
            if (f.getLength() >= a & f.getLength() <= b) return f;
        }
        return new Rose();
    }

    public double price(){
        double s =0;
        for (Flower x:flowers){
            s += x.getPrice();
        }
        return s;
    }

}