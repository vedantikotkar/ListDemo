package vedanti;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class ListFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListFrame frame = new ListFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListFrame() {
		setTitle("Ice-cream Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int indx=list.getSelectedIndex();
				if(indx==1)
					textField.setText("Price of "+list.getSelectedValue()+" 80/-");
				else if(indx==2)
					textField.setText("Price of "+list.getSelectedValue()+" 60/-");
				else if(indx==3)
					textField.setText("Price of "+list.getSelectedValue()+" 70/-");
				else if(indx==4)
					textField.setText("Price of "+list.getSelectedValue()+" 90/-");
				else if(indx==5)
					textField.setText("Price of "+list.getSelectedValue()+" 65/-");
				else if(indx==6)
					textField.setText("Price of "+list.getSelectedValue()+" 75/-");
				else if(indx==7)
					textField.setText("Price of "+list.getSelectedValue()+" 85/-");
				else 
					textField.setText("Select your flavour!");
				
				
			}
		});
		list.setFont(new Font("Tahoma", Font.BOLD, १४));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Select your flavour:-", "Chocolate", "strawberry", "vanilla", "pista", "pineapple", "mango", "mallai"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(81, 23, 143, 187);
		contentPane.add(list);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, ११));
		textField.setEditable(false);
		textField.setBounds(34, 241, 251, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
