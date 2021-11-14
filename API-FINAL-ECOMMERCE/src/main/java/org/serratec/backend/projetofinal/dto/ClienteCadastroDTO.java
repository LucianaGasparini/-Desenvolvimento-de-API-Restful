package org.serratec.backend.projetofinal.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.serratec.backend.projetofinal.domain.Cliente;

public class ClienteCadastroDTO {

	@NotBlank(message = "O nome do cliente não pode estar vazio")
	@Size(max = 40, message = "O nome da categoria não deve ultrapassar 40 caracteres.")
	private String nome;

	@CPF(message = "Digite um CPF válido")
	private String cpf;

	@Email(message = "Email Inválido!")
	private String email;

	@PastOrPresent(message = "Data Inválida")
	private Date dataNascimento;

	private Long id;

	// Quais validações colocar? 28613240

	private String cep;

	public ClienteCadastroDTO() {

	}

//PRECISAMOS IMPLEMENTAR O CEP AQUI DE ALGUMA FORMA TB
	public ClienteCadastroDTO(Cliente cliente) {
		super();
		this.nome = cliente.getNome();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.dataNascimento = cliente.getDataNascimento();

	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
