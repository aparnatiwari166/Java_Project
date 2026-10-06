
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Pin extends JFrame implements ActionListener {

    JPasswordField t1, t2;
    JButton b1, b2;
    JLabel l1, l2, l3;
    String pin;

    Pin(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(
            ClassLoader.getSystemResource("icons/atm.jpg")
        );

        Image i2 = i1.getImage().getScaledInstance(
            750, 600, Image.SCALE_DEFAULT
        );

        ImageIcon i3 = new ImageIcon(i2);

        JLabel l4 = new JLabel(i3);
        l4.setBounds(0, 0, 750, 600);
        add(l4);

        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);

        l2 = new JLabel("New PIN:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);

        l3 = new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);

        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));

        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 25));

        b1 = new JButton("CHANGE");
        b2 = new JButton("BACK");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        l1.setBounds(190, 205, 300, 30);
        l4.add(l1);

        l2.setBounds(160, 255, 120, 30);
        l4.add(l2);

        l3.setBounds(135, 305, 160, 30);
        l4.add(l3);

        t1.setBounds(290, 255, 180, 30);
        l4.add(t1);

        t2.setBounds(290, 305, 180, 30);
        l4.add(t2);

        b1.setBounds(390, 360, 150, 35);
        l4.add(b1);

        b2.setBounds(390, 405, 150, 35);
        l4.add(b2);

        setSize(750, 600);
        setLocation(300, 100);
        setUndecorated(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b2) {
            setVisible(false);
            new Transactions(pin).setVisible(true);
            return;
        }

        // CHANGE PIN
        if (ae.getSource() == b1) {

            String npin = new String(t1.getPassword());
            String rpin = new String(t2.getPassword());

            if (npin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter New PIN");
                return;
            }

            if (rpin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                return;
            }

            if (!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(
                    null,
                    "Entered PIN does not match"
                );
                return;
            }

            try {

                Conn c1 = new Conn();
                System.out.println("OLD PIN = [" + pin + "]");
                System.out.println("NEW PIN = [" + rpin + "]");

                String q1 = "UPDATE bank SET pin = ? WHERE pin = ?";
                PreparedStatement ps1 = c1.c.prepareStatement(q1);

                ps1.setString(1, rpin); 
                ps1.setString(2, pin); 

                int bankRows = ps1.executeUpdate();

                System.out.println("BANK rows updated = " + bankRows );

                String q2 = "UPDATE login SET pin = ? WHERE pin = ?";
                PreparedStatement ps2 = c1.c.prepareStatement(q2);

                ps2.setString(1, rpin);
                ps2.setString(2, pin);

                int loginRows = ps2.executeUpdate();

                System.out.println("LOGIN rows updated = " + loginRows);

                String q3 = "UPDATE signup3 SET pin = ? WHERE pin = ?";
                PreparedStatement ps3 = c1.c.prepareStatement(q3);

                ps3.setString(1, rpin);
                ps3.setString(2, pin);

                int signupRows = ps3.executeUpdate();

                System.out.println("SIGNUP3 rows updated = " + signupRows);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");

                setVisible(false);
                new Transactions(rpin).setVisible(true);

            } catch (Exception e) {

                e.printStackTrace();

                JOptionPane.showMessageDialog( null, "Error while changing PIN: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Pin("").setVisible(true);
    }
}