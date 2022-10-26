package com.jmu3d.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jmu3d.department.entity.Department;

@Repository

public interface DepartmentRepository extends JpaRepository <Department, Long>{
    Department findByDepartmentId(Long departmentId);
}
