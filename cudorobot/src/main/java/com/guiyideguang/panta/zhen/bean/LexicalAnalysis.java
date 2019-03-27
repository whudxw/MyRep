package com.guiyideguang.panta.zhen.bean;

import java.util.List;

public class LexicalAnalysis {
	private String term;
	private float weight;
	private String type;
	private List<String> etypes;
	private List<String> basic_word;

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getEtypes() {
		return etypes;
	}

	public void setEtypes(List<String> etypes) {
		this.etypes = etypes;
	}

	public List<String> getBasi_word() {
		return basic_word;
	}

	public void setBasi_word(List<String> basi_word) {
		this.basic_word = basi_word;
	}

	@Override
	public String toString() {
		return "LexicalAnalysis{" +
				"term='" + term + '\'' +
				", weight=" + weight +
				", type='" + type + '\'' +
				", etypes=" + etypes +
				", basi_word=" + basic_word +
				'}';
	}
}
