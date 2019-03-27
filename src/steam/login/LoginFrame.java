package steam.login;


import steam.listener.FrameDragListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;
import steam.connection.DBContext;
import steam.mainframe.SteamMainFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MemeLord
 */
public class LoginFrame extends javax.swing.JFrame {

    FrameDragListener fdl;
    DBContext db;
    Connection con;
    public LoginFrame() {
        this.setUndecorated(true); //remove title bar
        centreWindow(this); //make window centre
        makeDraggableWindow(); //make frame become draggable
        this.setIconImage(addImage("steam-square-512.png", 100, 100).getImage());
        initComponents();
        steamIcon.setIcon(addImage("steam-square-512.png", 50, 50));
        passField.setEchoChar('•');
        accField.setFocusable(true);
        try {
            connectDatabase();
        } catch (Exception ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void connectDatabase() throws Exception
    {
        db = new DBContext("localhost", "SteamDatabase", 1433, "sa", "123");
        con = db.getConnection();
    }
    private void makeDraggableWindow()
    {
        fdl = new FrameDragListener(this);
        this.addMouseListener(fdl);
        this.addMouseMotionListener(fdl);
    }
    private void centreWindow(Window frame)
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    private ImageIcon addImage(String src,int width,int height)
    {
        ImageIcon imageIcon = new ImageIcon(src);
        Image i = imageIcon.getImage();
        Image newImage = i.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImage);
        return imageIcon;
    }
    protected void setLineBorderFocus(Color c,int width,JTextComponent j)
    {
        Border b = new LineBorder(c,width);
        j.setBorder(b);
    }
    protected void setLabelFocus(Color c,JComponent j)
    {
        j.setForeground(c);
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
        steamLabel = new javax.swing.JLabel();
        steamIcon = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        accField = new javax.swing.JTextField();
        accountLabel = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        steamLoginTitle = new javax.swing.JLabel();
        loginButton = new java.awt.Button();
        cancelButton = new java.awt.Button();
        jSeparator2 = new javax.swing.JSeparator();
        createNewAccoutButton = new java.awt.Button();
        passwordLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        steamLabel.setBackground(new java.awt.Color(204, 204, 204));
        steamLabel.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        steamLabel.setForeground(new java.awt.Color(204, 204, 204));
        steamLabel.setText("STEAM");

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setForeground(new java.awt.Color(153, 153, 153));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        accField.setBackground(new java.awt.Color(51, 51, 51));
        accField.setForeground(new java.awt.Color(153, 153, 153));
        accField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        accField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        accField.setSelectionColor(new java.awt.Color(204, 204, 204));
        accField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accFieldFocusLost(evt);
            }
        });
        accField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accFieldActionPerformed(evt);
            }
        });

        accountLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accountLabel.setForeground(new java.awt.Color(102, 102, 102));
        accountLabel.setText("Account name");

        minimizeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimizeButton.setForeground(new java.awt.Color(153, 153, 153));
        minimizeButton.setText("-");
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });

        passField.setBackground(new java.awt.Color(51, 51, 51));
        passField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passField.setForeground(new java.awt.Color(204, 204, 204));
        passField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        passField.setSelectionColor(new java.awt.Color(204, 204, 204));
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passwordLabel.setText("Password");

        steamLoginTitle.setForeground(new java.awt.Color(204, 204, 204));
        steamLoginTitle.setText("Steam login");

        loginButton.setBackground(new java.awt.Color(102, 102, 102));
        loginButton.setForeground(new java.awt.Color(204, 204, 204));
        loginButton.setLabel("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(102, 102, 102));
        cancelButton.setForeground(new java.awt.Color(204, 204, 204));
        cancelButton.setLabel("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));

        createNewAccoutButton.setBackground(new java.awt.Color(102, 102, 102));
        createNewAccoutButton.setForeground(new java.awt.Color(204, 204, 204));
        createNewAccoutButton.setLabel("CREATE A NEW ACCOUNT");
        createNewAccoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewAccoutButtonActionPerformed(evt);
            }
        });

        passwordLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(204, 204, 204));
        passwordLabel1.setText("Don't have a steam account?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(steamIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(steamLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(accountLabel)
                                            .addComponent(passwordLabel))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passField)
                                            .addComponent(accField)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(steamLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(passwordLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createNewAccoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minimizeButton)
                        .addComponent(closeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(steamLoginTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(steamLabel))
                            .addComponent(steamIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLabel)
                    .addComponent(accField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createNewAccoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
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

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        String getUser="";
        String getPass="";
        try {
            PreparedStatement st = this.con.prepareCall("Select username,password from dbo.Account where username='"+accField.getText()+"' and password='"+passField.getText()+"'");

            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                getUser = rs.getString(1);
                getPass = rs.getString(2);
            }
            if(getUser.equals("")||getPass.equals(""))
            {
                ErrorDialog err = new ErrorDialog(this, true);
                err.setContent("Wrong username or password");
                err.setVisible(true);
                return;
            }
            System.out.println("Login successful: "+getUser);
            
            SteamMainFrame smf = new SteamMainFrame();
            smf.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
        Color c = new Color(102, 102, 102);
        setLineBorderFocus(c, 1, passField);
        setLabelFocus(c, passwordLabel);
    }//GEN-LAST:event_passFieldFocusLost

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
        Color c = new Color(204, 204, 204);
        setLineBorderFocus(c, 1, passField);
        setLabelFocus(c, passwordLabel);
    }//GEN-LAST:event_passFieldFocusGained

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void accFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accFieldActionPerformed

    private void accFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accFieldFocusLost
        Color c = new Color(102, 102, 102);
        setLineBorderFocus(c, 1, accField);
        setLabelFocus(c, accountLabel);
    }//GEN-LAST:event_accFieldFocusLost

    private void accFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accFieldFocusGained
        Color c = new Color(204, 204, 204);
        setLineBorderFocus(c, 1, accField);
        setLabelFocus(c, accountLabel);

    }//GEN-LAST:event_accFieldFocusGained

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void createNewAccoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewAccoutButtonActionPerformed
         CreateNewAccountDialog dialog = new CreateNewAccountDialog(this, true);
         dialog.setVisible(true);
    }//GEN-LAST:event_createNewAccoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accField;
    private javax.swing.JLabel accountLabel;
    private java.awt.Button cancelButton;
    private javax.swing.JLabel closeButton;
    private java.awt.Button createNewAccoutButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Button loginButton;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel steamIcon;
    private javax.swing.JLabel steamLabel;
    private javax.swing.JLabel steamLoginTitle;
    // End of variables declaration//GEN-END:variables
}
