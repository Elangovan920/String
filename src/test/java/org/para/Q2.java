package org.para;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Q2 extends DataDriven {
	@DataProvider(name="account")
    private Object[][] date() throws IOException {
		Object[][] datas = datas();
		return datas;
          
	}
}
