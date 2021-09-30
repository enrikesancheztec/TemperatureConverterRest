package mx.tec.mobile.lab;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tec.mobile.lab.model.vo.TemperatureConversion;

@Repository
public interface TemperatureConversionRepository extends JpaRepository<TemperatureConversion, Long> {
}

