package com.example.studentapp_backend.dao;

import com.example.studentapp_backend.model.Students;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends CrudRepository<Students , Integer> {


    @Query(value = "SELECT `id`, `adm_no`, `college_name`, `name`, `roll_no` FROM `student` WHERE `adm_no`=:adm_no",nativeQuery = true)
    List<Students> SearchStudents(@Param("adm_no") String adm_no);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `student` WHERE `id`=:id",nativeQuery = true)
    void StudentDelete(@Param("id") Integer id);
}
