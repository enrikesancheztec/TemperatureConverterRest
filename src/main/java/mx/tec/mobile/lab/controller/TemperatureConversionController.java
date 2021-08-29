package mx.tec.mobile.lab.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.tec.mobile.lab.model.manager.TemperatureManager;
import mx.tec.mobile.lab.model.tools.TemperatureConverter;
import mx.tec.mobile.lab.model.vo.Temperature;
import mx.tec.mobile.lab.model.vo.TemperatureConversion;

@RestController
public class TemperatureConversionController {
	@Autowired
	TemperatureConverter converter;
	
	@Autowired
	TemperatureManager manager;	
	
	@PostMapping("/temperature/conversion/fahrenheit")
	public Temperature getFarenheitConversion(@RequestBody Temperature temperature) {
		Temperature converted = converter.convert(temperature, Temperature.Unit.FAHRENHEIT);				
		manager.addConversionToHistory(new TemperatureConversion(Calendar.getInstance(), temperature, converted));		
		return converted;
	}
	
	@GetMapping("/temperature/conversion/history")
	public List<TemperatureConversion> getHistory() {
		return manager.getHistory();
	}	
}
