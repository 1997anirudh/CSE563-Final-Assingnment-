package projsrs;


import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DotButton extends JButton implements ActionListener{
	ImageIcon O;
	byte value=0;
	
	public DotButton(){

		O=new ImageIcon(this.getClass().getResource("Dot.jpeg"));
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		value++;
		value%=2;
		switch(value){
			case 0:
				setIcon(null);
				break;
			case 1:
				setIcon(O);
				break;

		}

	}
}