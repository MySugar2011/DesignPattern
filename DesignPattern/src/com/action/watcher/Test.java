package com.action.watcher;
/**
 * 观察者模式中，一个被观察者管理所有相依于它的观察者物件，并且在本身的状态改变时主动发出通知。
 * 这通常通过呼叫各观察者所提供的方法来实现。此种模式通常被用来实现事件处理系统。
 * 
 * 角色
 * 抽象被观察者角色：把所有对观察者对象的引用保存在一个集合中，每个被观察者角色都可以有任意数量的观察者。被观察者提供一个接口，可以增加和删除观察者角色。一般用一个抽象类和接口来实现。
 * 抽象观察者角色：为所有具体的观察者定义一个接口，在得到主题的通知时更新自己。
 * 具体被观察者角色：在被观察者内部状态改变时，给所有登记过的观察者发出通知。具体被观察者角色通常用一个子类实现。
 * 具体观察者角色：该角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。通常用一个子类实现。如果需要，具体观察者角色可以保存一个指向具体主题角色的引用。
 *
 * 实际应用
 * Tomcat 中控制组件生命周期的Lifecycle，Servlet实例的创建，Session的管理，Container等都是这个原理。
 * */
public class Test
{
     public static void main(String[] args)
     {
          Transporter transporter = new Transporter();

          Police police = new Police();
          Security security = new Security();

          transporter.addWatcher(police);
          transporter.addWatcher(security);

          transporter.notifyWatchers();
     }
}