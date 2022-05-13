    package MultiLaunchPro;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sameer Otham
 */
public class AddGame extends javax.swing.JFrame
{

    User_Data User;
    MLProDBManager link = new MLProDBManager();
    public AddGame(User_Data outUser)
    {
        initComponents();
        //settng frame to open in the center of the screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
        //populating User object
        User = outUser;
    }

    //generated code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JPanel();
        AddGameLbl = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        PlatLbl = new javax.swing.JLabel();
        JDirec = new javax.swing.JTextField();
        GnameLbl = new javax.swing.JLabel();
        JGname = new javax.swing.JTextField();
        DirectoryLbl = new javax.swing.JLabel();
        OpenDiec = new javax.swing.JButton();
        Ginsert = new javax.swing.JButton();
        PlatformChser = new javax.swing.JComboBox<>();
        HelpBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));

        AddGameLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AddGameLbl.setForeground(new java.awt.Color(255, 255, 255));
        AddGameLbl.setText("Add a Game");

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

        PlatLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PlatLbl.setForeground(new java.awt.Color(255, 255, 255));
        PlatLbl.setText("Platform");

        JDirec.setBackground(new java.awt.Color(255, 255, 255));
        JDirec.setForeground(new java.awt.Color(0, 0, 0));

        GnameLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        GnameLbl.setForeground(new java.awt.Color(255, 255, 255));
        GnameLbl.setText("Game Name");

        JGname.setBackground(new java.awt.Color(255, 255, 255));
        JGname.setForeground(new java.awt.Color(0, 0, 0));

        DirectoryLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DirectoryLbl.setForeground(new java.awt.Color(255, 255, 255));
        DirectoryLbl.setText("Directry");

        OpenDiec.setText("Add Directory");
        OpenDiec.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                OpenDiecActionPerformed(evt);
            }
        });

        Ginsert.setText("Add Game");
        Ginsert.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                GinsertActionPerformed(evt);
            }
        });

        PlatformChser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Steam", "Origin", "Epic Games Store", "Uplay", "Battle.net", "Other" }));

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
                        .addGap(30, 30, 30)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PlatLbl)
                                    .addComponent(DirectoryLbl))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PlatformChser, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JGname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JDirec, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                        .addComponent(GnameLbl)
                                        .addGap(0, 248, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OpenDiec))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddGameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HelpBtn))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ginsert)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddGameLbl)
                    .addComponent(HelpBtn))
                .addGap(24, 24, 24)
                .addComponent(DirectoryLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenDiec))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(GnameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JGname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PlatLbl)
                        .addGap(18, 18, 18)
                        .addComponent(PlatformChser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(BackBtn))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Ginsert)))
                .addContainerGap())
        );

        JDirec.setEditable(false);

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

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BackBtnMouseClicked
    {//GEN-HEADEREND:event_BackBtnMouseClicked
       //closing current frame
        this.dispose();
        //opening Games frame
        try
        {
            new Games(User).setVisible(true);
        } catch (SQLException ex)
        {
            System.out.println("Something went wrong");
        }
    }//GEN-LAST:event_BackBtnMouseClicked

    private void OpenDiecActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_OpenDiecActionPerformed
    {//GEN-HEADEREND:event_OpenDiecActionPerformed
        //opening windows get direc frame
        new getDirec(User).setVisible(true);
        //setting current frame invisible
        this.setVisible(false);
    }//GEN-LAST:event_OpenDiecActionPerformed
    //game insert
    private void GinsertActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_GinsertActionPerformed
    {//GEN-HEADEREND:event_GinsertActionPerformed
        //getting strings from JTextfields
        String inGname = JGname.getText();
        String inPlat = (String) PlatformChser.getSelectedItem();
        String inDirec = JDirec.getText();
        
        //checking iff fields are empty
        if (inGname.equalsIgnoreCase("") || inPlat.equalsIgnoreCase("") || inDirec.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "One or Fields have been left empty");
        } else
        {
            try
            {
                //checking if game is already in Global library
                if (link.DirecCheck(inDirec) == true)
                {
                 JOptionPane.showMessageDialog(null,"Game aleady in global library");
                } else
                {
                    //adding game to library
                    try
                    {
                        link.Gameinsert(inGname, inPlat, inDirec);
                        this.dispose();
                        new Games(User).setVisible(true);
                    } catch (SQLException ex)
                    {
                        System.out.println("Something went Wrong");
                    }
                }
            } catch (SQLException ex)
            {
                System.out.println("Something went Wrong");
            }
        }
    }//GEN-LAST:event_GinsertActionPerformed
    //help button
    private void HelpBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_HelpBtnMouseClicked
    {//GEN-HEADEREND:event_HelpBtnMouseClicked
    JOptionPane.showMessageDialog(null,"this Screen allows you to add a new game to the global library");
    }//GEN-LAST:event_HelpBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddGameLbl;
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel DirectoryLbl;
    private javax.swing.JButton Ginsert;
    private javax.swing.JLabel GnameLbl;
    private javax.swing.JLabel HelpBtn;
    public javax.swing.JTextField JDirec;
    private javax.swing.JTextField JGname;
    private javax.swing.JButton OpenDiec;
    private javax.swing.JLabel PlatLbl;
    private javax.swing.JComboBox<String> PlatformChser;
    // End of variables declaration//GEN-END:variables
}
