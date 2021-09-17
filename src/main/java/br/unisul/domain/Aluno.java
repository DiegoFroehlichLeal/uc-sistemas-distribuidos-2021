package br.unisul.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Aluno {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	private String Nome;

	@Column
	private Double N1;
	@Column
	private Double N2;
	@Column
	private Double N3;
	
	public Aluno(Integer Id, String Nome, Double N1, Double N2, Double N3) {
		this.Id = Id;
		this.Nome = Nome;
		this.N1 = N1;
		this.N2 = N2;
		this.N3 = N3;
	  }
	
	  public Aluno() {
	
	  }
	
	
	
	
	
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getN1() {
		return N1;
	}
	public void setN1(Double n1) {
		N1 = n1;
	}
	public Double getN2() {
		return N2;
	}
	public void setN2(Double n2) {
		N2 = n2;
	}
	public Double getN3() {
		return N3;
	}
	public void setN3(Double n3) {
		N3 = n3;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(Id, other.Id);
	}
	@Override
	public String toString() {
		return "Aluno [Id=" + Id + ", Nome=" + Nome + ", N1=" + N1 + ", N2=" + N2 + ", N3=" + N3 + "]";
	}
	
	

	

}
