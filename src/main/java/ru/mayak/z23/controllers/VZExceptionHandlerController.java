package ru.mayak.z23.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class VZExceptionHandlerController {
    @ExceptionHandler(Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", ex.getMessage());
        mv.addObject("request", request);
        mv.setViewName("custom-error");
        return mv;
    }
}
