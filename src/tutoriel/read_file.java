/*try {
	FileReader file = new FileReader("name_fichier.ext");
	BufferedReader bufRead = new BufferedReader(file);

	String line = bufRead.readLine();
	while ( line != null) {
	   	String[] array = line.split(",");
	   
	    int id = Integer.parseInt(array[0]);
	    float val = Float.parseFloat(array[6]);
	        		
	    line = bufRead.readLine();
	}

	bufRead.close();
	file.close();
	
} catch (IOException e) {
	e.printStackTrace();
}

// Create a date format to read all the dates
SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

try {
	Date timeOfLine = df.parse(timeString);
} catch (ParseException e) {
	e.printStackTrace();
}
*/