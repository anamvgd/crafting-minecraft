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
    
    private String path;
    
    private Queue<Stack<Cube<Integer, String>>> queue;
    
    private Stack<Cube<Integer, String>> stack1;
    private Stack<Cube<Integer, String>> stack2;
    private Stack<Cube<Integer, String>> stack3;
    private Stack<Cube<Integer, String>> stack4;
    private Stack<Cube<Integer, String>> stack5;
    private Stack<Cube<Integer, String>> stack6;
    private Stack<Cube<Integer, String>> stack7;

    @FXML
    void nextInventory(ActionEvent event) {
    	
    	object0.setVisible(false);
    	quantity0.setVisible(false);
    	object1.setVisible(false);
    	quantity1.setVisible(false);
    	object2.setVisible(false);
    	quantity2.setVisible(false);
    	object3.setVisible(false);
    	quantity3.setVisible(false);
    	object4.setVisible(false);
    	quantity4.setVisible(false);
    	object5.setVisible(false);
    	quantity5.setVisible(false);
    	object6.setVisible(false);
    	quantity6.setVisible(false);
    	object7.setVisible(false);
    	quantity7.setVisible(false);

    	int inventory = Integer.parseInt(inventoryNumber.getText())+1;
    	if(inventory > 7) {
    		inventory = 1;
    	}
    	inventoryNumber.setText(inventory+"");
    	
    	if(inventory == 1) {
    		path = "ui/Wood.png";
    	}else if(inventory == 2) {
    		path = "ui/Glass.png";
    	}else if(inventory == 3) {
    		path = "ui/Magma.gif";
    	}else if(inventory == 4) {
    		path = "ui/Obsidian.png";
    	}else if(inventory == 5) {
    		path = "ui/SoulSand.png";
    	}else if(inventory == 6) {
    		path = "ui/StoneBricks.png";
    	}else {
    		path = "ui/Gold.png";
    	}
    	
    	Stack<Cube<Integer, String>> currentStack = queue.poll();
    	queue.offer(currentStack);
    	
    		Image img = new Image(path);
    		int completeStacks = currentStack.size()/64;
    		if(completeStacks == 0) {
    			object0.setImage(img);
    			object0.setVisible(true);
    			quantity0.setText(currentStack.size()+"");
    			quantity0.setVisible(true);
    		}else if(completeStacks > 0) {
    			object0.setImage(img);
    			object0.setVisible(true);
    			quantity0.setText("64");
    			quantity0.setVisible(true);
    		}
    		
    		if(completeStacks == 1) {
    			object1.setImage(img);
    			object1.setVisible(true);
    			quantity1.setText(currentStack.size()-(64*1) + "");
    			quantity1.setVisible(true);
    		}else if(completeStacks > 1) {
    			object1.setImage(img);
    			object1.setVisible(true);
    			quantity1.setText("64");
    			quantity1.setVisible(true);
    		}
    		
    		if(completeStacks == 2) {
    			object2.setImage(img);
    			object2.setVisible(true);
    			quantity2.setText(currentStack.size()-(64*2) + "");
    			quantity2.setVisible(true);
    		}else if(completeStacks > 2) {
    			object2.setImage(img);
    			object2.setVisible(true);
    			quantity2.setText("64");
    			quantity2.setVisible(true);
    		}
    		
    		if(completeStacks == 3) {
    			object3.setImage(img);
    			object3.setVisible(true);
    			quantity3.setText(currentStack.size()-(64*3) + "");
    			quantity3.setVisible(true);
    		}else if(completeStacks > 3) {
    			object3.setImage(img);
    			object3.setVisible(true);
    			quantity3.setText("64");
    			quantity3.setVisible(true);
    		}
    		
    		if(completeStacks == 4) {
    			object4.setImage(img);
    			object4.setVisible(true);
    			quantity4.setText(currentStack.size()-(64*4) + "");
    			quantity4.setVisible(true);
    		}else if(completeStacks > 4) {
    			object4.setImage(img);
    			object4.setVisible(true);
    			quantity4.setText("64");
    			quantity4.setVisible(true);
    		}
    		
    		if(completeStacks == 5) {
    			object5.setImage(img);
    			object5.setVisible(true);
    			quantity5.setText(currentStack.size()-(64*5) + "");
    			quantity5.setVisible(true);
    		}else if(completeStacks > 5) {
    			object5.setImage(img);
    			object5.setVisible(true);
    			quantity5.setText("64");
    			quantity5.setVisible(true);
    		}
    		
    		if(completeStacks == 6) {
    			object6.setImage(img);
    			object6.setVisible(true);
    			quantity6.setText(currentStack.size()-(64*6) + "");
    			quantity6.setVisible(true);
    		}else if(completeStacks > 6) {
    			object6.setImage(img);
    			object6.setVisible(true);
    			quantity6.setText("64");
    			quantity6.setVisible(true);
    		}
    		
    		if(completeStacks == 7) {
    			object7.setImage(img);
    			object7.setVisible(true);
    			quantity7.setText(currentStack.size()-(64*7) + "");
    			quantity7.setVisible(true);
    		}else if(completeStacks > 7) {
    			object7.setImage(img);
    			object7.setVisible(true);
    			quantity7.setText("64");
    			quantity7.setVisible(true);
    		}
    		
    }

    @FXML
    void randomObject(ActionEvent event) {
    	Random r = new Random();
    	int key = r.nextInt(7)+1;
    	int value = r.nextInt(2000)+1;
    	
    	Block<Integer, String> hashTable = new Block<Integer, String>();
    	
    	if(key == 1) {
    		hashTable.insert(key, "Wood "+value);
    		Cube<Integer, String> cube = new Cube<>(key, "Wood "+value);
    		stack1.push(cube);
    		
    	}else if(key == 2) {
    		hashTable.insert(key, "Glass "+value);
    		Cube<Integer, String> cube = new Cube<>(key, "Glass "+value);
    		stack2.push(cube);
    		
    	}else if(key == 3) {
    		hashTable.insert(key, "Gold "+value);
    		Cube<Integer, String> cube = new Cube<>(key, "Gold "+value);
    		stack3.push(cube);
    		
    	}else if(key == 4) {
    		hashTable.insert(key, "Magma "+value);
    		Cube<Integer, String> cube = new Cube<>(key, "Magma "+value);
    		stack4.push(cube);
    		
    	}else if(key == 5) {
    		hashTable.insert(key, "Obsidian "+value);
    		Cube<Integer, String> cube = new Cube<>(key, "Obsidian "+value);
    		stack5.push(cube);
    		
    	}else if(key == 6) {
    		hashTable.insert(key, "SouldSand "+value);
    		Cube<Integer, String> cube = new Cube<>(key, "SouldSand "+value);
    		stack6.push(cube);
    		
    	}else {
    		hashTable.insert(key, "StoneBricks "+value);
    		Cube<Integer, String> cube = new Cube<>(key, "StoneBricks "+value);
    		stack7.push(cube);
    		
    	}
    	
    }
    
    @FXML
    void initialize() {
    	
    	stack1 = new Stack<Cube<Integer,String>>();
    	stack2 = new Stack<Cube<Integer,String>>();
    	stack3 = new Stack<Cube<Integer,String>>();
    	stack4 = new Stack<Cube<Integer,String>>();
    	stack5 = new Stack<Cube<Integer,String>>();
    	stack6 = new Stack<Cube<Integer,String>>();
    	stack7 = new Stack<Cube<Integer,String>>();
    	
    	queue = new LinkedList<Stack<Cube<Integer, String>>>();
    	queue.offer(stack1);
    	queue.offer(stack2);
    	queue.offer(stack3);
    	queue.offer(stack4);
    	queue.offer(stack5);
    	queue.offer(stack6);
    	queue.offer(stack7);
    	
    	nextInventory.setDisable(false);
    	
    	
    	
    	Image img = new Image("ui/Lucky.png");
        random.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(58, 60, false, false, false, true))));
    }
}

