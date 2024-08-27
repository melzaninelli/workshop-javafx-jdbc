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
	private MenuItem MenuItemDepartament;
	
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("OnMenuItemSellerAction");
		}
	@FXML
	public void onMenuItemDepartamentAction() {
		System.out.println("OnMenuItemDepartamentAction");
		}
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("OnMenuItemAboutAction");
		}
	
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
