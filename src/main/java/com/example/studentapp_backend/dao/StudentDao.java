package com.example.studentapp_backend.dao;

import com.example.studentapp_backend.model.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Students , Integer> {
}
