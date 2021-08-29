package mx.tec.mobile.lab.model.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import mx.tec.mobile.lab.model.vo.Temperature;
import mx.tec.mobile.lab.model.vo.TemperatureConversion;

class TemperatureManagerTest {
	@Test
	void testAddConversionToHistory() {
		// Given
		TemperatureManager manager = new TemperatureManager();
		
		// When
		TemperatureConversion conversion = new TemperatureConversion(
				Calendar.getInstance(), 
				new Temperature(0, Temperature.Unit.CELSIUS), 
				new Temperature(32, Temperature.Unit.FAHRENHEIT));
		manager.addConversionToHistory(conversion); 
		
		// Then
		assertTrue(manager.getHistory().contains(conversion));
	}

}
