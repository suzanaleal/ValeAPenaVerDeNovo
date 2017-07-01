package cdp;

import java.util.ArrayList;


public class Observable {
	
	protected ArrayList<Observer> sensoresPes = new ArrayList<Observer>();
	protected ArrayList<Observer> sensoresTemp = new ArrayList<Observer>();
	
	
	
	public ArrayList<Observer> getSensoresPes() {
		return sensoresPes;
	}

	
	public ArrayList<Observer> getSensoresTemp() {
		return sensoresTemp;
	}

	
	public void addObserver(Observer ob) {
		if(ob instanceof SensorPes)
		{
			this.sensoresPes.add(ob);
		}
		else
		{
			if(ob instanceof SensorTemp)
			{
				this.sensoresTemp.add(ob);
			}
		}
	}
	
	public void deleteObserver(Observer ob)
	{
		if(ob instanceof SensorPes)
		{
			this.sensoresPes.remove(ob);
		}
		else
		{
			if(ob instanceof SensorTemp)
			{
				this.sensoresTemp.remove(ob);
			}
		}
	}
	
	public void notifyObservers()
	{
		for(Observer ob: this.sensoresPes)
		{
			ob.update(this);
		}
		
		for(Observer ob: this.sensoresTemp)
		{
			ob.update(this);
		}
	}
	
}
