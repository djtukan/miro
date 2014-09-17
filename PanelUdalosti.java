import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelUdalosti extends JPanel {
	
	private JButton but1;
	private JLabel lab1;
	
	public PanelUdalosti (){
		this.setPreferredSize(new Dimension(200, 100));
		this.setBackground(Color.GREEN);
		
		but1 = new JButton("Tlacitko");
		this.add(but1);
		
		PosluchacTlacitko posluchacTlacitko = new  PosluchacTlacitko();
		but1.addActionListener(posluchacTlacitko);
		
		
		lab1 = new JLabel("Zakladni text.");
		this.add(lab1);
		
		
	}
private class PosluchacTlacitko implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		lab1.setText("JJJJJJJEEEEEEJJJJJJ");
		
	}
	
}
}
