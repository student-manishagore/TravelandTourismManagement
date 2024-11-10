package TravelSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

    public class BookHotel extends JFrame implements ActionListener {

        Choice chotel,cac,cfood;
        JTextField tfpersons,tfdays;
        String username;
        JLabel labelusername, labelid1, labelnumber, labelphone, labeltotal;
        JButton checkprice, bookpackage, back;

        BookHotel(String username) {
            this.username = username;
            setBounds(350, 200, 1100, 600);
            setLayout(null);
            getContentPane().setBackground(Color.WHITE);

            JLabel text = new JLabel("BOOK HOTEL");
            text.setBounds(100, 10, 200, 30);
            text.setFont(new Font("Tahoma", Font.BOLD, 20));
            add(text);


            JLabel lblusername = new JLabel("Username");
            lblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lblusername.setBounds(40, 70, 100, 20);
            add(lblusername);

            labelusername = new JLabel();
            labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
            labelusername.setBounds(250, 70, 100, 20);
            add(labelusername);

            JLabel lblid = new JLabel("Select Hotel");
            lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lblid.setBounds(40, 110, 200, 20);
            add(lblid);

            chotel = new Choice();
            chotel.setBounds(250, 110, 200, 20);
            add(chotel);

            try {
                Con c=new Con();
                ResultSet rs=c.s.executeQuery("select  * from hotel10");
                while (rs.next()){
                    chotel.add(rs.getString("name"));
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            JLabel lblpersons = new JLabel("Total Persons");
            lblpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lblpersons.setBounds(40, 150, 150, 25);
            add(lblpersons);

            tfpersons = new JTextField("1");
            tfpersons.setBounds(250, 150, 200, 25);
            add(tfpersons);

            JLabel lbldays = new JLabel("No of Days");
            lbldays.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lbldays.setBounds(40, 190, 150, 25);
            add(lbldays);

            tfdays = new JTextField("1");
            tfdays.setBounds(250, 190, 200, 25);
            add(tfdays);

            JLabel lblac = new JLabel("AC/ Non-AC");
            lblac.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lblac.setBounds(40, 230, 150, 25);
            add(lblac);

            cac = new Choice();
            cac.add("AC");
            cac.add("Non-AC");
            cac.setBounds(250, 230, 200, 20);
            add(cac);

            JLabel lblfood = new JLabel("Food Included");
            lblfood.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lblfood.setBounds(40, 270, 150, 25);
            add(lblfood);

            cfood = new Choice();
            cfood.add("Yes");
            cfood.add("No");
            cfood.setBounds(250, 270, 200, 20);
            add(cfood);


            JLabel lblid1 = new JLabel("Id");
            lblid1.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lblid1.setBounds(40, 310, 150, 25);
            add(lblid1);

            labelid1 = new JLabel();
            labelid1.setBounds(250, 310, 200, 25);
            add(labelid1);


            JLabel lblnumber = new JLabel("Number");
            lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lblnumber.setBounds(40, 350, 150, 25);
            add(lblnumber);

            labelnumber = new JLabel();
            labelnumber.setBounds(250, 350, 150, 25);
            add(labelnumber);

            JLabel lblphone = new JLabel("Phone");
            lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lblphone.setBounds(40, 390, 150, 25);
            add(lblphone);

            labelphone = new JLabel();
            labelphone.setBounds(250, 390, 200, 25);
            add(labelphone);


            JLabel lbltotal = new JLabel("Total Price");
            lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
            lbltotal.setBounds(40, 430, 150, 25);
            add(lbltotal);

            labeltotal = new JLabel();
            labeltotal.setBounds(250, 430, 150, 25);
            add(labeltotal);


            try {
                Con c = new Con();
                String query = "select * from customer where username = '" + username + "'";
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    labelusername.setText(rs.getString("username"));
                    labelid1.setText(rs.getString("id"));
                    labelnumber.setText(rs.getString("number"));
                    labelphone.setText(rs.getString("phone"));

                }


            } catch (Exception e) {
                e.printStackTrace();
            }

            checkprice = new JButton("Check Price");
            checkprice.setBackground(Color.BLACK);
            checkprice.setForeground(Color.WHITE);
            checkprice.setBounds(60, 490, 120, 25);
            checkprice.addActionListener(this);
            add(checkprice);

            bookpackage = new JButton("Book Hotel");
            bookpackage.setBackground(Color.BLACK);
            bookpackage.setForeground(Color.WHITE);
            bookpackage.setBounds(200, 490, 120, 25);
            bookpackage.addActionListener(this);
            add(bookpackage);

            back = new JButton("Back");
            back.setBackground(Color.BLACK);
            back.setForeground(Color.WHITE);
            back.setBounds(340, 490, 120, 25);
            back.addActionListener(this);
            add(back);

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
            Image i2= i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel l12=new JLabel(i3);
            l12.setBounds(500,50,600,300);
            add(l12);


            setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == checkprice) {
                try{
                    Con c=new Con();
                    ResultSet rs=c.s.executeQuery("select * from hotel10 where name='"+chotel.getSelectedItem()+"'");
                    while (rs.next()){
                        int cost = Integer.parseInt(rs.getString("costperperson"));
                        int food = Integer.parseInt(rs.getString("foodincluded"));
                        int ac = Integer.parseInt(rs.getString("acroom"));

                        int persons = Integer.parseInt(tfpersons.getText());
                        int days = Integer.parseInt(tfdays.getText());

                        String acselected = cac.getSelectedItem();
                        String foodselected = cfood.getSelectedItem();

                        if(persons * days > 0){
                            int total = 0;
                            total += acselected.equals("AC") ? ac :0;
                            total += foodselected.equals("Yes") ? food:0;
                            total += cost;
                            total = total * persons * days;
                            labeltotal.setText("Rs" + total);
                        }else {
                            JOptionPane.showMessageDialog(null,"Please Enter a Valid Number" );

                        }
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }

            } else if (ae.getSource() == bookpackage) {
                try{
                    Con c=new Con();
                    c.s.executeUpdate("insert into bookhotel11 values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid1.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labeltotal.getText()+"')");

                    JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
                    setVisible(false);
                }catch (Exception e){
                    e.printStackTrace();
                }
            } else {
                setVisible(false);
            }
        }

        public static void main(String[]args){
            new BookHotel("manu");
        }
    }


