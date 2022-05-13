package MultiLaunchPro;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sameer Otham
 */
public class Create_Account extends javax.swing.JFrame
{

    /**
     * Creates new form Create_Account
     */
    public Create_Account()
    {
        initComponents();
        //setting frame to open centre screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
    }

    MLProDBManager link = new MLProDBManager();
    ErrorChecking Checks = new ErrorChecking();

    // generated code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        BackBtn = new java.awt.Label();
        Label = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        JFname = new javax.swing.JTextField();
        JSname = new javax.swing.JTextField();
        UnameLabel = new javax.swing.JLabel();
        SnameLabel1 = new javax.swing.JLabel();
        JUname = new javax.swing.JTextField();
        JPass = new javax.swing.JTextField();
        PassLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        CreateAcc = new javax.swing.JButton();
        JDOB = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        Background.setBackground(new java.awt.Color(51, 51, 51));
        Background.setPreferredSize(new java.awt.Dimension(476, 639));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Name.png"))); // NOI18N

        BackBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BackBtnMouseClicked(evt);
            }
        });

        Label.setBackground(new java.awt.Color(51, 51, 51));
        Label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Create Account");

        NameLabel.setBackground(new java.awt.Color(51, 51, 51));
        NameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name");

        JFname.setBackground(new java.awt.Color(255, 255, 255));
        JFname.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JFnameActionPerformed(evt);
            }
        });

        JSname.setBackground(new java.awt.Color(255, 255, 255));
        JSname.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JSnameActionPerformed(evt);
            }
        });

        UnameLabel.setBackground(new java.awt.Color(51, 51, 51));
        UnameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UnameLabel.setText("Username");

        SnameLabel1.setBackground(new java.awt.Color(51, 51, 51));
        SnameLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SnameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        SnameLabel1.setText("Surname");

        JUname.setBackground(new java.awt.Color(255, 255, 255));
        JUname.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JUnameActionPerformed(evt);
            }
        });

        JPass.setBackground(new java.awt.Color(255, 255, 255));
        JPass.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JPassActionPerformed(evt);
            }
        });

        PassLabel.setBackground(new java.awt.Color(51, 51, 51));
        PassLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(255, 255, 255));
        PassLabel.setText("Password");

        DOBLabel.setBackground(new java.awt.Color(51, 51, 51));
        DOBLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DOBLabel.setForeground(new java.awt.Color(255, 255, 255));
        DOBLabel.setText("Date Of Birth");

        CreateAcc.setText("Create Accounct");
        CreateAcc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CreateAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label)
                .addGap(150, 150, 150))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(CreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DOBLabel)
                            .addComponent(SnameLabel1)
                            .addComponent(UnameLabel)
                            .addComponent(NameLabel)
                            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JFname)
                            .addComponent(JSname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JUname)
                            .addComponent(PassLabel)
                            .addComponent(JPass)
                            .addComponent(JDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label)
                .addGap(21, 21, 21)
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SnameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DOBLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(CreateAcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BackBtnMouseClicked
    {//GEN-HEADEREND:event_BackBtnMouseClicked
        //opening laumnch frame and cosing current frame
        new Launch().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void CreateAccActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CreateAccActionPerformed
    {//GEN-HEADEREND:event_CreateAccActionPerformed

        // retriving user input
        String inFname = JFname.getText();
        String inSname = JSname.getText();
        String inUname = JUname.getText();
        String inPass = JPass.getText();
        Date DtoStr = JDOB.getDate();
        
        //checking if fields are empty
        if (inFname.isEmpty() || inSname.isEmpty() || inUname.isEmpty() || inPass.isEmpty() || DtoStr == null)
        {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        } else
        {
            //checking if fields contain vailid data
            if (Checks.NameCheck(inFname) == false || Checks.PassCheck(inPass) == false || Checks.SNameCheck(inSname) == false || Checks.UnameCheck(inUname) == false)
            {
                JOptionPane.showMessageDialog(null, "One or more fields Contain irregular Characters");
            } else
            {
                try
                {
                    //checking if username already exists
                    if (link.Unamecheck(inUname) == true)
                    {
                        JOptionPane.showMessageDialog(null, "Username already exists, Please choose a new one");
                        JUname.setText("");
                    } else
                    {
                        // converting date to string
                        DateFormat DFor = new SimpleDateFormat("dd/MM/yyyy");
                        String inDOB = DFor.format(DtoStr);

                        try
                        {
                            //calling insert method
                            link.UserInsert(inFname, inSname, inUname, inPass, inDOB);
                        } catch (SQLException ex)
                        {
                            System.out.println("Something went wrong");
                        }
                        this.dispose(); // closing current frame
                        new Login_Screen().setVisible(true); // initilizing and opening login frame
                    }
                } catch (SQLException ex)
                {
                    System.out.println("Something went wrong");
                }
            }
        }


    }//GEN-LAST:event_CreateAccActionPerformed
    //setting fields to default to blank
    private void JSnameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JSnameActionPerformed
    {//GEN-HEADEREND:event_JSnameActionPerformed
        JSname.setText("");
    }//GEN-LAST:event_JSnameActionPerformed

    private void JUnameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JUnameActionPerformed
    {//GEN-HEADEREND:event_JUnameActionPerformed
        JUname.setText("");
    }//GEN-LAST:event_JUnameActionPerformed

    private void JPassActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JPassActionPerformed
    {//GEN-HEADEREND:event_JPassActionPerformed
        JPass.setText("");
    }//GEN-LAST:event_JPassActionPerformed

    private void JFnameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JFnameActionPerformed
    {//GEN-HEADEREND:event_JFnameActionPerformed
        JFname.setText("");
    }//GEN-LAST:event_JFnameActionPerformed

    //generated varibles
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JButton CreateAcc;
    private javax.swing.JLabel DOBLabel;
    private com.toedter.calendar.JDateChooser JDOB;
    private javax.swing.JTextField JFname;
    private javax.swing.JTextField JPass;
    private javax.swing.JTextField JSname;
    private javax.swing.JTextField JUname;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel SnameLabel1;
    private javax.swing.JLabel UnameLabel;
    // End of variables declaration//GEN-END:variables
}
