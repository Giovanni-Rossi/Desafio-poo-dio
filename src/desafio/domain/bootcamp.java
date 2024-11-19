package desafio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	public String getNome() {
	    return nome;
	}

	public void setNome(String nome) {
	    this.nome = nome;
	}

	public String getDescricao() {
	    return descricao;
	}

	public void setDescricao(String descricao) {
	    this.descricao = descricao;
	}

	public LocalDate getDataInicial() {
	    return dataInicial;
	}

	public LocalDate getDataFinal() {
	    return dataFinal;
	}

	public Set<Dev> getDevsInscritos() {
	    return devsInscritos;
	}

	public void setDevsInscritos(Set<Dev> devsInscritos) {
	    this.devsInscritos = devsInscritos;
	}

	public Set<Conteudo> getConteudos() {
	    return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
	    this.conteudos = conteudos;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    bootcamp outroBootcamp = (bootcamp) obj;
	    return Objects.equals(nome, outroBootcamp.nome) &&
	           Objects.equals(descricao, outroBootcamp.descricao) &&
	           Objects.equals(dataInicial, outroBootcamp.dataInicial) &&
	           Objects.equals(dataFinal, outroBootcamp.dataFinal) &&
	           Objects.equals(devsInscritos, outroBootcamp.devsInscritos) &&
	           Objects.equals(conteudos, outroBootcamp.conteudos);
	}

	@Override
	public int hashCode() {
	    return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
	}
}
