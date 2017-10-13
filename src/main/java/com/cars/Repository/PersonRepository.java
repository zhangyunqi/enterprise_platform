package com.cars.Repository;

import com.cars.Domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 人员CrudRepository
 */
@Repository
public interface PersonRepository extends CrudRepository<Person,String> {

}
