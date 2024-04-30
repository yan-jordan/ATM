import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        //create a font for ATM
        Font font1 = new Font("Palatine" , Font.ITALIC , 15);
        Font font2 = new Font("B Nazanin" , Font.CENTER_BASELINE , 20);
        //create a frame
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setLocation(450,100);
        Dimension frameSize = new Dimension(600,600);
        frame.setSize(frameSize);
        frame.setTitle("ATM");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //create two panel for first page (choosing the language)
        JPanel pageOneLeft = new JPanel();
        pageOneLeft.setLayout(null);
        pageOneLeft.setBounds(0 , 0, 300 , 600);
        pageOneLeft.setBackground(Color.black);

        JLabel language1 = new JLabel();
        language1.setText("CHOOSE LANGUAGE");
        language1.setBounds(20 , 20 , 300 , 100);
        language1.setForeground(Color.white);
        language1.setFont(font1);
        pageOneLeft.add(language1);

        JButton english = new JButton();
        english.setFont(font1);
        english.setBorderPainted(false);
        english.setText("ENGLISH");
        english.setBackground(Color.white);
        english.setOpaque(true);
        english.setFocusable(false);
        english.setForeground(Color.black);
        english.setBounds(90 , 120 , 200 , 50);
        pageOneLeft.add(english);


        JPanel pageOneRight = new JPanel();
        pageOneRight.setLayout(null);
        pageOneRight.setBounds(300 , 0 , 300 , 600);
        pageOneRight.setBackground(Color.white);

        JLabel language2 = new JLabel();
        language2.setText("زبان خود را انتخاب کنید");
        language2.setBounds(120 , 350 , 200 , 100);
        language2.setForeground(Color.black);
        language2.setFont(font2);
        pageOneRight.add(language2);

        JButton persian = new JButton();
        persian.setBorderPainted(false);
        persian.setOpaque(true);
        persian.setFont(font2);
        persian.setText("فارسی");
        persian.setBackground(Color.black);
        persian.setForeground(Color.white);
        persian.setFocusable(false);
        persian.setBounds(30 , 430 , 200 , 50);
        pageOneRight.add(persian);

        //action listener of first page buttons and making the second page
        JPanel pageTwo = new JPanel();
        pageTwo.setLayout(null);
        pageTwo.setSize(frameSize);
        pageTwo.setBackground(Color.black);

        JLabel passwordLabel = new JLabel();
        passwordLabel.setText("PLEASE ENTER YOUR PASSWORD");
        passwordLabel.setFont(font1);
        passwordLabel.setForeground(Color.white);
        passwordLabel.setBounds(175 , 180 , 250 , 100);
        pageTwo.add(passwordLabel);

        JTextField passwordText = new JTextField();
        passwordText.setBackground(Color.WHITE);
        passwordText.setBounds(180 , 250 , 220 , 45);
        pageTwo.add(passwordText);

        JButton next1 = new JButton();
        next1.setOpaque(true);
        next1.setBorderPainted(false);
        next1.setFont(font1);
        next1.setText("NEXT");
        next1.setBounds(210 , 330 , 170 , 40);
        next1.setForeground(Color.black);
        next1.setBackground(Color.white);
        pageTwo.add(next1);

        english.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(pageOneRight);
                frame.remove(pageOneLeft);
                frame.add(pageTwo);
                frame.repaint();
                frame.revalidate();
            }
        });


        ////action listener of second page button and making the third page with four panel
        JPanel pageThree1 = new JPanel();
        pageThree1.setLayout(null);
        pageThree1.setBackground(Color.black);
        pageThree1.setBounds(0 , 0 , 300 , 300);
        JButton harvest = new JButton();
        harvest.setOpaque(true);
        harvest.setBorderPainted(false);
        harvest.setBackground(Color.black);
        harvest.setForeground(Color.white);
        harvest.setText("HARVESTING MONEY");
        harvest.setFocusable(false);
        harvest.setFont(font1);
        harvest.setBounds(50 , 100 , 200, 50);
        pageThree1.add(harvest);

        JPanel pageThree2 = new JPanel();
        pageThree2.setLayout(null);
        pageThree2.setBackground(Color.black);
        pageThree2.setBounds(300 , 0 , 300 , 300);
        JButton transform = new JButton();
        transform.setOpaque(true);
        transform.setBorderPainted(false);
        transform.setBackground(Color.black);
        transform.setForeground(Color.white);
        transform.setText("TRANSFORMING MONEY");
        transform.setFocusable(false);
        transform.setFont(font1);
        transform.setBounds(50 , 100 , 250, 50);
        pageThree2.add(transform);

        JPanel pageThree3 = new JPanel();
        pageThree3.setLayout(null);
        pageThree3.setBackground(Color.black);
        pageThree3.setBounds(0 , 300 , 300 , 300);
        JButton passcode = new JButton();
        passcode.setOpaque(true);
        passcode.setBorderPainted(false);
        passcode.setBackground(Color.black);
        passcode.setForeground(Color.white);
        passcode.setText("CHANGING PASSWORD");
        passcode.setFocusable(false);
        passcode.setFont(font1);
        passcode.setBounds(50 , 100 , 250, 50);
        pageThree3.add(passcode);

        JPanel pageThree4 = new JPanel();
        pageThree4.setLayout(null);
        pageThree4.setBackground(Color.black);
        pageThree4.setBounds(300 , 300 , 300 , 300);
        JButton cash = new JButton();
        cash.setOpaque(true);
        cash.setBorderPainted(false);
        cash.setBackground(Color.black);
        cash.setForeground(Color.white);
        cash.setText("ANNOUNCING CASH");
        cash.setFocusable(false);
        cash.setFont(font1);
        cash.setBounds(50 , 100 , 250, 50);
        pageThree4.add(cash);

        next1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(pageTwo);
                frame.add(pageThree1);
                frame.add(pageThree2);
                frame.add(pageThree3);
                frame.add(pageThree4);
                frame.repaint();
                frame.revalidate();
            }
        });

        //success panel
        JPanel success = new JPanel();
        success.setSize(frameSize);
        success.setBackground(Color.black);
        success.setLayout(null);
        JLabel x = new JLabel();
        x.setFont(font1);
        x.setBounds( 160 , 100 , 300 , 100);
        x.setText("MISSION HAD DONE SUCCESSFULLY");
        x.setForeground(Color.white);
        success.add(x);

        ////action listener of third page buttons and making the pages
        JPanel harvestingMoney = new JPanel();
        harvestingMoney.setBackground(Color.black);
        harvestingMoney.setSize(600,585);
        harvestingMoney.setLayout(new GridLayout(3 ,3 , 100 ,100));
        JButton harvest1 = new JButton("50,000");

        harvest1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(harvestingMoney);
                frame.repaint();
                frame.revalidate();
                frame.add(success);
            }
        });
        harvestingMoney.add(harvest1);
        JButton harvest2 = new JButton("100,000");
        harvestingMoney.add(harvest2);
        harvest2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(harvestingMoney);
                frame.repaint();
                frame.revalidate();
                frame.add(success);
            }
        });
        JButton harvest3 = new JButton("200,000");
        harvest3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(harvestingMoney);
                frame.repaint();
                frame.revalidate();
                frame.add(success);
            }
        });
        harvestingMoney.add(harvest3);
        JButton harvest4 = new JButton("300,000");
        harvest4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(harvestingMoney);
                frame.repaint();
                frame.revalidate();
                frame.add(success);
            }
        });
        harvestingMoney.add(harvest4);
        harvest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(pageThree1);
                frame.remove(pageThree2);
                frame.remove(pageThree3);
                frame.remove(pageThree4);
                frame.add(harvestingMoney);
                frame.repaint();
                frame.revalidate();
            }
        });
        JButton back3 = new JButton();
        back3.setOpaque(true);
        back3.setBorderPainted(false);
        back3.setFont(font1);
        back3.setText("BACK");
        back3.setBounds(225 , 380 , 170 , 40);
        back3.setForeground(Color.black);
        back3.setBackground(Color.white);
        harvestingMoney.add(back3);
        back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(harvestingMoney);
                frame.add(pageThree1);
                frame.add(pageThree2);
                frame.add(pageThree3);
                frame.add(pageThree4);
                frame.repaint();
                frame.revalidate();
            }
        });





        JPanel announcingCash = new JPanel();
        announcingCash.setLayout(null);
        announcingCash.setSize(frameSize);
        announcingCash.setBackground(Color.black);
        announcingCash.setOpaque(true);
        JLabel mojudi = new JLabel("your cash amount is 123456789 $");
        mojudi.setForeground(Color.white);
        mojudi.setBounds(180 , 100 , 300 , 100);
        mojudi.setFont(font1);
        announcingCash.add(mojudi);
        cash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(pageThree1);
                frame.remove(pageThree2);
                frame.remove(pageThree3);
                frame.remove(pageThree4);
                frame.add(announcingCash);
                frame.repaint();
                frame.revalidate();
            }
        });
        JButton back2 = new JButton();
        back2.setOpaque(true);
        back2.setBorderPainted(false);
        back2.setFont(font1);
        back2.setText("BACK");
        back2.setBounds(225 , 380 , 170 , 40);
        back2.setForeground(Color.black);
        back2.setBackground(Color.white);
        announcingCash.add(back2);
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(announcingCash);
                frame.add(pageThree1);
                frame.add(pageThree2);
                frame.add(pageThree3);
                frame.add(pageThree4);
                frame.repaint();
                frame.revalidate();
            }
        });





        JPanel changingPassword = new JPanel();
        passcode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(pageThree1);
                frame.remove(pageThree2);
                frame.remove(pageThree3);
                frame.remove(pageThree4);
                frame.add(changingPassword);
                frame.repaint();
                frame.revalidate();
            }
        });

        changingPassword.setLayout(null);
        changingPassword.setSize(frameSize);
        changingPassword.setBackground(Color.black);

        JLabel newPassword = new JLabel();
        newPassword.setText("PLEASE ENTER NEW PASSWORD");
        newPassword.setFont(font1);
        newPassword.setForeground(Color.white);
        newPassword.setBounds(175 , 180 , 250 , 100);
        changingPassword.add(newPassword);

        JTextField newPasswordText = new JTextField();
        newPasswordText.setBackground(Color.WHITE);
        newPasswordText.setBounds(180 , 250 , 220 , 45);
        changingPassword.add(newPasswordText);

        JButton next2 = new JButton();
        next2.setOpaque(true);
        next2.setBorderPainted(false);
        next2.setFont(font1);
        next2.setText("NEXT");
        next2.setBounds(205 , 330 , 170 , 40);
        next2.setForeground(Color.black);
        next2.setBackground(Color.white);
        changingPassword.add(next2);
        JPanel nextStepChangingPassword = new JPanel();
        nextStepChangingPassword.setLayout(null);
        nextStepChangingPassword.setBackground(Color.black);
        nextStepChangingPassword.setSize(frameSize);
        JLabel successSituation = new JLabel();
        successSituation.setText("MISSION HAS DONE SUCCESSFULLY !");
        successSituation.setFont(font1);
        successSituation.setForeground(Color.white);
        successSituation.setBounds(170 , 100 , 300 , 100);
        nextStepChangingPassword.add(successSituation);
        next2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(changingPassword);
                frame.add(nextStepChangingPassword);
                frame.repaint();
                frame.revalidate();
            }
        });
        JButton back1 = new JButton();
        back1.setOpaque(true);
        back1.setBorderPainted(false);
        back1.setFont(font1);
        back1.setText("BACK");
        back1.setBounds(205 , 380 , 170 , 40);
        back1.setForeground(Color.black);
        back1.setBackground(Color.white);
        changingPassword.add(back1);
        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(nextStepChangingPassword);
                frame.remove(changingPassword);
                frame.add(pageThree1);
                frame.add(pageThree2);
                frame.add(pageThree3);
                frame.add(pageThree4);
                frame.repaint();
                frame.revalidate();
            }
        });


        JPanel transformingMoney = new JPanel();
        transformingMoney.setLayout(null);
        transformingMoney.setSize(frameSize);
        transformingMoney.setBackground(Color.black);
        JLabel mablagh = new JLabel("PLEASE ENTER THE AMOUNT OF CASH");
        mablagh.setFont(font1);
        mablagh.setForeground(Color.white);
        mablagh.setBounds(0 , 20 , 300 , 77);
        transformingMoney.add(mablagh);
        JTextField mablagh1 = new JTextField();
        mablagh1.setBackground(Color.white);
        mablagh1.setOpaque(true);
        mablagh1.setFont(font1);
        mablagh1.setBounds(230 , 110 , 300 , 40);
        transformingMoney.add(mablagh1);

        JLabel shomare = new JLabel("PLEASE ENTER THE NUMBER OF CART");
        shomare.setFont(font1);
        shomare.setForeground(Color.white);
        shomare.setBounds(0 , 240 , 300 , 77);
        transformingMoney.add(shomare);
        JTextField shomare2 = new JTextField();
        shomare2.setBackground(Color.white);
        shomare2.setOpaque(true);
        shomare2.setFont(font1);
        shomare2.setBounds(230 , 330 , 300 , 40);
        transformingMoney.add(shomare2);

        JButton done = new JButton("DONE!");
        done.setBounds(250 , 500 , 100 , 40);
        done.setForeground(Color.black);
        transformingMoney.add(done);
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(transformingMoney);
                frame.add(success);
                frame.repaint();
                frame.revalidate();
            }
        });

        JButton back4 = new JButton("BACK!");
        back4.setBounds(250 , 440 , 100 , 40);
        back4.setForeground(Color.black);
        transformingMoney.add(back4);
        back4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(transformingMoney);
                frame.add(pageThree1);
                frame.add(pageThree2);
                frame.add(pageThree3);
                frame.add(pageThree4);
                frame.revalidate();
                frame.repaint();
            }
        });


        transform.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(pageThree1);
                frame.remove(pageThree2);
                frame.remove(pageThree3);
                frame.remove(pageThree4);
                frame.add(transformingMoney);
                frame.repaint();
                frame.revalidate();
            }
        });



        //make frame visible and add panels on frame
        frame.add(pageOneLeft);
        frame.add(pageOneRight);
        frame.setVisible(true);

    }
}