package com.ironhack.intern;

import com.ironhack.emplyee.Employee;

public class Intern extends Employee {

    public Intern(String name, String position, int salary) {
        super(name, position);
        setInternSalary(salary);
    }
        public void setInternSalary (int salary) {
                if (salary > 20000) {
                    System.err.println("Being ambitious is fine. But let's get some experience. Max salary 20000");
                } else {
                    super.setSalary(salary);
                }
    }
}
