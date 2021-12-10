class Engineer extends Worker {
    private int grade;

    Engineer() {}

    Engineer(String post, int n, String department, float experience) {
        super(post, n, department, experience);
    }

    public Engineer(String title, int n, String authors, float price, int items) {
        this(title, n, authors, price);
        setGrade(items);
    }

    public void setGrade(int n) {
        this.grade = n;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Engineer: " + getPost() + ", " + getDepartment();
    }
}