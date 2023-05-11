package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.param.AlbumAddNewParam;
import cn.tedu.csmall.product.service.IAlbumService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "01.相册管理相关接口")
@RequestMapping(value = "/album", method = RequestMethod.POST)
@Slf4j
public class AlbumController {
    @Autowired
    private IAlbumService albumService;
    //    @RequestMapping("/add-new")
    @PostMapping("/album")
    @ApiOperation(value = "添加新的相册", notes = "添加新的相册")
    @ApiOperationSupport(order = 1)
//    与之相似的注解还有@GetMapping、@PutMapping、@DeleteMapping,@PatchMapping
    public String addNew(AlbumAddNewParam albumAddNewParam) {

        try {
            albumService.addNew(albumAddNewParam);
            return "添加成功";
        } catch (ServiceException e) {
            return e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            return "添加失败";
        }
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除相册", notes = "删除相册")
    @ApiOperationSupport(order = 200)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "albumId", value = "相册id", required = true, example = "1"),
            @ApiImplicitParam(name = "userId", value = "用户Id", required = true, example = "1")
    })
    public String delete(Long albumId, Long userId) {
        throw new RuntimeException("没做呢点什么！！！！！");
    }
}
