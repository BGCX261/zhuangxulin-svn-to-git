/**
 * 
 */
package com.zhuangxulin.tools.breakpointcontinues;

/**
 * @author zhuangxulin2003
 * 
 */
public class TestMethod {
	public TestMethod() { // /xx/weblogic60b2_win.exe

		try {
			SiteInfoBean bean = new SiteInfoBean(
					"http://192.168.1.212:8080/a/2.rar",
					"/Users/zhuangxulin2003/Public/Films", "2.rar", 50);
			// SiteInfoBean bean = new
			// SiteInfoBean("http://localhost:8080/down.zip","L:\\temp","weblogic60b2_win.exe",5);
			SiteFileFetch fileFetch = new SiteFileFetch(bean);
			fileFetch.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		new TestMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("cost time:" + (endTime - startTime));

	}
}
