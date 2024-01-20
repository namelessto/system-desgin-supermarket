package logic.worker;

import java.util.Date;
import java.util.List;
import logic.enums.WorkerEnum;

public class WorkerModel {
    private int workerID;
    private int personalID;
    private String name;
    private int bankAccount;
    private double salary;
    private Date employmentDate;
    private List<WorkerEnum> roles;

    // Getter and Setter for workerID
    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public int getWorkerID() {
        return this.workerID;
    }

    // Getter and Setter for personalID
    public void setPersonalID(int personalID) {
        this.personalID = personalID;
    }

    public int getPersonalID() {
        return this.personalID;
    }

    // Getter and Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Getter and Setter for bankAccount
    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBankAccount() {
        return this.bankAccount;
    }

    // Getter and Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    // Getter and Setter for employmentDate
    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Date getEmploymentDate() {
        return this.employmentDate;
    }

    // Getter and Setter for roles
    public void setRoles(List<WorkerEnum> roles) {
        this.roles = roles;
    }

    public List<WorkerEnum> getRoles() {
        return this.roles;
    }
}
