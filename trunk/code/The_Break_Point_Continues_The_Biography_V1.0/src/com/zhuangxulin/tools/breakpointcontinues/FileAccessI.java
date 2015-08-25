/**
 * 
 */
package com.zhuangxulin.tools.breakpointcontinues;

import java.io.*;

/**
 * @author zhuangxulin2003
 * 
 */
public class FileAccessI implements Serializable {
	/**
	 * @uml.property  name="oSavedFile"
	 */
	RandomAccessFile oSavedFile;
	/**
	 * @uml.property  name="nPos"
	 */
	long nPos;

	public FileAccessI() throws IOException {
		this("", 0);
	}

	public FileAccessI(String sName, long nPos) throws IOException {
		oSavedFile = new RandomAccessFile(sName, "rw");
		this.nPos = nPos;
		oSavedFile.seek(nPos);
	}

	public synchronized int write(byte[] b, int nStart, int nLen) {
		int n = -1;
		try {
			oSavedFile.write(b, nStart, nLen);
			n = nLen;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}
}
