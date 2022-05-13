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
public class ResGames extends javax.swing.JFrame
{

    User_Data User;
    MLProDBManager link = new MLProDBManager();

    public ResGames(User_Data outUser)
    {
        initComponents();
        //setting frame to open center screen and to be unresizeable
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
        this.setResizable(false);
        //populating user ibject
        User = outUser;
        try
        {
            //populating tgabel
            AllGames.setModel(DbUtils.resultSetToTableModel(link.AllGames()));
        } catch (SQLException ex)
        {
            System.out.println("Something went wrongx");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllGames = new javax.swing.JTable();
        Label = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        HelpBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));

        //makes tabel uneditable
        AllGames = new javax.swing.JTable()
        {
            public boolean isCellEditable (int rowIndex, int colIndex)
            {
                return false;
            }
        };
        AllGames.setBackground(new java.awt.Color(51, 51, 51));
        AllGames.setForeground(new java.awt.Color(255, 255, 255));
        AllGames.setModel(new javax.swing.table.DefaultTableModel(
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
        AllGames.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                AllGamesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AllGames);

        Label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Restirct And Unrestrict Games");

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
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(Label))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BackBtn))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 69, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BackBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BackBtnMouseClicked
    {//GEN-HEADEREND:event_BackBtnMouseClicked
        //closes frame and open home screen frame
        this.dispose();
        new HomeScreen(User).setVisible(true);
    }//GEN-LAST:event_BackBtnMouseClicked

    private void AllGamesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AllGamesMouseClicked
    {//GEN-HEADEREND:event_AllGamesMouseClicked
        //getting row index and game ID
        int rowIndex = AllGames.getSelectedRow();
        int GameID = (int) AllGames.getValueAt(rowIndex, 0);
        // array to store options
        String[] Ops =
        {
            "Restrict", "Unrestrict"
        };
        //option dialog
        int ResUnRes = JOptionPane.showOptionDialog(null, "Add to Favourites or Delete ",
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Ops, Ops[0]);
        //  running method and refreshing tabel
        try
        {
            link.RestrictGame(GameID, ResUnRes);
            AllGames.setModel(DbUtils.resultSetToTableModel(link.AllGames()));
        } catch (SQLException ex)
        {
            System.out.println("Something went wrong");
        }
    }//GEN-LAST:event_AllGamesMouseClicked
//help button
    private void HelpBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_HelpBtnMouseClicked
    {//GEN-HEADEREND:event_HelpBtnMouseClicked
            JOptionPane.showMessageDialog(null,"this Screen allows you set which games are restricted by clicking on them");
    }//GEN-LAST:event_HelpBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllGames;
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel HelpBtn;
    private javax.swing.JLabel Label;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
