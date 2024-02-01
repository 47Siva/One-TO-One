package com.entityRelationship.EmployeeOneToOne.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entityRelationship.EmployeeOneToOne.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

	// 
//	@Query(value = "select e.job , e.name, e.number ,a.district,a.place, a.state"
//			+ "from employee e inner join address a on e.address_id = a.address_id "
//			+ "where e.id =:key or e.job =:key or e.name =:key or e.number =:key "
//			+ "or a.district=:key or a.place=:key "
//			+ "or a.state =:key ",nativeQuery =true )
//	
	//like using 
	@Query(value = "select e.job , e.name, e.number ,a.district,a.place, a.state "
			+ "from employee e inner join address a on e.address_id = a.address_id "
			+ "where e.id like %:key% or e.job like %:key% or e.name like %:key% or e.number like %:key% "
			+ "or a.district like %:key% or a.place like %:key% "
			+ "or a.state like %:key% ",nativeQuery =true )
	
	List<Object> getAny(Object key);

}
