/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author comp
 */
public class MainUI extends javax.swing.JFrame {

   public ArrayList<String> allAttributes = new ArrayList<String>();
    public ArrayList<String> at1 = new ArrayList<String>();
    public ArrayList<String> at2 = new ArrayList<String>();
    public ArrayList<String> at3 = new ArrayList<String>();
    public ArrayList<String> at4 = new ArrayList<String>();
    public ArrayList<String> at5 = new ArrayList<String>();
    public ArrayList<String> at6 = new ArrayList<String>();
    public ArrayList<String> at7 = new ArrayList<String>();
    public ArrayList<String> at8 = new ArrayList<String>();
    public ArrayList<String> at9 = new ArrayList<String>();
    public ArrayList<String> at10 = new ArrayList<String>();
    public ArrayList<String> at11 = new ArrayList<String>();
    public ArrayList<String> at12 = new ArrayList<String>();
    public ArrayList<String> at13 = new ArrayList<String>();
    public ArrayList<String> at14 = new ArrayList<String>();
    public ArrayList<String> at15 = new ArrayList<String>();
    public ArrayList<String> at16 = new ArrayList<String>();
    public ArrayList<String> at17 = new ArrayList<String>();
    public ArrayList<String> at18 = new ArrayList<String>();
    public ArrayList<String> at19 = new ArrayList<String>();
    public ArrayList<String> at20 = new ArrayList<String>();
    public ArrayList<String> at21 = new ArrayList<String>();
    public ArrayList<String> at22 = new ArrayList<String>();
    
    
     public ArrayList<String> att1 = new ArrayList<String>();
    public ArrayList<String> att2 = new ArrayList<String>();
    public ArrayList<String> att3 = new ArrayList<String>();
    public ArrayList<String> att4 = new ArrayList<String>();
    public ArrayList<String> att5 = new ArrayList<String>();
    public ArrayList<String> att6 = new ArrayList<String>();
    public ArrayList<String> att7 = new ArrayList<String>();
    public ArrayList<String> att8 = new ArrayList<String>();
    public ArrayList<String> att9 = new ArrayList<String>();
    public ArrayList<String> att10 = new ArrayList<String>();
    public ArrayList<String> att11 = new ArrayList<String>();
    public ArrayList<String> att12 = new ArrayList<String>();
    public ArrayList<String> att13 = new ArrayList<String>();
    public ArrayList<String> att14 = new ArrayList<String>();
    public ArrayList<String> att15 = new ArrayList<String>();
    public ArrayList<String> att16 = new ArrayList<String>();
    public ArrayList<String> att17 = new ArrayList<String>();
    public ArrayList<String> att18 = new ArrayList<String>();
    public ArrayList<String> att19 = new ArrayList<String>();
    public ArrayList<String> att20 = new ArrayList<String>();
    public ArrayList<String> att21 = new ArrayList<String>();
   
    public MainUI() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel1.setText("CHURN DISCOVERY DATA EXTRACTION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 10, 700, 50);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("Read Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 220, 220, 50);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        jLabel3.setText("File Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 340, 140, 40);
        getContentPane().add(fname);
        fname.setBounds(330, 340, 290, 47);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 30, 160, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Extra.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 670);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try
       {
           String selectedFile="churn1.xlsx";
           fname.setText(selectedFile);
          
        FileInputStream file  = new FileInputStream(new File(selectedFile));
           XSSFWorkbook workbook = new XSSFWorkbook(file);
           XSSFSheet sheet = workbook.getSheetAt(0);  
           Iterator<Row> rowIterator = sheet.iterator();
             while (rowIterator.hasNext()) 
			{
                            Row row = rowIterator.next();
				//For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell = cellIterator.next();
                          
				while (cellIterator.hasNext()) 
				{
                                    
                                   
                            at1.add(row.getCell(0).toString());
                            at2.add(row.getCell(1).toString());
                            at3.add(row.getCell(2).toString());
                            at4.add(row.getCell(3).toString());
                            at5.add(row.getCell(4).toString());
                            at6.add(row.getCell(5).toString());
                            at7.add(row.getCell(6).toString());
                            at8.add(row.getCell(7).toString());
                            at9.add(row.getCell(8).toString());
                            at10.add(row.getCell(9).toString());
                            at11.add(row.getCell(10).toString());
                            at12.add(row.getCell(11).toString());
                            at13.add(row.getCell(12).toString());
                            at14.add(row.getCell(13).toString());
                            at15.add(row.getCell(14).toString());
                            at16.add(row.getCell(15).toString());
                            at17.add(row.getCell(16).toString());
                            at18.add(row.getCell(17).toString());
                            at19.add(row.getCell(18).toString());
                            at20.add(row.getCell(19).toString());
                            at21.add(row.getCell(20).toString());
                            
                            
                            
                            

                            
                             
                            break;
				}
				//System.out.println("completed");
			}
                            file.close();
                        
                 
                
                  
                  at1.remove(0);
                  at2.remove(0);
                  at3.remove(0);
                  at4.remove(0);
                  at5.remove(0);
                  at6.remove(0);
                  at7.remove(0);
                  at8.remove(0);
                  at9.remove(0);
                  at10.remove(0);
                  at11.remove(0);
                  at12.remove(0);
                  at13.remove(0);
                  at14.remove(0);
                  at15.remove(0);
                  at16.remove(0);
                  at17.remove(0);
                  at18.remove(0);
                  at19.remove(0);
                  at20.remove(0);
                  at21.remove(0);
                 

         JOptionPane.showMessageDialog(null, "Fetching Dataset Completed");
         
         FrameSerFile f1=new FrameSerFile();
         f1.makeSerialization(at1, "objects/1.txt");
         
          FrameSerFile f2=new FrameSerFile();
          f2.makeSerialization(at2, "objects/2.txt");
         
          FrameSerFile f3=new FrameSerFile();
          f3.makeSerialization(at3, "objects/3.txt");
         
          FrameSerFile f4=new FrameSerFile();
          f4.makeSerialization(at4, "objects/4.txt");
         
          FrameSerFile f5=new FrameSerFile();
         f5.makeSerialization(at5, "objects/5.txt");
         
          FrameSerFile f6=new FrameSerFile();
          f6.makeSerialization(at6, "objects/6.txt");
         
          FrameSerFile f7=new FrameSerFile();
          f7.makeSerialization(at7, "objects/7.txt");
         
          FrameSerFile f8=new FrameSerFile();
         f8.makeSerialization(at8, "objects/8.txt");
         
          FrameSerFile f9=new FrameSerFile();
         f9.makeSerialization(at9, "objects/9.txt");
         
          FrameSerFile f10=new FrameSerFile();
         f10.makeSerialization(at10, "objects/10.txt");
         
          FrameSerFile f11=new FrameSerFile();
         f11.makeSerialization(at11, "objects/11.txt");
         
          FrameSerFile f12=new FrameSerFile();
         f12.makeSerialization(at12, "objects/12.txt");
         
          FrameSerFile f13=new FrameSerFile();
         f13.makeSerialization(at13, "objects/13.txt");
         
          FrameSerFile f14=new FrameSerFile();
         f14.makeSerialization(at14, "objects/14.txt");
         
          FrameSerFile f15=new FrameSerFile();
         f15.makeSerialization(at15, "objects/15.txt");
         
          FrameSerFile f16=new FrameSerFile();
         f16.makeSerialization(at16, "objects/16.txt");
         
          FrameSerFile f17=new FrameSerFile();
         f17.makeSerialization(at17, "objects/17.txt");
         
         FrameSerFile f18=new FrameSerFile();
         f18.makeSerialization(at18, "objects/18.txt");
         
         FrameSerFile f19=new FrameSerFile();
         f19.makeSerialization(at19, "objects/19.txt");
         
         FrameSerFile f20=new FrameSerFile();
         f20.makeSerialization(at20, "objects/20.txt");
         
         FrameSerFile f21=new FrameSerFile();
         f21.makeSerialization(at21, "objects/21.txt");
         
         
         
       
       
      
       }catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             this.dispose();
             Menu m=new Menu();
             m.setVisible(true);
             m.setSize(1000,670 );
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             MainUI mm= new MainUI();
             mm.setVisible(true);
             mm.setSize(1000,670);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
