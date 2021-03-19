# api project

Api para busca de favorecidos cadastrados na base + carga historica

Executar aplicação:
```shell script
./mvnw compile quarkus:dev
```

Executar testes:
```shell script
./mvnw verify
```

Documentação da api:

[http://localhost:8080/swagger-ui](http://localhost:8080/swagger-ui)

Exemplo de requisição:

- consulta de favorecidos por cpf do cliente cadastrante

Chamada: http://localhost:8080/favorecidos/50373584342

resposta:

```json
[
  {
    "id": 1,
    "cliente": {
      "id": 1,
      "cpf": "50373584342",
      "nome": "JOAO DA SILVA"
    },
    "contaFavorecido": {
      "id": 2,
      "agencia": "1024",
      "numeroConta": "300121",
      "cliente": {
        "id": 2,
        "cpf": "52258570271",
        "nome": "RENATA DOURADO"
      },
      "instituicao": {
        "id": 2,
        "nome": "BANCO GEN2"
      }
    },
    "ativo": true
  },
  {
    "id": 2,
    "cliente": {
      "id": 1,
      "cpf": "50373584342",
      "nome": "JOAO DA SILVA"
    },
    "contaFavorecido": {
      "id": 3,
      "agencia": "1024",
      "numeroConta": "300122",
      "cliente": {
        "id": 3,
        "cpf": "52258570270",
        "nome": "MARIO PEIXOTO"
      },
      "instituicao": {
        "id": 1,
        "nome": "BANCO GEN1"
      }
    },
    "ativo": true
  },
  {
    "id": 3,
    "cliente": {
      "id": 1,
      "cpf": "50373584342",
      "nome": "JOAO DA SILVA"
    },
    "contaFavorecido": {
      "id": 4,
      "agencia": "1024",
      "numeroConta": "300123",
      "cliente": {
        "id": 4,
        "cpf": "52258570274",
        "nome": "MABEL DA SILVA"
      },
      "instituicao": {
        "id": 2,
        "nome": "BANCO GEN2"
      }
    },
    "ativo": true
  },
  {
    "id": 4,
    "cliente": {
      "id": 1,
      "cpf": "50373584342",
      "nome": "JOAO DA SILVA"
    },
    "contaFavorecido": {
      "id": 5,
      "agencia": "1024",
      "numeroConta": "300124",
      "cliente": {
        "id": 5,
        "cpf": "52258570275",
        "nome": "JULCE DOS SANTOS"
      },
      "instituicao": {
        "id": 1,
        "nome": "BANCO GEN1"
      }
    },
    "ativo": true
  },
  {
    "id": null,
    "cliente": {
      "id": null,
      "cpf": "50373584342",
      "nome": "JOAO DA SILVA"
    },
    "contaFavorecido": {
      "id": null,
      "agencia": "1023",
      "numeroConta": "300123",
      "cliente": {
        "id": null,
        "cpf": "52258570277",
        "nome": "PELE DOS SANTOS"
      },
      "instituicao": {
        "id": null,
        "nome": "BANCO GEN2"
      }
    },
    "ativo": true
  }
]
```
