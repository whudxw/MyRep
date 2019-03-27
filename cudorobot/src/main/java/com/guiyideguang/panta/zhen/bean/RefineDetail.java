package com.guiyideguang.panta.zhen.bean;

import java.util.List;
import java.util.Map;

public class RefineDetail {
private String interact;//交互形式（ask,select selectandask）
private String clarify_reason;//澄清理由 type为clarify
private List<Optionobj> option_list;

	public String getInteract() {
		return interact;
	}

	public void setInteract(String interact) {
		this.interact = interact;
	}

	public String getClarify_reason() {
		return clarify_reason;
	}

	public void setClarify_reason(String clarify_reason) {
		this.clarify_reason = clarify_reason;
	}

	public List<Optionobj> getOption_list() {
		return option_list;
	}

	public void setOption_list(List<Optionobj> option_list) {
		this.option_list = option_list;
	}

	@Override
	public String toString() {
		return "RefineDetail{" +
				"interact='" + interact + '\'' +
				", clarify_reason='" + clarify_reason + '\'' +
				", option_list=" + option_list +
				'}';
	}

	public static class Optionobj{
	private String option;
	private Map info;

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

		@Override
		public String toString() {
			return "Optionobj{" +
					"option='" + option + '\'' +
					", info=" + info +
					'}';
		}

		public Map getInfo() {
		return info;
	}

	public void setInfo(Map info) {
		this.info = info;
	}
}
}
