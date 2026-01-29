package com.example.bai2_ss8_module4.repository;

import com.example.bai2_ss8_module4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
