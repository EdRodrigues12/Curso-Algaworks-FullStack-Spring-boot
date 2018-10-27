package com.example.algamoneu.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoneu.api.model.Lancamento;
import com.example.algamoneu.api.model.Pessoa;
import com.example.algamoneu.api.repository.LancamentoRepository;
import com.example.algamoneu.api.repository.PessoaRepository;
import com.example.algamoneu.api.service.exception.PessoaInexistenteOuInativa;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativa();
		}
		return lancamentoRepository.save(lancamento); 
	}

}
