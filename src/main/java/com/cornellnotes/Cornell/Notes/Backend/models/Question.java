package com.cornellnotes.Cornell.Notes.Backend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "Questions")
public class Question {

	public Question(String content){
		this.content = content;
	}
	public Question(){}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idQuestion;
	@Column(columnDefinition = "TEXT")
	private String content;
	@ManyToOne
	@JoinColumn(name = "idNote")
	private Note note;
	
	
	//	Getters and Setters
	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@JsonBackReference
	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

}
