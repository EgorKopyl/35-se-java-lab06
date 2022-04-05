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

/** Представляет
 * методы для помещения
 * и извлечения задач
 * обработчиком потока;
 * шаблон Worker Thread
 * @author 35
 * @version 1.0
 * @see Command
 */

public interface Queue {
	/** Добавляет новую задачу в очередь;
	 * шаблон Worker Thread
	 * @param cmd задача
	 */
	void put(Command cmd);
	/** Удаляет задачу из очереди;
	 * шаблон Worker Thread
	 * @return удаляемая задача
	 */
	Command take();
}