/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author faetec
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        JLlogin = new javax.swing.JLabel();
        JLsenha = new javax.swing.JLabel();
        JBlogar = new javax.swing.JButton();
        JTFlogin = new javax.swing.JTextField();
        JTFsenha = new javax.swing.JPasswordField();
        JBvisivel = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLlogin.setText("Usuário:");

        JLsenha.setText("Senha:");

        JBlogar.setText("Logar");
        JBlogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlogarActionPerformed(evt);
            }
        });
        JBlogar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JBlogarKeyPressed(evt);
            }
        });

        JTFlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFloginActionPerformed(evt);
            }
        });
        JTFlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFloginKeyPressed(evt);
            }
        });

        JBvisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBvisivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(JBlogar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLsenha)
                            .addComponent(JLlogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTFsenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFlogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBvisivel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLlogin))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLsenha)
                    .addComponent(JTFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBvisivel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(JBlogar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFloginKeyPressed
        // TODO add your handling code here:
        //muda o foco do teclado para a senha, após preencher o login
        
        if(evt.getKeyCode() == evt.VK_ENTER)
        
            JTFsenha.requestFocus();
        
    }//GEN-LAST:event_JTFloginKeyPressed

    private void JTFloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFloginActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_JTFloginActionPerformed

    private void JBlogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlogarActionPerformed
        // TODO add your handling code here:
        String login = JTFlogin.getText();
        String senha = JTFsenha.getText();
        
        
         //compara a senha e o login, se forem corretos, executa o menuinicial,
        //se forem errados, aparece a mensagem de erro, limpa os JTextFields e
        //volta o foco para o campo de login, e se forem vazios, aparece a mensagem de erro
        if((login.isEmpty())||(senha.isEmpty())){
        JOptionPane.showMessageDialog(null, "PREENCHA OS CAMPOS!");
        JTFlogin.setText("");
        JTFsenha.setText("");
        }
        else{
            if(((JTFlogin.getText()).equals("admin"))&&((JTFsenha.getText()).equals("admin123"))){

                menuinicial menuinicial = new menuinicial();
                menuinicial.setVisible(true); 
                login.this.dispose();
            }

            else{
                JOptionPane.showMessageDialog(null, "SENHA OU LOGIN INCORRETOS!");
                JTFlogin.requestFocus();
                JTFlogin.setText("");
                JTFsenha.setText("");
            }  
        }
    }//GEN-LAST:event_JBlogarActionPerformed

    private void JBlogarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBlogarKeyPressed
        // TODO add your handling code here:
        //cria as variáveis "login" e "senha", para armazenarem o texto dos jtextfields
        String login = JTFlogin.getText();
        String senha = JTFsenha.getText();
        if(evt.getKeyCode() == evt.VK_ENTER){
        
         //compara a senha e o login, se forem corretos, executa o menuinicial,
        //se forem errados, aparece a mensagem de erro, limpa os JTextFields e
        //volta o foco para o campo de login, e se forem vazios, aparece a mensagem de erro
        if((login.isEmpty())||(senha.isEmpty())){
            JOptionPane.showMessageDialog(null, "PREENCHA OS CAMPOS!");
            JTFlogin.setText("");
            JTFsenha.setText("");
        }
            else{
                if(((JTFlogin.getText()).equals("admin"))&&((JTFsenha.getText()).equals("admin123"))){

                    menuinicial menuinicial = new menuinicial();
                    menuinicial.setVisible(true); 
                    login.this.dispose();
                }

                else{
                    JOptionPane.showMessageDialog(null, "SENHA OU LOGIN INCORRETOS!");
                    JTFlogin.requestFocus();
                    JTFlogin.setText("");
                    JTFsenha.setText("");
                } 
        }
        }  
    }//GEN-LAST:event_JBlogarKeyPressed

    private void JBvisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBvisivelActionPerformed
        // TODO add your handling code here:
         //ao apertar o botão, a senha fica visível
        char echoChar = JTFsenha.getEchoChar();
        if (echoChar == 0) {
            JTFsenha.setEchoChar('*');
        } else {
            JTFsenha.setEchoChar((char) 0);
        }
    
            
    }//GEN-LAST:event_JBvisivelActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBlogar;
    private javax.swing.JToggleButton JBvisivel;
    private javax.swing.JLabel JLlogin;
    private javax.swing.JLabel JLsenha;
    private javax.swing.JTextField JTFlogin;
    private javax.swing.JPasswordField JTFsenha;
    // End of variables declaration//GEN-END:variables
}
