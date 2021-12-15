package com.locationManagement.locationWeb.Utility;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class ReportUtilityImplementation implements ReportUtility {

	@Override
	public void locationPieChart(String chartPath, List<Object[]> chartData) {
		// TODO Auto-generated method stub
		DefaultPieDataset pieDataset = new DefaultPieDataset();
		for (Object[] objects : chartData) {
			pieDataset.setValue(objects[0].toString(), new BigDecimal(objects[1].toString()));
		}
		JFreeChart createJFreeChartPieChart3D = ChartFactory.createPieChart3D("Location Type Report", pieDataset);
		try {
			ChartUtils.saveChartAsJPEG(new File(chartPath + "/pieChart.jpeg"), createJFreeChartPieChart3D, 500, 400);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
