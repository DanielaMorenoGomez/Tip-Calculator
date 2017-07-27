/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class TipGUI extends JFrame {
    private JMenuBar menuBar;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JRadioButton rbGood;
    private JRadioButton rbGreat;
    private JRadioButton rbPoor;
    private JTextField txtBill;
    private JTextField txtNumberOfPeople;
    private JTextField txtPersonTotal;
    private JTextField txtTip;
    private JTextField txtTotalAmount;

    //Constructor 
    public TipGUI(){

        this.setTitle("TipGUI");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        button1 = new JButton();
        button1.setBounds(156,149,173,52);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("SansSerif",0,18));
        button1.setText("Calculate");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    calculateButtonClicked(evt);
                }
            });

        label1 = new JLabel();
        label1.setBounds(5,75,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Bill Amount");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(5,258,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Amount of Tip");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(10,300,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Total Amount");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(160,9,182,48);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("SansSerif",0,24));
        label4.setText("Tip Calculator");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(245,305,103,33);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Total per Person");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(240,77,111,37);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Number of People");
        label6.setVisible(true);

        rbGood = new JRadioButton();
        rbGood.setBounds(23,154,150,35);
        rbGood.setBackground(new Color(214,217,223));
        rbGood.setForeground(new Color(0,0,0));
        rbGood.setEnabled(true);
        rbGood.setFont(new Font("sansserif",0,12));
        rbGood.setText("Good Service");
        rbGood.setVisible(true);

        rbGreat = new JRadioButton();
        rbGreat.setBounds(23,177,150,35);
        rbGreat.setBackground(new Color(214,217,223));
        rbGreat.setForeground(new Color(0,0,0));
        rbGreat.setEnabled(true);
        rbGreat.setFont(new Font("sansserif",0,12));
        rbGreat.setText("Great Service");
        rbGreat.setVisible(true);

        rbPoor = new JRadioButton();
        rbPoor.setBounds(24,132,150,35);
        rbPoor.setBackground(new Color(214,217,223));
        rbPoor.setForeground(new Color(0,0,0));
        rbPoor.setEnabled(true);
        rbPoor.setFont(new Font("sansserif",0,12));
        rbPoor.setText("Poor Service");
        rbPoor.setVisible(true);

        txtBill = new JTextField();
        txtBill.setBounds(113,76,90,35);
        txtBill.setBackground(new Color(255,255,255));
        txtBill.setForeground(new Color(0,0,0));
        txtBill.setEnabled(true);
        txtBill.setFont(new Font("sansserif",0,12));
        txtBill.setText("50.00");
        txtBill.setVisible(true);

        txtNumberOfPeople = new JTextField();
        txtNumberOfPeople.setBounds(350,82,90,35);
        txtNumberOfPeople.setBackground(new Color(255,255,255));
        txtNumberOfPeople.setForeground(new Color(0,0,0));
        txtNumberOfPeople.setEnabled(true);
        txtNumberOfPeople.setFont(new Font("sansserif",0,12));
        txtNumberOfPeople.setText("");
        txtNumberOfPeople.setVisible(true);

        txtPersonTotal = new JTextField();
        txtPersonTotal.setBounds(354,306,90,35);
        txtPersonTotal.setBackground(new Color(255,255,255));
        txtPersonTotal.setForeground(new Color(0,0,0));
        txtPersonTotal.setEnabled(true);
        txtPersonTotal.setFont(new Font("sansserif",0,12));
        txtPersonTotal.setText("");
        txtPersonTotal.setVisible(true);

        txtTip = new JTextField();
        txtTip.setBounds(126,262,90,35);
        txtTip.setBackground(new Color(255,255,255));
        txtTip.setForeground(new Color(0,0,0));
        txtTip.setEnabled(true);
        txtTip.setFont(new Font("sansserif",0,12));
        txtTip.setText("");
        txtTip.setVisible(true);

        txtTotalAmount = new JTextField();
        txtTotalAmount.setBounds(124,309,90,35);
        txtTotalAmount.setBackground(new Color(255,255,255));
        txtTotalAmount.setForeground(new Color(0,0,0));
        txtTotalAmount.setEnabled(true);
        txtTotalAmount.setFont(new Font("sansserif",0,12));
        txtTotalAmount.setText("");
        txtTotalAmount.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(rbGood);
        contentPane.add(rbGreat);
        contentPane.add(rbPoor);
        contentPane.add(txtBill);
        contentPane.add(txtNumberOfPeople);
        contentPane.add(txtPersonTotal);
        contentPane.add(txtTip);
        contentPane.add(txtTotalAmount);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method mouseClicked for button1
    private void calculateButtonClicked (MouseEvent evt) {
        //TODO
        double bill = Double.parseDouble(txtBill.getText() );
        double tip = 0;
        if(rbPoor.isSelected()) {
            tip = bill * 0.10;
        }
        if(rbGood.isSelected()) {
            tip = bill * 0.15;
        }
        if(rbGreat.isSelected()) {
            tip = bill * 0.20;
        }
        double total = bill + tip;
        txtTip.setText(String.format("%.2f", tip) );
        txtTotalAmount.setText(String.format("%.2f", total) );
        int numberOfPeople = Integer.parseInt(txtNumberOfPeople.getText() );
        double totalPerPerson = (total / numberOfPeople);
        txtPersonTotal.setText(String.format("%.2f", totalPerPerson) );
        
        
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");

        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }


    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new TipGUI();
                }
            });
    }

}