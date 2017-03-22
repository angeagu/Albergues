import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import processes.FileReaderProcess;
import beans.Albergue;


public class TestReaderProcess {

	public static void main (String[] args) {
		
		String path = "C:\\Users\\aguado\\Kisters_workspace\\Albergues\\resources\\files\\albergues.csv";
		try {
			FileReaderProcess readerProcess = new FileReaderProcess(path);	
			List<Albergue> albergues = readerProcess.read();
			Iterator<Albergue> it = albergues.iterator();
			while(it.hasNext()) {
				Albergue albergue = it.next();
				System.out.println("Nombre Albergue: " + albergue.getNombre());
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}
		catch(IOException ex) {
			System.out.println("IOException: " + ex.getMessage());
		}
		
	}
}
