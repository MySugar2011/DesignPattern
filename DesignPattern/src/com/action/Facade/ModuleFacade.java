package com.action.Facade;
/**
 * 
 * 通常用在一个大的系统中有很多子系统时，这时多个子系统肯定要设计相互通信，
 * 但是每个子系统又不能将自己的内部数据过多的暴露给其他系统，不然就没必要划分子系统了
 * 每个子系统都会涉及一个门面，把别的系统感兴趣的数据封装起来，通过这个门面来进行访问
 * 一般门面类只有一个实例即是一个单例类
 * 
 * 优点
 * 1.松散耦合
 * 门面模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护。
 * 2.简单易用
 * 门面模式让子系统更加易用，客户端不再需要了解子系统内部的实现，也不需要跟众多子系统内部的模块进行交互，只需要跟门面类交互就可以了。
 * 3.更好的划分层次
 * 　通过合理使用Facade，可以帮助我们更好地划分访问的层次。有些方法是对系统外的，有些方法是系统内部使用的。把需要暴露给外部的功能集中到门面中，这样既方便客户端使用，也很好地隐藏了内部的细节。
 * 
 * 实际应用
 * Tomcat 中 Request和Response对象封装，StandardWrapper到ServletConfig封装、ApplicationContext到ServletContext的封装
 * 
 * 
 * */
public class ModuleFacade {
    
    ModuleA a = new ModuleA();
    ModuleB b = new ModuleB();
    ModuleC c = new ModuleC();
    /**
     * 下面这些是A、B、C模块对子系统外部提供的方法
     */
    public void a1(){
        a.a1();
    }
    public void b1(){
        b.b1();
    }
    public void c1(){
        c.c1();
    }
}