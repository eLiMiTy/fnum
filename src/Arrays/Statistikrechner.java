package Arrays;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Statistikrechner extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static JRadioButton kDataJRadio;
	protected static JRadioButton gDataJRadio;
	protected static JTextArea resultJArea;
	protected static JTextField inputJText;
	protected static JButton doneJButton;
	protected static JButton newJButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSeparator separator;
	private JSeparator separator_1;
	private JPanel contentPane;
	private JLabel hadder1;
	private JLabel hadder2;
	private JLabel nrJLabelStatic;
	private JLabel xjJLabelStatic;
	private JLabel inputJLabel;
	private JLabel xj1JLabel;
	private JLabel nrJLabel;
	private JLabel nrMaxJLabel;

	protected static ArrayList<Double> hj = new ArrayList<Double>();
	protected static ArrayList<Double> Hj = new ArrayList<Double>();
	protected static ArrayList<Double> xj1 = new ArrayList<Double>();
	protected static ArrayList<Double> xj2 = new ArrayList<Double>();
	private ArrayList<Double> calcHj = new ArrayList<Double>();
	private boolean xjIsDone = false;
	private boolean confirmNew = false;
	private boolean x1Done = false;
	private int nr = 0, countXj1Label = 1;
	private JLabel lblNewLabel;
	private JTextArea resultJArea2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistikrechner frame = new Statistikrechner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Statistikrechner() {
		setTitle("Statistikrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//GUI
		kDataJRadio = new JRadioButton("Klassiert");
		kDataJRadio.setToolTipText("Setze Datentyp auf 'Klassiert'");
		kDataJRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inputJText.setBounds(157, 66, 160, 20);
			}
		});

		buttonGroup.add(kDataJRadio);
		kDataJRadio.setBounds(323, 65, 90, 23);
		contentPane.add(kDataJRadio);

		gDataJRadio = new JRadioButton("Gruppiert");
		gDataJRadio.setToolTipText("Setze Datentyp auf 'Gruppiert'");
		gDataJRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inputJText.setBounds(96, 66, 221, 20);
				xj2.add(0.0);
			}
		});
		gDataJRadio.setSelected(true);
		buttonGroup.add(gDataJRadio);
		gDataJRadio.setBounds(323, 40, 90, 23);
		contentPane.add(gDataJRadio);

		separator = new JSeparator();
		separator.setBounds(10, 37, 414, 2);
		contentPane.add(separator);

		separator_1 = new JSeparator();
		separator_1.setBounds(10, 128, 414, 2);
		contentPane.add(separator_1);

		hadder1 = new JLabel("Dateneingabe:");
		hadder1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hadder1.setBounds(10, 7, 173, 23);
		contentPane.add(hadder1);

		hadder2 = new JLabel("Datentyp:");
		hadder2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hadder2.setBounds(328, 7, 100, 23);
		contentPane.add(hadder2);

		nrJLabelStatic = new JLabel("Nr");
		nrJLabelStatic.setHorizontalAlignment(SwingConstants.CENTER);
		nrJLabelStatic.setBounds(10, 44, 20, 14);
		contentPane.add(nrJLabelStatic);

		xjJLabelStatic = new JLabel("-  Xj  -");
		xjJLabelStatic.setHorizontalAlignment(SwingConstants.CENTER);
		xjJLabelStatic.setBounds(40, 44, 44, 14);
		contentPane.add(xjJLabelStatic);

		//Actions
		doneJButton = new JButton("Done");
		doneJButton.setToolTipText("Klicken um Dateneingabe fortzusetzen oder zum Berechnen der Parameter");
		doneJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!xjIsDone) {
					if(xj1.size() > 0) {
						nrMaxJLabel.setEnabled(true);
						doneJButton.setText("Berechnen");
						inputJLabel.setText("Eingabe von Hj");
						xjIsDone = true;
						resetNr();
						resultJArea.setText("");
						xj1JLabel.setText(String.valueOf(xj1.get(0)));

						if (kDataJRadio.isSelected()) {
							inputJText.setBounds(96, 66, 221, 20);
							xj1.remove(xj1.size()-1);
							nrMaxJLabel.setText(String.valueOf(xj2.size()));

						} else {
							nrMaxJLabel.setText(String.valueOf(xj1.size()));
						}

					} else {
						resultJArea.setText("Bitte erst mindestens einen Wert für Xj eingeben.");
					}

				} else if (xjIsDone == true && (Integer.parseInt(nrJLabel.getText()) == Integer.parseInt(nrMaxJLabel.getText()))) {
					String str = "";
					calcHj.add(hj.get(0));
					for (int i = 1;i < hj.size();i++) {
						calcHj.add(hj.get(i)+calcHj.get(i-1));
					}

					for (int i = 0;i < hj.size();i++) {
						Hj.add(calcHj.get(i));
					}

					if (gDataJRadio.isSelected()) {
						str = "Xi = \t\n" +xj1.toString()
						+"\nhj = \t\n" +hj.toString()
						+"\nHj = \t\n" +Hj.toString();

					} else if (kDataJRadio.isSelected()) {
						str = "Von = \t\n" +xj1.toString()
						+"\nbis unter = \t\n" +xj2.toString()
						+"\nhj = \t\n" +hj.toString()
						+"\nHj = \t\n" +Hj.toString();

					}
					inputJText.setEditable(false);
					inputJText.setText("");
					//					doneJButton.setEnabled(false);
					resultJArea.setText(Calculate.outputResults());
					resultJArea2.setText(str);
				} else {
					resultJArea.setText("Bitte insg. " +xj1.size() +" Werte eingeben.");
				}
			}
		});
		doneJButton.setBounds(96, 94, 221, 23);
		contentPane.add(doneJButton);

		//Changing
		inputJLabel = new JLabel("Eingabe von Xj");
		inputJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputJLabel.setBounds(117, 44, 200, 14);
		contentPane.add(inputJLabel);

		nrJLabel = new JLabel("0");
		nrJLabel.setToolTipText("Zeigt die Nummer der zuletzt eingegbenen Zahl");
		nrJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nrJLabel.setBounds(10, 69, 20, 14);
		contentPane.add(nrJLabel);

		nrMaxJLabel = new JLabel("");
		nrMaxJLabel.setEnabled(false);
		nrMaxJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nrMaxJLabel.setBounds(10, 89, 20, 14);
		contentPane.add(nrMaxJLabel);

		xj1JLabel = new JLabel("0");
		xj1JLabel.setToolTipText("Zeigt die zuletzt eingegebene Zahl");
		xj1JLabel.setHorizontalAlignment(SwingConstants.CENTER);
		xj1JLabel.setBounds(29, 69, 69, 14);
		contentPane.add(xj1JLabel);

		//Inputs - Outputs
		inputJText = new JTextField();
		inputJText.setToolTipText("Eingabe mit ENTER best\u00E4tigen");
		inputJText.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					if (!inputJText.equals("")) {
						try {
							if (!xjIsDone) {
								if (gDataJRadio.isSelected()) {
									gDataAdd();

								} else if (kDataJRadio.isSelected()) {
									kDataAdd();
								}

							} else if (xjIsDone) {
								hjDataAdd();
							}

						} catch (NumberFormatException e1) {
							resultJArea.setText("Bitte einen nummerischen Wert eingeben und mit ENTER bestätigen.");
							inputJText.setText("");
						}
					}
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
		});
		inputJText.setBounds(96, 66, 221, 20);
		contentPane.add(inputJText);
		inputJText.setColumns(10);

		resultJArea = new JTextArea();
		resultJArea.setEditable(false);
		resultJArea.setWrapStyleWord(true);
		resultJArea.setLineWrap(true);
		resultJArea.setBounds(10, 138, 214, 292);
		contentPane.add(resultJArea);
		//		JScrollPane scrollPane = new JScrollPane(resultJArea);
		//		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//		scrollPane.add(resultJArea);
		//		getContentPane().add(new JScrollPane(resultJArea));

		resultJArea2 = new JTextArea();
		resultJArea2.setWrapStyleWord(true);
		resultJArea2.setLineWrap(true);
		resultJArea2.setEditable(false);
		resultJArea2.setBounds(224, 138, 200, 292);
		contentPane.add(resultJArea2);


		newJButton = new JButton("Neu");
		newJButton.setToolTipText("Klicken um eine neue Rechnung zu beginnen");
		newJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (confirmNew == true) {
					resetData();
					resultJArea.setText("Daten wurden gelöscht.");
					confirmNew = false;

				} else {
					resultJArea.setText("Sind Sie sicher? Wenn ja, bitte mit einem erneuten drücken des Button bestätigen.");
					confirmNew = true;
				}

			}
		});
		newJButton.setBounds(323, 94, 101, 23);
		contentPane.add(newJButton);

		lblNewLabel = new JLabel("bis unter");
		lblNewLabel.setBounds(96, 65, 69, 23);
		contentPane.add(lblNewLabel);

	}

	public int getNr() {
		return nr;
	}

	public void addNr() {
		nr++;
		nrJLabel.setText(String.valueOf(nr));
	}

	public void disableJRadio() {
		gDataJRadio.setEnabled(false);
		kDataJRadio.setEnabled(false);
	}

	public void enableJRadio() {
		gDataJRadio.setEnabled(true);
		kDataJRadio.setEnabled(true);
	}

	public void resetNr() {
		nr = 0;
		nrJLabel.setText(String.valueOf(nr));
	}

	public void resetData() {
		gDataJRadio.setSelected(true);
		enableJRadio();
		xjIsDone = false;
		x1Done = false;
		calcHj.clear();
		xj1.clear();
		xj2.clear();
		hj.clear();
		Hj.clear();
		resetNr();
		clear();
		countXj1Label = 1;
		doneJButton.setText("Done");
		inputJLabel.setText("Eingabe von Xj");
		inputJText.setEditable(true);
		doneJButton.setEnabled(true);
		nrMaxJLabel.setText("");
		xj1JLabel.setText("0");
	}

	public void clear() {
		inputJText.setText("");
		resultJArea.setText("");
		resultJArea2.setText("");
	}

	public void gDataAdd() {
		xj1.add(Double.parseDouble(inputJText.getText().trim().replace(',', '.')));
		resultJArea.setText("X" +(getNr()+1) +" mit dem Wert " +inputJText.getText() +" wurde hinzugefügt.");
		xj1JLabel.setText(inputJText.getText());
		disableJRadio();
		inputJText.setText("");
		addNr();
	}

	public void kDataAdd() {
		if (!x1Done) {
			xj1.add(Double.parseDouble(inputJText.getText().trim().replace(',', '.')));
			resultJArea.setText("Von " +inputJText.getText() +" bis unter...");
			xj1JLabel.setText(inputJText.getText());
			nrJLabel.setText("1");
			disableJRadio();
			inputJText.setText("");
			x1Done = true;
			
		} else {
			if (Double.parseDouble(inputJText.getText()) > xj1.get(nr)) {
				xj2.add(Double.parseDouble(inputJText.getText().trim().replace(',', '.')));
				resultJArea.setText("Von " +xj1.get(nr) +" bis unter " +inputJText.getText() +" wurde hinzugefügt.");
				xj1JLabel.setText(inputJText.getText());
				nrJLabel.setText(String.valueOf(nr+1));
				xj1.add(xj2.get(nr));
				inputJText.setText("");
				addNr();

			} else {
				resultJArea.setText("Der Wert muss größer als X1 sein.");
			}
		}
	}

	public void hjDataAdd() {
		if (Double.parseDouble(nrMaxJLabel.getText()) > nr) {
			hj.add(Double.parseDouble(inputJText.getText().trim().replace(',', '.')));
			resultJArea.setText("H" +(getNr()+1) +" mit dem Wert " +inputJText.getText() +" wurde hinzugefügt.");
			inputJText.setText("");

			try {
				xj1JLabel.setText(String.valueOf(xj1.get(countXj1Label)));

			} catch (Exception e1) {
				xj1JLabel.setText("");
			}
			countXj1Label++;
			addNr();

		} else {
			resultJArea.setText("Bitte den 'Berechnen' button drücken.");
		}
	}
}
