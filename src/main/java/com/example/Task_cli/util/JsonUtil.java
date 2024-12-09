package com.example.Task_cli.util;

import com.example.Task_cli.Entity.Task;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    private static final String FILE_PATH = "";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static List<Task> readFromJsonFile() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            return objectMapper.readValue(file, new TypeReference<List<Task>>() {});
        } catch (IOException e) {
            throw new RuntimeException("JSON dosyası okunamadı!", e);
        }
    }

    public static void writeToJsonFile(List<Task> tasks) {
        try {
            objectMapper.writeValue(new File(FILE_PATH), tasks);
        } catch (IOException e) {
            throw new RuntimeException("JSON dosyasına yazılamadı!", e);
        }
    }
}
