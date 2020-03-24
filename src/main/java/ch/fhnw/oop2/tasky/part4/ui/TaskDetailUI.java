package ch.fhnw.oop2.tasky.part4.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TaskDetailUI extends VBox {
	private static final int PADDING = 10;
	private static final int WIDTH = Starter.WIDTH / 3;
	private static final double LABEL_WIDTH = 0.20;
	private static final double ELEMENT_WIDTH = 0.80;

	private TextField textFieldID, textFieldTitle;
	private Label labelID, labelTitle, labelDesc, labelDue, labelState;
	private TextArea textAreaDesc;
	private DatePicker datePickerDue;
	private ComboBox comboBoxState;
	private Button buttonSave, buttonDelete;


	public TaskDetailUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		labelID = new Label("ID: ");
		textFieldID = new TextField();

		labelTitle = new Label("Title: ");
		textFieldTitle = new TextField();

		labelDesc = new Label("Description: ");
		textAreaDesc = new TextArea();

		labelDue = new Label("Date: ");
		datePickerDue = new DatePicker();

		labelState = new Label("State: ");
		comboBoxState = new ComboBox();

		buttonSave = new Button("Save");
		buttonDelete = new Button("Delete");
	}

	private void layoutControls() {
		getChildren().add(wrapInHbox(labelID, textFieldID));
		getChildren().add(wrapInHbox(labelTitle, textFieldTitle));
		getChildren().add(wrapInHbox(labelDesc, textAreaDesc));
		getChildren().add(wrapInHbox(labelDue, datePickerDue));
		getChildren().add(wrapButtons(buttonSave, buttonDelete));

	}

	private HBox wrapInHbox(Label label, Control element) {
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(PADDING));
		hBox.getChildren().addAll(label, element);
		label.setPrefWidth(WIDTH * LABEL_WIDTH);
		element.setPrefWidth(WIDTH * ELEMENT_WIDTH);
		return hBox;
	}

	private HBox wrapButtons(Button b1, Button b2) {
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(PADDING));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(b1, b2);
		return hBox;
	}
}
