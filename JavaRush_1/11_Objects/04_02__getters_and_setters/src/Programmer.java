public class Programmer {
    private int salary = 1000;
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = (salary > this.salary) ? salary : this.salary;
    }
}