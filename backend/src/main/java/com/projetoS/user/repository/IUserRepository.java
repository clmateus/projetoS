package com.projetoS.user.repository;

import com.projetoS.user.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {
}
