package com.baizhi.service;

import com.baizhi.dao.MenuDao;
import com.baizhi.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 38178 on 2018/11/12.
 */

@Transactionalmysql
@localhost
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao dao;


    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Menu> selectMenu() {

        return dao.selectMenu();
    }
}
