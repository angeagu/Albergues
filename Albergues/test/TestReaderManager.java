import java.util.Iterator;
import java.util.List;

import beans.Albergue;
import processes.IReader;
import processes.ReaderManager;


public class TestReaderManager {

	public static void main(String[] args) throws Exception {

		IReader reader = ReaderManager.getReader();
		List listaAlbergues = reader.read();

	}
}
