package Charts;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author shaune
 */
public class PieChart extends JFrame {
    PieChart(String chartTitle)
    {
        PieDataset dataset = createDataset();
        JFreeChart chart = PieChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000,600));
        setContentPane(chartPanel);
    }
    private PieDataset createDataset()
    {
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("18 - 30 years     ",77);
        result.setValue("31 - 40 Years     ",85);
        result.setValue("41 - 50 Years     ",68);
        result.setValue("51 - 60 Years     ",24);
        return result;
    }
    
   private JFreeChart PieChart(PieDataset dataset, String title)
   {
       JFreeChart chart = ChartFactory.createPieChart3D(title, dataset,true,true,false);
       PiePlot3D plot = (PiePlot3D) chart.getPlot();
       plot.setStartAngle(90);
       plot.setDirection(Rotation.CLOCKWISE);   
       plot.setForegroundAlpha(0.6f);
       return chart;
   }
    }

