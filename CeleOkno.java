import javax.swing.JFrame;


public class CeleOkno extends JFrame {

	public CeleOkno ( ){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("TUKAN");
		this.setResizable(false);
		
		PanelUdalosti panelUdalosti = new  PanelUdalosti();
		this.add(panelUdalosti);
		
		this.pack();
		
	}
	public static void main(String[] args) {
		new CeleOkno().setVisible(true);

	}

}
