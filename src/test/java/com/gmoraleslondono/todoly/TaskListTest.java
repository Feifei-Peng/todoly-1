package com.gmoraleslondono.todoly;

import static org.junit.Assert.assertEquals;

import com.gmoraleslondono.todoly.Task;
import com.gmoraleslondono.todoly.TaskList;

import org.junit.Test;

public class TaskListTest {
    @Test
    public void testTaskListAdd() {
        // Arrage
        TaskList taskList = new TaskList();
        Task task = new Task(null, null, null, null);

        // Act
        taskList.addTask(task);

        // Assert
        assertEquals("test task list add a task", 1, taskList.getSize());
    }

    @Test
    public void testTaskListRemove() {
        // Arrage
        TaskList taskList = new TaskList();
        Task task = new Task(null, null, null, null);
        taskList.addTask(task);

        // Act
        taskList.removeTask(task);

        // Assert
        assertEquals("test task list remove a task", 0, taskList.getSize());
    }
}