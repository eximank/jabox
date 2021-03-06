/*
 * Jabox Open Source Version
 * Copyright (C) 2009-2010 Dimitris Kapanidis                                                                                                                          
 * 
 * This file is part of Jabox
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package org.jabox.eclipse_startup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import junit.framework.TestCase;

import org.jabox.utils.DownloadHelper;
import org.xml.sax.SAXException;

public abstract class DownloadEclipseTest extends TestCase {

	public void testDownloadFile() throws MalformedURLException,
			FileNotFoundException, IOException, SAXException {
		EclipseRunner er = EclipseRunner.getInstance();
		DownloadHelper.downloadFile(er.getDownloadURL(), new File(
				"target/eclipse"));
	}
}
