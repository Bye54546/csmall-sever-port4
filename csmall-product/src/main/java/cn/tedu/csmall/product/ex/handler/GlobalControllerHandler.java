package cn.tedu.csmall.product.ex.handler;

import cn.tedu.csmall.product.ex.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalControllerHandler {
    @ExceptionHandler
    public String handleServiceException(ServiceException e) {
        log.warn("程序运行过程中出现了ServiceException，将统一处理！");
        log.warn("异常信息：{}", e.getMessage());
        return e.getMessage();
    }
//    为什么要处理异常？怎么处理异常？
//    告诉使用者为什么会发生异常，并给出解决方案使得避免后续异常再次发生





//    建议要有，但不能只有。
    @ExceptionHandler
    public String handleThrowable(Throwable e) {
        log.warn("程序运行过程中出现了Throwable，将统一处理！");
        log.warn("异常信息：{}", e.getMessage());
        return e.getMessage();
    }
}
