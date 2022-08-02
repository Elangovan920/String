package org.excels;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pa3 {
	
	@DataProvider(name="login",indices= {0,1})
	private Object[][] details() {
		Object[][] obj = new Object[][]{{"elango","elango123","ELAMGO"},
		{"boopathi","boopi","BOOPATHI"},{"karim","karim123","KARIM"},{"kavi","kavi123","KAVI"},
	};
		return obj;
//	
//	@Parameters({"uname","password"})
//	@Test
//	private void test21(String uname,String password) {
//		System.out.println(uname);
//		System.out.println(password);
//	}
//	@Parameters({"uname","password"})
//	@Test
//	private void test22(String uname,String password) {
//		System.out.println(uname);
//		System.out.println(password);
//	}
//	@Parameters({"uname","password"})
//	@Test
//	private void test23(String uname,String password) {
//		System.out.println(uname);
//		System.out.println(password);
//		System.out.println("====================");
//	}
//	@Test
//	private void test24() {
//		System.out.println("test24");
//		System.out.println(Thread.currentThread().getId());
//	}
//	@Test
//	private void test25() {
//		System.out.println("test25");
//		System.out.println(Thread.currentThread().getId());
//	}
//	@Test
//	private void test26() {
//		System.out.println("test26");
//		System.out.println(Thread.currentThread().getId());
//	}
//	@Test
//	private void test27() {
//		System.out.println("test27");
//		System.out.println(Thread.currentThread().getId());
	}
}
