package com.guiyideguang.panta.zhen.bean;

import java.util.List;

public class Slot {
	private float confidence;
	private int begin;
	private int length;
	private String original_word;
	private String normalized_word;
	private String word_type;
	private String name;
	private int session_offset;
	private boolean need_clarify;
	private int father_idx;
	private String merge_method;
	private List<Slot> sub_slots;

	public float getConfidence() {
		return confidence;
	}

	public void setConfidence(float confidence) {
		this.confidence = confidence;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getOriginal_word() {
		return original_word;
	}

	public void setOriginal_word(String original_word) {
		this.original_word = original_word;
	}

	public String getNormalized_word() {
		return normalized_word;
	}

	public void setNormalized_word(String normalized_word) {
		this.normalized_word = normalized_word;
	}

	public String getWord_type() {
		return word_type;
	}

	public void setWord_type(String word_type) {
		this.word_type = word_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSession_offset() {
		return session_offset;
	}

	public void setSession_offset(int session_offset) {
		this.session_offset = session_offset;
	}

	public boolean isNeed_clarify() {
		return need_clarify;
	}

	public void setNeed_clarify(boolean need_clarify) {
		this.need_clarify = need_clarify;
	}

	public int getFather_idx() {
		return father_idx;
	}

	public void setFather_idx(int father_idx) {
		this.father_idx = father_idx;
	}

	public String getMerge_method() {
		return merge_method;
	}

	public void setMerge_method(String merge_method) {
		this.merge_method = merge_method;
	}

	public List<Slot> getSub_slots() {
		return sub_slots;
	}

	public void setSub_slots(List<Slot> sub_slots) {
		this.sub_slots = sub_slots;
	}

	@Override
	public String toString() {
		return "Slot{" +
				"confidence=" + confidence +
				", begin=" + begin +
				", length=" + length +
				", original_word='" + original_word + '\'' +
				", normalized_word='" + normalized_word + '\'' +
				", word_type='" + word_type + '\'' +
				", name='" + name + '\'' +
				", session_offset=" + session_offset +
				", need_clarify=" + need_clarify +
				", father_idx=" + father_idx +
				", merge_method='" + merge_method + '\'' +
				", sub_slots=" + sub_slots +
				'}';
	}
}
