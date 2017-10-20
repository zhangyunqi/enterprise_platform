package com.cars.Mapper;

import com.cars.Domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface PersonMapper {
    @Select("SELECT * FROM person t WHERE t.guid = #{id}")
    Person findPersonById(@Param("id") String id);

    @Select("SELECT name,age FROM person t where t.guid = #{id}")
    HashMap<String,Object> findPersonNameAndAgeById(@Param("id") String id);
}
