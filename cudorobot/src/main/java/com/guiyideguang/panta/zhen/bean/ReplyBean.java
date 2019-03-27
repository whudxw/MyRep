package com.guiyideguang.panta.zhen.bean;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class ReplyBean extends JSON {
	private String error_code;
	private String error_msg;
	private Result result;
	@Override
	public String toString() {
		return "ReplyBean{" +
				"error_code='" + error_code + '\'' +
				", error_msg='" + error_msg + '\'' +
				", result=" + result +
				'}';
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getError_msg() {
		return error_msg;
	}

	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}

	public static class Result {
		private String version;
		private String bot_id;
		private String log_id;
		//本轮对话更新后的session信息
		private String bot_session;
		//本轮请求应答之组合生成的id
		private String interaction_id;

		//private int timestamp;
		private Response response;

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getBot_id() {
			return bot_id;
		}

		public void setBot_id(String bot_id) {
			this.bot_id = bot_id;
		}

		public String getLog_id() {
			return log_id;
		}

		public void setLog_id(String log_id) {
			this.log_id = log_id;
		}

		public String getBot_session() {
			return bot_session;
		}

		public void setBot_session(String bot_session) {
			this.bot_session = bot_session;
		}

		public String getInteraction_id() {
			return interaction_id;
		}

		public void setInteraction_id(String interaction_id) {
			this.interaction_id = interaction_id;
		}
		public Response getResponse() {
			return response;
		}
		public void setResponse(Response response) {
			this.response = response;
		}
		@Override
		public String toString() {
			return "Result{" +
					"version='" + version + '\'' +
					", bot_id='" + bot_id + '\'' +
					", log_id='" + log_id + '\'' +
					", bot_session='" + bot_session + '\'' +
					", interaction_id='" + interaction_id + '\'' +

					", response=" + response +
					'}';
		}
	}
	public static class Response {
		private String msg;
		private Integer status;
		private List<ActionBean> action_list;
		private SchemeBean schema;
		private QuResolveBean qu_res;

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<ActionBean> getAction_list() {
			return action_list;
		}

		public void setAction_list(List<ActionBean> action_list) {
			this.action_list = action_list;
		}

		public SchemeBean getSchema() {
			return schema;
		}
		public void setSchema(SchemeBean schema) {
			this.schema = schema;
		}
		public QuResolveBean getQu_res() {
			return qu_res;
		}
		public void setQu_res(QuResolveBean qu_res) {
			this.qu_res = qu_res;
		}
		@Override
		public String toString() {
			return "Response{" +
					"msg='" + msg + '\'' +
					", status=" + status +
					", action_list=" + action_list +
					", schema=" + schema +
					", qu_res=" + qu_res +
					'}';
		}
	}
}


