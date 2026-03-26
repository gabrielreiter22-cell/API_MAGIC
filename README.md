# MTG Store - Sistema Web com Spring Boot

## Descrição

O MTG Store é uma aplicação web desenvolvida em Java com Spring Boot que simula um sistema de gerenciamento de cartas de Magic: The Gathering. A aplicação permite o cadastro, armazenamento e visualização de cartas contendo nome, descrição, preço e imagem.

O sistema utiliza arquitetura cliente-servidor, com backend em Spring Boot e frontend desenvolvido com HTML, CSS e JavaScript, consumindo uma API REST.

---

## Tecnologias Utilizadas

### Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate

### Banco de Dados

* MySQL

### Frontend

* HTML5
* CSS3
* JavaScript (Fetch API)

---

## Estrutura do Projeto

```
src/main/java/tech/buildrun/Api
 ├── controller
 │    └── CardController.java
 ├── model
 │    └── Card.java
 ├── repository
 │    └── CardRepository.java
 └── config
      └── WebConfig.java

src/main/resources
 ├── static
 │    ├── index.html
 │    ├── css/style.css
 │    └── js/script.js
 └── application.properties
```

---

## Funcionalidades

* Cadastro de cartas
* Upload de imagens
* Listagem de cartas
* Persistência em banco de dados
* Consumo de API REST pelo frontend

---

## Execução do Projeto

### 1. Clonar o repositório

```
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

### 2. Configurar o banco de dados

Certifique-se de que o MySQL está em execução e crie o banco de dados:

```
CREATE DATABASE DB_MTG;
```

---

### 3. Configurar o application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/DB_MTG
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4. Executar a aplicação

Execute a classe principal do projeto Spring Boot através da IDE.

---

### 5. Acessar a aplicação

```
http://localhost:8080
```

---

## Endpoints da API

### Criar carta

```
POST /cards
```

Parâmetros (multipart/form-data):

* nome
* descricao
* preco
* imagem

---

### Listar cartas

```
GET /cards
```

---

## Upload de Imagens

As imagens são armazenadas na pasta:

```
/uploads
```

E podem ser acessadas via:

```
http://localhost:8080/uploads/{nome-do-arquivo}
```

---

## Problemas Comuns

Erro 400 ou 500:

* Verifique se a requisição está sendo enviada como multipart/form-data

Imagem não aparece:

* Verifique a configuração da classe WebConfig

Falha na conexão com banco:

* Confirme se o MySQL está ativo e as credenciais estão corretas



## Melhorias Futuras

* Implementação de busca por nome
* Edição e exclusão de cartas
* Sistema de autenticação
* Interface mais avançada com framework frontend
* Implementação de carrinho de compras

---

## Autor

Gabriel Reiter

---

## Licença

Projeto desenvolvido para fins educacionais.
