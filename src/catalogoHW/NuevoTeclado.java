package catalogoHW;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class NuevoTeclado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	// Definición de ButtonGroup
	private ButtonGroup bgConector = new ButtonGroup();
	private ButtonGroup bgCable = new ButtonGroup();
	private ButtonGroup bgErgonomico = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoTeclado dialog = new NuevoTeclado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoTeclado() {
		setResizable(false);
		setModal(true);
		setTitle("Nuevo");
		setBounds(100, 100, 262, 386);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED,
				null, null), "Teclado", TitledBorder.LEADING, TitledBorder.TOP,
				null, new Color(255, 0, 0)));
		panel.setBounds(10, 11, 222, 291);
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel lblNombre = new JLabel("Modelo\r\n");
			lblNombre.setBounds(10, 43, 46, 14);
			panel.add(lblNombre);
		}
		{
			JLabel lblPrecio = new JLabel("Marca");
			lblPrecio.setBounds(10, 18, 46, 14);
			panel.add(lblPrecio);
		}
		{
			JLabel lblPrecio_1 = new JLabel("Precio");
			lblPrecio_1.setBounds(10, 68, 46, 14);
			panel.add(lblPrecio_1);
		}
		// Añadimos los radiobutton al buttongroup

		textField = new JTextField();
		textField.setBounds(66, 15, 141, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblConector = new JLabel("Conector");
		lblConector.setBounds(10, 93, 73, 14);
		panel.add(lblConector);

		JRadioButton rdbtnUsb = new JRadioButton("USB");
		rdbtnUsb.setBounds(89, 89, 54, 23);
		panel.add(rdbtnUsb);

		JRadioButton rdbtnPs = new JRadioButton("PS2");
		rdbtnPs.setBounds(145, 89, 62, 23);
		panel.add(rdbtnPs);

		JLabel lblInalmbrico = new JLabel("Inal\u00E1mbrico");
		lblInalmbrico.setBounds(10, 118, 86, 14);
		panel.add(lblInalmbrico);

		JRadioButton rdbtnInalambrico = new JRadioButton("Si");
		rdbtnInalambrico.setBounds(89, 114, 54, 23);
		panel.add(rdbtnInalambrico);

		JRadioButton rdbtnAlambrico = new JRadioButton("No");
		rdbtnAlambrico.setBounds(145, 115, 46, 23);
		panel.add(rdbtnAlambrico);

		textField_1 = new JTextField();
		textField_1.setBounds(66, 40, 141, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(66, 65, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(10, 313, 222, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Añadir");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
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
		

		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(10, 172, 133, 14);
		panel.add(lblObservaciones);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 197, 197, 83);
		panel.add(editorPane);

		JLabel lblErgonmico = new JLabel("Ergon\u00F3mico");
		lblErgonmico.setBounds(10, 143, 86, 14);
		panel.add(lblErgonmico);

		JRadioButton rdbtnErgo = new JRadioButton("Si");
		rdbtnErgo.setBounds(89, 139, 54, 23);
		panel.add(rdbtnErgo);

		JRadioButton rdbtnErgoNo = new JRadioButton("No");
		rdbtnErgoNo.setBounds(145, 140, 46, 23);
		panel.add(rdbtnErgoNo);
		
		// Añadimos los radiobutton al buttongroup
				bgConector.add(rdbtnUsb);
				bgConector.add(rdbtnPs);
				bgCable.add(rdbtnInalambrico);
				bgCable.add(rdbtnAlambrico);
				bgErgonomico.add(rdbtnErgo);
				bgErgonomico.add(rdbtnErgoNo);
	}
}
