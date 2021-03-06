package me.jrubio.todo.List;

import java.util.ArrayList;

import me.jrubio.todo.common.ITodoActionsInteractor;
import me.jrubio.todo.model.Entity.Todo;

/**
 * Example To.Do list app using MVP pattern.
 * Using android-support-v7 to support old Android versions.
 *
 * @author Jose I. Rubio (@joseirs)
 *
 */
public interface IListInteractor extends ITodoActionsInteractor {

    /**
     * Get all To.Dos from database
     * @return ArrayList
     */
    ArrayList<Todo> get();

    /**
     * Update old To.Do
     *
     * @param todo
     */
    void update(Todo todo);

}
