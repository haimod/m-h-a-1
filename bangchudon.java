/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bai2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ADMIN
 */
public class bangchudon extends javax.swing.JFrame {

    /**
     * Creates new form bangchudon
     */
    public bangchudon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Ramdom Key");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Encryption");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Decryption");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Key");

        jLabel2.setText("Key");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("Key\n");

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        // Generate a random key with 25 uppercase letters
        
    
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        // Tạo ra một key ngẫu nhiên với 25 chữ cái viết hoa
    StringBuilder key = new StringBuilder();
    for (int i = 0; i < 25; i++) {
        char randomChar = (char) (Math.random() * 26 + 'a');
        key.append(randomChar);
    }

    // Gán key vừa tạo vào hai trường văn bản
    jTextField2.setText(key.toString());
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
                                           
    // Lấy văn bản từ jTextArea1 (văn bản gốc)
    String inputText = jTextArea1.getText();

    // Lấy key từ jTextField1 và jTextField2
    String key1 = jTextField1.getText();
    String key2 = jTextField2.getText();

    // Kiểm tra nếu cả hai trường key đều chứa giá trị
    if (!key1.isEmpty() && !key2.isEmpty()) {
        jTextArea2.setText("Bạn cần xóa một trong hai key.");
        return;
    }

    // Sử dụng key từ jTextField1 hoặc jTextField2 nếu jTextField1 trống
    String key = key1.isEmpty() ? key2 : key1;

    // Kiểm tra nếu key trống
    if (key.isEmpty()) {
        jTextArea2.setText("Key không được để trống.");
        return;
    }

    // Chuyển key và văn bản thành chữ hoa để dễ xử lý
    key = key.toUpperCase();
    inputText = inputText.toUpperCase();

    // Bảng chữ cái gốc
    String originalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    // Tạo StringBuilder để lưu kết quả mã hóa
    StringBuilder encryptedText = new StringBuilder();

    // Lặp qua từng ký tự của inputText và mã hóa
    int keyIndex = 0;
    for (char ch : inputText.toCharArray()) {
        if (Character.isLetter(ch)) {
            // Tìm vị trí của ký tự trong bảng chữ cái gốc
            int index = originalAlphabet.indexOf(ch);

            // Nếu tìm thấy vị trí hợp lệ trong bảng chữ cái gốc
            if (index != -1) {
                // Sử dụng ký tự từ key để mã hóa, lặp lại key nếu cần
                int keyShift = originalAlphabet.indexOf(key.charAt(keyIndex % key.length()));

                // Thực hiện dịch chuyển ký tự theo key
                char encryptedChar = originalAlphabet.charAt((index + keyShift) % 26);

                // Thêm ký tự đã mã hóa vào kết quả
                encryptedText.append(encryptedChar);

                // Tăng keyIndex để lặp lại key khi cần
                keyIndex++;
            }
        } else {
            // Giữ nguyên ký tự không phải chữ cái
            encryptedText.append(ch);
        }
    }

    // Chuyển văn bản đã mã hóa thành chữ thường
    String encryptedTextLowerCase = encryptedText.toString().toLowerCase();

    // Hiển thị văn bản đã mã hóa xuống jTextArea2 dưới dạng chữ thường
    jTextArea2.setText(encryptedTextLowerCase);
}


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
            java.util.logging.Logger.getLogger(bangchudon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bangchudon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bangchudon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bangchudon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bangchudon().setVisible(true);
            }
        });
    
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
                                             
    // Lấy văn bản từ jTextArea1
    String inputText = jTextArea1.getText();

    // Lấy key từ jTextField3
    String key = jTextField3.getText();

    // Kiểm tra nếu key trống
    if (key.isEmpty()) {
        jTextArea2.setText("Key không được để trống.");
        return;
    }

    // Chuyển key và văn bản thành chữ hoa để dễ xử lý
    key = key.toUpperCase();
    inputText = inputText.toUpperCase();

    // Bảng chữ cái gốc
    String originalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    // Tạo StringBuilder để lưu kết quả mã hóa
    StringBuilder decryptedText = new StringBuilder();

    // Lặp qua từng ký tự của inputText và giải mã
    int keyIndex = 0;
    for (char ch : inputText.toCharArray()) {
        if (Character.isLetter(ch)) {
            // Tìm vị trí của ký tự trong bảng chữ cái gốc
            int index = originalAlphabet.indexOf(ch);

            // Nếu tìm thấy vị trí hợp lệ trong bảng chữ cái gốc
            if (index != -1) {
                // Sử dụng ký tự từ key để giải mã, lặp lại key nếu cần
                int keyShift = originalAlphabet.indexOf(key.charAt(keyIndex % key.length()));

                // Thực hiện dịch chuyển ngược ký tự theo key
                int decryptedIndex = index - keyShift;

                // Kiểm tra nếu decryptedIndex âm thì cộng thêm 26
                if (decryptedIndex < 0) {
                    decryptedIndex += 26; // Chuyển chỉ số về đúng khoảng
                }

                // Thêm ký tự đã giải mã vào kết quả
                char decryptedChar = originalAlphabet.charAt(decryptedIndex);
                decryptedText.append(decryptedChar);

                // Tăng keyIndex để lặp lại key khi cần
                keyIndex++;
            }
        } else {
            // Giữ nguyên ký tự không phải chữ cái
            decryptedText.append(ch);
        }
    }

    // Chuyển văn bản đã giải mã thành chữ thường
    String decryptedTextLowerCase = decryptedText.toString().toLowerCase();

    // Hiển thị văn bản đã giải mã xuống jTextArea2 dưới dạng chữ thường
    jTextArea2.setText(decryptedTextLowerCase);


   

    }                                        
    
   
        
    

  
        
 
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}
