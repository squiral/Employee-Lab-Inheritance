package Staff.Management;

import Staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, int NINumber, double salary, double budget){
        super(name, NINumber, salary);
        this.budget = budget;

    }

    public double getBudget() {
        return this.budget;
    }
}
