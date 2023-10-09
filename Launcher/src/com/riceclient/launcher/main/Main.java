/**
 * Author: Cringe#3621
 */
package com.riceclient.launcher.main;

import java.io.IOException;
import java.net.MalformedURLException;

public class Main {
	
	public static Launcher launcher;
	
	public static void main(String args[]) {
		launcher = new Launcher();
		try {
			launcher.update();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
