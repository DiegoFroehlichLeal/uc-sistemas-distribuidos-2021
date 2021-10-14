package br.unisul.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Matricula {

    @EmbeddedId
    MatriculaPK id;

    String semestre;

    public MatriculaPK getId() {
        return id;
    }

    public void setId(MatriculaPK id) {
        this.id = id;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(getId(), matricula.getId()) && Objects.equals(getSemestre(), matricula.getSemestre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSemestre());
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", semestre='" + semestre + '\'' +
                '}';
    }
}