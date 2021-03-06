package br.unisul.domain;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double n1;
	private Double n2;
	private Double n3;
	@ManyToOne
	private Cidade cidade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public Double getN3() {
		return n3;
	}

	public void setN3(Double n3) {
		this.n3 = n3;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}



	@Override
	public String toString() {
		return "Aluno{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", cidade=" + cidade +
				", n1=" + n1 +
				", n2=" + n2 +
				", n3=" + n3 +
				'}';
	}
}