package cn.tedu.csmall.product;

import cn.tedu.csmall.product.pojo.entity.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class CsmallProductApplicationTests {

    @Test
    void contextLoads() {}
    @Autowired
    DataSource dataSource;
    @Test
    void testDataSource() throws SQLException {
        dataSource.getConnection();
    }
    @Test
    void testDataSource2() throws SQLException {
        Album album = new Album();
        album.setId(1L);
        album.setName("test");
        System.out.println(album);
    }
}
