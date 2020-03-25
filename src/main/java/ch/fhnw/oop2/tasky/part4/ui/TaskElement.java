package ch.fhnw.oop2.tasky.part4.ui;

import ch.fhnw.oop2.tasky.part4.Logic.Task;
import javafx.scene.Node;

public class TaskElement extends Node {
	private ch.fhnw.oop2.tasky.part4.Logic.Task task;

	public TaskElement(ch.fhnw.oop2.tasky.part4.Logic.Task task) {
		this.task = task;
	}

}
