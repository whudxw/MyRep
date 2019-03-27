package com.guiyideguang.panta.zhen.bean;

public class SentimentAnalisis {
	private String label;
	private float pval;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getPval() {
		return pval;
	}

	public void setPval(float pval) {
		this.pval = pval;
	}

	@Override
	public String toString() {
		return "SentimentAnalisis{" +
				"label='" + label + '\'' +
				", pval=" + pval +
				'}';
	}
}
