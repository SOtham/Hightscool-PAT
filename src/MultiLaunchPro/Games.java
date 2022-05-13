package MultiLaunchPro;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sameer Otham
 */
public class Games extends javax.swing.JFrame
{

    User_Data outUser;
    MLProDBManager link = new MLProDBManager();

    public Games(User_Data User) throws SQLException
    {
        initComponents();
        //setting frame to open centre screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
        //populatinng user object
        outUser = User;
        //checking if  user is restricted and preventing them from seeing or adding non restricted games
        if (outUser.isRestricted() == true)
        {
            AddGameBtn.setVisible(false);
            GamesTabel.setModel(DbUtils.resultSetToTableModel(link.ResGames()));
        } else// else for regular users
        {
            try
            {
                GamesTabel.setModel(DbUtils.resultSetToTableModel(link.AllGames()));
            } catch (SQLException ex)
            {
                System.out.println("Something went Wrong");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JPanel();
        BackBtn = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        GamesTabel = new javax.swing.JTable();
        AvalibleLbl = new javax.swing.JLabel();
        AddGameBtn = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
        HelpBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));

        BackBtn.setBackground(new java.awt.Color(51, 51, 51));
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

        //setting tabel to be uneditable
        GamesTabel = new javax.swing.JTable()
        {
            public boolean isCellEditable (int rowIndex, int colIndex)
            {
                return false;
            }
        };
        GamesTabel.setBackground(new java.awt.Color(51, 51, 51));
        GamesTabel.setForeground(new java.awt.Color(255, 255, 255));
        GamesTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        GamesTabel.getTableHeader().setReorderingAllowed(false);
        GamesTabel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                GamesTabelMouseClicked(evt);
            }
        });
        ScrollPane.setViewportView(GamesTabel);

        AvalibleLbl.setBackground(new java.awt.Color(51, 51, 51));
        AvalibleLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AvalibleLbl.setForeground(new java.awt.Color(255, 255, 255));
        AvalibleLbl.setText("Avalible Games");

        AddGameBtn.setBackground(new java.awt.Color(51, 51, 51));
        AddGameBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AddGameBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddGameBtn.setText("Add a new game");
        AddGameBtn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                AddGameBtnMouseClicked(evt);
            }
        });

        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RefreshBtnActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(AddGameBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBtn))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(AvalibleLbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RefreshBtn)
                            .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(HelpBtn)
                        .addContainerGap())))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HelpBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AvalibleLbl)
                    .addComponent(RefreshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddGameBtn))
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
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BackBtnMouseClicked
    {//GEN-HEADEREND:event_BackBtnMouseClicked
        //closes current frame and opens the Homescreen
        this.dispose();
        new HomeScreen(outUser).setVisible(true);
    }//GEN-LAST:event_BackBtnMouseClicked

    private void AddGameBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AddGameBtnMouseClicked
    {//GEN-HEADEREND:event_AddGameBtnMouseClicked
        //closes current frame and opens add games frame
        this.dispose();
        new AddGame(outUser).setVisible(true);
    }//GEN-LAST:event_AddGameBtnMouseClicked

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RefreshBtnActionPerformed
    {//GEN-HEADEREND:event_RefreshBtnActionPerformed
        //reloads tabel
        if (outUser.isRestricted() == true)
        {
            AddGameBtn.setVisible(false);
            try
            {
                GamesTabel.setModel(DbUtils.resultSetToTableModel(link.ResGames()));
            } catch (SQLException ex)
            {
                Logger.getLogger(Games.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
        {
            try
            {
                GamesTabel.setModel(DbUtils.resultSetToTableModel(link.AllGames()));
            } catch (SQLException ex)
            {
                System.out.println("Something went Wrong");
            }
    }//GEN-LAST:event_RefreshBtnActionPerformed
    }
    private void GamesTabelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_GamesTabelMouseClicked
    {//GEN-HEADEREND:event_GamesTabelMouseClicked
        //gets selected row and in global library and give user the option to add it to thier personal lbrary
        int index = GamesTabel.getSelectedRow();
        int GameID = (int) GamesTabel.getModel().getValueAt(index, 0);
        String GameName = (String) GamesTabel.getModel().getValueAt(index, 1);

        try
        {
            //method to add game to Users personal library
            link.LibAdd(GameID, outUser, GameName);
        } catch (SQLException ex)
        {
            System.out.println("Something went wrong");
        }
    }//GEN-LAST:event_GamesTabelMouseClicked
//help button
    private void HelpBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_HelpBtnMouseClicked
    {//GEN-HEADEREND:event_HelpBtnMouseClicked
        JOptionPane.showMessageDialog(null, "this Screen allows you to add games to you library by clicking on them");
    }//GEN-LAST:event_HelpBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddGameBtn;
    private javax.swing.JLabel AvalibleLbl;
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JTable GamesTabel;
    private javax.swing.JLabel HelpBtn;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JScrollPane ScrollPane;
    // End of variables declaration//GEN-END:variables
}
