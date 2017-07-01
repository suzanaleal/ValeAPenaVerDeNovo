package cdp;

public class SensorTemp extends Sensor{

	int temperatura;
	
	public SensorTemp(int temperatura) {
		super();
		this.temperatura = temperatura;
	}


	public int getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}


	public void update(Observable obs) {
		
		ArCondicionado ar = (ArCondicionado)obs;
		
		if(ar.getCurrentTemp() > this.TEMP_TO_ALERT)
		{
			System.out.println("**ALERTA SensorTemp** Temperatura acima do limite!!! ("+ ar.getCurrentTemp() +")");
		}
		else if(ar.getCurrentTemp() < this.TEMP_TO_ALERT){
				System.out.println("** ALERTA SensorTemp** Temperatura abaixo do limite!!! (" + ar.getCurrentTemp()+")");
		}
		else{
			System.out.println("...Temperatura Normal... (" + ar.getCurrentTemp()+")");
		}

	}


}
