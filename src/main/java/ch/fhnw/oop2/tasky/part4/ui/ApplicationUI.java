package ch.fhnw.oop2.tasky.part4.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane {
	private static final int MARGIN = 5;
	private Button buttonTop;
	private Button buttonRight;
	private Button buttonBottom;
	private Button buttonLeft;
	private TextArea textArea;

	private Parent right;
	private int rightWidth = Starter.WIDTH / 3;


	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		right = new TaskDetailUI();

	}

	private void layoutControls() {
		setAlignment(right, Pos.BOTTOM_LEFT);
		setRight(right);

	}
}
