package com.guiyideguang.panta.zhen.bean;

import java.sql.Timestamp;
import java.util.List;

public class QuResolveBean {
	private Timestamp timestamp;
	private int status;
	private String raw_query;
	private List<Candidate> candidates;
	private String qu_res_chosen;
    private SentimentAnalisis sentiment_analysis;
    private List<LexicalAnalysis> lexical_analysis;

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRaw_query() {
		return raw_query;
	}

	public void setRaw_query(String raw_query) {
		this.raw_query = raw_query;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public String getQu_res_chosen() {
		return qu_res_chosen;
	}

	public void setQu_res_chosen(String qu_res_chosen) {
		this.qu_res_chosen = qu_res_chosen;
	}

	public SentimentAnalisis getSentiment_analysis() {
		return sentiment_analysis;
	}

	public void setSentiment_analysis(SentimentAnalisis sentiment_analysis) {
		this.sentiment_analysis = sentiment_analysis;
	}

	public List<LexicalAnalysis> getLexical_analysis() {
		return lexical_analysis;
	}

	public void setLexical_analysis(List<LexicalAnalysis> lexical_analysis) {
		this.lexical_analysis = lexical_analysis;
	}

	@Override
	public String toString() {
		return "QuResolveBean{" +
				"timestamp=" + timestamp +
				", status=" + status +
				", raw_query='" + raw_query + '\'' +
				", candidates=" + candidates +
				", qu_res_chosen='" + qu_res_chosen + '\'' +
				", sentiment_analysis=" + sentiment_analysis +
				", lexical_analysis=" + lexical_analysis +
				'}';
	}
}
