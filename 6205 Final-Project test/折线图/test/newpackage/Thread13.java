/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MAX19
 */
//多线程的写法2，用两种情况变换，
//情况1：新建一个对象，两个线程共享一个对象。另外是新建两个对象，两个线程用两个对象
//情况2：int i=0；拿到run（）外面与在run（）里面两种情况。
//上面4种情况可以排列组合试一下
public class Thread13 {

    public static void main(String args[]) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
    }

}

class MyThread extends Thread {

    public void run() {
        
            System.out.println("i----------");
        try {
            Thread.sleep((int) (1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
