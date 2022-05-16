package gui;

import javax.swing.*;

public class AddTwoForm extends JFrame{
    private JPanel jcontainer;
    private JTextField txtnumber1;
    private JTextField txtsecond;
    private JButton btncompute;
    private JLabel lblReasult;
    private JLabel lblfirst;
    private JLabel lblsecond;

    public  AddTwoForm(){
  createUIComponents();
        setContentPane(jcontainer);
        setTitle("Add Two");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AddTwoForm addt =  new AddTwoForm();

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        jcontainer =  new javax.swing.JPanel();
        txtsecond =  new javax.swing.JTextField();
        txtnumber1 =  new javax.swing.JTextField();
        lblReasult =  new javax.swing.JLabel();
        lblfirst =  new javax.swing.JLabel();
        lblsecond =  new javax.swing.JLabel();

    }
}
