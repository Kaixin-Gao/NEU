/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author MAX19
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PaintDemo {
	//主窗口
	private JFrame frmPaint = new JFrame("Paint Demo");
	//绘画面板
	private JPanel pnlPaint = new JPanel();
	//定义当前点坐标
	private int x=400, y=400;
	public PaintDemo () {
		//创建 MouseAdapter
		MouseAdapter ma = new MouseAdapter() {
			//添加点击事件
			@Override
			public void mousePressed (MouseEvent me) {
				//鼠标按下，则把当前点坐标设定为鼠标位置
				x = me.getX();
				y = me.getY();
				//画线，从点 (x,y) 到点 (x,y)
				//pnlPaint.getGraphics().drawLine(x, y, x+60, y+60);
                            public void PaintTank(int x, int y){
                                for(int i=0;i<3;i++){
                                    pnlPaint.getGraphics().drawLine(x-7+i, y+7, x-7+i, y-7);
                                }
                                for(int i=0;i<3;i++){
                                    pnlPaint.getGraphics().drawLine(x+4+i, y+7, x+4+i, y-7);
                                }
                                for(int i=0;i<8;i++){
                                    pnlPaint.getGraphics().drawLine(x-4+i, y-4, x-4+i, y+4);
                                }
                                for(int i=0;i<2;i++){
                                    pnlPaint.getGraphics().drawLine(x+i-1, y-9, x+i-1, y-4);
                                }
                            }
			//添加拖拽事件
			@Override
			public void mouseDragged (MouseEvent me) {
				//画线，从点 (x,y) 到鼠标当前位置
				pnlPaint.getGraphics().drawLine(x, y, me.getX(), me.getY());
				//更新当前点，这是为鼠标位置
				x = me.getX();
				y = me.getY();
			}
                    
		};
                
		//初始化绘画面板
		pnlPaint.setBackground(Color.WHITE);
		pnlPaint.addMouseListener(ma);
		pnlPaint.addMouseMotionListener(ma);
		//初始化主窗口
		frmPaint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaint.setSize(800, 800);
		frmPaint.setLocationRelativeTo(null);
		frmPaint.setContentPane(pnlPaint);
		frmPaint.setVisible(true);
	}
	public static void main (String args[]) {
		new PaintDemo();
	}
}