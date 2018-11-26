package com.baizhi.controller;

import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 38178 on 2018/11/12.
 */
@Controller                 //json转成对象是反序列化，对象转成json是序列化
@RequestMapping("menu")   //@RestController  相当于Conntroller和ResponseBody
public class MenuController {
    //DI      //在Springmvcbean的cope有singleton,protoype,request,session等
    //request表示每次http请求时都会创建新的对象，在spring中如果依赖了
    //HttpservletRequest 和HttpServletResponse对象就会在每次请求时重新计算依赖，创建新的实例，
    //@Autowired(required = false)让注解不进行检查就可以实现
    @Autowired   //@Autowired(required = false)
    private MenuService service;


    @RequestMapping("selectmenu")
    @ResponseBody
    public List<Menu> selectMenu() {

        return service.selectMenu();
    }

}
