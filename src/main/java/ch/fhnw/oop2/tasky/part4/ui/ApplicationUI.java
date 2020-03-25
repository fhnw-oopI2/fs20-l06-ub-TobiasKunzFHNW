package ch.fhnw.oop2.tasky.part4.ui;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class ApplicationUI extends BorderPane {
	private static final int MARGIN = 5;
	private Button buttonTop;
	private Button buttonRight;
	private Button buttonBottom;
	private Button buttonLeft;
	private TextArea textArea;

	private Parent details;
	private Parent footer;
	private HBox center;
	private int rightWidth = Starter.WIDTH / 3;
	private int centerWidth = Starter.WIDTH / 3 * 2;


	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		details = new TaskDetails();
		footer = new Footer();
		center = new HBox(new TaskElementContainer(TaskElementContainer.Status.Todo),
				new TaskElementContainer(TaskElementContainer.Status.Doing),
				new TaskElementContainer(TaskElementContainer.Status.Done));

		center.getChildren().forEach(container -> HBox.setHgrow(container, Priority.ALWAYS));
	}


	private void layoutControls() {
		setMargin(details, new Insets(20));
		setMargin(footer, new Insets(20));
		setMargin(center, new Insets(20));
		//details.prefWidth(Starter.WIDTH/3);
		setCenter(center);
		setRight(details);
		setBottom(footer);
	}
}
