package com.example.Educationalloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Educationalloan.Model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer>{

}
