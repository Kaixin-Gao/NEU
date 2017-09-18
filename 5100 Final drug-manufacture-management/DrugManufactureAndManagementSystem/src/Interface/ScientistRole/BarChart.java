/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ScientistRole;
import Business.Compound.Compound;
import Business.WorkQueue.ScientistRole.Analysis;
import Business.WorkQueue.WorkRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.Dataset;
/**
 *
 * @author zhang
 */
public class BarChart {
     private ChartPanel panel;

    /**
     */
    public BarChart(List<WorkRequest> request) {
        CategoryDataset dataset = (CategoryDataset) getDataset(request);
        JFreeChart chart = ChartFactory.createBarChart3D("Which component is the most effective", "Component of the Gene",
                "Ratio", dataset, PlotOrientation.VERTICAL, true, false, false);
        panel = new ChartPanel(chart, true);

    }

    public ChartPanel getChartPanel() {
        return panel;
    }

    /**
     * @return
     */
    private static Dataset getDataset(List<WorkRequest> requestList) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //Map<String,Integer> geneMap = new HashMap<String, Integer>();
        
        Map<String,Integer> geneMap = new HashMap<>();
        for (WorkRequest request : requestList){
            if (request instanceof Analysis) {
                Object[] row = new Object[6];
                row[0] = ((Analysis) request).getDisease();
                row[1]= ((Analysis)request).getGene();
                row[2]=((Analysis) request).getDrug();
                Compound[] ca=((Analysis)request).getCompoundArray();
                row[3] = ca[0];
                row[4] = ca[1]; 
                row[5]= ca[2];
                String geneName = ((Analysis) request).getGene().getName();
                
                if(geneMap.containsKey(geneName+ "-" + ca[0].getName())){
                    Integer count = geneMap.get(geneName+ "-" + ca[0].getName())+ 1;
                    dataset.addValue(count,  geneName, ca[0].getName());
                    geneMap.put(geneName+ "-" + ca[0].getName(),count);
                }else{
                    geneMap.put(geneName+ "-" + ca[0].getName(), 1);
                    dataset.addValue(1,  geneName, ca[0].getName());
                }
               if(geneMap.containsKey(geneName+ "-" + ca[1].getName())){
                    Integer count = geneMap.get(geneName+ "-" + ca[1].getName())+ 1;
                    dataset.addValue(count,  geneName, ca[1].getName());
                    geneMap.put(geneName+ "-" + ca[1].getName(),count);
                }else{
                    geneMap.put(geneName+ "-" + ca[1].getName(), 1);
                    dataset.addValue(1,  geneName, ca[1].getName());
                }  
                if(geneMap.containsKey(geneName+ "-" + ca[2].getName())){
                    Integer count = geneMap.get(geneName+ "-" + ca[2].getName()) + 1;
                    dataset.addValue(count,  geneName, ca[2].getName());
                    geneMap.put(geneName+ "-" + ca[2].getName(),count);
                }else{
                    geneMap.put(geneName+ "-" + ca[2].getName(), 1);
                    dataset.addValue(1,  geneName, ca[2].getName());
                }  
//                dataset.addValue(1,  geneName, ca[0].getName());
//                dataset.addValue(1,geneName, ca[1].getName());
//                dataset.addValue(1,geneName, ca[2].getName());
            }
        }

        return dataset;
    }
}
