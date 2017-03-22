package processes;

public class ReaderManager {

	public static IReader getReader() throws Exception{
		//Intento crear URLProcess
		try {
			URLReaderProcess urlReaderProcess = new URLReaderProcess();
			System.out.println("Creado reader de tipo URL");
			return urlReaderProcess;
		}
		catch(Exception ex) {
			try {
				String path = "C:\\Users\\aguado\\Kisters_workspace\\Albergues\\resources\\files\\albergues.csv";
				try {
					FileReaderProcess fileReaderProcess = new FileReaderProcess(path);
					System.out.println("Creado reader de tipo File");
					return fileReaderProcess;
				}
				catch(Exception ex3) {
					throw new Exception("No se ha podido crear un Proceso Reader");
				}
				
			}
			catch(Exception ex2) {
				//Intento crear DBReaderProcess
				DBReaderProcess dbReaderProcess = new DBReaderProcess();
				System.out.println("Creado reader de tipo BBDD");
				return dbReaderProcess;
			}
					
		}
	}
	
	public static IReader getReader(String type) {
		if (type=="URL") {
			
		}
		else if (type=="File") {
			
		}
		return null;
	}
	
}
