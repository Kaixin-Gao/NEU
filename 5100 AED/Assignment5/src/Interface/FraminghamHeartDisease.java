/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Health.City;
import Health.CityDirectory;
import Health.Community;
import Health.CommunityDirectory;
import Health.Family;
import Health.FamilyDirectory;
import Health.House;
import Health.HouseDirectory;
import Health.Initialization;
import Health.Person;
import Health.PersonDirectory;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FraminghamHeartDisease {

    /**
     * @param args the command line arguments
     */
    PersonDirectory personDirectory;
    FamilyDirectory familyDirectory;
    CommunityDirectory CommunityDirectory;
    City city;

    public static void main(String[] args) {

        PersonDirectory personDirectory = Initialization.initPersonDirectory();

        System.out.println("*********************Reports*************************");


        int t = 8;//loop for 8times
        do {
            t = t - 1;
            System.out.println("*********Welcome to the CITY LEVEL ECOSYSTEM********* ");
            System.out.println("******Please enter the choice below for Reports****** ");
            System.out.println("1.CITY LEVEL REPORTS");//整个城市的平均，最大小
            System.out.println("2.COMMUNITY LEVEL REPORTS");//几个区的数据
            System.out.println("3.HOUSE LEVEL REPORTS");//所有house的数据
            System.out.println("4.FAMILY LEVEL REPORTS");//家庭的数据
            System.out.println("5.PERSON LEVEL REPORTS");//个人数据加查找
            System.out.println("6.CALCULLATE YOUR HEALTH RISK");//输入+输出
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println();
            System.out.println("Enter a choice. Please enter a number.");
            int choice = reader.nextInt(); // Scans the next token of the input as an int.
            // double input = reader.nextDouble();

            // Health ecosystem = Initialization.initialize();
            switch (choice) {
                case 1:
                    CityDirectory cityDirectory = Initialization.initCityDirectory();
                    for (City c : cityDirectory.getCityList()) {
                        System.out.println("***************CITY LEVEL REPORT STARTS******************");
                        System.out.println("【                  City No.1\n【 " + "Smoker Rate is :" + String.format("%.0f", c.getSomkerRate() * 100) + "%    Male Rate is :" + String.format("%.0f", c.getMaleRate() * 100) + "%    Diabetes Rate is :" + String.format("%.0f", c.getDiabetesRate() * 100) + "%\n【 Average total chlesterol is : " + String.format("%.2f", c.getAvetotalChlesterol()) + ",  Minimum total chlesterol is : " + String.format("%.2f", c.getMintotalChlesterol()) + ",  Maxmum total chlesterol is : " + String.format("%.2f", c.getMaxtotalChlesterol()) + "   \n【 Average HDL chlesterol is : " + String.format("%.2f", c.getAveHDLChlesterol()) + ",  Minimum HDL chlesterol is : " + String.format("%.2f", c.getMinHDLChlesterol()) + ",  Maxmum total chlesterol is : " + String.format("%.2f", c.getMaxHDLChlesterol()) + "\n【 Average bloodpressure is : " + String.format("%.0f", c.getAvebloodPressure()) + ",   Minimum bloodpressure is : " + c.getMinbloodPressure() + ",   Maxmum bloodpressure is : " + c.getMaxbloodPressure() + "\n【 Average heartBeatPerMinute is : " + String.format("%.0f", c.getAveheartBeatPerMinute()) + ",    Minimum heartBeatPerMinute is : " + c.getMinheartBeatPerMinute() + ",   Maxmum heartBeatPerMinute is : " + c.getMaxheartBeatPerMinute());
                        System.out.println("【 Average Age is:" + String.format("%.0f", c.getAveage()) + ",   Minimum Age is:" + c.getMinage() + ",   Maxmum Age is:" + c.getMaxage() + "\n【 Average Health Point: " + String.format("%.1f", c.getAvehealthpoint()) + ",   Minimum Health Point: " + c.getMinhealthpoint() + ",   Maxmum Health Point: " + c.getMaxhealthpoint() + "\n【 Average 10-year-CHD-risk:" + String.format("%.1f", c.getAvetenyearrisk()) + ",   Minimum 10-year-CHD-risk:" + c.getMintenyearrisk() + ",   Maxmum 10-year-CHD-risk:" + c.getMaxtenyearrisk() + "\n");

                    }
                    System.out.println("***************CITY LEVEL REPORT ENDS******************" + "\n");

                    break;

                case 2:
                    CommunityDirectory communityDirectory = Initialization.initCommunityDirectory();
                    System.out.println("***************COMMUNITY LEVEL REPORT STARTS******************");
                    for (Community c : communityDirectory.getCommunityList()) {
                        System.out.println("                Community No." + c.getCommunityNumber() + "\n【 Smoker Rate is :" + String.format("%.0f", c.getSomkerRate() * 100) + "%    Male Rate is :" + String.format("%.0f", c.getMaleRate() * 100) + "%    Diabetes Rate is :" + String.format("%.0f", c.getDiabetesRate() * 100) + "%\n【 Average total chlesterol is : " + String.format("%.2f", c.getAvetotalChlesterol()) + ",  Minimum total chlesterol is : " + String.format("%.2f", c.getMintotalChlesterol()) + ",  Maxmum total chlesterol is : " + String.format("%.2f", c.getMaxtotalChlesterol()) + "   \n【 Average HDL chlesterol is : " + String.format("%.2f", c.getAveHDLChlesterol()) + ",  Minimum HDL chlesterol is : " + String.format("%.2f", c.getMinHDLChlesterol()) + ",  Maxmum total chlesterol is : " + String.format("%.2f", c.getMaxHDLChlesterol()) + "\n【 Average bloodpressure is : " + String.format("%.0f", c.getAvebloodPressure()) + ",   Minimum bloodpressure is : " + c.getMinbloodPressure() + ",   Maxmum bloodpressure is : " + c.getMaxbloodPressure() + "\n【 Average heartBeatPerMinute is : " + String.format("%.0f", c.getAveheartBeatPerMinute()) + ",    Minimum heartBeatPerMinute is : " + c.getMinheartBeatPerMinute() + ",   Maxmum heartBeatPerMinute is : " + c.getMaxheartBeatPerMinute());
                        System.out.println("【 Average Age is:" + String.format("%.0f", c.getAveage()) + ",   Minimum Age is:" + c.getMinage() + ",   Maxmum Age is:" + c.getMaxage() + "\n【 Average Health Point: " + String.format("%.1f", c.getAvehealthpoint()) + ",   Minimum Health Point: " + c.getMinhealthpoint() + ",   Maxmum Health Point: " + c.getMaxhealthpoint() + "\n【 Average 10-year-CHD-risk:" + String.format("%.1f", c.getAvetenyearrisk()) + ",   Minimum 10-year-CHD-risk:" + c.getMintenyearrisk() + ",   Maxmum 10-year-CHD-risk:" + c.getMaxtenyearrisk() + "\n");

                        //System.out.println("               Community No." + c.getCommunityNumber() + "\n【 Smoker:" + String.format("%.0f", c.getSomkerRate() * 100) + "%   male:" + String.format("%.0f", c.getMaleRate() * 100) + "%   diabetes:" + String.format("%.0f", c.getDiabetesRate() * 100) + "%   ave,min,max total chlesterol: " + String.format("%.2f", c.getAvetotalChlesterol()) + ", " + String.format("%.2f", c.getMintotalChlesterol()) + ", " + String.format("%.2f", c.getMaxtotalChlesterol()) + "   ave,min,max HDL chlesterol: " + String.format("%.2f", c.getAveHDLChlesterol()) + ", " + String.format("%.2f", c.getMinHDLChlesterol()) + ", " + String.format("%.2f", c.getMaxHDLChlesterol()) + "   ave,min,max bloodpressure: " + String.format("%.0f", c.getAvebloodPressure()) + "," + c.getMinbloodPressure() + "," + c.getMaxbloodPressure() + "   ave,min,max heartBeatPerMinute: " + String.format("%.0f", c.getAveheartBeatPerMinute()) + "," + c.getMinheartBeatPerMinute() + "," + c.getMaxheartBeatPerMinute());
                        //System.out.println("              " + "ave,min,max age:" + String.format("%.0f", c.getAveage()) + ", " + c.getMinage() + ", " + c.getMaxage() + "   ave,min,max Health point:" + String.format("%.1f", c.getAvehealthpoint()) + ", " + c.getMinhealthpoint() + ", " + c.getMaxhealthpoint() + "   ave,min,max 10-year-CHD-risk:" + String.format("%.1f", c.getAvetenyearrisk()) + ", " + c.getMintenyearrisk() + ", " + c.getMaxtenyearrisk() + "\n");
                    }
                    System.out.println("***************COMMUNITY LEVEL REPORT ENDS******************" + "\n");
                    break;

                case 3:
                    HouseDirectory houseDirectory = Initialization.initHouseDirectory();
                    System.out.println("***************HOUSE LEVEL REPORT STARTS******************");
                    for (House h : houseDirectory.getHouseList()) {
                        System.out.println("House No." + h.getHouseNumber() + "   Smoker:" + String.format("%.0f", h.getSomkerRate() * 100) + "%   male:" + String.format("%.0f", h.getMaleRate() * 100) + "%   diabetes:" + String.format("%.0f", h.getDiabetesRate() * 100) + "%   ave,min,max total chlesterol: " + String.format("%.2f", h.getAvetotalChlesterol()) + ", " + String.format("%.2f", h.getMintotalChlesterol()) + ", " + String.format("%.2f", h.getMaxtotalChlesterol()) + "   ave,min,max HDL chlesterol: " + String.format("%.2f", h.getAveHDLChlesterol()) + ", " + String.format("%.2f", h.getMinHDLChlesterol()) + ", " + String.format("%.2f", h.getMaxHDLChlesterol()) + "   ave,min,max bloodpressure: " + String.format("%.0f", h.getAvebloodPressure()) + "," + h.getMinbloodPressure() + "," + h.getMaxbloodPressure() + "   ave,min,max heartBeatPerMinute: " + String.format("%.0f", h.getAveheartBeatPerMinute()) + "," + h.getMinheartBeatPerMinute() + "," + h.getMaxheartBeatPerMinute());
                        System.out.println("              " + "ave,min,max age:" + String.format("%.0f", h.getAveage()) + ", " + h.getMinage() + ", " + h.getMaxage() + "   ave,min,max Health point:" + String.format("%.1f", h.getAvehealthpoint()) + ", " + h.getMinhealthpoint() + ", " + h.getMaxhealthpoint() + "   ave,min,max 10-year-CHD-risk:" + String.format("%.1f", h.getAvetenyearrisk()) + ", " + h.getMintenyearrisk() + ", " + h.getMaxtenyearrisk() + "\n");
                    }
                    System.out.println("***************HOUSE LEVEL REPORT ENDS******************" + "\n");
                    break;

                case 4:
                    FamilyDirectory familyDirectory = Initialization.initFamilyDirectory();
                    System.out.println("***************FAMILY LEVEL REPORT STARTS******************");
                    for (Family f : familyDirectory.getFamilyList()) {
                        System.out.println("Family No." + f.getFamilyNumber() + "   Smoker:" + String.format("%.0f", f.getSomkerRate() * 100) + "%   male:" + String.format("%.0f", f.getMaleRate() * 100) + "%   diabetes:" + String.format("%.0f", f.getDiabetesRate() * 100) + "%   ave,min,max chlesterol: " + String.format("%.2f", f.getAvetotalChlesterol()) + ", " + String.format("%.2f", f.getMintotalChlesterol()) + ", " + String.format("%.2f", f.getMaxtotalChlesterol()) + "   ave,min,max HDL: " + String.format("%.2f", f.getAveHDLChlesterol()) + ", " + String.format("%.2f", f.getMinHDLChlesterol()) + ", " + String.format("%.2f", f.getMaxHDLChlesterol()) + "   ave,min,max bloodpressure: " + String.format("%.0f", f.getAvebloodPressure()) + "," + f.getMinbloodPressure() + "," + f.getMaxbloodPressure() + "   ave,min,max heartBeatPerMinute: " + String.format("%.0f", f.getAveheartBeatPerMinute()) + "," + f.getMinheartBeatPerMinute() + "," + f.getMaxheartBeatPerMinute());
                        System.out.println("              " + "ave,min,max age:" + String.format("%.0f", f.getAveage()) + ", " + f.getMinage() + ", " + f.getMaxage() + "   ave,min,max Health point:" + String.format("%.1f", f.getAvehealthpoint()) + ", " + f.getMinhealthpoint() + ", " + f.getMaxhealthpoint() + "   ave,min,max 10-year-CHD-risk:" + String.format("%.1f", f.getAvetenyearrisk()) + ", " + f.getMintenyearrisk() + ", " + f.getMaxtenyearrisk() + "\n");
                    }
                    System.out.println("***************FAMILY LEVEL REPORT ENDS******************" + "\n");
                    break;

                case 5:
                    System.out.println("******************My Random Data STARTS*********************");
                    int i = 1;
                    for (Person p : personDirectory.getPersonList()) {
                        Calendar cal = Calendar.getInstance();
                        int year = cal.get(Calendar.YEAR) - p.getAge();
                        int month = cal.get(Calendar.MONTH)+1;
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int hour = cal.get(Calendar.HOUR_OF_DAY);
                        int minute = cal.get(Calendar.MINUTE);
                        int second = cal.get(Calendar.SECOND);
                        String date = year + "/" + month + "/" + day + "/ " + hour + ":" + minute + ":" + second;
                        System.out.println("Person No." + i + "   Name : " + p.getName() + "     AGE : " + p.getAge() + "     Heartbeat : " + p.getHeartBeatPerMinute() + "     Gender : " + p.getGender() + "     Smoke : " + p.getIsSmoker() + "     TotalChlesterol : " + p.getTotalChlesterol() + "     HDLChlesterol : " + p.getHDLChlesterol() + "     BloodPressure : " + p.getBloodPressure() + "     Diabetes : " + p.getIsDiabetes() + "     Health Point : " + p.getHealthPoint() + "     Ten year CHD risk : " + p.getTenYearRisk() + "   Date:" + date + "\n");
                        i++;
                    }
                    System.out.println("***************My Random Data ENDS******************" + "\n");

                    break;

                case 6:

                    System.out.println("***************CALCULLATE YOUR HEALTH RISK STARTS******************");
                    System.out.println("Choose your gender");
                    System.out.println("1. Male");
                    System.out.println("2. Female");
                    int gender = reader.nextInt();

                    System.out.println("Input your age (5-100)");
                    int age = reader.nextInt();

                    System.out.println("Input your Total Chlesterol (2.3-10.3)");
                    double totalChlesterol = reader.nextDouble();

                    System.out.println("Input your HDL Chlesterol (0.7-3.0)");
                    double HDLChlesterol = reader.nextDouble();

                    System.out.println("Input your systolic blood pressure (70-110)");
                    int BloodPressure = reader.nextInt();

                    System.out.println("Do you somke ???");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    int IsSmoker = reader.nextInt();
                    String Smoker;
                    if (IsSmoker == 1) {
                        Smoker = "Diabetes";
                    } else {
                        Smoker = "None-Diabetes";
                    }

                    System.out.println("Do you have Diabetes ???");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    int IsDiabetes = reader.nextInt();
                    String Diabetes;
                    if (IsDiabetes == 1) {
                        Diabetes = "Diabetes";
                    } else {
                        Diabetes = "None-Diabetes";
                    }

                    int healthpoint;
                    int risk;
                    if (age > 100 || totalChlesterol > 10.4 || totalChlesterol < 2.2 || HDLChlesterol > 3.1 || HDLChlesterol < 0.6 || BloodPressure > 111 || BloodPressure < 69) {System.out.println("SOMETHING WORING WITH YOUR INPUT, PLEASE TRY AGAIN\n\n"); } 
                    else{if (gender == 1) {
                        healthpoint = Initialization.calculateHealthPoint(age, totalChlesterol, HDLChlesterol, BloodPressure, Smoker, Diabetes);
                        risk = Initialization.calculateTenYearRisk(healthpoint);
                    } else {
                        healthpoint = Initialization.calculateFemaleHealthPoint(age, totalChlesterol, HDLChlesterol, BloodPressure, Smoker, Diabetes);
                        risk = Initialization.calculateFemaleTenYearRisk(healthpoint);
                    }
                    

                    System.out.println("*************YOUR RESULTS************");
                    System.out.println("Your health point is " + healthpoint);
                    System.out.println("Your 10 year CHD risk is " + risk + "%");
                    
                    Calendar cal = Calendar.getInstance();
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH)+1;
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int hour = cal.get(Calendar.HOUR_OF_DAY);
                    int minute = cal.get(Calendar.MINUTE);
                    int second = cal.get(Calendar.SECOND);
                    String date = year + "/" + month + "/" + day + "/ " + hour + ":" + minute + ":" + second;
                    System.out.println("Date: " + date);
                    System.out.println("     WISH  YOU  IN  GOOD  HEALTH !!");
                    System.out.println("*************     END    ************" + "\n");}
                    break;

            }
        } while (t > 0);

    }

}
