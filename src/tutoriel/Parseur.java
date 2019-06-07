package tutoriel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Parseur {
	
	protected String lien;
	
	public Parseur()
	{
		lien = "";
	}
	
	public void setlien(String s)
	{
		this.lien = s;
	}
	
	public void ParserFichier (String S)
	{try {
		FileReader file = new FileReader(S);
		BufferedReader bufRead = new BufferedReader(file);

		String line = bufRead.readLine();
		while ( line != null) {
		   	String[] array = line.split(",");
		   
		    //int id = Integer.parseInt(array[0]);
		    //float val = Float.parseFloat(array[6]);
		    Enregistrement e = new Enregistrement (array);  
		    System.out.println(e);
		    line = bufRead.readLine();
		}

		bufRead.close();
		file.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	// Create a date format to read all the dates
	/*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.s");
	SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ss");
	public Date ParserDate (String timeString)
	{
	Date timeOfLine = new Date();
	try {
		if (timeString.length() == 19)
		{timeOfLine = df.parse(timeString);}
		if (timeString.length() == 21)
		{timeOfLine = df1.parse(timeString);}
		if (timeString.length() == 22)
		{timeOfLine = df2.parse(timeString);}
	} catch (ParseException e1) {
		e1.printStackTrace();
	}
	return timeOfLine;
	*/

}
