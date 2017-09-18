/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health;

import java.util.Random;

/**
 *
 * @author User
 */
public class Initialization {

    public static String generateString(Random rng, String characters, int length) {//random String 
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

    public static int randInt(int min, int max) {//ramdom int between min and max

        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static double randDouble(double min, double max) {//ramdom double between min and max

        Random r = new Random();// so add 1 to make it inclusive
        double rd = (r.nextDouble()) * (max - min) + min;
        rd = (double) (Math.round(rd * 100) / 100.0);
        return rd;
    }

    public static int calculateHealthPoint(int age, double totalChlesterol, double HDLChlesterol, int BloodPressure, String IsSmoker, String IsDiabetes) {// String isSmoker, String gender, double totalChlesterol, double HDLChlesterol, int bloodPressure,String isDiabetes,int heartBeatPerMinute  , double max) {
//calculate mens Health point
        int healthpoint = 0;
        
            if (age < 35) {
                healthpoint = healthpoint - 1;
            } else {
                healthpoint = (int) (healthpoint + Math.floor((age - 35) / 4));
            }

            if (totalChlesterol < 2.59) {
                healthpoint = healthpoint - 3;
            } else {
                if (totalChlesterol > 4.15) {
                    healthpoint = healthpoint + 1;
                }
                if (totalChlesterol >= 4.92) {
                    healthpoint = healthpoint + 1;
                }
            }

            if (HDLChlesterol < 0.9) {
                healthpoint = healthpoint + 2;
            } else if (HDLChlesterol < 1.16) {
                healthpoint = healthpoint + 1;
            } else if (HDLChlesterol > 1.56) {
                healthpoint = healthpoint - 1;
            }

            if (BloodPressure >= 100) {
                healthpoint = healthpoint + 3;
            } else if (BloodPressure >= 90) {
                healthpoint = healthpoint + 2;
            } else {
                healthpoint = healthpoint + 1;
            }

            if ("Smoker".equals(IsSmoker)) {
                healthpoint = healthpoint + 2;
            }
            if ("Diabetes".equals(IsDiabetes)) {
                healthpoint = healthpoint + 2;
            
        }

        return healthpoint;
    }

    public static int calculateFemaleHealthPoint(int age, double totalChlesterol, double HDLChlesterol, int BloodPressure, String IsSmoker, String IsDiabetes) {// String isSmoker, String gender, double totalChlesterol, double HDLChlesterol, int bloodPressure,String isDiabetes,int heartBeatPerMinute  , double max) {
//calculate womens Health point
        int healthpoint = 0;
        
            if (age < 35) {
                healthpoint = healthpoint - 1;
            } else {
                healthpoint = (int) (healthpoint + Math.floor((age - 35) / 4));
            }

            if (totalChlesterol < 2.59) {
                healthpoint = healthpoint - 2;
            } else if (totalChlesterol > 4.15) {
                healthpoint = healthpoint + 2;
            }

            if (HDLChlesterol < 0.9) {
                healthpoint = healthpoint + 5;
            } else if (HDLChlesterol < 1.16) {
                healthpoint = healthpoint + 2;
            } else if (HDLChlesterol >= 1.56) {
                healthpoint = healthpoint - 2;
            }

            if (BloodPressure >= 100) {
                healthpoint = healthpoint + 3;
            } else if (BloodPressure >= 90) {
                healthpoint = healthpoint + 2;
            } else if (BloodPressure < 80) {
                healthpoint = healthpoint - 3;
            }

            if ("Smoker".equals(IsSmoker)) {
                healthpoint = healthpoint + 4;
            }
            if ("Diabetes".equals(IsDiabetes)) {
                healthpoint = healthpoint + 2;
            
        }

        return healthpoint;
    }

    public static int calculateTenYearRisk(int healthpoint) {//calculate mens ten year risk
        int risk = 0;
        if (healthpoint < -3) {
            risk = 1;
        }
        if (healthpoint == -2) {
            risk = 2;
        }
        if (healthpoint == -1) {
            risk = 2;
        }
        if (healthpoint == 0) {
            risk = 3;
        }
        if (healthpoint == 1) {
            risk = 4;
        }
        if (healthpoint == 2) {
            risk = 4;
        }
        if (healthpoint == 3) {
            risk = 6;
        }
        if (healthpoint == 4) {
            risk = 7;
        }
        if (healthpoint == 5) {
            risk = 9;
        }
        if (healthpoint == 6) {
            risk = 11;
        }
        if (healthpoint == 7) {
            risk = 14;
        }
        if (healthpoint == 8) {
            risk = 18;
        }
        if (healthpoint == 9) {
            risk = 22;
        }
        if (healthpoint == 10) {
            risk = 17;
        }
        if (healthpoint == 11) {
            risk = 33;
        }
        if (healthpoint == 12) {
            risk = 40;
        }
        if (healthpoint == 13) {
            risk = 47;
        }
        if (healthpoint >= 14) {
            risk = 56;
        }
        return risk;
    }

    public static int calculateFemaleTenYearRisk(int healthpoint) {//calculate womens ten year risk
        int risk = 0;
        if (healthpoint <= -2) {
            risk = 1;
        }
        if (healthpoint == -1) {
            risk = 2;
        }
        if (healthpoint == 0) {
            risk = 2;
        }
        if (healthpoint == 1) {
            risk = 2;
        }
        if (healthpoint == 2) {
            risk = 3;
        }
        if (healthpoint == 3) {
            risk = 3;
        }
        if (healthpoint == 4) {
            risk = 4;
        }
        if (healthpoint == 5) {
            risk = 5;
        }
        if (healthpoint == 6) {
            risk = 6;
        }
        if (healthpoint == 7) {
            risk = 7;
        }
        if (healthpoint == 8) {
            risk = 8;
        }
        if (healthpoint == 9) {
            risk = 9;
        }
        if (healthpoint == 10) {
            risk = 11;
        }
        if (healthpoint == 11) {
            risk = 13;
        }
        if (healthpoint == 12) {
            risk = 15;
        }
        if (healthpoint == 13) {
            risk = 17;
        }
        if (healthpoint == 14) {
            risk = 20;
        }
        if (healthpoint == 15) {
            risk = 24;
        }
        if (healthpoint == 16) {
            risk = 27;
        }
        if (healthpoint >= 17) {
            risk = 32;
        }
        return risk;
    }

    public static PersonDirectory initPersonDirectory() {//开始初始化======================
        PersonDirectory personDirectory = new PersonDirectory();
        Random rand = new Random();

        String[] array = {"Neeraj", "Katie", "Courtney", "Kelsey", "David", "Alex", "Yi", "Zhang", "Hang", "Nan", "Yiming", "Sarah", "Kim", "Kevin", "Ethan", "Cole", "John", "Steven", "Ford", "James", "Riched", "Jereme", "Adam"};
        String[] array2 = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Wilson", "Martinez", "Taylor", "Thomas", "Jackson", "Scoot", "Walker", "Perez", "King", "Green", "Baker", "Adams", "Hill", "Clack", "White"};
        //随机名字和姓氏============================
        String[] array3 = {"Somker", "None-Smoker", "None-Smoker"};
        String[] array4 = {"Male", "Female"};
        String[] array5 = {"Diabetes", "None-Diabetes", "None-Diabetes", "None-Diabetes", "None-Diabetes", "None-Diabetes"};//增加"None-Smoker"出现的次数，模拟真实的糖尿病比率

        for (int i = 1; i < 5001; i++) {
            //以下**************************random grandparent************************************

            Person person = personDirectory.addPerson();

            String name = array[rand.nextInt(array.length)];
            String lastname = array2[rand.nextInt(array2.length)];
            person.setName(name + " " + lastname);//生成名字

            String Smoker = array3[rand.nextInt(array3.length)];
            String Male = array4[rand.nextInt(array4.length)];
            String Diabetes = array5[rand.nextInt(array5.length)];
            person.setIsSmoker(Smoker);
            person.setGender(Male);
            person.setIsDiabetes(Diabetes);//抽烟，性别，糖尿病

            int n = randInt(60, 80) + 1;
            person.setAge(n);//年龄60-80岁

            n = randInt(40, 100);
            person.setHeartBeatPerMinute(n);//心跳40-100

            double x = randDouble(2.3, 10.3);
            person.setTotalChlesterol(x);//总胆固醇2.3-10.3

            x = randDouble(0.7, 3.0);
            person.setHDLChlesterol(x);//HDL胆固醇0.7--3.0

            n = randInt(70, 110);
            person.setBloodPressure(n);//心跳10-110

            n = i;
            person.setFamilyNumber(n);//记录这是第几个家庭

            if ("Male".equals(person.getGender())) {
                n = calculateHealthPoint(person.getAge(), person.getTotalChlesterol(), person.getHDLChlesterol(), person.getBloodPressure(), person.getIsSmoker(), person.getIsDiabetes());//*******
                person.setHealthPoint(n);//计算男人健康指标

                n = calculateTenYearRisk(person.getHealthPoint());
                person.setTenYearRisk(n);
            }//计算男人10年风险
            else {
                n = calculateFemaleHealthPoint(person.getAge(), person.getTotalChlesterol(), person.getHDLChlesterol(), person.getBloodPressure(), person.getIsSmoker(), person.getIsDiabetes());//*******
                person.setHealthPoint(n);//计算女人健康指标

                n = calculateFemaleTenYearRisk(person.getHealthPoint());
                person.setTenYearRisk(n);//计算女人10年风险
            }

            //**********************random son and doughtor***********************************
            n = randInt(0, 3);//随机爷爷有几个儿子
            if (n != 0) {
                for (int y = 1; y <= n; y++) {

                    Person son = personDirectory.addPerson();

                    son.setFamilyNumber(i);
                    String sonname = array[rand.nextInt(array.length)];
                    //String sonlastname = array2[rand.nextInt(array2.length)];
                    son.setName(sonname + " " + lastname);                //生成名字+爷爷的姓氏

                    String sonSmoker = array3[rand.nextInt(array3.length)];
                    String sonMale = array4[rand.nextInt(array4.length)];
                    String sonDiabetes = array5[rand.nextInt(array5.length)];
                    son.setIsSmoker(sonSmoker);
                    son.setGender(sonMale);
                    son.setIsDiabetes(sonDiabetes);//抽烟，性别，糖尿病

                    int z = person.getAge() - randInt(25, 30);
                    son.setAge(z);//年龄

                    z = randInt(40, 100);
                    son.setHeartBeatPerMinute(z);//心跳

                    double a = randDouble(2.3, 10.3);
                    son.setTotalChlesterol(a);//总胆固醇

                    a = randDouble(0.7, 3.0);
                    son.setHDLChlesterol(a);//HDL胆固醇

                    z = randInt(70, 110);
                    son.setBloodPressure(z);//血压

                    if ("Male".equals(son.getGender())) {
                        n = calculateHealthPoint(son.getAge(), son.getTotalChlesterol(), son.getHDLChlesterol(), son.getBloodPressure(), son.getIsSmoker(), son.getIsDiabetes());//*******
                        son.setHealthPoint(n);//计算男人健康指标

                        n = calculateTenYearRisk(son.getHealthPoint());
                        son.setTenYearRisk(n);
                    }//计算男人10年风险
                    else {
                        n = calculateFemaleHealthPoint(son.getAge(), son.getTotalChlesterol(), son.getHDLChlesterol(), son.getBloodPressure(), son.getIsSmoker(), son.getIsDiabetes());//*******
                        son.setHealthPoint(n);//计算女人健康指标

                        n = calculateFemaleTenYearRisk(person.getHealthPoint());
                        son.setTenYearRisk(n);//计算女人10年风险
                    }

                    //****************random grand son************************************
                    z = randInt(0, 3);//随机爸爸辈有几个孙子辈
                    if (n != 0 && z != 0) {//如果没有爸爸辈就没有孙子辈
                        for (int d = 1; d <= z; d++) {

                            Person grandson = personDirectory.addPerson();

                            grandson.setFamilyNumber(i);
                            String grandsonname = array[rand.nextInt(array.length)];
                            //String sonlastname = array2[rand.nextInt(array2.length)];
                            grandson.setName(grandsonname + " " + lastname);//生成名字

                            String grandsonSmoker = array3[rand.nextInt(array3.length)];
                            String grandsonMale = array4[rand.nextInt(array4.length)];
                            String grandsonDiabetes = array5[rand.nextInt(array5.length)];
                            grandson.setIsSmoker(grandsonSmoker);
                            grandson.setGender(grandsonMale);
                            grandson.setIsDiabetes(grandsonDiabetes);//抽烟，性别，糖尿病

                            int b = son.getAge() - randInt(25, 30);
                            grandson.setAge(b);//年龄50-80岁
                            if (b < 21) {
                                grandson.setIsSmoker("None-Smoker");//小于二十一岁不能抽烟
                            }

                            b = randInt(40, 100);
                            grandson.setHeartBeatPerMinute(b);//心跳40-80

                            double c = randDouble(2.3, 10.3);
                            grandson.setTotalChlesterol(c);//总胆固醇3.6-10.3

                            c = randDouble(0.7, 3.0);
                            grandson.setHDLChlesterol(c);//HDL胆固醇0.8--4.0

                            b = randInt(70, 110);
                            grandson.setBloodPressure(b);//xueya90-200

                            if ("Male".equals(grandson.getGender())) {
                                n = calculateHealthPoint(grandson.getAge(), grandson.getTotalChlesterol(), grandson.getHDLChlesterol(), grandson.getBloodPressure(), grandson.getIsSmoker(), grandson.getIsDiabetes());//*******
                                grandson.setHealthPoint(n);//计算男人健康指标

                                n = calculateTenYearRisk(grandson.getHealthPoint());
                                grandson.setTenYearRisk(n);
                            }//计算男人10年风险
                            else {
                                n = calculateFemaleHealthPoint(grandson.getAge(), grandson.getTotalChlesterol(), grandson.getHDLChlesterol(), grandson.getBloodPressure(), grandson.getIsSmoker(), grandson.getIsDiabetes());//*******
                                grandson.setHealthPoint(n);//计算女人健康指标

                                n = calculateFemaleTenYearRisk(grandson.getHealthPoint());
                                grandson.setTenYearRisk(n);//计算女人10年风险
                            }

                        }
                    }

                }

            }

        }
        return personDirectory;
    }

    //生成结束
    public static FamilyDirectory initFamilyDirectory() {
        FamilyDirectory familyDirectory = new FamilyDirectory();
        PersonDirectory personDirectory = Initialization.initPersonDirectory();

        for (int i = 1; i < 5001; i++) {
            int howmanypeople = 0;

            double somkerRate = 0;
            double maleRate = 0;
            double diabetesRate = 0;

            double avetotalChlesterol = 0;
            double mintotalChlesterol = 10000;
            double maxtotalChlesterol = 0;

            double aveHDLChlesterol = 0;
            double minHDLChlesterol = 1000;
            double maxHDLChlesterol = 0;

            double avebloodPressure = 0;
            int minbloodPressure = 10000;
            int maxbloodPressure = 0;

            double aveheartBeatPerMinute = 0;
            int minheartBeatPerMinute = 10000;
            int maxheartBeatPerMinute = 0;

            double aveage = 0;
            int minage = 10000;
            int maxage = 0;

            double avehealthpoint = 0;
            int minhealthpoint = 1000;
            int maxhealthpoint = 0;

            double avetenyearrisk = 0;
            int mintenyearrisk = 1000;
            int maxtenyearrisk = 0;

            for (Person p : personDirectory.getPersonList()) {
                if (p.getFamilyNumber() == i) {
                    howmanypeople++;
                    if ("Somker".equals(p.getIsSmoker())) {
                        somkerRate++;
                    }
                    if ("Diabetes".equals(p.getIsDiabetes())) {
                        diabetesRate++;
                    }
                    if ("Male".equals(p.getGender())) {
                        maleRate++;
                    }
                    avetotalChlesterol = avetotalChlesterol + p.getTotalChlesterol();
                    if (p.getTotalChlesterol() < mintotalChlesterol) {
                        mintotalChlesterol = p.getTotalChlesterol();
                    }
                    if (p.getTotalChlesterol() > maxtotalChlesterol) {
                        maxtotalChlesterol = p.getTotalChlesterol();
                    }
                    avebloodPressure = avebloodPressure + p.getBloodPressure();
                    if (p.getBloodPressure() < minbloodPressure) {
                        minbloodPressure = p.getBloodPressure();
                    }
                    if (p.getBloodPressure() > maxbloodPressure) {
                        maxbloodPressure = p.getBloodPressure();
                    }
                    aveHDLChlesterol = aveHDLChlesterol + p.getHDLChlesterol();
                    if (p.getHDLChlesterol() < minHDLChlesterol) {
                        minHDLChlesterol = p.getHDLChlesterol();
                    }
                    if (p.getHDLChlesterol() > maxHDLChlesterol) {
                        maxHDLChlesterol = p.getHDLChlesterol();
                    }
                    aveheartBeatPerMinute = aveheartBeatPerMinute + p.getHeartBeatPerMinute();
                    if (p.getHeartBeatPerMinute() < minheartBeatPerMinute) {
                        minheartBeatPerMinute = p.getHeartBeatPerMinute();
                    }
                    if (p.getHeartBeatPerMinute() > maxheartBeatPerMinute) {
                        maxheartBeatPerMinute = p.getHeartBeatPerMinute();
                    }
                    aveage = aveage + p.getAge();
                    if (p.getAge() < minage) {
                        minage = p.getAge();
                    }
                    if (p.getAge() > maxage) {
                        maxage = p.getAge();
                    }

                    avehealthpoint = avehealthpoint + p.getHealthPoint();
                    if (p.getHealthPoint() < minhealthpoint) {
                        minhealthpoint = p.getHealthPoint();
                    }
                    if (p.getHealthPoint() > maxhealthpoint) {
                        maxhealthpoint = p.getHealthPoint();
                    }

                    avetenyearrisk = avetenyearrisk + p.getTenYearRisk();
                    if (p.getTenYearRisk() < mintenyearrisk) {
                        mintenyearrisk = p.getTenYearRisk();
                    }
                    if (p.getTenYearRisk() > maxtenyearrisk) {
                        maxtenyearrisk = p.getTenYearRisk();
                    }

                }

            }
            Family family = familyDirectory.addFamily();
            family.setFamilyNumber(i);
            family.setHowmanypeople(howmanypeople);
            family.setMaleRate(maleRate / howmanypeople);
            family.setDiabetesRate(diabetesRate / howmanypeople);
            family.setSomkerRate(somkerRate / howmanypeople);

            family.setAvetotalChlesterol(avetotalChlesterol / howmanypeople);
            family.setMintotalChlesterol(mintotalChlesterol);
            family.setMaxtotalChlesterol(maxtotalChlesterol);

            family.setAveheartBeatPerMinute(aveheartBeatPerMinute / howmanypeople);
            family.setMaxheartBeatPerMinute(maxheartBeatPerMinute);
            family.setMinheartBeatPerMinute(minheartBeatPerMinute);

            family.setAvebloodPressure(avebloodPressure / howmanypeople);
            family.setMaxbloodPressure(maxbloodPressure);
            family.setMinbloodPressure(minbloodPressure);

            family.setMinHDLChlesterol(minHDLChlesterol);
            family.setAveHDLChlesterol(aveHDLChlesterol / howmanypeople);
            family.setMaxHDLChlesterol(maxHDLChlesterol);

            family.setAvetenyearrisk(avetenyearrisk / howmanypeople);
            family.setMintenyearrisk(mintenyearrisk);
            family.setMaxtenyearrisk(maxtenyearrisk);

            family.setAvehealthpoint(avehealthpoint / howmanypeople);
            family.setMinhealthpoint(minhealthpoint);
            family.setMaxhealthpoint(maxhealthpoint);

            family.setAveage(aveage / howmanypeople);
            family.setMinage(minage);
            family.setMaxage(maxage);
            // family.setCommunityNumber(randInt(1,10));
            family.setHouseNumber(randInt(1, 100));

        }

        return familyDirectory;
    }

    public static HouseDirectory initHouseDirectory() {
        HouseDirectory houseDirectory = new HouseDirectory();
        FamilyDirectory familyDirectory = Initialization.initFamilyDirectory();

        for (int ii = 1; ii < 101; ii++) {
            int howmanypeople = 0;

            double somkerRate = 0;
            double maleRate = 0;
            double diabetesRate = 0;

            double avetotalChlesterol = 0;
            double mintotalChlesterol = 10000;
            double maxtotalChlesterol = 0;

            double aveHDLChlesterol = 0;
            double minHDLChlesterol = 1000;
            double maxHDLChlesterol = 0;

            double avebloodPressure = 0;
            int minbloodPressure = 10000;
            int maxbloodPressure = 0;

            double aveheartBeatPerMinute = 0;
            int minheartBeatPerMinute = 10000;
            int maxheartBeatPerMinute = 0;

            double aveage = 0;
            int minage = 10000;
            int maxage = 0;

            double avehealthpoint = 0;
            int minhealthpoint = 1000;
            int maxhealthpoint = 0;

            double avetenyearrisk = 0;
            int mintenyearrisk = 1000;
            int maxtenyearrisk = 0;

            for (Family f : familyDirectory.getFamilyList()) {
                if (f.getHouseNumber() == ii) {
                    howmanypeople = howmanypeople + f.getHowmanypeople();
                    // if("Somker".equals(f.getIsSmoker())){somkerRate++;}
                    // if("Diabetes".equals(f.getIsDiabetes())){diabetesRate++;}
                    // if("Male".equals(f.getGender())){maleRate++;}
                    somkerRate = somkerRate + f.getHowmanypeople() * f.getSomkerRate();
                    maleRate = maleRate + f.getHowmanypeople() * f.getMaleRate();
                    diabetesRate = diabetesRate + f.getHowmanypeople() * f.getDiabetesRate();

                    avetotalChlesterol = avetotalChlesterol + f.getAvetotalChlesterol() * f.getHowmanypeople();
                    if (f.getMintotalChlesterol() < mintotalChlesterol) {
                        mintotalChlesterol = f.getMintotalChlesterol();
                    }
                    if (f.getMaxtotalChlesterol() > maxtotalChlesterol) {
                        maxtotalChlesterol = f.getMaxtotalChlesterol();
                    }
                    avebloodPressure = avebloodPressure + f.getAvebloodPressure() * f.getHowmanypeople();
                    if (f.getMinbloodPressure() < minbloodPressure) {
                        minbloodPressure = f.getMinbloodPressure();
                    }
                    if (f.getMaxbloodPressure() > maxbloodPressure) {
                        maxbloodPressure = f.getMaxbloodPressure();
                    }
                    aveHDLChlesterol = aveHDLChlesterol + f.getAveHDLChlesterol() * f.getHowmanypeople();
                    if (f.getMinHDLChlesterol() < minHDLChlesterol) {
                        minHDLChlesterol = f.getMinHDLChlesterol();
                    }
                    if (f.getMaxHDLChlesterol() > maxHDLChlesterol) {
                        maxHDLChlesterol = f.getMaxHDLChlesterol();
                    }
                    aveheartBeatPerMinute = aveheartBeatPerMinute + f.getAveheartBeatPerMinute() * f.getHowmanypeople();
                    if (f.getMinheartBeatPerMinute() < minheartBeatPerMinute) {
                        minheartBeatPerMinute = f.getMinheartBeatPerMinute();
                    }
                    if (f.getMaxheartBeatPerMinute() > maxheartBeatPerMinute) {
                        maxheartBeatPerMinute = f.getMaxheartBeatPerMinute();
                    }
                    aveage = aveage + f.getAveage() * f.getHowmanypeople();
                    if (f.getMinage() < minage) {
                        minage = f.getMinage();
                    }
                    if (f.getMaxage() > maxage) {
                        maxage = f.getMaxage();
                    }

                    avehealthpoint = avehealthpoint + f.getAvehealthpoint() * f.getHowmanypeople();
                    if (f.getMinhealthpoint() < minhealthpoint) {
                        minhealthpoint = f.getMinhealthpoint();
                    }
                    if (f.getMaxhealthpoint() > maxhealthpoint) {
                        maxhealthpoint = f.getMaxhealthpoint();
                    }

                    avetenyearrisk = avetenyearrisk + f.getAvetenyearrisk();
                    if (f.getMintenyearrisk() < mintenyearrisk) {
                        mintenyearrisk = f.getMintenyearrisk();
                    }
                    if (f.getMaxtenyearrisk() > maxtenyearrisk) {
                        maxtenyearrisk = f.getMaxtenyearrisk();
                    }

                }

            }
            House house = houseDirectory.addHouse();
            house.setHouseNumber(ii);
            house.setHowmanypeople(howmanypeople);

            house.setMaleRate(maleRate / howmanypeople);
            house.setDiabetesRate(diabetesRate / howmanypeople);
            house.setSomkerRate(somkerRate / howmanypeople);

            house.setAvetotalChlesterol(avetotalChlesterol / howmanypeople);
            house.setMintotalChlesterol(mintotalChlesterol);
            house.setMaxtotalChlesterol(maxtotalChlesterol);

            house.setAveheartBeatPerMinute(aveheartBeatPerMinute / howmanypeople);
            house.setMaxheartBeatPerMinute(maxheartBeatPerMinute);
            house.setMinheartBeatPerMinute(minheartBeatPerMinute);

            house.setAvebloodPressure(avebloodPressure / howmanypeople);
            house.setMaxbloodPressure(maxbloodPressure);
            house.setMinbloodPressure(minbloodPressure);

            house.setMinHDLChlesterol(minHDLChlesterol);
            house.setAveHDLChlesterol(aveHDLChlesterol / howmanypeople);
            house.setMaxHDLChlesterol(maxHDLChlesterol);

            house.setAvetenyearrisk(avetenyearrisk / howmanypeople);
            house.setMintenyearrisk(mintenyearrisk);
            house.setMaxtenyearrisk(maxtenyearrisk);

            house.setAvehealthpoint(avehealthpoint / howmanypeople);
            house.setMinhealthpoint(minhealthpoint);
            house.setMaxhealthpoint(maxhealthpoint);

            house.setAveage(aveage / howmanypeople);
            house.setMinage(minage);
            house.setMaxage(maxage);
            house.setCommunityNumber(randInt(1, 10));

        }

        return houseDirectory;
    }

    public static CommunityDirectory initCommunityDirectory() {
        CommunityDirectory communityDirectory = new CommunityDirectory();
        HouseDirectory houseDirectory = Initialization.initHouseDirectory();

        for (int ii = 1; ii < 11; ii++) {
            int howmanypeople = 0;

            double somkerRate = 0;
            double maleRate = 0;
            double diabetesRate = 0;

            double avetotalChlesterol = 0;
            double mintotalChlesterol = 10000;
            double maxtotalChlesterol = 0;

            double aveHDLChlesterol = 0;
            double minHDLChlesterol = 1000;
            double maxHDLChlesterol = 0;

            double avebloodPressure = 0;
            int minbloodPressure = 10000;
            int maxbloodPressure = 0;

            double aveheartBeatPerMinute = 0;
            int minheartBeatPerMinute = 10000;
            int maxheartBeatPerMinute = 0;

            double aveage = 0;
            int minage = 10000;
            int maxage = 0;

            double avehealthpoint = 0;
            int minhealthpoint = 1000;
            int maxhealthpoint = 0;

            double avetenyearrisk = 0;
            int mintenyearrisk = 1000;
            int maxtenyearrisk = 0;

            for (House h : houseDirectory.getHouseList()) {
                if (h.getCommunityNumber() == ii) {
                    howmanypeople = howmanypeople + h.getHowmanypeople();
                    // if("Somker".equals(f.getIsSmoker())){somkerRate++;}
                    // if("Diabetes".equals(f.getIsDiabetes())){diabetesRate++;}
                    // if("Male".equals(f.getGender())){maleRate++;}
                    somkerRate = somkerRate + h.getHowmanypeople() * h.getSomkerRate();
                    maleRate = maleRate + h.getHowmanypeople() * h.getMaleRate();
                    diabetesRate = diabetesRate + h.getHowmanypeople() * h.getDiabetesRate();

                    avetotalChlesterol = avetotalChlesterol + h.getAvetotalChlesterol() * h.getHowmanypeople();
                    if (h.getMintotalChlesterol() < mintotalChlesterol) {
                        mintotalChlesterol = h.getMintotalChlesterol();
                    }
                    if (h.getMaxtotalChlesterol() > maxtotalChlesterol) {
                        maxtotalChlesterol = h.getMaxtotalChlesterol();
                    }
                    avebloodPressure = avebloodPressure + h.getAvebloodPressure() * h.getHowmanypeople();
                    if (h.getMinbloodPressure() < minbloodPressure) {
                        minbloodPressure = h.getMinbloodPressure();
                    }
                    if (h.getMaxbloodPressure() > maxbloodPressure) {
                        maxbloodPressure = h.getMaxbloodPressure();
                    }
                    aveHDLChlesterol = aveHDLChlesterol + h.getAveHDLChlesterol() * h.getHowmanypeople();
                    if (h.getMinHDLChlesterol() < minHDLChlesterol) {
                        minHDLChlesterol = h.getMinHDLChlesterol();
                    }
                    if (h.getMaxHDLChlesterol() > maxHDLChlesterol) {
                        maxHDLChlesterol = h.getMaxHDLChlesterol();
                    }
                    aveheartBeatPerMinute = aveheartBeatPerMinute + h.getAveheartBeatPerMinute() * h.getHowmanypeople();
                    if (h.getMinheartBeatPerMinute() < minheartBeatPerMinute) {
                        minheartBeatPerMinute = h.getMinheartBeatPerMinute();
                    }
                    if (h.getMaxheartBeatPerMinute() > maxheartBeatPerMinute) {
                        maxheartBeatPerMinute = h.getMaxheartBeatPerMinute();
                    }
                    aveage = aveage + h.getAveage() * h.getHowmanypeople();
                    if (h.getMinage() < minage) {
                        minage = h.getMinage();
                    }
                    if (h.getMaxage() > maxage) {
                        maxage = h.getMaxage();
                    }

                    avehealthpoint = avehealthpoint + h.getAvehealthpoint() * h.getHowmanypeople();
                    if (h.getMinhealthpoint() < minhealthpoint) {
                        minhealthpoint = h.getMinhealthpoint();
                    }
                    if (h.getMaxhealthpoint() > maxhealthpoint) {
                        maxhealthpoint = h.getMaxhealthpoint();
                    }

                    avetenyearrisk = avetenyearrisk + h.getAvetenyearrisk();
                    if (h.getMintenyearrisk() < mintenyearrisk) {
                        mintenyearrisk = h.getMintenyearrisk();
                    }
                    if (h.getMaxtenyearrisk() > maxtenyearrisk) {
                        maxtenyearrisk = h.getMaxtenyearrisk();
                    }

                }

            }
            Community community = communityDirectory.addCommunity();
            community.setCommunityNumber(ii);
            community.setHowmanypeople(howmanypeople);

            community.setMaleRate(maleRate / howmanypeople);
            community.setDiabetesRate(diabetesRate / howmanypeople);
            community.setSomkerRate(somkerRate / howmanypeople);

            community.setAvetotalChlesterol(avetotalChlesterol / howmanypeople);
            community.setMintotalChlesterol(mintotalChlesterol);
            community.setMaxtotalChlesterol(maxtotalChlesterol);

            community.setAveheartBeatPerMinute(aveheartBeatPerMinute / howmanypeople);
            community.setMaxheartBeatPerMinute(maxheartBeatPerMinute);
            community.setMinheartBeatPerMinute(minheartBeatPerMinute);

            community.setAvebloodPressure(avebloodPressure / howmanypeople);
            community.setMaxbloodPressure(maxbloodPressure);
            community.setMinbloodPressure(minbloodPressure);

            community.setMinHDLChlesterol(minHDLChlesterol);
            community.setAveHDLChlesterol(aveHDLChlesterol / howmanypeople);
            community.setMaxHDLChlesterol(maxHDLChlesterol);

            community.setAvetenyearrisk(avetenyearrisk / howmanypeople);
            community.setMintenyearrisk(mintenyearrisk);
            community.setMaxtenyearrisk(maxtenyearrisk);

            community.setAvehealthpoint(avehealthpoint / howmanypeople);
            community.setMinhealthpoint(minhealthpoint);
            community.setMaxhealthpoint(maxhealthpoint);

            community.setAveage(aveage / howmanypeople);
            community.setMinage(minage);
            community.setMaxage(maxage);

        }

        return communityDirectory;
    }

    public static CityDirectory initCityDirectory() {
        CityDirectory cityDirectory = new CityDirectory();
        CommunityDirectory communityDirectory = Initialization.initCommunityDirectory();

        int howmanypeople = 0;

        double somkerRate = 0;
        double maleRate = 0;
        double diabetesRate = 0;

        double avetotalChlesterol = 0;
        double mintotalChlesterol = 10000;
        double maxtotalChlesterol = 0;

        double aveHDLChlesterol = 0;
        double minHDLChlesterol = 1000;
        double maxHDLChlesterol = 0;

        double avebloodPressure = 0;
        int minbloodPressure = 10000;
        int maxbloodPressure = 0;

        double aveheartBeatPerMinute = 0;
        int minheartBeatPerMinute = 10000;
        int maxheartBeatPerMinute = 0;

        double aveage = 0;
        int minage = 10000;
        int maxage = 0;

        double avehealthpoint = 0;
        int minhealthpoint = 1000;
        int maxhealthpoint = 0;

        double avetenyearrisk = 0;
        int mintenyearrisk = 1000;
        int maxtenyearrisk = 0;

        for (Community c : communityDirectory.getCommunityList()) {

            howmanypeople = howmanypeople + c.getHowmanypeople();
            // if("Somker".equals(f.getIsSmoker())){somkerRate++;}
            // if("Diabetes".equals(f.getIsDiabetes())){diabetesRate++;}
            // if("Male".equals(f.getGender())){maleRate++;}
            somkerRate = somkerRate + c.getHowmanypeople() * c.getSomkerRate();
            maleRate = maleRate + c.getHowmanypeople() * c.getMaleRate();
            diabetesRate = diabetesRate + c.getHowmanypeople() * c.getDiabetesRate();

            avetotalChlesterol = avetotalChlesterol + c.getAvetotalChlesterol() * c.getHowmanypeople();
            if (c.getMintotalChlesterol() < mintotalChlesterol) {
                mintotalChlesterol = c.getMintotalChlesterol();
            }
            if (c.getMaxtotalChlesterol() > maxtotalChlesterol) {
                maxtotalChlesterol = c.getMaxtotalChlesterol();
            }
            avebloodPressure = avebloodPressure + c.getAvebloodPressure() * c.getHowmanypeople();
            if (c.getMinbloodPressure() < minbloodPressure) {
                minbloodPressure = c.getMinbloodPressure();
            }
            if (c.getMaxbloodPressure() > maxbloodPressure) {
                maxbloodPressure = c.getMaxbloodPressure();
            }
            aveHDLChlesterol = aveHDLChlesterol + c.getAveHDLChlesterol() * c.getHowmanypeople();
            if (c.getMinHDLChlesterol() < minHDLChlesterol) {
                minHDLChlesterol = c.getMinHDLChlesterol();
            }
            if (c.getMaxHDLChlesterol() > maxHDLChlesterol) {
                maxHDLChlesterol = c.getMaxHDLChlesterol();
            }
            aveheartBeatPerMinute = aveheartBeatPerMinute + c.getAveheartBeatPerMinute() * c.getHowmanypeople();
            if (c.getMinheartBeatPerMinute() < minheartBeatPerMinute) {
                minheartBeatPerMinute = c.getMinheartBeatPerMinute();
            }
            if (c.getMaxheartBeatPerMinute() > maxheartBeatPerMinute) {
                maxheartBeatPerMinute = c.getMaxheartBeatPerMinute();
            }
            aveage = aveage + c.getAveage() * c.getHowmanypeople();
            if (c.getMinage() < minage) {
                minage = c.getMinage();
            }
            if (c.getMaxage() > maxage) {
                maxage = c.getMaxage();
            }

            avehealthpoint = avehealthpoint + c.getAvehealthpoint() * c.getHowmanypeople();
            if (c.getMinhealthpoint() < minhealthpoint) {
                minhealthpoint = c.getMinhealthpoint();
            }
            if (c.getMaxhealthpoint() > maxhealthpoint) {
                maxhealthpoint = c.getMaxhealthpoint();
            }

            avetenyearrisk = avetenyearrisk + c.getAvetenyearrisk();
            if (c.getMintenyearrisk() < mintenyearrisk) {
                mintenyearrisk = c.getMintenyearrisk();
            }
            if (c.getMaxtenyearrisk() > maxtenyearrisk) {
                maxtenyearrisk = c.getMaxtenyearrisk();
            }

        }
        City city = cityDirectory.addCity();
        city.setHowmanypeople(howmanypeople);

        city.setMaleRate(maleRate / howmanypeople);
        city.setDiabetesRate(diabetesRate / howmanypeople);
        city.setSomkerRate(somkerRate / howmanypeople);

        city.setAvetotalChlesterol(avetotalChlesterol / howmanypeople);
        city.setMintotalChlesterol(mintotalChlesterol);
        city.setMaxtotalChlesterol(maxtotalChlesterol);

        city.setAveheartBeatPerMinute(aveheartBeatPerMinute / howmanypeople);
        city.setMaxheartBeatPerMinute(maxheartBeatPerMinute);
        city.setMinheartBeatPerMinute(minheartBeatPerMinute);

        city.setAvebloodPressure(avebloodPressure / howmanypeople);
        city.setMaxbloodPressure(maxbloodPressure);
        city.setMinbloodPressure(minbloodPressure);

        city.setMinHDLChlesterol(minHDLChlesterol);
        city.setAveHDLChlesterol(aveHDLChlesterol / howmanypeople);
        city.setMaxHDLChlesterol(maxHDLChlesterol);

        city.setAvetenyearrisk(avetenyearrisk / howmanypeople);
        city.setMintenyearrisk(mintenyearrisk);
        city.setMaxtenyearrisk(maxtenyearrisk);

        city.setAvehealthpoint(avehealthpoint / howmanypeople);
        city.setMinhealthpoint(minhealthpoint);
        city.setMaxhealthpoint(maxhealthpoint);

        city.setAveage(aveage / howmanypeople);
        city.setMinage(minage);
        city.setMaxage(maxage);

        return cityDirectory;
    }
}
