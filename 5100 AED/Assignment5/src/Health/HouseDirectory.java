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
public class HouseDirectory {
    List<House> houseList;

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    HouseDirectory() {
        houseList = new ArrayList<>();
    }

    public House addHouse() {
        House h = new House();
        houseList.add(h);
        return h;
    }
}
