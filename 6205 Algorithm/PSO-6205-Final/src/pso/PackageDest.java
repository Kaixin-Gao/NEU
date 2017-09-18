/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pso;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MAX19
 */
public class PackageDest {
    public ArrayList<Integer> list;
    public PackageDest(){
        list = new ArrayList<Integer>();
    }
    

    public ArrayList<Integer> getlist() {
        return list;
    }

    
    
    public void add(int i){
        list.add(i);
    }
    
    /*int[] toIntArray(ArrayList list) {
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (int) list.get(i);
        }
        return ret;
    }

    int[] inputDest() {
        ArrayList List = new ArrayList();
        System.out.println("input maxium 8 packages destination code: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            int temp = sc.nextInt();
            if (List.contains(temp)) {
                System.out.println("same destination found, 2 package will drop together");
            } else {
                List.add(temp);
            }
        }
        int[] z = new int[List.size()];
        z = toIntArray(List);
        //Arrays.sort(z);
       int[] z = new int[]{1,2,3,4,5,6,7,8};
        return z;
    }*/
    
}
