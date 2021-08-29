package mx.tec.mobile.lab.model.manager;

import java.util.ArrayList;
import java.util.List;

import mx.tec.mobile.lab.model.vo.TemperatureConversion;

public class TemperatureManager {
	private List<TemperatureConversion> history;
	
	public TemperatureManager() {
		history = new ArrayList<>();
	}

	public List<TemperatureConversion> getHistory() {
		return history;
	}

	public void setHistory(List<TemperatureConversion> history) {
		this.history = history;
	}
	
	public void addConversionToHistory(TemperatureConversion conversion) {
		this.history.add(conversion);
	}	
}
