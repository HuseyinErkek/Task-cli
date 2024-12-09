package com.example.Task_cli.Repository;

import com.example.Task_cli.Entity.Task;
import com.example.Task_cli.util.JsonUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {
    public List<Task> getAllTasks() {
        return JsonUtil.readFromJsonFile();
    }

    public void saveAllTasks(List<Task> tasks) {
        JsonUtil.writeToJsonFile(tasks);
    }
}
