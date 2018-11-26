import com.alibaba.druid.pool.DruidDataSource;
import com.baizhi.dao.MenuDao;
import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 38178 on 2018/11/12.
 */
public class TestMaven {
    ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");

    //测试数据源
    @Test
    public void test1() throws SQLException {
        DruidDataSource ds = (DruidDataSource) cpx.getBean("dataSource");
        System.out.println(ds.getConnection());
    }

    //测试连接池
    @Test
    public void test2() throws SQLException {
        SqlSessionFactory sf = (SqlSessionFactory) cpx.getBean("factory");
        System.out.println(sf.openSession().getConnection());
    }

    //测试dao
    @Test
    public void test3() throws SQLException {
        MenuDao dao = (MenuDao) cpx.getBean("menuDao");
        List<Menu> list = dao.selectMenu();
        for (Menu m : list) {
            System.out.println(m.getTitle());
            for (Menu d : m.getMenus()) {

                System.out.println(d.getTitle());

            }
        }
    }

    //测试service
    @Test
    public void test4() throws SQLException {
        MenuService service = (MenuService) cpx.getBean("menuService");
        List<Menu> list = service.selectMenu();

        for (Menu cate : list) {

            System.out.println(cate);
        }
    }
}
