package MultiLaunchPro;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sameer Otham
 */
public class Login_Screen extends javax.swing.JFrame
{
    public Login_Screen()
    {
        initComponents();
        //setting frame to open center screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
    }
    MLProDBManager link = new MLProDBManager();

    // generated code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JPanel();
        LogoImage = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        Uname_Label = new javax.swing.JLabel();
        LogUname = new javax.swing.JTextField();
        Pass_Label = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        ShowPass = new javax.swing.JCheckBox();
        LogPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));

        LogoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Name.png"))); // NOI18N

        BackBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BackBtnMouseClicked(evt);
            }
        });

        Uname_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Uname_Label.setForeground(new java.awt.Color(255, 255, 255));
        Uname_Label.setText("Username");

        LogUname.setBackground(new java.awt.Color(255, 255, 255));
        LogUname.setForeground(new java.awt.Color(0, 0, 0));
        LogUname.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                LogUnameKeyPressed(evt);
            }
        });

        Pass_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pass_Label.setForeground(new java.awt.Color(255, 255, 255));
        Pass_Label.setText("Password");

        LoginBtn.setBackground(new java.awt.Color(51, 51, 51));
        LoginBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.setToolTipText("");
        LoginBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LoginBtnActionPerformed(evt);
            }
        });
        LoginBtn.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                LoginBtnKeyPressed(evt);
            }
        });

        ShowPass.setBackground(new java.awt.Color(51, 51, 51));
        ShowPass.setForeground(new java.awt.Color(255, 255, 255));
        ShowPass.setText("Show Password");
        ShowPass.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ShowPassActionPerformed(evt);
            }
        });

        LogPass.setBackground(new java.awt.Color(255, 255, 255));
        LogPass.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                LogPassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(LogoImage)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Uname_Label)
                            .addComponent(Pass_Label)
                            .addComponent(LogUname)
                            .addComponent(LogPass, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(ShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(LogoImage)
                .addGap(51, 51, 51)
                .addComponent(Uname_Label)
                .addGap(18, 18, 18)
                .addComponent(LogUname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pass_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(ShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginBtn)
                        .addContainerGap(82, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BackBtn  code
    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BackBtnMouseClicked
    {//GEN-HEADEREND:event_BackBtnMouseClicked
        new Launch().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

//login button code 
    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_LoginBtnActionPerformed
    {//GEN-HEADEREND:event_LoginBtnActionPerformed
        String inUname = LogUname.getText();
        String inPass = LogPass.getText();
        User_Data outUser;

        try
        {
            String outPass = link.login(inUname, inPass);
            if (inUname.equals("") || inPass.equals(""))
            {
                JOptionPane.showMessageDialog(null, "One or more fields have been left blank");
            } else
            {
                if (outPass.equals(inPass))
                {
                    outUser = link.UserCreate(inUname);
                    new HomeScreen(outUser).setVisible(true);
                    this.dispose();
                } else
                {
                    JOptionPane.showMessageDialog(null, "Username or password is incorrect please try again");
                }
            }
        } catch (SQLException ex)
        {
            System.out.println("Something went wrong");
        }

    }//GEN-LAST:event_LoginBtnActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ShowPassActionPerformed
    {//GEN-HEADEREND:event_ShowPassActionPerformed
        //show password checkbox
        if (ShowPass.isSelected())
        {
            LogPass.setEchoChar((char) 0);
        } else
        {
            LogPass.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassActionPerformed
    //adding ability to press enter key to do mouse clicked action
    private void LoginBtnKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_LoginBtnKeyPressed
    {//GEN-HEADEREND:event_LoginBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            LoginBtn.doClick();
        }
    }//GEN-LAST:event_LoginBtnKeyPressed

    private void LogPassKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_LogPassKeyPressed
    {//GEN-HEADEREND:event_LogPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            LoginBtn.doClick();
        }
    }//GEN-LAST:event_LogPassKeyPressed

    private void LogUnameKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_LogUnameKeyPressed
    {//GEN-HEADEREND:event_LogUnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            LoginBtn.doClick();
        }
    }//GEN-LAST:event_LogUnameKeyPressed

    //generated varibles
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JPasswordField LogPass;
    private javax.swing.JTextField LogUname;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel LogoImage;
    private javax.swing.JLabel Pass_Label;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JLabel Uname_Label;
    // End of variables declaration//GEN-END:variables
}
