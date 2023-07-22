package com.project.spring.lesson61.repo;

import com.project.spring.lesson61.entity.Mouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MouseRepo extends JpaRepository<Mouse, Long> {

    List<Mouse> findAllByAge(Integer age);

    @Transactional
    @Modifying
    int updateMouseById(Long id);

    @Transactional
    @Modifying
    boolean deleteMouseById(Long id);

}
