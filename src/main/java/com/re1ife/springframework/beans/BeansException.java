package com.re1ife.springframework.beans;
/**
 * @author JustACP
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg){
        super(msg);
     }

    public BeansException(String msg, Throwable cause){
        super(msg,cause);
    }
}
