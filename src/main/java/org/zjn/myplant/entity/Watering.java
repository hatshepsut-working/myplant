package org.zjn.myplant.entity;

import java.util.Date;

public class Watering {
	private int deviceId;
	private int plantId;
	private int waterVolume;
	private Date waterTime;
	private long detectInterval;
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public int getPlantId() {
		return plantId;
	}
	public long getDetectInterval() {
		return detectInterval;
	}
	public void setDetectInterval(long detectInterval) {
		this.detectInterval = detectInterval;
	}
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	public int getWaterVolume() {
		return waterVolume;
	}
	public void setWaterVolume(int waterVolume) {
		this.waterVolume = waterVolume;
	}
	public Date getWaterTime() {
		return waterTime;
	}
	public void setWaterTime(Date waterTime) {
		this.waterTime = waterTime;
	}
	@Override
	public String toString() {
		return "Watering [deviceId=" + deviceId + ", plantId=" + plantId + ", waterVolume=" + waterVolume
				+ ", waterTime=" + waterTime + "]";
	}
	

}
