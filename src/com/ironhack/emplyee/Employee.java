package com.ironhack.emplyee;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public void promotionEmployee (String name, String position) {
        System.out.println("Hello " + name + "you've been promoted to " + position + " !");
    }

    public Employee(String name, String position) {
        setName(name);
        setPosition(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
