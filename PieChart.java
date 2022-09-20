


import java.util.ArrayList;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
 
public class PieChart extends ApplicationFrame {
   public ArrayList<Double> vaals = new ArrayList<Double>();
   public PieChart( String title ) {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   public PieChart(String title , ArrayList<Double> chValues){
      
       super( title ); 
       vaals = chValues;
      setContentPane(createDemoPanel( ));
   }
    private PieDataset createDataset( ArrayList<Double> chFValues) {
        DefaultPieDataset dataset = new DefaultPieDataset( );
        for(int i=0;i<chFValues.size();i++){
         dataset.setValue( "Phone no. ("+(i+1)+") "+ chFValues.get(i)+"%", chFValues.get(i) );   
        }
        return dataset;
    }
   /* private PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "IPhone 5s" , new Double( 20 ) );  
      dataset.setValue( "SamSung Grand" , new Double( 20 ) );   
      dataset.setValue( "MotoG" , new Double( 40 ) );    
      dataset.setValue( "Nokia Lumia" , new Double( 10 ) );  
      return dataset;         
   }*/
   
   private JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Pie Chart",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);

      return chart;
   }
   
   public JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset(vaals ) );  
      return new ChartPanel( chart ); 
   }

   public static void main( String[ ] args ) {
      PieChart demo = new PieChart( "Customers Churn Predictions" );  
      demo.setSize( 1380 , 730 );    
      RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true ); 
   }
}