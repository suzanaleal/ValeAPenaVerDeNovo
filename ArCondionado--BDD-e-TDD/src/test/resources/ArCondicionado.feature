# language: pt
Feature: Controlar a temperatura do ambiente

	Scenario: Calcular a temperatura interna
	Given que eu quero controlar a temperatura ambiente
	When os sensores de pessoas identificam o número de pessoas <SensorPes1>, <SensorPes2>, <SensorPes3>
	And os sensores de temperatura identificam a temperatura externa <SensorTemp1>, <SensorTemp2>, <SensorTemp3>
	Then a tempetura média é calculada <MediaTemp>
  
  
  