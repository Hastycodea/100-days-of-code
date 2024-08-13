package com.hastycode.EventsGuru.repo;

import com.hastycode.EventsGuru.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
