package com.sugar.proxy;

/**
 * @author sugar
 *
 * 抽象主题角色Subject：天气
 */
public interface Weather {
	
	public void request(String city);
	public void display(String city);
	public void isValidCity(String city);
	
}
