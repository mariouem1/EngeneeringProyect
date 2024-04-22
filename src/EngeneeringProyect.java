import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class EngeneeringProyect {

	private static URL url;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Comienzo del código
			
	try {
		URL url = new URL ("https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/diaria/45210?api_key="
				+ "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJidXN0bWFyaW9Ab3V0bG9vay5jb20iLCJqdGkiOiI4OGM0OTZlMC01MDdjLTQyNjgtOTcxYy00MWNiZDQyMTY3MjciLCJpc3MiOiJBRU1FVCIsImlhdCI6MTcxMzgxMjE5NSwidXNlcklkIjoiODhjNDk2ZTAtNTA3Yy00MjY4LTk3MWMtNDFjYmQ0MjE2NzI3Iiwicm9sZSI6IiJ9.DgMDdxPXiangA3BRy9hToFVNN7WhwobEXkm3NffqhXc");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	HttpURLConnection connection = (HttpURLConnection) url.openConnection();	
	connection.setRequestMethod("GET");
	connection.setRequestProperty("Content-Type", "application/json;charset=ISO_8859_1");
	connection.setDoInput(true);
	try {
		connection.connect();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
	
	}

}
