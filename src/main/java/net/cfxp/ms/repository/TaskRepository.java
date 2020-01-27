package net.cfxp.ms.repository;

import net.cfxp.ms.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
