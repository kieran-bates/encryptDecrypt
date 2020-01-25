/*
 * Kieran Bates
 * January 25, 2020
 * This program encrypts and decrypts messages according to a specified character shift algorithm and also has the option to encrypt and decrypt using random character shifts
 */

package encryptionprogram;

/**
 *
 * @author kibat6204
 */
import java.util.Random;
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        encryptInput = new javax.swing.JTextField();
        encryptButton = new javax.swing.JButton();
        decryptOutput = new javax.swing.JTextField();
        decryptInput = new javax.swing.JTextField();
        decryptButton = new javax.swing.JButton();
        encryptOutput = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel1.setText("Encrypt/Decrypt");

        encryptInput.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        encryptInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        encryptButton.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        encryptButton.setText("Encrypt");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        decryptOutput.setEditable(false);
        decryptOutput.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        decryptOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        decryptInput.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        decryptInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        decryptButton.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        encryptOutput.setEditable(false);
        encryptOutput.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        encryptOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jToggleButton1.setText("Super Mode");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(225, 225, 225))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(decryptInput, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(decryptButton))
                        .addComponent(encryptOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(decryptOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(encryptInput, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(256, 256, 256)
                            .addComponent(encryptButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(encryptInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptButton)
                .addGap(18, 18, 18)
                .addComponent(decryptOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(decryptInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decryptButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean toggleMode = false;
    public String randomNumberMaster = "";
    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        if(toggleMode == false) //If super mode isn't selected
        {
        String message = encryptInput.getText(); //Store input in a variable
        
        int charNumber = 0;
        String encryptedMessage = ""; //Create a string for the encrypted message
        for(int i = 0; i<=message.length()-1; i++)//Loop for all characters in the original message
        {
            charNumber = (int)message.charAt(i);//Find the corresponding int for a character
            charNumber = charNumber+5; //Shift it by five
            encryptedMessage += (char)charNumber; //Store the shifted character in the encrypted message
        }
        
        decryptOutput.setText(encryptedMessage); //Show the encrypted message
        }
        
        if(toggleMode == true) //If super mode is activated
        {
            Random random = new Random();//Create a new random object
            String message = encryptInput.getText(); //Store the message to be encrypted in a string
            
            int charNumber = 0;
            int randomNumber = 0;
            String encryptedMessage = "";//Create a variable for the encrypted message
            int randomNumbers[] = new int[message.length()];//Create an array to store the random character shifts that were generated
            for(int i = 0; i<=message.length()-1; i++)//Shift every character
            {
                charNumber = (int)message.charAt(i);//Find the character number of a specific character
                randomNumber = random.nextInt(9);//generate a random shift factor
                charNumber = charNumber+randomNumber;//Randomly shift the character
                encryptedMessage += (char)charNumber;//Store the shifted character in the encrypted message variable
                randomNumberMaster += randomNumber;//Store the random shift number in a "key" variable for use in decryption
            }
            
            decryptOutput.setText(encryptedMessage);//Show the encrypted message in a text box
        }
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        
        if(toggleMode == false) //Everything here is the exact opposite of what is written above unless otherwise stated
        {
        String message = decryptInput.getText();
        
        int charNumber = 0;
        String decryptedMessage = "";
        for(int i = 0; i<=message.length()-1; i++)
        {
            charNumber = (int)message.charAt(i);
            charNumber = charNumber-5;//Shift the characters back to a decrypted state
            decryptedMessage += (char)charNumber;
        }
        
        encryptOutput.setText(decryptedMessage);
        }
        
        if(toggleMode == true)
        {
            String message = decryptInput.getText();
            
            int charNumber = 0;
            String decryptedMessage = "";
            for(int i = 0; i<=message.length()-1; i++)
            {
                charNumber = (int)message.charAt(i);
                charNumber = charNumber-Integer.parseInt(Character.toString(randomNumberMaster.charAt(i))); //Shift the characters back based on the random numbers stored in the "key"
                decryptedMessage += (char)charNumber;
            }
        
            encryptOutput.setText(decryptedMessage);
            randomNumberMaster = "";//Reset the key for the sequence of random numbers used to generate the original encryption
        }
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        if(toggleMode == true)
        {
            toggleMode = false;
        }
        if(toggleMode == false)
        {
            toggleMode = true;
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decryptButton;
    private javax.swing.JTextField decryptInput;
    private javax.swing.JTextField decryptOutput;
    private javax.swing.JButton encryptButton;
    private javax.swing.JTextField encryptInput;
    private javax.swing.JTextField encryptOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
