package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture {
	
	
	
	public static void captureLogs(String msg) {
		Logger log=Logger.getLogger(LogCapture.class);
		DOMConfigurator.configure("../YTFrameWork/log4j.xml");
		log.debug(msg);
		log.info(msg);
		log.error(msg);
		
	}
	
}
