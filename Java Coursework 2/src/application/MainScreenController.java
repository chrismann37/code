package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainScreenController implements Initializable {

	@FXML
    private Button btnLoad;

    @FXML
    private TableView<Visit> tblUnallocated;

    @FXML
    private TableColumn<Visit, String> tblID;

    @FXML
    private TableColumn<Visit, String> tblName;

    @FXML
    private TableColumn<Visit, String> tblAddress;

    @FXML
    private TableColumn<Visit, String> tblCity;

    @FXML
    private TableColumn<Visit, String> tblPostcode;

    @FXML
    private TableColumn<Visit, String> tblType;

    @FXML
    private TableView<Visit> tblAllocated;

    @FXML
    private TableColumn<Visit, String> tbl2ID;

    @FXML
    private TableColumn<Visit, String> tbl2Name;

    @FXML
    private TableColumn<Visit, String> tbl2Address;

    @FXML
    private TableColumn<Visit, String> tbl2City;

    @FXML
    private TableColumn<Visit, String> tbl2Postcode;

    @FXML
    private TableColumn<Visit, String> tbl2Type;
    
    @FXML
    private TableView<Worker> tblWorker;
    
    @FXML
    private TableColumn<Worker, String> tblWorkers;
    
    @FXML
    private Button btnAllocate;

    @FXML
    private Button btnDeallocate;
    
    @FXML
    private Button btnSave;

    CSVReader csv = new CSVReader();
    

    @FXML
    void handleBtnLoad(ActionEvent event) {
    	
    	File file = csv.selectFile();
    	
    	tblUnallocated.setItems(csv.read(file)); 	  	
    	
    }
    
    @FXML
    void handleBtnAllocate(ActionEvent event) {
    	
    	Visit visitSelection = tblUnallocated.getSelectionModel().getSelectedItem();

    	Worker workerSelection = tblWorker.getSelectionModel().getSelectedItem();
    	
    }
    
    @FXML
    void handleBtnDeallocate(ActionEvent event) {
    	
    }
    
    @FXML
    void handleBtnSave(ActionEvent event) {
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

    	tblID.setCellValueFactory(new PropertyValueFactory<Visit, String>("id"));
    	tblName.setCellValueFactory(new PropertyValueFactory<Visit, String>("name"));
    	tblAddress.setCellValueFactory(new PropertyValueFactory<Visit, String>("address"));
    	tblCity.setCellValueFactory(new PropertyValueFactory<Visit, String>("city"));
    	tblPostcode.setCellValueFactory(new PropertyValueFactory<Visit, String>("postcode"));
    	tblType.setCellValueFactory(new PropertyValueFactory<Visit, String>("type"));
    	
    	tbl2ID.setCellValueFactory(new PropertyValueFactory<Visit, String>("id"));
    	tbl2Name.setCellValueFactory(new PropertyValueFactory<Visit, String>("name"));
    	tbl2Address.setCellValueFactory(new PropertyValueFactory<Visit, String>("address"));
    	tbl2City.setCellValueFactory(new PropertyValueFactory<Visit, String>("city"));
    	tbl2Postcode.setCellValueFactory(new PropertyValueFactory<Visit, String>("postcode"));
    	tbl2Type.setCellValueFactory(new PropertyValueFactory<Visit, String>("type"));
    	
    	tblWorkers.setCellValueFactory(new PropertyValueFactory<Worker, String>("name"));
    	
    		
		
	}

}
