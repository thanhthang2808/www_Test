package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iuh.fit.se.maithanhthang.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}