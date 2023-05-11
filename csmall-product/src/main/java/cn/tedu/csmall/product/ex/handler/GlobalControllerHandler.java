package cn.tedu.csmall.product.ex.handler;

import cn.tedu.csmall.product.ex.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.validation.BindException;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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
public String handleBindException(BindException e) {
    log.warn("程序运行过程中出现了BindException，将统一处理！");
    log.warn("异常信息：{}", e.getMessage());
//    第一种解决方式，随机返回错误提示
//    String message = e.getFieldError().getDefaultMessage();
//    return message;
//    第二种解决方式，拼接错误提示
//    StringJoiner stringJoiner = new StringJoiner("，", "请求参数错误，", "！");
//    List<FieldError> fieldErrors = e.getFieldErrors();
//    for(FieldError fieldError : fieldErrors) {
//        String defaultMessage = fieldError.getDefaultMessage();
//        stringJoiner.add(defaultMessage);
//    }
//    return stringJoiner.toString();
//    第三种解决方式，返回错误提示列表
    List<String> messageList = new ArrayList<>();
    List<FieldError>fieldErrors = e.getFieldErrors();
    for (FieldError fieldError : fieldErrors) {
        String defaultMessage = fieldError.getDefaultMessage();
        messageList.add(defaultMessage);
    }
    return messageList.toString();
}
//    建议要有，但不能只有。
    @ExceptionHandler
    public String handleThrowable(Throwable e) {
        log.warn("程序运行过程中出现了Throwable，将统一处理！");
        log.warn("异常信息：{}", e.getMessage());
        return e.getMessage();
    }
}
