package MultiLaunchPro;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sameer Otham
 */
public class HomeScreen extends javax.swing.JFrame
{

    MLProDBManager link = new MLProDBManager();
    User_Data User;

    public HomeScreen(User_Data outUser)
    {
        initComponents();
        //setting frame to opne centre screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2  -this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
        //setting frame to not be resizaable
        this.setResizable(false);
        //populating user object
        User = outUser;
        //setting welcom back text
        WB.setText("Welcome Back " + User.getFirstname());

        //checking if user is admin to show/ not show admin settings button
        if (User.isAdministrator() == false)
        {
            AdminBtn.setVisible(false);
        }
        //populating tabel
        try
        {
            tblLib.setModel(DbUtils.resultSetToTableModel(link.getLib(User)));
        } catch (SQLException ex)
        {
            System.out.println("Somethng went wrong");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLib = new javax.swing.JTable();
        WB = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        ManageLib = new javax.swing.JMenu();
        AddGameBtn = new javax.swing.JMenuItem();
        EditLib = new javax.swing.JMenuItem();
        MngAcc = new javax.swing.JMenu();
        UpAccBtn = new javax.swing.JMenuItem();
        DelAccBtn = new javax.swing.JMenuItem();
        Sort = new javax.swing.JMenu();
        OrderFav = new javax.swing.JMenuItem();
        OrderGname = new javax.swing.JMenuItem();
        OrderPlat = new javax.swing.JMenuItem();
        AllGames = new javax.swing.JMenuItem();
        AdminBtn = new javax.swing.JMenu();
        EditUsers = new javax.swing.JMenuItem();
        ResGames = new javax.swing.JMenuItem();
        SignOut = new javax.swing.JMenu();
        HelpBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));

        tblLib = new javax.swing.JTable()
        {
            public boolean isCellEditable (int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tblLib.setBackground(new java.awt.Color(51, 51, 51));
        tblLib.setForeground(new java.awt.Color(255, 255, 255));
        tblLib.setModel(new javax.swing.table.DefaultTableModel(
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
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblLib.getTableHeader().setReorderingAllowed(false);
        tblLib.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblLibMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLib);
        if (tblLib.getColumnModel().getColumnCount() > 0)
        {
            tblLib.getColumnModel().getColumn(0).setResizable(false);
            tblLib.getColumnModel().getColumn(1).setResizable(false);
            tblLib.getColumnModel().getColumn(2).setResizable(false);
            tblLib.getColumnModel().getColumn(3).setResizable(false);
        }

        WB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        WB.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WB, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(WB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        MenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        ManageLib.setText("Manage Library");

        AddGameBtn.setText("Add new Games");
        AddGameBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddGameBtnActionPerformed(evt);
            }
        });
        ManageLib.add(AddGameBtn);

        EditLib.setText("Edit Library");
        EditLib.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditLibActionPerformed(evt);
            }
        });
        ManageLib.add(EditLib);

        MenuBar.add(ManageLib);

        MngAcc.setText("Manage Account");

        UpAccBtn.setText("Update Details");
        UpAccBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpAccBtnActionPerformed(evt);
            }
        });
        MngAcc.add(UpAccBtn);

        DelAccBtn.setText("Delete Account");
        DelAccBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DelAccBtnActionPerformed(evt);
            }
        });
        MngAcc.add(DelAccBtn);

        MenuBar.add(MngAcc);

        Sort.setText("Sort By");

        OrderFav.setText("Favorite");
        OrderFav.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                OrderFavActionPerformed(evt);
            }
        });
        Sort.add(OrderFav);

        OrderGname.setText("Game Name");
        OrderGname.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                OrderGnameActionPerformed(evt);
            }
        });
        Sort.add(OrderGname);

        OrderPlat.setText("Platform");
        OrderPlat.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                OrderPlatActionPerformed(evt);
            }
        });
        Sort.add(OrderPlat);

        AllGames.setText("All Games");
        AllGames.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AllGamesActionPerformed(evt);
            }
        });
        Sort.add(AllGames);

        MenuBar.add(Sort);

        AdminBtn.setText("Admin");

        EditUsers.setText("Edit Users");
        EditUsers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditUsersActionPerformed(evt);
            }
        });
        AdminBtn.add(EditUsers);

        ResGames.setText("Restrict Games");
        ResGames.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ResGamesActionPerformed(evt);
            }
        });
        AdminBtn.add(ResGames);

        MenuBar.add(AdminBtn);

        SignOut.setText("Sign Out");
        SignOut.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                SignOutMouseClicked(evt);
            }
        });
        MenuBar.add(SignOut);

        HelpBtn.setText("Help");
        HelpBtn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                HelpBtnMouseClicked(evt);
            }
        });
        MenuBar.add(HelpBtn);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_SignOutMouseClicked
    {//GEN-HEADEREND:event_SignOutMouseClicked
        //closes current frame, set object to null and sets launch screen visible
        User = null;
        this.dispose();
        new Launch().setVisible(true);
    }//GEN-LAST:event_SignOutMouseClicked

    private void EditUsersActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditUsersActionPerformed
    {//GEN-HEADEREND:event_EditUsersActionPerformed
        //opens edit users frame
        try
        {
            new AdminUsers(User).setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditUsersActionPerformed

    private void AddGameBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddGameBtnActionPerformed
    {//GEN-HEADEREND:event_AddGameBtnActionPerformed
        //opnes add game frame and closes current frame
        try
        {
            new Games(User).setVisible(true);
        } catch (SQLException ex)
        {
            System.out.println("something went wrong");
        }
        this.dispose();
    }//GEN-LAST:event_AddGameBtnActionPerformed

    private void EditLibActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditLibActionPerformed
    {//GEN-HEADEREND:event_EditLibActionPerformed
        //closes current frame and opens edit library frame
        this.dispose();
        new LibraryEdit(User).setVisible(true);
    }//GEN-LAST:event_EditLibActionPerformed

    private void ResGamesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ResGamesActionPerformed
    {//GEN-HEADEREND:event_ResGamesActionPerformed
        //opens Restrcit games frame and closes current frame
        this.dispose();
        new ResGames(User).setVisible(true);
    }//GEN-LAST:event_ResGamesActionPerformed

    private void tblLibMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblLibMouseClicked
    {//GEN-HEADEREND:event_tblLibMouseClicked
        //getting row clicked index and game name
        int index = tblLib.getSelectedRow();
        String GName = (String) tblLib.getValueAt(index, 1);

        //confirmation to launch game
        int YesorNo = JOptionPane.showConfirmDialog(null, "Would you like to Launch " + GName);
        System.out.println(YesorNo);
        if (YesorNo == 0)
        {
            try
            {
                //lauching game
                Desktop.getDesktop().open(new File((String) tblLib.getValueAt(index, 4)));
            } catch (IOException ex)
            {
                System.out.println("Something went wrong");
            }
        }
    }//GEN-LAST:event_tblLibMouseClicked

    private void UpAccBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpAccBtnActionPerformed
    {//GEN-HEADEREND:event_UpAccBtnActionPerformed
        //opening update frame and closing current frame
        this.dispose();
        new Update(User).setVisible(true);
    }//GEN-LAST:event_UpAccBtnActionPerformed

    private void DelAccBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DelAccBtnActionPerformed
    {//GEN-HEADEREND:event_DelAccBtnActionPerformed
        //getting userID
        int UserID = User.getUserID();
        String check = "DELETE";
        //Delete confirmantion
        String inDel = JOptionPane.showInputDialog(null, "Sorry to see you go\n Please type " + check + " to delete your account");
        if (inDel.equals(check))
        {
            try
            {
                //deleting account
                this.dispose();
                new Launch().setVisible(true);
                link.UserDelete(UserID);
                JOptionPane.showMessageDialog(null, "Account Deleted");
            } catch (SQLException ex)
            {
                System.out.println("something went wrong");
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Does not match");
        }
    }//GEN-LAST:event_DelAccBtnActionPerformed

    private void OrderFavActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_OrderFavActionPerformed
    {//GEN-HEADEREND:event_OrderFavActionPerformed
        try
        {
            //showing favourites
            tblLib.setModel(DbUtils.resultSetToTableModel(link.ShowFav(User.getUserID())));
        } catch (SQLException ex)
        {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OrderFavActionPerformed

    private void OrderPlatActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_OrderPlatActionPerformed
    {//GEN-HEADEREND:event_OrderPlatActionPerformed
        String in = "Platform";
        try
        {
            //ordering by Platform
            tblLib.setModel(DbUtils.resultSetToTableModel(link.OrderBy(in, User.getUserID())));
        } catch (SQLException ex)
        {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OrderPlatActionPerformed

    private void OrderGnameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_OrderGnameActionPerformed
    {//GEN-HEADEREND:event_OrderGnameActionPerformed
        String in = "GameName";
        try
        {
            //ordering by GameName
            tblLib.setModel(DbUtils.resultSetToTableModel(link.OrderBy(in, User.getUserID())));
        } catch (SQLException ex)
        {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OrderGnameActionPerformed

    private void AllGamesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AllGamesActionPerformed
    {//GEN-HEADEREND:event_AllGamesActionPerformed
        try
        {
            //showing all games
            tblLib.setModel(DbUtils.resultSetToTableModel(link.getLib(User)));
        } catch (SQLException ex)
        {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AllGamesActionPerformed
//help buttom
    private void HelpBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_HelpBtnMouseClicked
    {//GEN-HEADEREND:event_HelpBtnMouseClicked
        JOptionPane.showMessageDialog(null, "this Screen allows you to lauch games by clicking on them as well as navigate to every other frame");
    }//GEN-LAST:event_HelpBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddGameBtn;
    private javax.swing.JMenu AdminBtn;
    private javax.swing.JMenuItem AllGames;
    private javax.swing.JPanel Background;
    private javax.swing.JMenuItem DelAccBtn;
    private javax.swing.JMenuItem EditLib;
    private javax.swing.JMenuItem EditUsers;
    private javax.swing.JMenu HelpBtn;
    private javax.swing.JMenu ManageLib;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MngAcc;
    private javax.swing.JMenuItem OrderFav;
    private javax.swing.JMenuItem OrderGname;
    private javax.swing.JMenuItem OrderPlat;
    private javax.swing.JMenuItem ResGames;
    private javax.swing.JMenu SignOut;
    private javax.swing.JMenu Sort;
    private javax.swing.JMenuItem UpAccBtn;
    public javax.swing.JLabel WB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLib;
    // End of variables declaration//GEN-END:variables
}
