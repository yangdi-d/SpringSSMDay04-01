package com.ujiuye.mapper;

import com.ujiuye.pojo.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PersonMapper {

    @Select("select * from person where qqnum = #{qqnum} and qqpwd = #{qqpwd}")
    Person login(Person person);

    @Select("select * from person where qqnum = #{qqnum}")
    Person queryByQqnum(String qqnum);


    @Insert("insert into person(name,qqnum,qqpwd) values(#{name},#{qqnum},#{qqpwd})")
    int regist(Person person);

    @Delete("delete from person where id=#{id}")
    int delete(Person person);

    @Update("update person set name = #{name},qqpwd = #{qqpwd} where id=#{id}")
    int update(Person person);
}
