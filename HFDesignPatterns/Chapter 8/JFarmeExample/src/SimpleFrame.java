import java.awt.Graphics;

import javax.swing.JFrame;


public class SimpleFrame extends JFrame{
	
	public SimpleFrame(String title){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void Paint(Graphics graphics){
		super.paint(graphics);
		String msg = "Rule!";
		graphics.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args){
		SimpleFrame sf = new SimpleFrame("Hello!");
	}

}
