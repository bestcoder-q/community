package sdjzu.edu.community.advice;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import sdjzu.edu.community.exception.CustomizeException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Lwq on 2020/3/1 12:16
 */
@ControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e,Model model){
        if(e instanceof CustomizeException){
            model.addAttribute("message",e.getMessage());
        }else {
            model.addAttribute("message","请求太快了，要不然你稍后再试试");
        }
        return new ModelAndView("error");
    }
}
