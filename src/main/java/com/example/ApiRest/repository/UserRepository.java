package com.example.ApiRest.repository;

import com.example.ApiRest.models.UserModel;
import lombok.ToString;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
}
