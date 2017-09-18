package psopid;

import java.awt.*;

import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

import javax.swing.event.*;

public class psopid_temp extends Frame implements Runnable {

    private static int particleNumber;

    private static int iterations;

    private static int k = 1;

    final private static float C1 = 2;

    final private static float C2 = 2;

    final private static float WMIN = -200;

    final private static float WMAX = 200;

    final private static float VMAX = 200;

    private static float r1;

    private static float r2;

    private static float x[][];

    private static float v[][];

    private static float xpbest[][];

    private static float pbest[];

    private static float gbest = 0;

    private static float xgbest[];

    private static float w;

    private static float s;

    private static float h;

    private static float fit[];

    public void lzqjs() {

        w = (float) (0.9 - k * (0.9 - 0.4) / iterations);

        for (int i = 0; i < particleNumber; i++) {

            fit[i] = (float) (1 / (Math.pow(x[i][0], 2) + Math.pow(x[i][1], 2)));

            if (fit[i] > pbest[i]) {

                pbest[i] = fit[i];

                xpbest[i][0] = x[i][0];

                xpbest[i][1] = x[i][1];

            }

            if (pbest[i] > gbest) {

                gbest = pbest[i];

                xgbest[0] = xpbest[i][0];

                xgbest[1] = xpbest[i][1];

            }

        }

        for (int i = 0; i < particleNumber; i++) {

            for (int j = 0; j < 2; j++) {

                v[i][j] = (float) (w * v[i][j] + C1 * Math.random() * (xpbest[i][j] - x[i][j])
                        + C2 * Math.random() * (xgbest[j] - x[i][j]));

                x[i][j] = (float) (x[i][j] + v[i][j]);

            }

        }

    }

    public static void main(String[] args) {

        particleNumber = Integer.parseInt(JOptionPane.showInputDialog("请输入粒子个数1-300）"));

        iterations = Integer.parseInt(JOptionPane.showInputDialog("请输入迭代次数10-100）"));

        x = new float[particleNumber][2];

        v = new float[particleNumber][2];

        fit = new float[particleNumber];

        pbest = new float[particleNumber];

        xpbest = new float[particleNumber][2];

        xgbest = new float[2];

        for (int i = 0; i < particleNumber; i++) {

            pbest[i] = 0;

            xpbest[i][0] = 0;

            xpbest[i][1] = 0;

        }

        xgbest[0] = 0;

        xgbest[1] = 0;

        for (int i = 0; i < particleNumber; i++) {

            for (int j = 0; j < 2; j++) {

                x[i][j] = (float) (WMAX * Math.random() + WMIN);

                v[i][j] = (float) (VMAX * Math.random());

            }

        }
        // 初始化所有参数，pbest和gbest

        psopid_temp threada = new psopid_temp();

        threada.setTitle("基于粒子群的粒子位置动态显示");

        threada.setSize(800, 800);

        threada.addWindowListener(new gbck());

        threada.setVisible(true);

        Thread threadc = new Thread(threada);

        threadc.start();

    }
    // 初始化窗口s

    static class gbck extends WindowAdapter {

        public void windowClosing(WindowEvent e) {

            System.exit(0);

        }

    }

    public void run() {
        repaint();
    }

    public void paint(Graphics g) {

        g.setColor(new Color(0, 0, 0));
        for (int i = 0; i < particleNumber; i++) {
            g.drawString("*", (int) (x[i][0] + 200), (int) (x[i][1] + 200));
        }
        g.setColor(new Color(255, 0, 0));
        g.drawString("*", (int) (xgbest[0] + 200), (int) (xgbest[1] + 200));

        g.drawString("适应度函数：" + gbest + " 参数1：" + xgbest[0] + " 参数2：" + xgbest[1], 50, 725);

        try {
            lzqjs();
            k = k + 1;
            System.out.println(k);
            if (k >= iterations) {
            }

            Thread.sleep((int) (1000));

        } catch (InterruptedException e) {
            System.out.println(e.toString());

        }
        repaint();

    }

}
