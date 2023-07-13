package org.testing.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownElementHandle {
	
	public void selectbyIndex(int indexValue, WebElement element)
	{
		Select selList = new Select(element);
		selList.selectByIndex(indexValue);
	}
	
	

}
