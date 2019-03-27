package com.guiyideguang.panta.zhen.bean;
//动作列表
public class ActionBean {
	private float confidence;//动作置信度
	private String action_id;//动作id
	private String say;//应答话术
	private String custom_reply;//type为event时，用户自定义答应
	private String type;//动作类型
	private RefineDetail refine_detail;//澄清与引导，type为clarify，guide,faqguide
	public float getConfidence() {
		return confidence;
	}
	public void setConfidence(float confidence) {
		this.confidence = confidence;
	}
	public String getAction_id() {
		return action_id;
	}
	public void setAction_id(String action_id) {
		this.action_id = action_id;
	}
	public String getSay() {
		return say;
	}
	public void setSay(String say) {
		this.say = say;
	}

	public String getCustom_reply() {
		return custom_reply;
	}

	public void setCustom_reply(String custom_reply) {
		this.custom_reply = custom_reply;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RefineDetail getRefine_detail() {
		return refine_detail;
	}

	public void setRefine_detail(RefineDetail refine_detail) {
		this.refine_detail = refine_detail;
	}

	@Override
	public String toString() {
		return "ActionBean{" +
				"confidence=" + confidence +
				", action_id='" + action_id + '\'' +
				", say='" + say + '\'' +
				", custom_reply='" + custom_reply + '\'' +
				", type='" + type + '\'' +
				", refine_detail=" + refine_detail +
				'}';
	}
}
