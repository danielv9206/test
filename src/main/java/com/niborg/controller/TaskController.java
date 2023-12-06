package com.niborg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niborg.dto.TaskDto;
import com.niborg.service.TaskService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping("/all")
    public List<TaskDto> getAll() {
        return taskService.getAll();
    }

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Integer id) {
        return taskService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody TaskDto dto) {
        taskService.save(null, dto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id,
            @RequestBody TaskDto dto) {
        taskService.save(id, dto);
    }
}