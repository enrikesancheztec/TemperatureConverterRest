package mx.tec.mobile.lab.model.vo;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TemperatureConversion {
    @JsonFormat(pattern="yyyy-M-dd",timezone = "GMT-6")
	private Calendar created;
    private Temperature original;
    private Temperature converted;
    
	public TemperatureConversion() {
	}

	public TemperatureConversion(Calendar created, Temperature original, Temperature converted) {
		this.created = created;
		this.original = original;
		this.converted = converted;
	}

	public Calendar getCreated() {
		return created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}

	public Temperature getOriginal() {
		return original;
	}

	public void setOriginal(Temperature original) {
		this.original = original;
	}

	public Temperature getConverted() {
		return converted;
	}

	public void setConverted(Temperature converted) {
		this.converted = converted;
	}

}
