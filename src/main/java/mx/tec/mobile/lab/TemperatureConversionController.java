package mx.tec.mobile.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.tec.mobile.lab.model.tools.TemperatureConverter;
import mx.tec.mobile.lab.model.vo.Temperature;

@RestController
public class TemperatureConversionController {
	@Autowired
	TemperatureConverter converter;
	
	@PostMapping("/temperature/conversion/fahrenheit")
	public Temperature getFarenheitConversion(@RequestBody Temperature temperature) {
		return converter.convert(temperature, Temperature.Unit.FAHRENHEIT);
	}
}
