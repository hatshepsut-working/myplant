package org.zjn.myplant.entity;

public class Device {
	private int deviceId;
	private int plantId;
	private int userId;
	private int potVolume;
	private int soilQuality;
	public int getPotVolume() {
		return potVolume;
	}
	public void setPotVolume(int potVolume) {
		this.potVolume = potVolume;
	}
	public int getSoilQuality() {
		return soilQuality;
	}
	public void setSoilQuality(int soilQuality) {
		this.soilQuality = soilQuality;
	}
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", plantId=" + plantId + ", userId=" + userId + "]";
	}
	

}
