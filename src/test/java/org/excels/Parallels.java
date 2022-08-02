package org.excels;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallels {
//	@Parameters({"uname","password"})
//	@Test
//	private void test1(String uname,String password) {
//		System.out.println("test1");
//		System.out.println(uname);
//		System.out.println(password);
//	}
//	@Parameters({"uname","password"})
//	@Test
//	private void test2(String uname,String password) {
//		System.out.println("test2");
//		System.out.println(uname);
//		System.out.println(password);
//	}
//	@Parameters({"uname","password"})
//	@Test
//	private void test3(String uname,String password) {
//		System.out.println("test3");
//		System.out.println(uname);
//		System.out.println(password);
//		System.out.println("=======================");
//		
//	}
	@Test
	private void test4() {
		System.out.println("test4");
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test
	private void test5() {
		System.out.println("test5");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void test6() {
		System.out.println("test6");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void test7() {
		System.out.println("test7");
		System.out.println(Thread.currentThread().getId());
	}
     
}
