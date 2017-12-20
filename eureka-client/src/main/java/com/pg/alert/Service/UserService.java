package com.pg.alert.Service;

import com.pg.alert.dao.UserDao;
import com.pg.alert.entity.UserEO;
import com.pg.alert.model.UserMO;
import com.pg.alert.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 10:31 2017/12/20
 * @Modified By
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 添加新用户
     * @param userMo
     * @return
     */
    @Transactional
    public String addUser(UserMO userMo){
        UserEO userEO = new UserEO();
        BeanUtil.copy(userMo,userEO);
        userDao.save(userEO);
        return "添加成功";
    }

    /**
     * jdbc 查询所有用户
     * @return
     */
    public List<Map<String,Object>> getAllUser(){
        return userDao.queryData();
    }


}
