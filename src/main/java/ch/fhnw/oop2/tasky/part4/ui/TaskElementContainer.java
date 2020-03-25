package ch.fhnw.oop2.tasky.part4.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.List;

public class TaskElementContainer extends VBox {
	public enum Status {Todo, Doing, Done}

	private Status status;
	private Label labelTitle;
	private HBox container;

	public TaskElementContainer(Status status) {
		this.status = status;
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		labelTitle = new Label(status.name());
		container = new HBox();
	}

	private void layoutControls() {
		getChildren().addAll(labelTitle, container);
		labelTitle.setPadding(new Insets(5));
		labelTitle.setMaxWidth(Integer.MAX_VALUE);
		labelTitle.setAlignment(Pos.TOP_CENTER);
		labelTitle.setFont(new Font(18));
		styleContainer();
	}

	private void styleContainer(){
		setVgrow(container, Priority.ALWAYS);
		setMargin(container,new Insets(10));
		container.setSpacing(5);
		container.setStyle("-fx-border-color: black");
	}

	public void setTasks(List<ch.fhnw.oop2.tasky.part4.Logic.Task> tasks) {
		container.getChildren().removeAll();
		tasks.forEach(t -> container.getChildren().add(new TaskElement(t)));
	}
}
