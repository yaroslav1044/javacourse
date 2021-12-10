abstract class Worker implements CoWorker {
    private int salary; //print
    private String post; //title
    private String department; //authors
    private float experience; //price

    Worker() {}

    Worker(String post, int n, String department, float experience) {
        this.post = post;
        setSalary(n);
        this.department = department;
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int n) {
        salary = n;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String s) {
        this.post = s;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float p) {
        this.experience = p;
    }

    @Override
    public String toString() {
        return "Engineer: " + getPost() + ", " + getDepartment();
    }
}