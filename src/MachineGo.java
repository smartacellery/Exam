
import javax.swing.JOptionPane;


public class MachineGo extends javax.swing.JFrame {

   Slotmachine slot1, slot2, slot3;
   int numtries, numquarters;
   
    public MachineGo() {
        initComponents();
        slot1=new Slotmachine(10,5,10);
        slot2= new Slotmachine(20,10,20);
        slot3=new Slotmachine(30,15,30);
        numtries=0;
        numquarters=0;
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblt1 = new javax.swing.JLabel();
        txteq = new javax.swing.JTextField();
        lbleq1 = new javax.swing.JLabel();
        lblt2 = new javax.swing.JLabel();
        lblt3 = new javax.swing.JLabel();
        lbtb = new javax.swing.JLabel();
        txtt1 = new javax.swing.JTextField();
        txtt2 = new javax.swing.JTextField();
        txtt3 = new javax.swing.JTextField();
        txttb = new javax.swing.JTextField();
        btngo = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblt1.setText("Times Since 1 Has Paid");

        txteq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteqActionPerformed(evt);
            }
        });

        lbleq1.setText("Enter Quarters");

        lblt2.setText("Times Since 2 Has Paid");

        lblt3.setText("Times Since 3 Has Paid");

        lbtb.setText("Tries until broke");

        txtt1.setText("              ");

        txtt2.setText("              ");

        txtt3.setText("              ");

        txttb.setText("              ");

        btngo.setText("Go");
        btngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(btngo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnclear)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblt1)
                            .addComponent(lblt2)
                            .addComponent(lbleq1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblt3))
                            .addComponent(lbtb))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txteq, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
                .addComponent(btnexit)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbleq1))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblt1)
                    .addComponent(txtt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblt2))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtb)
                    .addComponent(txttb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngo)
                    .addComponent(btnexit)
                    .addComponent(btnclear))
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoActionPerformed
       //int numquarters;
       try{
      numquarters=Integer.parseInt(txteq.getText());
  } catch(Exception e)
  {JOptionPane.showMessageDialog(this,"Must enter number of quarters");
  return;}
  if(numquarters<0){
  JOptionPane.showMessageDialog(this, "number of quarters must be positive");return;}
      // numquarters=Integer.parseInt(txteq.getText());
        while(numquarters>0){
          numquarters= slot1.playmachine(numquarters);
           numtries++;
          if (numquarters==0)break;
           numquarters=slot2.playmachine(numquarters);
           numtries++;
           if (numquarters==0)break;
           numquarters=slot3.playmachine(numquarters);
           numtries++;
           if (numquarters==0)break;}
    // txteq.setText(""+numquarters);
       txttb.setText(""+numtries);
       txtt1.setText(""+(slot1.getPayoutcycle() -slot1.getTimetillnextpay()));
       txtt2.setText(""+(slot2.getPayoutcycle() -slot2.getTimetillnextpay()));
       txtt3.setText(""+(slot3.getPayoutcycle()-slot3.getTimetillnextpay()));
       numquarters=0;
       btngo.setEnabled(false);

    }//GEN-LAST:event_btngoActionPerformed

    private void txteqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteqActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
System.exit(0);      
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
numquarters=0;
numtries=0;
slot1.setTimetillnextpay(10);
slot2.setTimetillnextpay(20);
slot3.setTimetillnextpay(30);
txteq.setText("");
       txttb.setText("");
       txtt1.setText("");
       txtt2.setText("");
       txtt3.setText("");
 btngo.setEnabled(true);      
    }//GEN-LAST:event_btnclearActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(MachineGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MachineGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MachineGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MachineGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MachineGo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btngo;
    private javax.swing.JLabel lbleq1;
    private javax.swing.JLabel lblt1;
    private javax.swing.JLabel lblt2;
    private javax.swing.JLabel lblt3;
    private javax.swing.JLabel lbtb;
    private javax.swing.JTextField txteq;
    private javax.swing.JTextField txtt1;
    private javax.swing.JTextField txtt2;
    private javax.swing.JTextField txtt3;
    private javax.swing.JTextField txttb;
    // End of variables declaration//GEN-END:variables
}
