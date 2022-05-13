package MultiLaunchPro;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sameer Otham
 */
public class AdminUsers extends javax.swing.JFrame
{

    User_Data outUser;
    MLProDBManager link = new MLProDBManager();

    public AdminUsers(User_Data User) throws SQLException
    {
        initComponents();
        //setting frame to open centre screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
        //populating user object
        outUser = User;
        //populating tabel
        try
        {
            Users.setModel(DbUtils.resultSetToTableModel(link.AllUsers()));
        } catch (SQLException ex)
        {
            System.out.println("Something went Wrong");
        }

    }

    //generated code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Users = new javax.swing.JTable();
        info = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        HelpBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));
        Background.setForeground(new java.awt.Color(255, 255, 255));

        //setting tabel to be un editable
        Users = new javax.swing.JTable()
        {
            public boolean isCellEditable (int rowIndex, int colIndex)
            {
                return false;
            }
        };
        Users.setBackground(new java.awt.Color(51, 51, 51));
        Users.setForeground(new java.awt.Color(255, 255, 255));
        Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Users.getTableHeader().setReorderingAllowed(false);
        Users.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Users);

        info.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setText("Delete, Restrict or make Users admins");

        BackBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Done");
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
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HelpBtn)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HelpBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BackBtnMouseClicked
    {//GEN-HEADEREND:event_BackBtnMouseClicked
        //closing frame
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void UsersMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_UsersMouseClicked
    {//GEN-HEADEREND:event_UsersMouseClicked
        //getting userID from tabel
        int rowindex = Users.getSelectedRow();
        int UID = (int) Users.getValueAt(rowindex, 0);
        //string arrays for option popups
        String[] options =
        {
            "Make Admin", "Restrict", "Delete"
        };

        String[] YesNo =
        {
            "Add", "Remove"
        };
        //getting name of selected user
        String name = (String) Users.getValueAt(rowindex, 1);
        //first option popup
        int threeOps = JOptionPane.showOptionDialog(null, "Options for " + name,
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        //switch for options
        switch (threeOps)
        {
            case 0:
            {
                try
                {
                    //option popup
                    int AdminChoice = JOptionPane.showOptionDialog(null, "Add or Remove Restrcted Status",
                            "",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, YesNo, YesNo[0]);
                    //method to change admin status
                    link.ChangeAdmin(UID, AdminChoice);
                    //refreshing tabel
                    Users.setModel(DbUtils.resultSetToTableModel(link.AllUsers()));

                } catch (SQLException ex)
                {
                    System.out.println("Something went wrong");
                }
            }
            break;
            case 1:
            {
                //option popup
                int RestricChoice = JOptionPane.showOptionDialog(null, "Add or Remove Restrcted Status",
                        "",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, YesNo, YesNo[0]);
                try
                {
                    //method to change restrcted status
                    link.restrictUser(UID, RestricChoice);
                    //refreshing tabel
                    Users.setModel(DbUtils.resultSetToTableModel(link.AllUsers()));
                } catch (SQLException ex)
                {
                    System.out.println("Something went wrong");
                }

            }
            break;

            case 2:
            {
                try
                {
                    //method to delete user
                    link.UserDelete(UID);
                    //refreshing tabel
                    Users.setModel(DbUtils.resultSetToTableModel(link.AllUsers()));
                } catch (SQLException ex)
                {
                }
            }
            break;
        }
    }//GEN-LAST:event_UsersMouseClicked
    //help button
    private void HelpBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_HelpBtnMouseClicked
    {//GEN-HEADEREND:event_HelpBtnMouseClicked
        JOptionPane.showMessageDialog(null, "this Screen allows you to change the admin and restricted Status as well as delete users by clicking on them in the table");
    }//GEN-LAST:event_HelpBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel HelpBtn;
    private javax.swing.JTable Users;
    private javax.swing.JLabel info;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
