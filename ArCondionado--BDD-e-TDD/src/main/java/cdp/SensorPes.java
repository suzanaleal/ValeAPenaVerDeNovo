package cdp;

public class SensorPes extends Sensor{

	int numPessoas;
	

	public SensorPes(int numPessoas) {
		super();
		this.numPessoas = numPessoas;
	}


	public int getNumPessoas() {
		return numPessoas;
	}


	public void update(Observable obs) {
		
		ArCondicionado ar = (ArCondicionado)obs;
		
		if(ar.getCurrentTemp() > this.TEMP_TO_ALERT)
		{
			System.out.println("**ALERTA SensorPes** Temperatura acima do limite!!! ("+ ar.getCurrentTemp() +")");
		}
		else if(ar.getCurrentTemp() < this.TEMP_TO_ALERT){
				System.out.println("** ALERTA SensorPes** Temperatura abaixo do limite!!! (" + ar.getCurrentTemp()+")");
		}
		else{
			System.out.println("...Temperatura Normal... (" + ar.getCurrentTemp()+")");
		}
	
	}
	
}
