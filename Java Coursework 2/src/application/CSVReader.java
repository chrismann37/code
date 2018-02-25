package application;

import java.io.File;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class CSVReader {
	
	public CSVReader() {
		
	}
	
	public ObservableList<Visit> read(File file) {
		ObservableList<Visit> visitList = FXCollections.observableArrayList();
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] field = line.split(",");
				Visit visit = new Visit(field[0], field[1], field[2], field [3], field[4], field[5]);
				visitList.add(visit);
			}
			return visitList;			
			
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
			//ex.printStackTrace();
		}	 
		return null;
	}
	
	public File selectFile() {
		Stage stage = new Stage();
		FileChooser chooser = new FileChooser();
    	File file = chooser.showOpenDialog(stage);
    	System.out.println(file);
    	return file;
	}
}
