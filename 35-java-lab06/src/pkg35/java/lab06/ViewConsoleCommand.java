/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35.java.lab06;

/**
 *
 * @author Phoen1x
 */
public class ViewConsoleCommand implements ConsoleCommand {
	/** Объект, реализующий интерфейс {@linkplain View};
	 * обслуживает коллекцию объектов {@linkplain ex01.Item2d}
	 */
	private View view;

	public ViewConsoleCommand(View view) {
		this.view = view;
	}

	@Override
	public char getKey() {
		return 'v';
	}

	@Override
	public String toString() {
		return "'v'iew";
	}

	@Override
	public void execute() {
		System.out.println("View current.");
		view.viewShow();
	}
}