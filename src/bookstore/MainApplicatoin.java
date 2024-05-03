package bookstore;

import javax.swing.SwingUtilities;

public class MainApplicatoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new RibbonLayout();
		
		SwingUtilities.invokeLater(() -> new bookstore.ribbonLayout.RibbonLayout());
		

	}

}
