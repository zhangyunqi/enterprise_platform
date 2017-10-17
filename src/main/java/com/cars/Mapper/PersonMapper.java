package com.cars.Mapper;

import com.cars.Domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {
    @Select("SELECT * FROM person t WHERE t.guid = #{id}")
    Person findPersonById(@Param("id") String id);
}
