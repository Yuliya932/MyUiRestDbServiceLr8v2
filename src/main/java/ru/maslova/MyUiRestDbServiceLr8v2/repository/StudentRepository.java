package ru.maslova.MyUiRestDbServiceLr8v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.maslova.MyUiRestDbServiceLr8v2.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}