package com.riceclient.launcher.main;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.riceclient.launcher.utils.OSHelper;

import org.apache.commons.io.FileUtils;
public class Launcher {
	
	private File dataDir;
	private File gameAssets;
	
	private File natives;
	private File libraries;
	private File jar;
	
	public Launcher() {
		dataDir = new File(OSHelper.getOS().getMc());
		gameAssets = new File(dataDir + File.separator + "assets");
		
		natives = new File(dataDir + File.separator + "natives.zip");
		libraries = new File(dataDir + File.separator + "libraries.zip");
		jar = new File(dataDir + File.separator + "fr" + "Cringe.jar");
	}
	
	public void update() throws MalformedURLException, IOException  {
		FileUtils.copyURLToFile(new URL("https://github.com/HackingBatard/htfgwefe/blob/main/libraries.zip"), libraries);
		FileUtils.copyURLToFile(new URL("https://github.com/HackingBatard/htfgwefe/blob/main/natives.zip"), natives);
		FileUtils.copyURLToFile(new URL("https://github.com/HackingBatard/htfgwefe/blob/main/Cringe.jar"), jar);
	}
	
	public void launch() {
		
	}
	
}
