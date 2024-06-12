package main;

import java.util.Objects;

public class Tarefa {
	String descricao;
	boolean realizada;
	
	
	
	public Tarefa(String descricao, boolean realizada) {
		super();
		this.descricao = descricao;
		this.realizada = realizada;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isRealizada() {
		return realizada;
	}
	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", realizada=" + realizada + "]";
	}
	
	
}
