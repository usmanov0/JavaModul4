package MultiThreading.ImmutableClass;

public final class Employee{
    private final String fullname;
    private final int age;
    private final double salary;
    private final Address address;

    public Employee(String fullname, int age, double salary, Address address) throws CloneNotSupportedException {
        this.fullname = fullname;
        this.age = age;
        this.salary = salary;
        this.address = (Address) address.clone();
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
