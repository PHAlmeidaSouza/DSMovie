package com.devsuperior.dsmovie.entitites;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double Value;

	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}

	public Score() {
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return Value;
	}

	public void setValue(Double value) {
		Value = value;
	}

}
