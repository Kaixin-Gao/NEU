/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Max
 */
public class CityDirectory {
    
    List<City> cityList;

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    CityDirectory() {
        cityList = new ArrayList<>();
    }

    public City addCity() {
        City c = new City();
        cityList.add(c);
        return c;
    }
}
