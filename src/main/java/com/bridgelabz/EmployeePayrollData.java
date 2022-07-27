package com.bridgelabz;

import java.time.LocalDate;

public class EmployeePayrollData {
    public int employeeId;
    public String employeeName;
    public double employeeSalary;

    public LocalDate startDate;
    private String name;
    double salary;
    private String id;


    public EmployeePayrollData(Integer id, String name, Double salary) {

        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    public EmployeePayrollData(int id, String name, double salary, LocalDate startDate) {
        this(id, name, salary);
        this.startDate = startDate;
    }

        @Override
        public String toString() {
            return "id =" + id + ",name =" + name + ",salary =" + salary;
        }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        EmployeePayrollData emp_payroll = (EmployeePayrollData) obj;
        return id == emp_payroll.id && Double.compare(emp_payroll.salary, salary) == 0 && name.equals(emp_payroll.name);
    }
    }
