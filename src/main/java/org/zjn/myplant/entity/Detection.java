package org.zjn.myplant.entity;

import java.util.Date;

public class Detection {
	private int deviceId;
	private int plantId;
	private double airTemperature;
	private double airMoisture;
	private double soilMoisture;
	private Date detectionTime;
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public int getPlantId() {
		return plantId;
	}
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	public double getAirTemperature() {
		return airTemperature;
	}
	public void setAirTemperature(double airTemperature) {
		this.airTemperature = airTemperature;
	}
	public double getAirMoisture() {
		return airMoisture;
	}
	public void setAirMoisture(double airMoisture) {
		this.airMoisture = airMoisture;
	}
	public double getSoilMoisture() {
		return soilMoisture;
	}
	public void setSoilMoisture(double soilMoisture) {
		this.soilMoisture = soilMoisture;
	}
	public Date getDetectionTime() {
		return detectionTime;
	}
	public void setDetectionTime(Date detectionTime) {
		this.detectionTime = detectionTime;
	}
	@Override
	public String toString() {
		return "Detection [deviceId=" + deviceId + ", plantId=" + plantId + ", airTemperature=" + airTemperature
				+ ", airMoisture=" + airMoisture + ", soilMoisture=" + soilMoisture + ", detectionTime=" + detectionTime
				+ "]";
	}
	

}
