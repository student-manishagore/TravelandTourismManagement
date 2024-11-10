package TravelSystem;

import javax.print.attribute.standard.Destination;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton addpersonalDetails, viewpersonalDetails, updatepersonalDetails, checkpackages, bookpackages, viewpackages, viewhotels;
    JButton destinations,bookhotels, viewbookedhotels,  payment;
    JButton calculator,notepad,about;

    Dashboard(String username) {
        this.username = username;
        setBounds(0, 0, 1600, 1000);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.GRAY);
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);


        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("tahoma", Font.BOLD, 30));
        p1.add(heading);


        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.GRAY);
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        addpersonalDetails = new JButton("Add Personal Details");
        addpersonalDetails.setBounds(0, 0, 300, 50);
        addpersonalDetails.setBackground(Color.GRAY);
        addpersonalDetails.setForeground(Color.WHITE);
        addpersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addpersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addpersonalDetails.addActionListener(this);
        p2.add(addpersonalDetails);

        updatepersonalDetails = new JButton("Update Personal Details");
        updatepersonalDetails.setBounds(0, 50, 300, 50);
        updatepersonalDetails.setBackground(Color.GRAY);
        updatepersonalDetails.setForeground(Color.WHITE);
        updatepersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatepersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        p2.add(updatepersonalDetails);

        viewpersonalDetails = new JButton("View Details");
        viewpersonalDetails.setBounds(0, 100, 300, 50);
        viewpersonalDetails.setBackground(Color.GRAY);
        viewpersonalDetails.setForeground(Color.WHITE);
        viewpersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        viewpersonalDetails.addActionListener(this);
        p2.add(viewpersonalDetails);

        JButton deletepersonalDetails = new JButton("Delete Personal Details");
        deletepersonalDetails.setBounds(0, 150, 300, 50);
        deletepersonalDetails.setBackground(Color.GRAY);
        deletepersonalDetails.setForeground(Color.WHITE);
        deletepersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletepersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        p2.add(deletepersonalDetails);

        checkpackages = new JButton("Check Package");
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.setBackground(Color.GRAY);
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0, 110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);

        bookpackages = new JButton("Book Package");
        bookpackages.setBounds(0, 250, 300, 50);
        bookpackages.setBackground(Color.GRAY);
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0, 0, 0, 120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);

        viewpackages = new JButton("View Package");
        viewpackages.setBounds(0, 300, 300, 50);
        viewpackages.setBackground(Color.GRAY);
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0, 0, 0, 120));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);

        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(Color.GRAY);
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

        bookhotels = new JButton("Book Hotels");
        bookhotels.setBounds(0, 400, 300, 50);
        bookhotels.setBackground(Color.GRAY);
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotels.setMargin(new Insets(0, 0, 0, 140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);

        viewbookedhotels = new JButton("View Booked Hotel");
        viewbookedhotels.setBounds(0, 450, 300, 50);
        viewbookedhotels.setBackground(Color.GRAY);
        viewbookedhotels.setForeground(Color.WHITE);
        viewbookedhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotels.setMargin(new Insets(0, 0, 0, 70));
        viewbookedhotels.addActionListener(this);
        p2.add(viewbookedhotels);

        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(Color.GRAY);
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        destinations.addActionListener(this);
        p2.add(destinations);

        payment = new JButton("Payments");
        payment.setBounds(0, 550, 300, 50);
        payment.setBackground(Color.GRAY);
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payment.setMargin(new Insets(0, 0, 0, 155));
        payment.addActionListener(this);
        p2.add(payment);

        calculator = new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setBackground(Color.GRAY);
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        calculator.addActionListener(this);
        p2.add(calculator);

        notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(Color.GRAY);
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        notepad.addActionListener(this);
        p2.add(notepad);

        about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(Color.GRAY);
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway", Font.PLAIN, 55));
        image.add(text);


        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addpersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewpersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatepersonalDetails) {
            new CustomerUpdate(username);
        } else if (ae.getSource() == checkpackages) {
            new CheckPackage();
        } else if (ae.getSource() == bookpackages) {
            new BookPackage(username);
        } else if (ae.getSource() == viewpackages) {
            new ViewPackage(username);
        } else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        } else if (ae.getSource() == destinations) {
            new Destinations();
        }else if(ae.getSource() == bookhotels){
            new BookHotel(username);
        }else if(ae.getSource() ==  viewbookedhotels){
            new ViewBookedHotel(username);
        }else if(ae.getSource() == payment){
            new Payment();
        }else if( ae.getSource() == calculator){
            try{
               Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else  if (ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == about){
            new About();
        }
    }
        public static void main (String[]args){
            new Dashboard("");
        }
    }

