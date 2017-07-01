package cdp;

import java.util.ArrayList;


public class ArCondicionado extends Observable {

	private int currentTemp;
	private int mediaSensorPes = 0;
	private int mediaSensorTemp =0;
	private int mediaTempTotal;

	public ArCondicionado(){
		
		//A temperatura tem que ser sempre de 25 graus
		this.currentTemp = 25;
	}
	
	public void setCurrentTemp() {
		
		this.mediaTempTotal = (this.mediaSensoresPes() + this.mediaSensoresTemp())/2; 
	
		this.currentTemp = this.mediaTempTotal;
		
		notifyObservers();
	}
	
	public int mediaSensoresPes()
	{
		for(Observer ob : this.sensoresPes)
		{
			SensorPes sensorpes = (SensorPes)ob;
			
			this.mediaSensorPes += sensorpes.getNumPessoas();
			
		}
		this.mediaSensorPes = (int) Math.round(this.mediaSensorPes/this.getSensoresPes().size());
		
		return this.mediaSensorPes;
	}
	
	public int mediaSensoresTemp()
	{
		for(Observer ob: this.sensoresTemp)
		{
			SensorTemp sensortemp = (SensorTemp)ob;
			
			this.mediaSensorTemp += sensortemp.getTemperatura();
			
		}
		this.mediaSensorTemp = (int)Math.round(this.mediaSensorTemp/this.getSensoresTemp().size());		
		
		return this.mediaSensorTemp;
	}

	public int getCurrentTemp() {
		return currentTemp;
	}



	
}
