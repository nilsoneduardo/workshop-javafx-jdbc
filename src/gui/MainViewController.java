package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	
	@FXML
	public void onMenuItemSeller() {
		System.out.println("Teste1");
		
		
	}
	
	@FXML
	public void onMenuItemDepartment() {
		System.out.println("Teste2");
		
	}
	
	@FXML
	public void onMenuItemAbout() {
		System.out.println("Teste2");
		
		
	}
	
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	
		
		
	}

	
}
