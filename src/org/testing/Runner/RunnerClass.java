package org.testing.Runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testing.BasePackage.BaseClass;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RunnerClass extends BaseClass{
	
	public static void main(String[] args) throws BiffException, IOException {
		
		//Creating Suite Objects
		XmlSuite xst = new XmlSuite();
		xst.setName("Execution1");

		//Creating Test Objects
		XmlTest xtest = new XmlTest(xst);
		
		//Extract the executable test cases from Sheet
		File f = new File("../YTFrameWork/YTTestCases.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet st = wk.getSheet("TC List");
		
		int row=st.getRows();
		int col=st.getColumns();
		
		//Creating Array list for classes
		ArrayList<XmlClass> tclist = new ArrayList<XmlClass>();
		
		for (int i=1; i < row ; i++)
		{
			Cell c=st.getCell(4, i);
			if(c.getContents().equals("Y"))
			{
				Cell pkgname = st.getCell(2, i);
				Cell classname = st.getCell(3, i);
				String classnamefill = pkgname.getContents()+"."+classname.getContents();
				XmlClass xclass = new XmlClass(classnamefill);
				tclist.add(xclass);   //add the classes to Array List
				
			}
		}
			
			System.out.println("Total Number of Test cases to be executed :" + tclist.size());
			xtest.setClasses(tclist);
			
			//Creating array list for Tests and add the Classes list to the Test
			ArrayList<XmlTest> xtestList = new ArrayList<XmlTest>();
			xtestList.add(xtest);
			xst.setTests(xtestList);
			
			//Creating array list for Suites and add the Test list to the Test
			ArrayList<XmlSuite> xsuiteList = new ArrayList<XmlSuite>();
			xsuiteList.add(xst);
			
			//Creating TestNG object and available for Run
			TestNG tng = new TestNG();
			tng.setXmlSuites(xsuiteList);
			tng.run();
			
				
		}

}
