package com.struts.demo;/** * @ClassName com.struts.demo.HelloWorldAction * @Description TODO * @Author mac * @Date 2019-05-25 07:33 AM * Version 1.0 **/public class HelloWorldAction {    public String helloWorld(){        System.out.println("成功该问Helloworld");        System.out.println("调用Service");        return "success";    }}