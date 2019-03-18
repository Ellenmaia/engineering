---------------------------------------------------------
CONSIDERAÇÕES 
---------------------------------------------------------

- Decidi não apagar os registros em cascade.
- Não tive tempo hábil para tratar/personalizar as mensagens de erro.
- Não tive tempo hábil para fazer o front-end então utilizei o postman para consumir os serviços
- As saídas também não foram configuradas devido ao tempo.
- Toda a prova foi feita em 5h.

---------------------------------------------------------
AMBIENTE
---------------------------------------------------------

1. Abra o prompt de comando
2. No promp de comando, vá até o caminho que está o projeto (raiz arquivo mvnw.cmd)
Por exemplo: cd C:\Users\Ellen\Documents\Engineering Prova\prova
3. Execute o comando mvnw spring-boot:run

---------------------------------------------------------
POSTMAN
---------------------------------------------------------
Para consumir os serviços utilizei o postman. 
Sempre configurar o BODY como RAW e selecionar JSON (application/json).

Na requisição POST do cliente, quando coloca o ID no vendedor ele associa a um vendedor existente; quando não coloco o campo id para vendedor ele cria um novo registro.

REQUISIÇÃO: POST
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

REQUISIÇÃO: PUT
URL: llocalhost:8080/cliente/1
BODY: {
	"id":1,
	"nome": "Ellen Aguiar Maia",
	"cpf": "098.908.999-00",
	"sexo": "feminino"

      }

REQUISIÇÃO: GET
URL: localhost:8080/cliente
BODY: 

REQUISIÇÃO: GET
URL: localhost:8080/cliente/10
BODY: 

REQUISIÇÃO: DELETE
URL: localhost:8080/cliente/2
BODY:






REQUISIÇÃO: POST
URL: localhost:8080/vendedor
BODY:   {
		"nome": "VENDEDOR SOBRENOME2",
		"cpf": "098.908.999-57"
	}

REQUISIÇÃO: GET
URL: localhost:8080/vendedor
BODY:

REQUISIÇÃO: GET
URL: localhost:8080/vendedor/1
BODY:

REQUISIÇÃO: PUT
URL: localhost:8080/vendedor/1
BODY:	{
		"id": 1,
		"nome": "VENDEDOR SOBRENOME3",
		"cpf": "098.908.999-57"
	}

REQUISIÇÃO: DELETE
URL: localhost:8080/vendedor/1
BODY:
