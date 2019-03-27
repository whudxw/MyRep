package com.guiyideguang.panta.zhen.bean;

import java.util.List;

public class MyResult {
private List<ActionBean> actionList;
private float confidence;
private String intent;
private List<Slot> slots;

	public List<ActionBean> getActionList() {
		return actionList;
	}

	public void setActionList(List<ActionBean> actionList) {
		this.actionList = actionList;
	}

	public float getConfidence() {
		return confidence;
	}

	public void setConfidence(float confidence) {
		this.confidence = confidence;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public List<Slot> getSlots() {
		return slots;
	}

	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}

	@Override
	public String toString() {
		return "MyResult{" +
				"actionList=" + actionList +
				", confidence=" + confidence +
				", intent='" + intent + '\'' +
				", slots=" + slots +
				'}';
	}
}
