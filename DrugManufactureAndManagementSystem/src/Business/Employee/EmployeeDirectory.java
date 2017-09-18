/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author zhang
 */
public class EmployeeDirectory {
     private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }

    public Patient createPatient(String name) {
        Patient patient = new Patient();
        patient.setName(name);
        employeeList.add(patient);
        return patient;
    }

    public void removePatient(Patient p) {
        employeeList.remove(p);
    }

    public boolean updateConsumer(Patient p) {
        if (employeeList.contains(p)) {
            int elementIndex = employeeList.indexOf(p);
            employeeList.set(elementIndex, p);
            return true;
        } else {
            return false;
        }
    }
}
