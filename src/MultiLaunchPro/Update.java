
package MultiLaunchPro;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sameer Otham
 */
public class Update extends javax.swing.JFrame
{

    MLProDBManager link = new MLProDBManager();
    ErrorChecking Checks = new ErrorChecking();

    User_Data outUser;

    public Update(User_Data User)
    {
        initComponents();
        //setting frame to open center screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
        //populating user Object
        outUser = User;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        JFname = new javax.swing.JTextField();
        SnameLabel1 = new javax.swing.JLabel();
        JSname = new javax.swing.JTextField();
        UnameLabel = new javax.swing.JLabel();
        JUname = new javax.swing.JTextField();
        PassLabel = new javax.swing.JLabel();
        JPass = new javax.swing.JTextField();
        UpdateAcc = new javax.swing.JButton();
        BackBtn = new java.awt.Label();
        HelpBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));

        Label.setBackground(new java.awt.Color(51, 51, 51));
        Label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Update Account");

        NameLabel.setBackground(new java.awt.Color(51, 51, 51));
        NameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name");

        JFname.setBackground(new java.awt.Color(255, 255, 255));

        SnameLabel1.setBackground(new java.awt.Color(51, 51, 51));
        SnameLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SnameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        SnameLabel1.setText("Surname");

        JSname.setBackground(new java.awt.Color(255, 255, 255));

        UnameLabel.setBackground(new java.awt.Color(51, 51, 51));
        UnameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UnameLabel.setText("Username");

        JUname.setBackground(new java.awt.Color(255, 255, 255));

        PassLabel.setBackground(new java.awt.Color(51, 51, 51));
        PassLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(255, 255, 255));
        PassLabel.setText("Password");

        JPass.setBackground(new java.awt.Color(255, 255, 255));

        UpdateAcc.setText("Update");
        UpdateAcc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpdateAccActionPerformed(evt);
            }
        });

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

        HelpBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HelpBtn.setForeground(new java.awt.Color(255, 255, 255));
        HelpBtn.setText("Help");
        HelpBtn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                HelpBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Label))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JUname, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(JPass)
                            .addComponent(PassLabel)
                            .addComponent(UnameLabel)
                            .addComponent(SnameLabel1)
                            .addComponent(NameLabel)
                            .addComponent(JFname)
                            .addComponent(JSname))))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HelpBtn)
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HelpBtn)
                .addGap(15, 15, 15)
                .addComponent(Label)
                .addGap(18, 18, 18)
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SnameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(UnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateAcc)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BackBtnMouseClicked
    {//GEN-HEADEREND:event_BackBtnMouseClicked
       //closing current frame and setting home screen to be visible 
        new HomeScreen(outUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void UpdateAccActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpdateAccActionPerformed
    {//GEN-HEADEREND:event_UpdateAccActionPerformed
        //getting user input
        String upFname = JFname.getText();
        String upSname = JSname.getText();
        String upUname = JUname.getText();
        String upPass = JPass.getText();

        try
        {
            //checking if fields are empty
            if (upFname.isEmpty() || upSname.isEmpty() || upUname.isEmpty() || upPass.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "One or more fields are empty");
            } else
            {
                //checking if Username is taken
                if (upUname.equalsIgnoreCase(outUser.getUsername()) || link.Unamecheck(upUname) == false)
                {
                    //checking if feilds contain numbers or special characters
                    if (Checks.NameCheck(upFname) == false || Checks.PassCheck(upPass) == false || Checks.SNameCheck(upSname) == false || Checks.UnameCheck(upUname) == false)
                    {
                        JOptionPane.showMessageDialog(null, "One or more fields Contain irregular Characters");
                    } else
                    {
                        //updating details and closing frame
                        link.UserUpdate(outUser, upFname, upSname, upUname, upPass);
                        JOptionPane.showMessageDialog(null, "Details Updated");
                        this.dispose();
                        new HomeScreen(outUser).setVisible(true);
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Username already exists");
                }
            }
        } catch (SQLException ex)
        {
            System.out.println("Something went wrong");
        }


    }//GEN-LAST:event_UpdateAccActionPerformed
//help button
    private void HelpBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_HelpBtnMouseClicked
    {//GEN-HEADEREND:event_HelpBtnMouseClicked
    JOptionPane.showMessageDialog(null,"this Screen allows you to update you details in the database");
    }//GEN-LAST:event_HelpBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel HelpBtn;
    private javax.swing.JTextField JFname;
    private javax.swing.JTextField JPass;
    private javax.swing.JTextField JSname;
    private javax.swing.JTextField JUname;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel SnameLabel1;
    private javax.swing.JLabel UnameLabel;
    private javax.swing.JButton UpdateAcc;
    // End of variables declaration//GEN-END:variables
}
