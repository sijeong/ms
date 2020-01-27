package net.cfxp.ms.service;

import net.cfxp.ms.entity.Task;
import net.cfxp.ms.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @PostFilter("hasRole()")
    public Iterable<Task> findAll(){
        return taskRepository.findAll();
    }

    @PreFilter("66=")
    public Iterable<Task> save(Iterable<Task> entities){
        return taskRepository.saveAll(entities);
    }
}
