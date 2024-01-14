/*
* File: TodoService.java
* Author: Béres Délia
* Copyright: 2024, Béres Délia
* Group: Szoft II_1_E
* Date: 2024-01-14
* Github: https://github.com/deliaberes/todo.git
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getTodos() {
        return client.get(url);
    }
}