package ru.maslova.MyUiRestDbServiceLr8v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslova.MyUiRestDbServiceLr8v2.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName (String name);
}