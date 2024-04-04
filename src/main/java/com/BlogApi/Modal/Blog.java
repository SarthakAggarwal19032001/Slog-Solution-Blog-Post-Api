package com.BlogApi.Modal;

import jakarta.persistence.*;


@Entity
public class Blog {
	
	@Id
	private int id;
	private String title;
	private String introduction;
	private String paragraph;
	private String conclusion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getParagraph() {
		return paragraph;
	}
	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", introduction=" + introduction + ", paragraph=" + paragraph
				+ ", conclusion=" + conclusion + "]";
	}
	
	
}
