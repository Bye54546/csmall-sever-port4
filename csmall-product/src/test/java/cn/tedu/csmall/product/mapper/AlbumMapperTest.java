package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.param.AlbumAddNewParam;
import cn.tedu.csmall.product.service.IAlbumService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class AlbumMapperTest {
    @Autowired
    AlbumMapper albumMapper;
    @Test
    void testInsertAlbum() {
        Album album = new Album();
        album.setName("1T");
        System.out.println("插入前：" + album);
        albumMapper.insert(album);
        System.out.println("插入后：" + album);
        System.out.println(album);
    }
    @Test
    void deleteById(){
        albumMapper.deleteById(15);
    }
    @Test
    void deleteByMap(){
        Map<String,Object> map = new HashMap<String,Object>(){{
            put("id",14);
        }};
        albumMapper.deleteByMap(map);
    }


}
