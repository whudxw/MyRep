package com.guiyideguang.panta.zhen.bean;

import java.util.List;

public class SchemeBean {
	private String intent;
	private float intent_confidence;
	private float domain_confidence;
	private List<Slot> slots;

	public String getIntent() {
		return intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}

	public float getIntent_confidence() {
		return intent_confidence;
	}

	public void setIntent_confidence(float intent_confidence) {
		this.intent_confidence = intent_confidence;
	}

	public float getDomain_confidence() {
		return domain_confidence;
	}

	public void setDomain_confidence(float domain_confidence) {
		this.domain_confidence = domain_confidence;
	}

	public List<Slot> getSlots() {
		return slots;
	}

	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}

	@Override
	public String toString() {
		return "SchemeBean{" +
				"intent='" + intent + '\'' +
				", intent_confidence=" + intent_confidence +
				", domain_confidence=" + domain_confidence +
				", slots=" + slots +
				'}';
	}
}
