package MultiLaunchPro;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

/**
 *
 * @author Sameer Otham
 */
public class getDirec extends javax.swing.JFrame
{

    User_Data outUser;
    String Direc = "";

    public getDirec(User_Data User)
    {
        initComponents();
        //setting frame to open center screen
        Dimension SetLocat = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(SetLocat.width / 2 - this.getSize().width / 2, SetLocat.height / 2 - this.getSize().height / 2);
        //populating user object
        outUser = User;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        JExplorer = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JExplorer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JExplorerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JExplorer, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JExplorer, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JExplorerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JExplorerActionPerformed
    {//GEN-HEADEREND:event_JExplorerActionPerformed
       // instantiating AddGame frame
        AddGame AG = new AddGame(outUser);
        //getting selected file
        File selected = JExplorer.getSelectedFile();
       //closing frame if nothing is selected 
        if (this.isValid() == true)
        {
            this.dispose();
            AG.setVisible(true);
        } else
        {
            //getting path of file
            Direc = Direc + selected.getAbsolutePath();
            //setting Add games frame visible with direcroty populated
            AG.setVisible(true);
            AG.JDirec.setText(Direc);
            System.out.println(AG.JDirec.getText());
            this.dispose();
        }
    }//GEN-LAST:event_JExplorerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFileChooser JExplorer;
    // End of variables declaration//GEN-END:variables
}
