/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlybenhvien;

import java.io.File;
import java.io.PrintStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trucn
 */
public class FormTong extends javax.swing.JFrame {
    DefaultTableModel table= new DefaultTableModel();
    /**
     * Creates new form FormTong
     */
    public FormTong() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btOK = new javax.swing.JButton();
        btXuatfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TỔNG");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        btOK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btOK.setText("OK");
        btOK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        btXuatfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btXuatfile.setText("Xuất file");
        btXuatfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXuatfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOK)
                .addGap(18, 18, 18)
                .addComponent(btXuatfile)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOK)
                    .addComponent(btXuatfile))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        this.dispose();
    }//GEN-LAST:event_btOKActionPerformed

    private void btXuatfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXuatfileActionPerformed
        // TODO add your handling code here:
        JFileChooser open =new JFileChooser();
        open.showSaveDialog(null);
        String path="";
        path=open.getSelectedFile().getPath();
        if(!path.equals("")) wirtefile(path);
    }//GEN-LAST:event_btXuatfileActionPerformed
   void wirtefile(String path)
   {
        try
        {
            File f = new File(path);
            //if(!f.exists())
            {
                PrintStream out=new PrintStream(f);
                out.println(table.getColumnName(0)+"\t\t"+table.getColumnName(1)+"\t\t"+table.getColumnName(2)+"\t\t"+table.getColumnName(3)+
                            "\t\t"+table.getColumnName(4));
                out.println(table.getValueAt(0, 0)+"\t\t"+table.getValueAt(0, 1)+"\t\t"+table.getValueAt(0,2)+"\t\t"+table.getValueAt(0, 3)
                          +"\t\t"+table.getValueAt(0, 4));
                out.close();
            }
            //else System.out.println("file file da ton tai!!!");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"!!!WARNING!!!",JOptionPane.WARNING_MESSAGE);
        }
   }
    public void setTable(int type, double value1, double value2, double value3, double value4)
   {
       table= new DefaultTableModel();
       if(type==0)
       {
           table.setColumnIdentifiers(new Object[] {"","Không phòng yêu cầu","Phòng yêu cầu","BHYT","BHXH"});
           jTable.setModel(table);
           table.addRow(new Object[] {"Tổng:",value1,value2,value3,value4});
       }
       else if(type==1)
       {
           table.setColumnIdentifiers(new Object[] {"","Y tá","Bác sĩ","Phó Khoa","Trưởng khoa"});
           jTable.setModel(table);
           table.addRow(new Object[] {"Tổng:",value1,value2,value3,value4});
       }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK;
    private javax.swing.JButton btXuatfile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}