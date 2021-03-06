package CS2011.Lecture19.Graphs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChartSample extends Application{
	
	//http://docs.oracle.com/javafx/2/charts/bar-chart.htm
    final static String austria = "Austria";
    final static String brazil = "Brazil";
    final static String france = "France";
    final static String italy = "Italy";
    final static String usa = "USA";
 
    @Override 
    public void start(Stage primaryStage) {
    	
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Country");       
        yAxis.setLabel("Value");
        
        BarChart<String,Number> barchart = new BarChart<String,Number>(xAxis,yAxis);
        
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2003"); 
        
        series1.getData().add(new XYChart.Data(austria, 25601.34));
        series1.getData().add(new XYChart.Data(brazil, 20148.82));
        series1.getData().add(new XYChart.Data(france, 10000));
        series1.getData().add(new XYChart.Data(italy, 35407.15));
        series1.getData().add(new XYChart.Data(usa, 12000));      
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2004");
        
        series2.getData().add(new XYChart.Data(austria, 57401.85));
        series2.getData().add(new XYChart.Data(brazil, 41941.19));
        series2.getData().add(new XYChart.Data(france, 45263.37));
        series2.getData().add(new XYChart.Data(italy, 117320.16));
        series2.getData().add(new XYChart.Data(usa, 14845.27));  
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("2005");
        
        series3.getData().add(new XYChart.Data(austria, 45000.65));
        series3.getData().add(new XYChart.Data(brazil, 44835.76));
        series3.getData().add(new XYChart.Data(france, 18722.18));
        series3.getData().add(new XYChart.Data(italy, 17557.31));
        series3.getData().add(new XYChart.Data(usa, 92633.68));  
        
        barchart.setTitle("Country Summary");
        barchart.getData().addAll(series1, series2, series3);
        
        Scene scene = new Scene(barchart,800,600);
        
        primaryStage.setTitle("Bar Chart Sample");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    } 
    
    public static void main(String[] args) {
        launch(args);
    }
    
}