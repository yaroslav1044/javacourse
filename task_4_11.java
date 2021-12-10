package zxcqwe;

import java.util.ArrayList;

class Interval{
    float x1;
    float x2;
    boolean x11;
    boolean x12;
    Interval(float x1, boolean x11, float x2, boolean x12){
        if(x1<x2){
            this.x1 = x1;
            this.x2 = x2;
            this.x11 = x11;
            this.x12 = x12;
        }
        else{
            this.x1 = x2;
            this.x2 = x1;
            this.x11 = x12;
            this.x12 = x11;
        }
    }
    public Interval Intersection(Interval w){
        Interval ans = new Interval(0,false,0,false);
        if(x1< w.x1 && w.x1 < x2){
            ans.x1 = w.x1;
            ans.x11 = w.x11;
        }
        else if(x1!= w.x1 && x1 != w.x2){
            ans.x1 = x1;
            ans.x11 = x11;
        }
        if(x1< w.x2 && w.x2 < x2){
            ans.x2 = w.x2;
            ans.x12 = w.x12;
        }
        else if(x2!= w.x1 && x2 != w.x2){
            ans.x2 = x2;
            ans.x12 = x12;
        }
        if(w.x1 == x1 && w.x11 != x11){
            ans.x1 =x1;
            ans.x11 = false;
        }
        else if(w.x1 == x1 && w.x11 == x11){
            ans.x1 =x1;
            ans.x11 = x11;
        }
        if(w.x2 == x2 && w.x12 != x12){
            ans.x2 =x2;
            ans.x11 = false;
        }else if(w.x2 == x2 && w.x12 == x12){
            ans.x2 =x2;
            ans.x12 = x12;
        }
        if(x1 == w.x2 && x11 == w.x12){
            ans.x11 = x11;
            ans.x12 = x11;
            ans.x1 =x1;
            ans.x2 = x1;
        }
        if(x2 == w.x1 && x12 == w.x11){
            ans.x12 = x12;
            ans.x11 =x12;
            ans.x1 = x2;
            ans.x2 = x2;
        }
        return ans;
    }
    public Interval Union(Interval w){
        Interval ans = new Interval(0,false,0,false);
        if(x1< w.x1 && w.x1 < x2){
            ans.x1 = x1;
            ans.x11 = x11;
        }
        else if(x1!= w.x1 && x1 != w.x2){
            ans.x1 = w.x1;
            ans.x11 = w.x11;
        }
        if(x1< w.x2 && w.x2 < x2){
            ans.x2 = x2;
            ans.x12 = x12;
        }
        else if(x2!= w.x1 && x2 != w.x2){
            ans.x2 = w.x2;
            ans.x12 = w.x12;
        }
        if(w.x1 == x1 && w.x11 != x11){
            ans.x1 = x1;
            ans.x11 = true;
        }
        else if(w.x1 == x1 && w.x11 == x11){
            ans.x1 = x1;
            ans.x11 = x11;
        }
        if(w.x2 == x2 && w.x12 != x12){
            ans.x2 = x2;
            ans.x11 = true;
        }else if(w.x2 == x2 && w.x12 == x12){
            ans.x2 =x2;
            ans.x12 = x12;
        }
        return ans;
    }
    public void Show(){
        String s = "";
        if(x11 == true){
            s = s+"[";
        }else{s = s+"(";}
        s = s + x1 + ", " +x2;
        if(x12 == true){
            s = s+"]";
        }else{s = s+")";}
        System.out.print(s);
    }
}

public class task_4_11 {

    public static void main(String[] args) {
        ArrayList<Interval> arr = new ArrayList<>();
        Interval x1 = new Interval(1, true, 4, true);
        Interval x2 = new Interval(3, false, 6, true);
        Interval x3 = new Interval(5, false, 3, false);
        arr.add(x1); arr.add(x2); arr.add(x3);
        float max = arr.get(0).x2;
        float min = arr.get(0).x1;
        for(Interval i : arr) {
            i.Show();
            if (i.x1 < min) {
                min = i.x1;
            }
            if (i.x2 > max) {
                max = i.x2;
            }
        }
        System.out.println("Min = "+min+"; Max = "+max);
        x1.Show();
        x2.Show();
        Interval u = x1.Union(x2);
        System.out.println("\nUnion:");
        u.Show();
        u = x1.Intersection(x2);
        System.out.println("\nIntersection:");
        u.Show();
    }
}