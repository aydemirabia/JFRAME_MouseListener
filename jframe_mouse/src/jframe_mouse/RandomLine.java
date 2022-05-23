package jframe_mouse;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

public class RandomLine extends JFrame implements MouseListener {

	private Random rnd;
	private int x1, y1, x2, y2;
	
	//constructor
	public RandomLine() {
		super();
		rnd = new Random();
		addMouseListener(this); //Constructor'a MouseListener'ý ekleme iþlemini yaptýk.
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(x1, y1, x2, y2);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		/*x1 = 100;
		y1 = 100;*/
		
		//týkladýðýmýz yere göre koordinat alýr.
		/*x1 = e.getX();
		y1 = e.getY();*/
		
		//sað tuþa týklayýnca x1-y1; sol tuþa basýnca x2-y2 deðiþsin.
		if(e.getButton() == e.BUTTON1) {
			x1 = e.getX();
			y1 = e.getY();
		}
		//BUTTON2 kullandýðýmýz farenin orta tuþudur.
		//BUTTON3 kullandýðýmýz farenin sað tuþudur.
		else if(e.getButton() == e.BUTTON3) {
			x2 = e.getX();
			y2  =e.getY();
		}
		
		
		
		repaint();
		//repaint : ekran içeriðinin yeniden çizilmesini saðlar.
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
//Hatýrlatma: Interfaceler, belli baþlý metotlarýn classlarda olmasýný saðlardý!!! 
