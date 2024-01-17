#Author: susanabergamo@outlook.com

@regressao
Feature: Busca de cep ou endereco
	Como usuario do site do correio
	Quero
	Para
	
	@positvo
	Scenario: buscar um novo cep
	When envio o dado para busca
	Then valido o retorno da consulta
	
	