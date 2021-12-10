public class T3_5and3_6 {
    public String name;
    public String say;

    public T3_5and3_6(String name, String say) {
        this.name = name;
        this.say = say;
    }

    public void bark()
    {
        System.out.println(name + " say " + say);
    }
} 