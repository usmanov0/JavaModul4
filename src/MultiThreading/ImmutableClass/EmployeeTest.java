package MultiThreading.ImmutableClass;

public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address1 = new Address("Tashkent","Nakqoshlik");
        Address address2 = new Address("Samarqand", "Bulvar");
        Employee employee = new Employee("AKBAR SATTOROV",39,4.150, address1);
        System.out.println(employee);
        address1.setRegion("Samarqand"); //O'zgarmadi
        System.out.println(employee);
        employee.getAddress().setRegion("Samarqand"); //O'zgarmadi
        System.out.println(employee);
    }
}
