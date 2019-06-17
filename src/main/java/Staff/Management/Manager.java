package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String departmentName;

    public Manager(String name, int NINumber, double salary, String departmentName) {
        super(name, NINumber, salary);
        this.departmentName = departmentName;
    }


    public String getDepartmentName() {
        return this.departmentName;
    }
}
