class task_4_4 {
    public static double Perimeter (double x, double y, double z){
        return x+y+z;
    }
    public static double Area (double x, double y, double z, double perimeter){
        double p = perimeter/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println("area: " + Area(a, b, c, Perimeter(a, b, c)));
        System.out.println("perimeter: " + Perimeter(a, b, c));
        System.out.println("area with given numbers: " + Area(3, 3.5+2E-111, 3.5+2E-111, Perimeter(3, 3.5+2E-111, 3.5+2E-111)));
        System.out.println("perimeter with given numbers: " + Perimeter(3, 3.5+2E-111, 3.5+2E-111));
    }
}
