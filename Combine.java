import java.time.LocalDate;

enum StudentStatus {
    FRESHMAN,
    SOPHOMORE,
    JUNIOR,
    SENIOR
}

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    private StudentStatus status;

    public Student(String name, String address, String phoneNumber, String email, StudentStatus status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private LocalDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,
                   LocalDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary,
                 LocalDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}

class FullTimeStaff extends Staff {
    public FullTimeStaff(String name, String address, String phoneNumber, String email, String office, double salary,
                         LocalDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired, title);
    }

    @Override
    public String toString() {
        return "Full-Time Staff: " + name;
    }
}

class PartTimeStaff extends Staff {
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeStaff(String name, String address, String phoneNumber, String email, String office, double hourlyRate,
                         double hoursWorked, LocalDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, 0, dateHired, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateEarnings() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "Part-Time Staff: " + name;
    }
}

public class Combine {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "123 Main St", "555-1234", "john@example.com", StudentStatus.SOPHOMORE);
        System.out.println(student);

        Faculty faculty = new Faculty("Jane Smith", "456 Elm St", "555-5678", "jane@example.com", "A-101",
                5000, LocalDate.of(2022, 1, 1), "9AM-5PM", "Professor");
        System.out.println(faculty);

        FullTimeStaff fullTimeStaff = new FullTimeStaff("David Johnson", "789 Oak St", "555-9012", "david@example.com",
                "B-201", 4000, LocalDate.of(2022, 3, 1), "Manager");
        System.out.println(fullTimeStaff);

        PartTimeStaff partTimeStaff = new PartTimeStaff("Lisa Anderson", "789 Oak St", "555-3456", "lisa@example.com",
                "B-202", 20, 30, LocalDate.of(2022, 4, 1), "Assistant");
        System.out.println(partTimeStaff);
        System.out.println("Earnings: $" + partTimeStaff.calculateEarnings());
    }
}