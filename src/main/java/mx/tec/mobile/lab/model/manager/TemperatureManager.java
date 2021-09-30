package mx.tec.mobile.lab.model.manager;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.TemperatureConversionRepository;
import mx.tec.mobile.lab.model.vo.TemperatureConversion;

@Service
public class TemperatureManager {
	@Resource
	TemperatureConversionRepository repository;

	public List<TemperatureConversion> getHistory() {
		return repository.findAll();
	}

	public void addConversionToHistory(TemperatureConversion conversion) {
		repository.save(conversion);
	}	
}
