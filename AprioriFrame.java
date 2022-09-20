



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.jfree.ui.RefineryUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gohitha
 */
public class AprioriFrame extends javax.swing.JFrame {
    public ArrayList<String> allAttributes = new  ArrayList<String>();
    public ArrayList<String> allSelectedAttributes = new ArrayList<String>();
    public ArrayList<String> aprioriPatternFinal4Churn = new ArrayList<String>();
    public ArrayList<Integer> churnPhoneIndex = new ArrayList<Integer>();
    
    public String seedPattern = new String();
    /**
     * Creates new form AprioriFrame
     */
    public AprioriFrame() {
        initComponents();
    }
    public AprioriFrame(ArrayList<String> allAttrs , ArrayList<String> selAtt) {
        allAttributes.clear();
        allSelectedAttributes.clear();
        allAttributes = allAttrs;
        allSelectedAttributes = selAtt;
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
        allApriori = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        allApriori.setColumns(40);
        allApriori.setRows(15);
        allApriori.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                allAprioriComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(allApriori);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      try{
          
          
          churnPhoneIndex.clear();
      
      for(int i=0;i<allSelectedAttributes.size();i++){
          allApriori.append(allSelectedAttributes.get(i)+"\r\n");
       }
       
       allApriori.append("apriori starts...\r\n");
       allApriori.append("-----------------------\r\n");
       
       for(int i=0;i<allSelectedAttributes.size();i++){
           seedPattern = seedPattern+allSelectedAttributes.get(i)+" ";
       }
       allApriori.append("seed pattern\r\n");
       allApriori.append(seedPattern+"\r\n");
       
       allApriori.append("-----------------------\r\n");
       aprioriPatternFinal4Churn.clear();
       
       ArrayList<String> allClearedItems = new ArrayList<String>();
       allClearedItems.clear();
       allClearedItems = (ArrayList<String>)allAttributes.clone();
       allClearedItems.removeAll(allSelectedAttributes);
       
       System.out.println(allClearedItems);
       allApriori.append("-----------------------\r\n");
       allApriori.append(allClearedItems+"\r\n");
       allApriori.append("apriori\r\n");
       
       aprioriPatternFinal4Churn.clear();
       int k = 0;
       for(int i=0;i<allClearedItems.size();i++){
           String mainString = seedPattern;
           for(int j=k;j<allClearedItems.size();j++){
               mainString += allClearedItems.get(j)+" ";
               aprioriPatternFinal4Churn.add(mainString);
           }
           mainString = "";
           k = k+1;
       }
       
       //System.out.println("aprioriPatternFinal4Churn"+aprioriPatternFinal4Churn);
       for(int i=0;i<aprioriPatternFinal4Churn.size();i++){
       //System.out.println(aprioriPatternFinal4Churn.get(i));
       //allApriori.append(aprioriPatternFinal4Churn.get(i)+"\r\n");
       }
       
       //main apriori loop starts.for churn...
         ArrayList<Float> Acc = new ArrayList<Float>();
         ArrayList<Float> DayM = new ArrayList<Float>();
         ArrayList<Float> EveM = new ArrayList<Float>();
         ArrayList<Float> NightM = new ArrayList<Float>();
         ArrayList<Float> IntlM = new ArrayList<Float>();
         ArrayList<Float> DayC = new ArrayList<Float>();
         ArrayList<Float> DayCh = new ArrayList<Float>();
         ArrayList<Float> EveC = new ArrayList<Float>();
         ArrayList<Float> EveCh = new ArrayList<Float>();
         ArrayList<Float> NightC = new ArrayList<Float>();
         ArrayList<Float> NightCh = new ArrayList<Float>();
         ArrayList<Float> IntlC = new ArrayList<Float>();
         ArrayList<String> State = new ArrayList<String>();
         ArrayList<Float> AreaC = new ArrayList<Float>();
         ArrayList<String> Phone = new ArrayList<String>();
         
         
         ArrayList<String> AccT = new ArrayList<String>();
         ArrayList<String> DayMT = new ArrayList<String>();
         ArrayList<String> EveMT = new ArrayList<String>();
         ArrayList<String> NightMT = new ArrayList<String>();
         ArrayList<String> IntlMT = new ArrayList<String>();
         ArrayList<String> DayCT = new ArrayList<String>();
         ArrayList<String> DayChT = new ArrayList<String>();
         ArrayList<String> EveCT = new ArrayList<String>();
         ArrayList<String> EveChT = new ArrayList<String>();
         ArrayList<String> NightCT = new ArrayList<String>();
         ArrayList<String> NightChT = new ArrayList<String>();
         ArrayList<String> IntlCT = new ArrayList<String>();
         ArrayList<String> StateT = new ArrayList<String>();
         ArrayList<String> AreaCT = new ArrayList<String>();
         ArrayList<String> PhoneT = new ArrayList<String>();
         
         ArrayList<Integer> pTCount = new ArrayList<Integer>();
         ArrayList<Integer> nTCount = new ArrayList<Integer>();
         
         
         AccT.clear();
         DayMT.clear();
         EveMT.clear();
         NightMT.clear();
         IntlMT.clear();
         DayCT.clear();
         DayChT.clear();
         EveCT.clear();
         EveChT.clear();
         NightCT.clear();
         NightChT.clear();
         IntlCT.clear();
         StateT.clear();
         AreaCT.clear();
         PhoneT.clear();
              
         FileInputStream fisAccT = new FileInputStream("objects/1.txt");
         ObjectInputStream oisAccT = new ObjectInputStream(fisAccT);
         AccT = (ArrayList<String>)oisAccT.readObject();
         oisAccT.close();
         fisAccT.close();
         
         FileInputStream fisDayMT = new FileInputStream("objects/3.txt");
         ObjectInputStream oisDayMT = new ObjectInputStream(fisDayMT);
         DayMT = (ArrayList<String>)oisDayMT.readObject();
         oisDayMT.close();
         fisDayMT.close();
         
         FileInputStream fisEveMT = new FileInputStream("objects/4.txt");
         ObjectInputStream oisEveMT = new ObjectInputStream(fisEveMT);
         EveMT = (ArrayList<String>)oisEveMT.readObject();
         oisEveMT.close();
         fisEveMT.close();
         
         FileInputStream fisNightMT = new FileInputStream("objects/5.txt");
         ObjectInputStream oisNightMT = new ObjectInputStream(fisNightMT);
         NightMT = (ArrayList<String>)oisNightMT.readObject();
         oisNightMT.close();
         fisNightMT.close();
         
         FileInputStream fisIntlMT = new FileInputStream("objects/6.txt");
         ObjectInputStream oisIntlMT = new ObjectInputStream(fisIntlMT);
         IntlMT = (ArrayList<String>)oisIntlMT.readObject();
         oisIntlMT.close();
         fisIntlMT.close();
         
         FileInputStream fisDayCT = new FileInputStream("objects/11.txt");
         ObjectInputStream oisDayCT = new ObjectInputStream(fisDayCT);
         DayCT = (ArrayList<String>)oisDayCT.readObject();
         oisDayCT.close();
         fisDayCT.close();
         
         FileInputStream fisDayChT = new FileInputStream("objects/12.txt");
         ObjectInputStream oisDayChT = new ObjectInputStream(fisDayChT);
         DayChT = (ArrayList<String>)oisDayChT.readObject();
         oisDayChT.close();
         fisDayChT.close();
         
         FileInputStream fisEveCT = new FileInputStream("objects/13.txt");
         ObjectInputStream oisEveCT  = new ObjectInputStream(fisEveCT);
         EveCT = (ArrayList<String>)oisEveCT.readObject();
         oisEveCT.close();
         fisEveCT.close();
         
         FileInputStream fisEveChT = new FileInputStream("objects/14.txt");
         ObjectInputStream oisEveChT  = new ObjectInputStream(fisEveChT);
         EveChT = (ArrayList<String>)oisEveChT.readObject();
         oisEveChT.close();
         fisEveChT.close();
         
         FileInputStream fisNightCT = new FileInputStream("objects/15.txt");
         ObjectInputStream oisNightCT  = new ObjectInputStream(fisNightCT);
         NightCT = (ArrayList<String>)oisNightCT.readObject();
         oisNightCT.close();
         fisNightCT.close();
         
         FileInputStream fisNightChT = new FileInputStream("objects/16.txt");
         ObjectInputStream oisNightChT  = new ObjectInputStream(fisNightChT);
         NightChT = (ArrayList<String>)oisNightChT.readObject();
         oisNightChT.close();
         fisNightChT.close();
         
         FileInputStream fisIntlCT = new FileInputStream("objects/17.txt");
         ObjectInputStream oisIntlCT  = new ObjectInputStream(fisIntlCT);
         IntlCT = (ArrayList<String>)oisIntlCT.readObject();
         oisIntlCT.close();
         fisIntlCT.close();
         
         FileInputStream fisStateT = new FileInputStream("objects/19.txt");
         ObjectInputStream oisStateT  = new ObjectInputStream(fisStateT);
         StateT = (ArrayList<String>)oisStateT.readObject();
         oisStateT.close();
         fisStateT.close();
         
         FileInputStream fisAreaCT = new FileInputStream("objects/20.txt");
         ObjectInputStream oisAreaCT  = new ObjectInputStream(fisAreaCT);
         AreaCT = (ArrayList<String>)oisAreaCT.readObject();
         oisAreaCT.close();
         fisAreaCT.close();
         
         FileInputStream fisPhoneT = new FileInputStream("objects/21.txt");
         ObjectInputStream oisPhoneT = new ObjectInputStream(fisPhoneT);
         PhoneT = (ArrayList<String>)oisPhoneT.readObject(); 
         oisPhoneT.close();
         fisPhoneT.close();
                 
         for(int i=0;i<AccT.size();i++){
             String ttt = AccT.get(i);
             Acc.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<DayMT.size();i++){
             String ttt = DayMT.get(i);
             DayM.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<EveMT.size();i++){
             String ttt = EveMT.get(i);
             EveM.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<NightMT.size();i++){
             String ttt = NightMT.get(i);
             NightM.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<IntlMT.size();i++){
             String ttt = IntlMT.get(i);
             IntlM.add(Float.parseFloat(ttt));
         }
         
         for(int i=0;i<DayCT.size();i++){
             String ttt = DayCT.get(i);
             DayC.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<DayChT.size();i++){
             String ttt = DayChT.get(i);
             DayCh.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<EveCT.size();i++){
             String ttt = EveCT.get(i);
             EveC.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<EveChT.size();i++){
             String ttt = EveChT.get(i);
             EveCh.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<NightCT.size();i++){
             String ttt = NightCT.get(i);
             NightC.add(Float.parseFloat(ttt));
         }
         
         
         for(int i=0;i<NightChT.size();i++){
             String ttt = NightChT.get(i);
             NightCh.add(Float.parseFloat(ttt));
         }
         
         for(int i=0;i<IntlCT.size();i++){
             String ttt = IntlCT.get(i);
             IntlC.add(Float.parseFloat(ttt));
         }
         
         State = StateT;         
         
        for(int i=0;i<AreaCT.size();i++){
        String ttt = AreaCT.get(i);
        AreaC.add(Float.parseFloat(ttt));
         }
       
       
       
       
       
       ArrayList<Integer> allPositiveCount = new ArrayList<Integer>();
       ArrayList<Integer> allNegetiveCount = new ArrayList<Integer>();
       ArrayList<String> tempTokens = new ArrayList<String>();
       tempTokens.clear();
       allPositiveCount.clear();
       allNegetiveCount.clear();
       int pCount = 0;
       int nCount = 0;
       for(int i=0;i<aprioriPatternFinal4Churn.size();i++){           
           String pattern = aprioriPatternFinal4Churn.get(i);
           StringTokenizer st = new StringTokenizer(pattern," ");
           while(st.hasMoreTokens()){
               String token = st.nextToken();
               tempTokens.add(token);
           }
           for(int j=0;j<tempTokens.size();j++){
               String token = tempTokens.get(j);
               
               
               if(token.equals("AccountLength")){
                 for(int l=0;l<Acc.size();l++)  {
                     float ff = Acc.get(l);
                     if(ff>=Threshold_Churn.AccountLength){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.AccountLength){
                         ++nCount;
                         churnPhoneIndex.add(l);
                       // System.out.println("churnPhoneIndex"+churnPhoneIndex);

                     }
                 }
               }
               
               else if(token.equals("DayMins")){
                 for(int l=0;l<DayM .size();l++)  {
                     float ff = DayM .get(l);
                     if(ff>=Threshold_Churn.DayMins){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.DayMins){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("EveMins")){
                 for(int l=0;l<EveM.size();l++)  {
                     float ff = EveM.get(l);
                     if(ff>=Threshold_Churn.EveMins){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.EveMins){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
                   
               else if(token.equals("NightMins")){
                 for(int l=0;l<NightM .size();l++)  {
                     float ff = NightM .get(l);
                     if(ff>=Threshold_Churn.NightMins){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.NightMins){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("IntlMins")){
                 for(int l=0;l<IntlM .size();l++)  {
                     float ff = IntlM .get(l);
                     if(ff>=Threshold_Churn.IntlMins){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.IntlMins){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("DayCalls")){
                 for(int l=0;l<DayC.size();l++)  {
                     float ff = DayC.get(l);
                     if(ff>=Threshold_Churn.DayCalls){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.DayCalls){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("DayCharge")){
                 for(int l=0;l<DayCh.size();l++)  {
                     float ff = DayCh.get(l);
                     if(ff>=Threshold_Churn.DayCharge){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.DayCharge){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("EveCalls")){
                 for(int l=0;l<EveC.size();l++)  {
                     float ff = EveC.get(l);
                     if(ff>=Threshold_Churn.EveCalls){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.EveCalls){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("EveCharge")){
                 for(int l=0;l<EveCh.size();l++)  {
                     float ff = EveCh.get(l);
                     if(ff>=Threshold_Churn.EveCharge){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.EveCharge){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("NightCalls")){
                 for(int l=0;l<NightC.size();l++)  {
                     float ff = NightC.get(l);
                     if(ff>=Threshold_Churn.NightCalls){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.NightCalls){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("NightCharge")){
                 for(int l=0;l<NightCh.size();l++)  {
                     float ff = NightCh.get(l);
                     if(ff>=Threshold_Churn.NightCharge){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.NightCharge){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               else if(token.equals("IntlCalls")){
                 for(int l=0;l<IntlC.size();l++)  {
                     float ff = IntlC.get(l);
                     if(ff>=Threshold_Churn.IntlCalls){
                         ++pCount;
                     }
                     else if(ff<Threshold_Churn.IntlCalls){
                         ++nCount;
                         churnPhoneIndex.add(l);
                     }
                 }
               }
               
               
           }
          // System.out.println("churnPhoneIndex"+churnPhoneIndex);
           tempTokens.clear();
           allPositiveCount.add(pCount);
           allNegetiveCount.add(nCount);
           pCount = 0;
           nCount = 0;
           
       }
       
       for(int i=0;i<aprioriPatternFinal4Churn.size();i++){
           String ttt = aprioriPatternFinal4Churn.get(i)+"\r\n";
           allApriori.append(ttt);
       }
       System.out.println("apriori rate:"+aprioriPatternFinal4Churn.size());
       System.out.println("pos"+allPositiveCount.size());
       System.out.println("neg"+allNegetiveCount.size());
        //main apriori loop ends..for churn.
        
        //churn estimation starts...
        ArrayList<Integer> tempNVector = new ArrayList<Integer>();
        tempNVector.clear();
        tempNVector = (ArrayList<Integer>)allNegetiveCount;
        //Collections.sort(tempNVector);
        
        ArrayList<Double> allChurn75pPercentage = new ArrayList<Double>();
        allChurn75pPercentage.clear();
        for(int i=0;i<allPositiveCount.size();i++){
            double neg = allNegetiveCount.get(i);
            double tCount = (double)allPositiveCount.get(i)+allNegetiveCount.get(i);
            double tValue = (double)neg/tCount;
            double fValue = (double)tValue*100;
            allChurn75pPercentage.add(fValue);
        }      
       // Collections.sort(allChurn75pPercentage);
       // System.out.println(allChurn75pPercentage);        
       ArrayList<Double> finalResult = new ArrayList<Double>();
       finalResult.clear();
       System.out.println(allChurn75pPercentage);
       //int j = allChurn75pPercentage.size()-10;
       for(int i=0;i<allChurn75pPercentage.size();i++){
           finalResult.add(allChurn75pPercentage.get(i));
       }
       
       System.out.println(finalResult);
       
      
//      PieChart demo =  new PieChart("churn final result",finalResult);
//     demo.setSize( 560 , 367 );    
//     RefineryUtilities.centerFrameOnScreen( demo );    
//      demo.setVisible( true ); 
      
      
      
//      final Barchart demo = new Barchart("====CHURN DISCOVERY=====",finalResult);
//      demo.pack();
//      RefineryUtilities.centerFrameOnScreen(demo);
//        demo.setVisible(true);
        
        
        ArrayList<Double> finalResultNonSorted = new ArrayList<Double>();
        finalResultNonSorted.clear();
        //int K = allChurn75pPercentage.size()-;
       for(int i=0;i<allChurn75pPercentage.size();i++){
           finalResultNonSorted.add(allChurn75pPercentage.get(i));
       }
        Collections.sort(finalResultNonSorted);
        
        ArrayList<Double> last10 =  new ArrayList<Double>();
        last10.clear();
        int K = finalResultNonSorted.size()-10;
        for(int i=K;i<finalResultNonSorted.size();i++){
            last10.add(finalResultNonSorted.get(i));
        }
        
          FileOutputStream fos=new FileOutputStream("graphvalue.txt");
          ObjectOutputStream oobs=new ObjectOutputStream(fos);
          oobs.writeObject(last10);
          oobs.close();
          fos.close();
          
//        final Barchart demo1 = new Barchart("====CHURN DISCOVERY=====",last10);
//        demo1.pack();
//        RefineryUtilities.centerFrameOnScreen(demo1);
//        demo1.setVisible(true);
//        
//        PieChart demo =  new PieChart("churn final result",last10);
//        demo.setSize( 560 , 367 );    
//        RefineryUtilities.centerFrameOnScreen( demo );    
//        demo.setVisible( true ); 
         //churn estimation starts...
         
         
         //churnPhoneIndex.add(l);
         
//         Set set = new HashSet(churnPhoneIndex);
//         churnPhoneIndex.clear();
//         churnPhoneIndex.addAll(set);

   Collections.shuffle(churnPhoneIndex);
         
         
         String finalChurnPhones = "";
         
         for(int i=0;i<10;i++){
             int index = churnPhoneIndex.get(i);
             finalChurnPhones += "PHONE NO "+i+" "+PhoneT.get(index)+"\r\n";
         }
        JOptionPane.showMessageDialog(null, "Top 10 Phone Number are :"+"\r\n"+finalChurnPhones);
         
      }catch(Exception e){
          System.out.println(e);
      }
    }//GEN-LAST:event_formComponentShown

    private void allAprioriComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_allAprioriComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_allAprioriComponentShown

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
            java.util.logging.Logger.getLogger(AprioriFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AprioriFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AprioriFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AprioriFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	AprioriFrame aa= new AprioriFrame();
            	aa.setVisible(true);
            	aa.setSize(1300,730);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea allApriori;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
