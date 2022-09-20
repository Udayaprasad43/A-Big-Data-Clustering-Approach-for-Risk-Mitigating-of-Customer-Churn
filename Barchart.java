




import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


public class Barchart extends ApplicationFrame {
public String churnFramer = "";
    public Barchart(final String title  ,ArrayList<Double> churns) {

        super(title);
         churnFramer = title;
        final CategoryDataset dataset = createDataset(churns);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);

    }
   
  
    
    private CategoryDataset createDataset(ArrayList<Double> churns){
 
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       
        for(int i=0;i<churns.size();i++){
            dataset.addValue(churns.get(i), "Phone no. ("+(i+1)+") "+ churns.get(i)+"%","Phone no. ("+(i+1)+") "+ churns.get(i)+"%");
        }
        
        return dataset;
  }      
    
    
    
    
  private CategoryDataset createDataset(ArrayList<String> subjects,ArrayList<Float> grades,String str){
 
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       /*
        for(int i=0;i<subjects.size();i++){
            dataset.addValue(grades.get(i),subjects.get(i),subjects.get(i));
        }
*/
        for(int i=subjects.size()-1;i>=0;--i){
            dataset.addValue(grades.get(i),subjects.get(i),subjects.get(i));
        }
              
        
        return dataset;
  }      
  private CategoryDataset createDataset() {
        
        // row keys...
        final String series1 = "GRADE";
        final String series2 = "WEIGHT";   

        // column keys...
        final String category1 = "GRADE";
        final String category2 = "WEIGHT";    

        // create the dataset...
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(1, series1, category1);
        dataset.addValue(4, series1, category2); 
        dataset.addValue(5, series2, category1);
        dataset.addValue(7, series2, category2);
        
        return dataset;
        
    }
    
   
    private JFreeChart createChart(final CategoryDataset dataset) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Bar Graph",         // chart title
            "Category",               // domain axis label
            "count",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

      
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.blue, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.green, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, Color.red, 
            0.0f, 0.0f, Color.lightGray
        );
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        // OPTIONAL CUSTOMISATION COMPLETED.
        
        return chart;
        
    }
    
    
    public static void main(final String[] args) {

        //final Barchart demo = new Barchart("====Faculty FeedBack=====");
       // demo.pack();
        //RefineryUtilities.centerFrameOnScreen(demo);
        //demo.setVisible(true);

    }

}
