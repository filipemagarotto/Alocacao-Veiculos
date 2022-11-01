package com.intercar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intercar.models.UserClient;

public interface UserClientRepository extends JpaRepository<UserClient, Long>{

}
