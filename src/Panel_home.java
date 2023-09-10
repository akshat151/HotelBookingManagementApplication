import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Panel_home extends JPanel 
{
	public Panel_home()
	{		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Hotel-reception.jpg"));
		add(lblNewLabel);		
	}
}