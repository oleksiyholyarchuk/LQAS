
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileReader {

	public static ArrayList<String> readFileToArrayList(String fileToRead)
			throws IOException {
		ArrayList<String> lines = new ArrayList<String>();
		InputStream ips = new FileInputStream(fileToRead);
		InputStreamReader ipsr = new InputStreamReader(ips);
		BufferedReader br = new BufferedReader(ipsr);
		String line;
		while ((line = br.readLine()) != null) {
			lines.add(line);
		}
		br.close();

		return lines;
	}
}
