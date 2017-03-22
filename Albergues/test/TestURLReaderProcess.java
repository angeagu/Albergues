import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import processes.URLReaderProcess;
import beans.Albergue;


public class TestURLReaderProcess {

	public static void main (String[] args) {
		
		try {
			URLReaderProcess readerProcess = new URLReaderProcess();
			readerProcess.read();
			
		}
		catch(Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
	}
}
