package com.pg.alert.dao;

import com.pg.alert.entity.UserEO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 0:39 2017/12/20
 * @Modified By
 */
public interface UserDao extends CrudRepository<UserEO,Long>, UserDaoCustom{

    UserEO findById(Long id);

    //@Modifying结合@Query注解执行更新操作
    @Query("select t.name,t.age,t.id from UserEO t where t.name in ?1")
    Page<UserEO> findNames(List<String> users, Pageable pageable);


    @Query(value ="select t.name,t.age,t.id from UserEO t where t.name like :name ")
    List<UserEO> findLikeName(@Param("name") String name);

}
