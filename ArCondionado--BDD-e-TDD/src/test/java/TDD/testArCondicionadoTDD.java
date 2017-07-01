package TDD;
import cdp.ArCondicionado;
import cdp.Sensor;
import cdp.SensorPes;
import cdp.SensorTemp;
import junit.framework.*;

public class testArCondicionadoTDD extends TestCase{
	
	public void testAddObserver(){
		
		//criando um observer sensorPes
		Sensor sensorpes = new SensorPes(15);
		
		//Criando um Observable ArCondicionado
		ArCondicionado ar = new ArCondicionado();
		ar.addObserver(sensorpes);
		
		assertEquals(true, ar.getSensoresPes().contains(sensorpes));
		
	}
	
	public void testSetCurrentTemp(){
		
		ArCondicionado ar = new ArCondicionado();
		
		//cria sensores pessoas
		Sensor sensorpes1 = new SensorPes(10);
		Sensor sensorpes2 = new SensorPes(12);
		Sensor sensorpes3 = new SensorPes(13);
		
		
		ar.addObserver(sensorpes1);
		ar.addObserver(sensorpes2);
		ar.addObserver(sensorpes3);
		
		//cria sensores temperatura
		
		Sensor sensortemp1 = new SensorTemp(15);
		Sensor sensortemp2 = new SensorTemp(16);
		Sensor sensortemp3 = new SensorTemp(20);
		
		ar.addObserver(sensortemp1);
		ar.addObserver(sensortemp2);
		ar.addObserver(sensortemp3);
		
		//tests
		ar.setCurrentTemp();
		
		assertEquals(14, ar.getCurrentTemp());	
	}
	
	
	public void getCurrentTemp()
	{
		ArCondicionado ar = new ArCondicionado();
		assertEquals(25, ar.getCurrentTemp());
	}
	
	
	public void testmediaSensoresPes()
	{
		ArCondicionado ar = new ArCondicionado();
		
		//cria sensores pessoas
		Sensor sensorpes1 = new SensorPes(10);
		Sensor sensorpes2 = new SensorPes(12);
		Sensor sensorpes3 = new SensorPes(13);
		
		ar.addObserver(sensorpes1);
		ar.addObserver(sensorpes2);
		ar.addObserver(sensorpes3);
		
		
		assertEquals(11, ar.mediaSensoresPes());
	}
	
	public void testMediaSensoresTemp(){
		
		ArCondicionado ar = new ArCondicionado();
		
		Sensor sensortemp1 = new SensorTemp(15);
		Sensor sensortemp2 = new SensorTemp(16);
		Sensor sensortemp3 = new SensorTemp(20);
		
		ar.addObserver(sensortemp1);
		ar.addObserver(sensortemp2);
		ar.addObserver(sensortemp3);
		
		assertEquals(17, ar.mediaSensoresTemp());
	}
}
