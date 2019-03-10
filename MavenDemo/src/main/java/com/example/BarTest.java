package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BarTest {
		
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Bar bar = new Bar();
		
		bar.setBar_name("Navarang Bar and rest");
		bar.setDrink("Red Wine");
		bar.setPrice(360.00);
		
		BarDao bardao =new BarDao();
		bardao.save(bar,factory);
		
		factory.close();
	}
}
