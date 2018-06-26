package com.thinkxfactor.zomatoplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
