/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Max
 */
public class Business {

    public static Business business;

    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employDirectory;

    private Business() {
        userAccountDirectory = new UserAccountDirectory();
        employDirectory = new EmployeeDirectory();
    }

    public static Business getInsance() {
        if (business == null) {
            business = new Business();

        }
        return business;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployDirectory() {
        return employDirectory;
    }

    public void setEmployDirectory(EmployeeDirectory employDirectory) {
        this.employDirectory = employDirectory;
    }

}
