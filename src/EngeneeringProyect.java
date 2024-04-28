
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class EngeneeringProyect {
	
	private static JFrame cuadroTexto;
	private static JTextField locationField;
	private static JTextArea weatherDisplay;
	private static JButton fetchButton;
	private static String APIKey="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJidXN0bWFyaW9Ab3V0bG9vay5jb20iLCJqdGkiOiI4OGM0OTZlMC01MDdjLTQyNjgtOTcxYy00MWNiZDQyMTY3MjciLCJpc3MiOiJBRU1FVCIsImlhdCI6MTcxMzgxMjE5NSwidXNlcklkIjoiODhjNDk2ZTAtNTA3Yy00MjY4LTk3MWMtNDFjYmQ0MjE2NzI3Iiwicm9sZSI6IiJ9.DgMDdxPXiangA3BRy9hToFVNN7WhwobEXkm3NffqhXc";
	
	private static String fetchWeatherData(String CP) {
		try {
			URL url=new URL("https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/horaria/"+CP+"?api_key="+APIKey);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();	
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json;charset=ISO_8859_1");
			connection.setDoInput(true);

		} catch (Exception e){
			return "Problema al encontrar la información. Por favor, revisa el nombre de la ciudad o la API Key.";
		}
		return "line";
	}
	
	
	public static void main(String[] args) {
	
//	En esta parte se creará una ventana donde se monstrarán los resultados obtendos.
	JFrame cuadroTexto=new JFrame ("Proyecto Ingeniería: API Meteorológica");
	cuadroTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//En esta parte si cerremos la ventana, se finaliazrá el programa

	cuadroTexto.setSize(400,300);	//Tamaño de la ventana
	cuadroTexto.setLayout(new FlowLayout());	//?
	
	JTextField locationField=new JTextField(15);
	JButton fetchButton=new JButton ("Continuar");
	JTextArea weatherDisplay=new JTextArea (10, 30);
	weatherDisplay.setEditable(false);
	
	cuadroTexto.add(new JLabel("Introduce el Código Postal de la ciudad"));
	cuadroTexto.add(locationField);
	cuadroTexto.add(fetchButton);
	cuadroTexto.add(weatherDisplay);
	
	fetchButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String CP=locationField.getText();
			String weatherInfo=fetchWeatherData(CP);
			weatherDisplay.setText(weatherInfo);
		}
	});
	
	
	
	
	cuadroTexto.setVisible(true);	//??	
	
	
	
	
	
	
	
	
	/*
	private static URL url;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Comienzo del código
		
	try {
		URL url = new URL ("https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/horaria/28940?api_key="
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
*/
	
	}

}
