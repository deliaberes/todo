/*
* File: Controller.java
* Author: Béres Délia
* Copyright: 2024, Béres Délia
* Group: Szoft II_1_E
* Date: 2024-01-14
* Github: https://github.com/deliaberes/todo.git
* Licenc: GNU GPL
*/

import java.util.ArrayList;

import hu.szit.Convert;

public class Controller {
    TodoService service;

    public Controller() {
        service = new TodoService();
        getTodos();
    }

    public void getTodos() {
        String todos = service.getTodos();
        ArrayList<Todo> todolist = Convert.toListObject(todos, Todo.class);
        for (Todo todo : todolist) {
            System.out.println(
                    "userId: " + todo.userId + " | id: " + todo.id + " | title: " + todo.title + " | completed: "
                            + todo.completed);
        }
    }

}