/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ScientistRole;
import Business.Compound.Compound;
import Business.WorkQueue.ScientistRole.Analysis;
import Business.WorkQueue.WorkRequest;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author zhang
 */
public class PieChart {
    ChartPanel panel;

	/**
	 * init the picture
	 */
	public PieChart(String geneName, Map<String, Integer> columnMap ) {
		DefaultPieDataset dataset = getDataset(columnMap); 
		JFreeChart chart = ChartFactory.createPieChart3D("Proportion of " + geneName + " components", dataset, true, false, false);
		PiePlot piePlot = (PiePlot) chart.getPlot();
		DecimalFormat df = new DecimalFormat("0.00%");
		NumberFormat nf = NumberFormat.getInstance();
		StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("{0} {2}",nf, df);
		piePlot.setLabelGenerator(generator);
		piePlot.setNoDataMessage("No Data");
		piePlot.setCircular(false);
		piePlot.setLabelGap(0.02D);
		piePlot.setIgnoreNullValues(true);
		piePlot.setIgnoreZeroValues(true);     
		panel = new ChartPanel(chart, true);

	}

	/**
	 *set value 
	 * 
	 * @return
	 */
	private DefaultPieDataset getDataset(Map<String, Integer> columnMap) {
            DefaultPieDataset dataset = new DefaultPieDataset();
             for (Map.Entry<String,  Integer> entry : columnMap.entrySet()) { 
                 dataset.setValue(entry.getKey(), entry.getValue());
             }
//            if (request instanceof Analysis) {
//                Object[] row = new Object[6];
//                row[0] = ((Analysis) request).getDisease();
//                row[1]= ((Analysis)request).getGene();
//                row[2]=((Analysis) request).getDrug();
//                Compound[] ca=((Analysis)request).getCompoundArray();
//                row[3] = ca[0];
//                row[4] = ca[1]; 
//                row[5]= ca[2];
//                dataset.setValue(ca[0].getName(), 1);
//                dataset.setValue(ca[1].getName(), 1);
//                dataset.setValue(ca[2].getName(), 1);
//            }
            return dataset;
	}

	public ChartPanel getPieChartPanel() {
		return panel;
	}
}
