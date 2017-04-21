/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebankingsystemcwk;

//import static e_bankingsystem.Controller.ParseDouble;
//import static e_bankingsystem.Controller.ParseDouble;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddCustomerUI extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomerUI() {
        initComponents();
    }

    /**
     * Set customer Name To access customer name from slectCustomerPage
     *
     * @param cusName
     */
    public void setCusName(String cusName) {
        this.nameTxt.setText(cusName);
    }

    /**
     * Get customer name
     *
     * @return
     */
    public String getCusName() {
        return this.nameTxt.getText();
    }

    /**
     * Set Account Number To access accountNumber from slectCustomerPage
     *
     * @param accNumber
     */
    public void setAccNumber(String accNumber) {
        this.accountNoTxt.setText(accNumber);
    }

    /**
     *
     * @return
     */
    public String getAccNumber() {
        return this.accountNoTxt.getText();
    }

    /**
     * SET BIRTHDATE To access birthdate from selectCustomerPage
     *
     * @param birthdate
     */
    public void setBirthdate(String birthdate) {
        this.birthdateTxt.setText(birthdate);
    }

    /**
     * SET ADDRESS
     *
     * @param address
     */
    public void setAddress(String address) {
        this.addressTxt.setText(address);
    }

    /**
     * SET EMAIL ADDRESS
     *
     * @param email
     */
    public void setEmail(String email) {
        this.emailTxt.setText(email);
    }

    /**
     * SET MOBILE NO
     *
     * @param mobileNo
     */
    public void setMobileNo(String mobileNo) {
        this.mobileTxt.setText(mobileNo);
    }

    /**
     * SET ACCOUNT TYPE
     *
     * @param accType
     */
    public void setAccountType(String accType) {
        this.accTypeTxt.setText(accType);
    }

    /**
     * SET SORTCODE
     *
     * @param sortCode
     */
    public void setSortCode(String sortCode) {
        this.sortCodeTxt.setText(sortCode);
    }

    /**
     * SET BALANCE
     *
     * @param balance
     */
    public void setBalance(String balance) {
        this.balanceTxt.setText(balance);
    }

    /**
     * SET CARD
     *
     * @param card
     */
    public void setCard(String card) {
        this.cardTxt.setText(card);
    }

    /**
     * METHOD TO DISABLE THAT TEXT FIELD READ ONLY BANK EMPLOYEE CAN'T CHANGE
     * NAME OF THE CUSTOMER AND ACCOUNT NUMBER
     *
     * @param flag
     */
    public void changeStateOfTextFields(boolean flag) {
        nameTxt.setEditable(flag);
        accountNoTxt.setEditable(flag);
    }

    /**
     * METHOD TO DISABLE CREATE BUTTON WHILE USER EDIT OR DELETE EXISTING
     * CUSTOMER
     *
     * @param flag
     */
    public void changeStateOfButton(boolean flag) {

        createBtn.setEnabled(flag);

    }
    
   public void changeStateOfEditDeleteBtn(boolean flag){
       editBtn.setEnabled(flag);
       deleteBtn.setEnabled(flag);
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        birthdateTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mobileTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        accTypeTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        accountNoTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sortCodeTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        balanceTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cardTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("AvenirNext LT Pro Cn", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Account");

        jLabel13.setFont(new java.awt.Font("AvenirNext LT Pro Bold", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("HIGH STREET BANK");

        jLabel2.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name *");

        jLabel3.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Birthdate (YYYY-MM-DD)*");

        jLabel4.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address*");

        jLabel6.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile*");

        jLabel7.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email*");

        jLabel8.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Account Type*");

        jLabel9.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Account Number*");

        jLabel10.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sort code*");

        jLabel11.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Balance*");

        jLabel12.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Card");

        createBtn.setFont(new java.awt.Font("AvenirNext LT Pro Bold", 0, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("AvenirNext LT Pro Bold", 0, 18)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("AvenirNext LT Pro Bold", 0, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("AvenirNext LT Pro Bold", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(createBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editBtn)
                .addGap(85, 85, 85)
                .addComponent(deleteBtn)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cardTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editBtn)
                        .addComponent(createBtn))
                    .addComponent(deleteBtn))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Give action to create button
     * @param evt 
     */
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        try {
            String name = nameTxt.getText();
            String birthdate = birthdateTxt.getText();
            String address = addressTxt.getText();
            String mobile = mobileTxt.getText();
            String email = emailTxt.getText();
            String accType = accTypeTxt.getText();
            String accNumber = accountNoTxt.getText();
            String sortCode = sortCodeTxt.getText();
            Double balance = Double.valueOf(balanceTxt.getText());
            String card = cardTxt.getText();
            
            
            
            //validates all the mandatory fields
            if (validateFormContents(name, birthdate, address, mobile, email, accType, accNumber, sortCode, card) == false) {
                JOptionPane.showMessageDialog(null, "Please fill all the mandatory fields","ERROR",JOptionPane.ERROR_MESSAGE);
            }else if(parseDouble(balanceTxt.getText())== 1){
                JOptionPane.showMessageDialog(null, "Please fill some amount");
                //validate birthdate format
            } else if (validateDate(birthdate) == false) {
                  JOptionPane.showMessageDialog(null,"Please check date format!!!The format must be YYYY-MM-DD","ERROR",JOptionPane.ERROR_MESSAGE);
                birthdateTxt.setText(" ");
            }else if(validateAccountNo(accNumber)==false){
                JOptionPane.showMessageDialog(null, "Account number is already exisiting","ERROR",JOptionPane.ERROR_MESSAGE);
                accountNoTxt.setText(" ");
            } else {
                addCustomer(name, birthdate, address, mobile, email, accType, accNumber, sortCode, balance, card);
                JOptionPane.showMessageDialog(null, "Successfully added");
                clearText();
                CustomerListPage list=new CustomerListPage();
                setVisible(false);
                list.setVisible(true);
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
            //clearText();
        }


    }//GEN-LAST:event_createBtnActionPerformed
    
    /**
     * Give action to edit button
     * @param evt 
     */
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            String cusName=nameTxt.getText();
            String birthdate=birthdateTxt.getText();
            String address=addressTxt.getText();
            String mobile=mobileTxt.getText();
            String email=emailTxt.getText();
            String accType=accTypeTxt.getText();
            String accNumber=accountNoTxt.getText();
            String sortCode=sortCodeTxt.getText();
            double balance = Double.valueOf(balanceTxt.getText());
            String card = cardTxt.getText();
            if (validateFormContents(cusName, birthdate, address, mobile, email, accType, accNumber, sortCode, card) == false) {
            }else if(parseDouble(balanceTxt.getText())== 1){
                JOptionPane.showMessageDialog(null, "Please fill some ammount","ERROR",JOptionPane.ERROR_MESSAGE);
                //validate birthdate format
            } else if (validateDate(birthdate) == false) {
                JOptionPane.showMessageDialog(null,"Please check date format!!!The format must be YYYY-MM-DD","ERROR",JOptionPane.ERROR_MESSAGE);
                birthdateTxt.setText(" ");
                
            } else {
                updateCustomerDetails(cusName, birthdate, address, mobile, email, accType, accNumber, sortCode, balance, card);
                JOptionPane.showMessageDialog(null, "updated");
                CustomerListPage selectCustomer=new CustomerListPage();
                setVisible(false);
                selectCustomer.setVisible(true);
            }
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editBtnActionPerformed
    
    /**
     * Give Action to delete button
     * @param evt 
     */
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String accNumber=accountNoTxt.getText();
        deleteCustomer(accNumber);
        JOptionPane.showMessageDialog(null, "Deleted");
        CustomerListPage selectCustomer=new CustomerListPage();
        setVisible(false);
        selectCustomer.setVisible(true);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       CustomerListPage listPage=new CustomerListPage();
       setVisible(false);
       listPage.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void clearText() {
        nameTxt.setText(" ");
        birthdateTxt.setText(" ");
        addressTxt.setText("");
        mobileTxt.setText(" ");
        emailTxt.setText("");
        accTypeTxt.setText("");
        accountNoTxt.setText("");
        sortCodeTxt.setText("");
        balanceTxt.setText("");
        cardTxt.setText("");
    }
    

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddCustomerUI().setVisible(true);
//            }
//        });
//    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accTypeTxt;
    private javax.swing.JTextField accountNoTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField balanceTxt;
    private javax.swing.JTextField birthdateTxt;
    private javax.swing.JTextField cardTxt;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField sortCodeTxt;
    // End of variables declaration//GEN-END:variables

    private static void addCustomer(java.lang.String cusName, java.lang.String birthdate, java.lang.String address, java.lang.String mobileNo, java.lang.String email, java.lang.String accType, java.lang.String accNumber, java.lang.String sortCode, double balance, java.lang.String card) {
        ebankingsystemCustomer.EBankingCustomerWs_Service service = new ebankingsystemCustomer.EBankingCustomerWs_Service();
        ebankingsystemCustomer.EBankingCustomerWs port = service.getEBankingCustomerWsPort();
        port.addCustomer(cusName, birthdate, address, mobileNo, email, accType, accNumber, sortCode, balance, card);
    }

    private static void deleteCustomer(java.lang.String accNumber) {
        ebankingsystemCustomer.EBankingCustomerWs_Service service = new ebankingsystemCustomer.EBankingCustomerWs_Service();
        ebankingsystemCustomer.EBankingCustomerWs port = service.getEBankingCustomerWsPort();
        port.deleteCustomer(accNumber);
    }

    private static double parseDouble(java.lang.String strNumber) {
        ebankingsystemCustomer.EBankingCustomerWs_Service service = new ebankingsystemCustomer.EBankingCustomerWs_Service();
        ebankingsystemCustomer.EBankingCustomerWs port = service.getEBankingCustomerWsPort();
        return port.parseDouble(strNumber);
    }

    private static void updateCustomerDetails(java.lang.String cusName, java.lang.String birthdate, java.lang.String address, java.lang.String mobileNo, java.lang.String email, java.lang.String accType, java.lang.String accNumber, java.lang.String sortCode, double balance, java.lang.String card) {
        ebankingsystemCustomer.EBankingCustomerWs_Service service = new ebankingsystemCustomer.EBankingCustomerWs_Service();
        ebankingsystemCustomer.EBankingCustomerWs port = service.getEBankingCustomerWsPort();
        port.updateCustomerDetails(cusName, birthdate, address, mobileNo, email, accType, accNumber, sortCode, balance, card);
    }

    private static boolean validateAccountNo(java.lang.String accNumber) {
        ebankingsystemCustomer.EBankingCustomerWs_Service service = new ebankingsystemCustomer.EBankingCustomerWs_Service();
        ebankingsystemCustomer.EBankingCustomerWs port = service.getEBankingCustomerWsPort();
        return port.validateAccountNo(accNumber);
    }

    private static boolean validateDate(java.lang.String date) {
        ebankingsystemCustomer.EBankingCustomerWs_Service service = new ebankingsystemCustomer.EBankingCustomerWs_Service();
        ebankingsystemCustomer.EBankingCustomerWs port = service.getEBankingCustomerWsPort();
        return port.validateDate(date);
    }

    private static boolean validateFormContents(java.lang.String cusName, java.lang.String birthdate, java.lang.String address, java.lang.String mobileNo, java.lang.String email, java.lang.String accType, java.lang.String accNumber, java.lang.String sortCode, java.lang.String card) {
        ebankingsystemCustomer.EBankingCustomerWs_Service service = new ebankingsystemCustomer.EBankingCustomerWs_Service();
        ebankingsystemCustomer.EBankingCustomerWs port = service.getEBankingCustomerWsPort();
        return port.validateFormContents(cusName, birthdate, address, mobileNo, email, accType, accNumber, sortCode, card);
    }

    

    
    
}
