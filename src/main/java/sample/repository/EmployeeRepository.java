package sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sample.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
