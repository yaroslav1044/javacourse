class Supervisor extends Worker {
    private String city;
    private String office;
    private int grade;

    public Supervisor() {}

    public Supervisor(String title, int n, String authors, float price) {
        super(title, n, authors, price);
    }

    public Supervisor(String title, int n, String authors, float price, String l1, String l2, int items) {
        this(title, n, authors, price);
        setCity(l1);
        setOffice(l2);
        setGrade(items);
    }

    public void setCity(String l1) {
        this.city = l1;
    }

    public void setOffice(String l2) {
        this.office = l2;
    }

    public void setGrade(int n) {
        this.grade = n;
    }

    public String getCity() {
        return city;
    }

    public String getOffice() {
        return office;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Dictionary: " + city + " -> " + office + ": " + getPost() + ", " + getDepartment();
    }
}