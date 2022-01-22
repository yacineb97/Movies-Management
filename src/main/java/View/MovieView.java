/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import Control.Movie;
import Model.MovieEntity;
public class MovieView extends javax.swing.JFrame {

    /**
     * Creates new form MovieView
    public MovieView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textT = new javax.swing.JTextField();
        textG = new javax.swing.JTextField();
        textA = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajouter un Film");
        setPreferredSize(new java.awt.Dimension(600, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add  a Movie");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 20, 210, 43);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Title       :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 100, 90, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Genre     :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 190, 90, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Year    :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 280, 90, 22);

        textT.setBackground(new java.awt.Color(204, 0, 0));
        textT.setForeground(new java.awt.Color(255, 255, 255));
        textT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTActionPerformed(evt);
            }
        });
        getContentPane().add(textT);
        textT.setBounds(150, 100, 230, 30);

        textG.setBackground(new java.awt.Color(204, 0, 0));
        textG.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textG);
        textG.setBounds(150, 190, 230, 30);

        textA.setBackground(new java.awt.Color(204, 0, 0));
        textA.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textA);
        textA.setBounds(150, 280, 230, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 350, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\YACINE BLN\\Desktop\\Movies-Management\\src\\main\\java\\Images\\Cinema-Popcorn-Box-1000-ConvertImage.jpg")); // NOI18N
        jLabel1.setLabelFor(jLabel1);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 600, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String titre = textT.getText().toString();
        String genre = textG.getText().toString();
        String a = textA.getText().toString();
        int année = Integer.valueOf(a);
        Movie f = new Movie(titre,année, genre );
        MovieEntity fe = new MovieEntity();
        
        fe.addFilm(f);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textA;
    private javax.swing.JTextField textG;
    private javax.swing.JTextField textT;
    // End of variables declaration//GEN-END:variables
}
