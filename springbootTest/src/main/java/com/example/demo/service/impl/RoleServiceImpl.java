package com.example.demo.service.impl;

import com.example.demo.dao.RoleDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.RoleInfo;
import com.example.demo.entity.SelectUser;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author:fjh
 * @Date: 11:23
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserDao userDao;
    @Override
    public int insertUser(RoleInfo roleInfo) {

        return roleDao.saveUser(roleInfo);
    }

    @Override
    public int updateUser(RoleInfo roleInfo) {
        return roleDao.updateUser(roleInfo);
    }

    @Override
    public List<SelectUser> selectUser(SelectUser selectUser) {
        List<SelectUser> list=userDao.selectUser(selectUser);

        SelectUser select=null;
        Iterator<SelectUser> iterator = list.iterator();

        while (iterator.hasNext()) {

            select = iterator.next();

            String sex = select.getSex();
            if("0".equals(sex))
            {
                sex="女";

            }
            else {
                sex="男";

            }
            select.setSex(sex);




        }

        return list;
    }

    @Override
    public int deleteUser(RoleInfo roleInfo) {
//        Date gmtcreate = roleInfo.getGmtCreate();
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        String format = simpleDateFormat.format(gmtcreate);
//         roleInfo.setCreateBy(format);


        return roleDao.deleteUser(roleInfo);
    }

    @Override
    public int delUserAll(RoleInfo roleInfo) {
        return roleDao.delUserAll(roleInfo);
    }
}
