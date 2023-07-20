package com.project.spring.lesson59.repo;

import com.project.spring.lesson59.entity.Phone;

public interface Repo {

    boolean save(Phone phone);

    Phone getById(Long id);

    boolean update(Phone phone);

    boolean delete(Phone phone);

}
