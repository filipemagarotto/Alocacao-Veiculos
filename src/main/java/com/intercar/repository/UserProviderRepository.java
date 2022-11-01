package com.intercar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intercar.models.UserProvider;

public interface UserProviderRepository extends JpaRepository<UserProvider, Long>{

}
