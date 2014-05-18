package catalogoHW;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NuevoMonitor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoMonitor dialog = new NuevoMonitor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoMonitor() {
		setResizable(false);
		setModal(true);
		setTitle("Nuevo");
		setBounds(100, 100, 288, 355);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 244, 267);
		panel.setBorder(new TitledBorder(null, "Monitor", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel label = new JLabel("Marca");
			label.setBounds(10, 26, 46, 14);
			panel.add(label);
		}
		{
			textField = new JTextField();
			textField.setBounds(93, 26, 133, 20);
			textField.setColumns(10);
			panel.add(textField);
		}
		{
			JLabel label = new JLabel("Modelo\r\n");
			label.setBounds(10, 51, 46, 14);
			panel.add(label);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(93, 51, 133, 20);
			textField_1.setColumns(10);
			panel.add(textField_1);
		}
		{
			JLabel label = new JLabel("Precio");
			label.setBounds(10, 76, 46, 14);
			panel.add(label);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(93, 76, 86, 20);
			textField_2.setColumns(10);
			panel.add(textField_2);
		}
		{
			JLabel lblPulgadas = new JLabel("Pulgadas:");
			lblPulgadas.setBounds(10, 101, 69, 14);
			panel.add(lblPulgadas);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(93, 101, 86, 20);
			textField_3.setColumns(10);
			panel.add(textField_3);
		}
		{
			JLabel lblTecnologa = new JLabel("Tecnolog\u00EDa:");
			lblTecnologa.setBounds(10, 126, 69, 14);
			panel.add(lblTecnologa);
		}
		{
			JRadioButton rdbtnLed = new JRadioButton("LED");
			rdbtnLed.setBounds(89, 122, 54, 23);
			panel.add(rdbtnLed);
		}
		{
			JRadioButton rdbtnLcd = new JRadioButton("LCD");
			rdbtnLcd.setBounds(145, 123, 62, 23);
			panel.add(rdbtnLcd);
		}
		{
			JEditorPane editorPane = new JEditorPane();
			editorPane.setBounds(10, 173, 197, 83);
			panel.add(editorPane);
		}
		{
			JLabel label = new JLabel("Observaciones:");
			label.setBounds(10, 148, 133, 14);
			panel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("A\u00F1adir");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Volver");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					dispose();
					}
				});
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
