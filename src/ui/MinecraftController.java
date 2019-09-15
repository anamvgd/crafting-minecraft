package ui;

import java.net.URL;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import model.Block;
import model.Cube;

public class MinecraftController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label inventoryNumber;

    @FXML
    private ImageView object0;

    @FXML
    private Label quantity0;

    @FXML
    private ImageView object1;

    @FXML
    private Label quantity1;

    @FXML
    private ImageView object2;

    @FXML
    private Label quantity2;

    @FXML
    private ImageView object3;

    @FXML
    private Label quantity3;

    @FXML
    private ImageView object4;

    @FXML
    private Label quantity4;

    @FXML
    private ImageView object5;

    @FXML
    private Label quantity5;

    @FXML
    private ImageView object6;

    @FXML
    private Label quantity6;

    @FXML
    private ImageView object7;

    @FXML
    private Label quantity7;

    @FXML
    private ImageView object8;

    @FXML
    private Label quantity8;

    @FXML
    private Button nextInventory;

    @FXML
    private Button random;
    
    private Queue queue;
    
    private Stack<Block>[] stacks;

    @FXML
    void nextInventory(ActionEvent event) {
    	
    }

    @FXML
    void randomObject(ActionEvent event) {
    	Random r = new Random();
    	int key = r.nextInt(6)+1;
    	Cube newCube;
    	if(key == 1) {
    		newCube = new Cube(key, "Wood");
    	}else if(key == 2) {
    		newCube = new Cube(key, "Glass");
    	}else if(key == 3) {
    		newCube = new Cube(key, "Gold");
    	}else if(key == 4) {
    		newCube = new Cube(key, "Magma");
    	}else if(key == 5) {
    		newCube = new Cube(key, "Obsidian");
    	}else if(key == 6) {
    		newCube = new Cube(key, "SouldSand");
    	}else {
    		newCube = new Cube(key, "StoneBricks");
    	}
    	
    	//.insert(newCube);
    }
    
    @FXML
    void initialize() {
    	
    	queue = new LinkedList<Stack<Block>>();
    	
    	
    	
    	Image img = new Image("ui/Lucky.png");
        random.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(58, 60, false, false, false, true))));
    }
}

