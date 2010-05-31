package org.jabox.environment;

import java.io.File;

import junit.framework.TestCase;

public class EnvironmentTest extends TestCase {

	public void testGetHomeDir() throws Exception {
		String homeDir = Environment.getHomeDir();
		assertEquals(System.getProperty("user.home"), homeDir);
	}

	public void testGetBaseDir() throws Exception {
		String baseDir = Environment.getBaseDir();
		assertEquals(Environment.getHomeDir() + File.separator + ".jabox"
				+ File.separator, baseDir);
	}

	public void testGetBaseDirFile() throws Exception {
		File baseDirFile = Environment.getBaseDirFile();
		assertEquals(Environment.getBaseDir(), baseDirFile.getAbsolutePath()
				+ File.separator);
	}
}
