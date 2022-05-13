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
public class LibraryEdit extends javax.swing.JFrame
{

    User_Data User;
    MLProDBManager link = new MLProDBManager();

    public LibraryEdit(User_Data outUser)
    {
        initComponents();
        //settting frame to open cemter Screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
        //populating user Object
        User = outUser;
        //populating table
        try
        {
            tblEdit.setModel(DbUtils.resultSetToTableModel(link.getLib(User)));
        } catch (SQLException ex)
        {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEdit = new javax.swing.JTable();
        Label = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        HelpBtn = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));

        tblEdit = new javax.swing.JTable()
        {
            public boolean isCellEditable (int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tblEdit.setBackground(new java.awt.Color(51, 51, 51));
        tblEdit.setForeground(new java.awt.Color(255, 255, 255));
        tblEdit.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEdit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblEditMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEdit);

        Label.setBackground(new java.awt.Color(51, 51, 51));
        Label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Remove/Favourite Games");

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

        HelpBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label)))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        //closes frame and goes back to home screen
        this.dispose();
        new HomeScreen(User).setVisible(true);
    }//GEN-LAST:event_BackBtnMouseClicked

    private void tblEditMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblEditMouseClicked
    {//GEN-HEADEREND:event_tblEditMouseClicked
        //getting rown index and  game id
        int RIndex = tblEdit.getSelectedRow();
        int GameID = (int) tblEdit.getValueAt(RIndex, 0);

        // arrays to store options for option dialog
        String[] RemoveFav =
        {
            "Make Favourite", "Remove"
        };
        String[] MakeRemove =
        {
            "Make Favourite", "Un-Favrouite "
        };
        //options for switch
        int Ops = JOptionPane.showOptionDialog(null, "Add to Favourites or Delete ",
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, RemoveFav, RemoveFav[0]);

        switch (Ops)
        {
            case 0:
                //fav/unfav game
                int FavOps = JOptionPane.showOptionDialog(null, "Add to Favourites or Remove From Favourites ",
                        "",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, MakeRemove, MakeRemove[0]);
                {
                    try
                    {
                        //favroute/ unfavrouiting game and refreshing tabel
                        link.MakeFav(User.getUserID(), GameID, FavOps);
                        tblEdit.setModel(DbUtils.resultSetToTableModel(link.getLib(User)));
                    } catch (SQLException ex)
                    {
                        System.out.println("Something went wrong");
                    }
                }
                break;
            case 1:
            {
                try
                {
                    //removing game and refreshing tabel
                    link.RemoveGame(User.getUserID(), GameID);
                    tblEdit.setModel(DbUtils.resultSetToTableModel(link.getLib(User)));
                } catch (SQLException ex)
                {
                    System.out.println("Somthing went wrong");
                }
            }
            break;
        }

    }//GEN-LAST:event_tblEditMouseClicked
//help button
    private void HelpBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_HelpBtnMouseClicked
    {//GEN-HEADEREND:event_HelpBtnMouseClicked
        JOptionPane.showMessageDialog(null, "this Screen allows you to add games to your favorites and remove games from your library");
    }//GEN-LAST:event_HelpBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel HelpBtn;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEdit;
    // End of variables declaration//GEN-END:variables
}
