package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNumber, int salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public void setDeptName(String department) {
        this.deptName = department;
    }
}
