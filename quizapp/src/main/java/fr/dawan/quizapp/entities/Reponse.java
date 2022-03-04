package fr.dawan.quizapp.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import fr.dawan.quizapp.entities.Question;


@Entity
@Table(name = "t_reponse")

public class Reponse extends DbObject{
	

private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Version
private int version;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "question_id", nullable = false)
private Question question;

@Column(name = "content", nullable = false)
private String content;

@Column(name = "correct", nullable = false)
private boolean correct;

public Reponse() {
}

public Reponse(Question question, String content, boolean correct) {
	this.question = question;
	this.content = content;
	this.correct = correct;
}

public long getId() {
	return this.id;
}


public Question getQuestion() {
	return this.question;
}

public void setQuestion(Question question) {
	this.question = question;
}

public String getContent() {
	return this.content;
}


public void setContent(String content) {
	this.content = content;
}


public boolean isCorrect() {
	return this.correct;
}

public void setCorrect(boolean correct) {
	this.correct = correct;
}

public int getVersion() {
	return version;
}


}
