package com.baizhi.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 38178 on 2018/11/12.
 */
public class Menu implements Serializable {

    private Integer id;
    private String title;
    private String url;
    private String iconCls;
    private Integer parent_id;
    private List<Menu> menus = new ArrayList<>();

    public Menu() {
    }

    public Menu(Integer id, String title, String url, String iconCls, Integer parent_id, List<Menu> menus) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.iconCls = iconCls;
        this.parent_id = parent_id;
        this.menus = menus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", parent_id=" + parent_id +
                ", menus=" + menus +
                '}';
    }
}
