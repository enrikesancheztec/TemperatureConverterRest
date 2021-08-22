package mx.tec.mobile.lab.model.vo;

import java.util.Objects;

public class Temperature {
	private float value;
	private Unit unit;
	
	public Temperature() {
	}
	
	public Temperature(float value, Unit unit) {
		this.value = value;
		this.unit = unit;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(unit, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Temperature)) {
			return false;
		}
		Temperature other = (Temperature) obj;
		return unit == other.unit && Float.floatToIntBits(value) == Float.floatToIntBits(other.value);
	}

	@Override
	public String toString() {
		return "Temperature [value=" + value + ", unit=" + unit + "]";
	}

	public enum Unit {
		FAHRENHEIT ("FAHRENHEIT"),
	    CELSIUS ("CELSIUS");

	    private final String name;       

	    private Unit(String name) {
	        this.name = name;
	    }

	    public boolean equalsName(String otherName) {
	        return name.equals(otherName);
	    }

	    public String toString() {
	       return this.name;
	    }
	}

}
