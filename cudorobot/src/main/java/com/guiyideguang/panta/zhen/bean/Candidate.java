package com.guiyideguang.panta.zhen.bean;

import java.util.Map;

public class Candidate {
	private float confidence;
	private String intent;
	private float intent_confidence;
	private float domain_confidence;
	private boolean intent_need_clarify;
	private String from_who;
	private String match_who;
	private Map extra_info;

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

	public boolean isIntent_need_clarify() {
		return intent_need_clarify;
	}

	public void setIntent_need_clarify(boolean intent_need_clarify) {
		this.intent_need_clarify = intent_need_clarify;
	}

	public String getFrom_who() {
		return from_who;
	}

	public void setFrom_who(String from_who) {
		this.from_who = from_who;
	}

	public String getMatch_who() {
		return match_who;
	}

	public void setMatch_who(String match_who) {
		this.match_who = match_who;
	}

	public Map getExtra_info() {
		return extra_info;
	}

	public void setExtra_info(Map extra_info) {
		this.extra_info = extra_info;
	}

	@Override
	public String toString() {
		return "Candidate{" +
				"confidence=" + confidence +
				", intent='" + intent + '\'' +
				", intent_confidence=" + intent_confidence +
				", domain_confidence=" + domain_confidence +
				", intent_need_clarify=" + intent_need_clarify +
				", from_who='" + from_who + '\'' +
				", match_who='" + match_who + '\'' +
				", extra_info=" + extra_info +
				'}';
	}
}
