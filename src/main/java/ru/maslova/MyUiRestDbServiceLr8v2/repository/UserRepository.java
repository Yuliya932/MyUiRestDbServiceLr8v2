package ru.maslova.MyUiRestDbServiceLr8v2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslova.MyUiRestDbServiceLr8v2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail (String email);
}
