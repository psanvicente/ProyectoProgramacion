package catalogoHW;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.KeyStroke;

public class Index extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setTitle("Productos Hardware");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 526);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setMnemonic('A');
		menuBar.add(mnArchivo);
		
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArchivo.add(mntmAbrir);
		
		JMenuItem mntmNuevo = new JMenuItem("Nueva Lista");
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mnArchivo.add(mntmGuardar);
		
		JMenuItem mntmGuardarComo = new JMenuItem("Guardar Como...");
		mnArchivo.add(mntmGuardarComo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setMnemonic('S');
		//accelerators
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.SHIFT_MASK));
		
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnAadir = new JMenu("Nuevo");
		mnAadir.setMnemonic('N');
		menuBar.add(mnAadir);
		
		JMenuItem mntmMouse = new JMenuItem("Mouse");
		mntmMouse.setMnemonic('M');
		mntmMouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			NuevoRaton.main(null);
			}
		});
		mnAadir.add(mntmMouse);
		
		JMenuItem mntmKeboard = new JMenuItem("Keyboard");
		mntmKeboard.setMnemonic('k');
		mntmKeboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoTeclado.main(null);
			}
		});
		mnAadir.add(mntmKeboard);
		
		JMenuItem mntmMonitor = new JMenuItem("Monitor");
		mntmMonitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoMonitor.main(null);
			}
		});
		mnAadir.add(mntmMonitor);
		mntmMonitor.setMnemonic('O');
		
		JMenuItem mntmDiscoDuro = new JMenuItem("Disco Duro");
		mnAadir.add(mntmDiscoDuro);
		
		JMenu mnMs = new JMenu("M\u00E1s");
		menuBar.add(mnMs);
		mnMs.setMnemonic('M');
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mnMs.add(mntmAyuda);
		mntmAyuda.setMnemonic('Y');
		mntmAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,Event.SHIFT_MASK));
		
		JMenuItem mntmSobre = new JMenuItem("Sobre...");
		mntmSobre.setMnemonic('S');
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sobre.main(null);
			}
		});
		mntmMouse.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,Event.SHIFT_MASK));
		mntmKeboard.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,Event.SHIFT_MASK));
		mntmMonitor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,Event.SHIFT_MASK));
		mnMs.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cat\u00E1logo", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel.setBounds(10, 21, 242, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 25, 222, 396);
		panel.add(list);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Detalles", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_1.setBounds(290, 21, 420, 400);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Marca");
		label.setBounds(10, 28, 46, 14);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(93, 28, 133, 20);
		panel_1.add(textField);
		
		JLabel label_1 = new JLabel("Modelo\r\n");
		label_1.setBounds(10, 53, 46, 14);
		panel_1.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 53, 133, 20);
		panel_1.add(textField_1);
		
		JLabel label_2 = new JLabel("Precio");
		label_2.setBounds(10, 78, 46, 14);
		panel_1.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(93, 78, 86, 20);
		panel_1.add(textField_2);
		
		JLabel label_3 = new JLabel("Conector");
		label_3.setBounds(10, 120, 73, 14);
		panel_1.add(label_3);
		
		JRadioButton radioButton = new JRadioButton("USB");
		radioButton.setBounds(89, 116, 54, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("PS2");
		radioButton_1.setBounds(145, 116, 62, 23);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("No");
		radioButton_2.setBounds(145, 142, 46, 23);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Si");
		radioButton_3.setBounds(89, 141, 54, 23);
		panel_1.add(radioButton_3);
		
		JLabel label_4 = new JLabel("Inal\u00E1mbrico");
		label_4.setBounds(10, 145, 86, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Ergon\u00F3mico");
		label_5.setBounds(10, 172, 86, 14);
		panel_1.add(label_5);
		
		JRadioButton radioButton_4 = new JRadioButton("Si");
		radioButton_4.setBounds(89, 168, 54, 23);
		panel_1.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("No");
		radioButton_5.setBounds(145, 169, 46, 23);
		panel_1.add(radioButton_5);
		
		JLabel label_6 = new JLabel("Pulgadas:");
		label_6.setBounds(10, 197, 69, 14);
		panel_1.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(93, 197, 86, 20);
		panel_1.add(textField_3);
		
		JLabel label_7 = new JLabel("Tecnolog\u00EDa:");
		label_7.setBounds(10, 222, 69, 14);
		panel_1.add(label_7);
		
		JRadioButton radioButton_6 = new JRadioButton("LED");
		radioButton_6.setBounds(89, 218, 54, 23);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("LCD");
		radioButton_7.setBounds(145, 219, 62, 23);
		panel_1.add(radioButton_7);
		
		JLabel label_8 = new JLabel("Observaciones:");
		label_8.setBounds(10, 244, 133, 14);
		panel_1.add(label_8);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 269, 388, 109);
		panel_1.add(editorPane);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(616, 442, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEliminar = new JButton("Guardar");
		btnEliminar.setBounds(515, 442, 91, 23);
		contentPane.add(btnEliminar);
		
		JButton btnEliminar_1 = new JButton("Eliminar");
		btnEliminar_1.setBounds(290, 442, 91, 23);
		contentPane.add(btnEliminar_1);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(386, 442, 91, 23);
		contentPane.add(btnEditar);
	}
}
