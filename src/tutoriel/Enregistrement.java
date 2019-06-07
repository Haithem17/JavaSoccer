package tutoriel;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Enregistrement {

	private int tagID;
	private float posX;
	private float posY;
	private Date timestamp;
	private float energy;
	private float heading;
	private float speed;
	private float totalDistance;
	
	//fonction de parsage
	
	//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	public Date ParserDate (String timeString)
	{
	Date timeOfLine= null;
	String DateString =  timeString.substring(1, timeString.length()-1);
	try {
		if(DateString.length() == 19)
		{timeOfLine = df.parse(DateString+ ".000");}
		else if(DateString.length() == 21)
		{timeOfLine = df.parse(DateString+ "00");}
		else if(DateString.length() == 22)
		{timeOfLine = df.parse(DateString+ "0");}
		else timeOfLine = df.parse(DateString);
		
	} catch (ParseException e1) {
		e1.printStackTrace();
	}	
	return timeOfLine;
}

	//Constructeurs
	
	public Enregistrement(){
	} ;
	
	public Enregistrement( String[] line){
		
		this.timestamp = ParserDate(line[0]);
		this.tagID = Integer.parseInt(line[1]);
		this.posX  = Float.parseFloat(line[2]);
		this.posY  = Float.parseFloat(line[3]);
		this.heading = Float.parseFloat(line[4]);
		this.energy = Float.parseFloat(line[6]);
		this.speed  = Float.parseFloat(line[7]);
		this.totalDistance = Float.parseFloat(line[8]);
	}
	//getters
	
	public Date getTimeStamp()
	{
		return this.timestamp;
	}
	
	//setters
	
	public void setTagID(int a){
		this.tagID = a;
	}
	
	public void setPosX(float x){
		this.posX = x;
	}
	
	public void setPosY(float y){
		this.posY = y;
	}
	
	public void setTimestamp(Date t){
		this.timestamp = t;
	}
	
	public void setEnergie(float e){
		this.energy = e;
	}
	
	public void setHeading(float h){
		this.heading = h;
	}
	
	public void setSpeed(float s){
		this.speed = s;
	}
	
	public void setTotalDistance(float t){
		this.totalDistance = t;
	}
	
	
}
