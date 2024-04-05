package com.test.crawl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//크롤링 + 자동화 테스트 도구(셀레니움)
		//m1();
		//m2();
		m3();

	}

	private static void m3() {
		
		String url = "http://localhost:8090/CrawlingTest/ex05.jsp";
		
		String webDriverID = "webdriver.chrome.driver";
		String path = "C:\\class\\dev\\chromedriver.exe";
		System.setProperty(webDriverID, path);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement> list = driver.findElements(By.cssSelector("#list2 > li"));
		
		for (WebElement li : list) {
			System.out.println(li.getText());
		}
		
	}





	private static void m2() {
		
		String url = "http://lms1.sist.co.kr/worknet/SLogin.asp";
		
		String webDriverID = "webdriver.chrome.driver";
		String path = "C:\\class\\dev\\chromedriver.exe";
		System.setProperty(webDriverID, path);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement strLoginID = driver.findElement(By.id("strLoginID"));
		strLoginID.sendKeys("지성근");
		
		WebElement strLoginPwd = driver.findElement(By.id("strLoginPwd"));
		strLoginPwd.sendKeys("5481");
		
		WebElement btn = driver.findElement(By.cssSelector(".login-btn > input"));
		btn.click();
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		WebElement td = driver.findElement(By.cssSelector("#content > div > div > div > div.panel-body > form > table > thead > tr:nth-child(5) > td:nth-child(2)"));
		
		System.out.println(td.getText());
		
	}//m2()


	private static void m1() {
		
		String webDriverID = "webdriver.chrome.driver";
		String path = "C:\\class\\dev\\chromedriver.exe";
		System.setProperty(webDriverID, path);
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://localhost:8090/CrawlingTest/ex05.jsp";
		driver.get(url);
		
		WebElement btn1 = driver.findElement(By.id("btn1"));
//		btn1.click();
		
		WebElement txt1 = driver.findElement(By.id("txt1"));
		txt1.sendKeys("홍길동입니다.");
		
		
		
		
	}//m1()

}










