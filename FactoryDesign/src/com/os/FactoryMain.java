/**
 * 
 */
package com.os;

//import java.lang.management.OperatingSystemFactory;
//import com.os.*;
//import com.os.Os;

/**
 * @author varshil.panchal
 *
 */
public class FactoryMain  {

	public static void main(String[] args) {
		OperatingSystemFactory obj = new OperatingSystemFactory();
		Os ob = obj.show("android"); 
		ob.display();

	}

}
