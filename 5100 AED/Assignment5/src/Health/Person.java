/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health;

/**
 *
 * @author User
 */
public class Person {

    String name;
    int age;
    String isSmoker;
    String gender;
    double totalChlesterol;
    double HDLChlesterol;
    int bloodPressure;
    String isDiabetes;
    int heartBeatPerMinute;
    int familyNumber;
    int healthPoint;
    int tenYearRisk;
    
    

    public int getTenYearRisk() {
        return tenYearRisk;
    }

    public void setTenYearRisk(int tenYearRisk) {
        this.tenYearRisk = tenYearRisk;
    }
    
    

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    
    
    public int getFamilyNumber() {
        return familyNumber;
    }

    public void setFamilyNumber(int familyNumber) {
        this.familyNumber = familyNumber;
    }

    public String getIsSmoker() {
        return isSmoker;
    }

    public void setIsSmoker(String isSmoker) {
        this.isSmoker = isSmoker;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getTotalChlesterol() {
        return totalChlesterol;
    }

    public void setTotalChlesterol(double totalChlesterol) {
        this.totalChlesterol = totalChlesterol;
    }

    public double getHDLChlesterol() {
        return HDLChlesterol;
    }

    public void setHDLChlesterol(double HDLChlesterol) {
        this.HDLChlesterol = HDLChlesterol;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getIsDiabetes() {
        return isDiabetes;
    }

    public void setIsDiabetes(String isDiabetes) {
        this.isDiabetes = isDiabetes;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getHeartBeatPerMinute() {
        return heartBeatPerMinute;
    }

    public void setHeartBeatPerMinute(int heartBeatPerMinute) {
        this.heartBeatPerMinute = heartBeatPerMinute;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
