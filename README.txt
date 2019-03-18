---------------------------------------------------------
CONSIDERA��ES 
---------------------------------------------------------

- Decidi n�o apagar os registros em cascade.
- N�o tive tempo h�bil para tratar/personalizar as mensagens de erro.
- N�o tive tempo h�bil para fazer o front-end ent�o utilizei o postman para consumir os servi�os
- As sa�das tamb�m n�o foram configuradas devido ao tempo.
- Toda a prova foi feita em 5h.

---------------------------------------------------------
AMBIENTE
---------------------------------------------------------

1. Abra o prompt de comando
2. No promp de comando, v� at� o caminho que est� o projeto (raiz arquivo mvnw.cmd)
Por exemplo: cd C:\Users\Ellen\Documents\Engineering Prova\prova
3. Execute o comando mvnw spring-boot:run

---------------------------------------------------------
POSTMAN
---------------------------------------------------------
Para consumir os servi�os utilizei o postman. 
Sempre configurar o BODY como RAW e selecionar JSON (application/json).

Na requisi��o POST do cliente, quando coloca o ID no vendedor ele associa a um vendedor existente; quando n�o coloco o campo id para vendedor ele cria um novo registro.

REQUISI��O: POST
URL: localhost:localhost:8080/cliente
BODY: {
	"nome": "Ellen Aguiar Maia",
	"cpf": "098.908.999-56",
	"sexo": "feminino",
	"vendedor": [{
			"id": 2,
			"nome": "VENDEDOR SOBRENOME 1",
			"cpf": "098.908.999-57"
		}]
	}

REQUISI��O: PUT
URL: llocalhost:8080/cliente/1
BODY: {
	"id":1,
	"nome": "Ellen Aguiar Maia",
	"cpf": "098.908.999-00",
	"sexo": "feminino"

      }

REQUISI��O: GET
URL: localhost:8080/cliente
BODY: 

REQUISI��O: GET
URL: localhost:8080/cliente/10
BODY: 

REQUISI��O: DELETE
URL: localhost:8080/cliente/2
BODY:






REQUISI��O: POST
URL: localhost:8080/vendedor
BODY:   {
		"nome": "VENDEDOR SOBRENOME2",
		"cpf": "098.908.999-57"
	}

REQUISI��O: GET
URL: localhost:8080/vendedor
BODY:

REQUISI��O: GET
URL: localhost:8080/vendedor/1
BODY:

REQUISI��O: PUT
URL: localhost:8080/vendedor/1
BODY:	{
		"id": 1,
		"nome": "VENDEDOR SOBRENOME3",
		"cpf": "098.908.999-57"
	}

REQUISI��O: DELETE
URL: localhost:8080/vendedor/1
BODY:
