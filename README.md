# Gerenciador de Produtos API
Esta é a API Backend para o sistema Gerenciador de Produtos, desenvolvida como parte do curso Programação Fullstack Presencial do Prof. MSc. Kelson | Senior Software Engineer. O projeto foi construído usando o Spring Framework e tem como objetivo gerenciar produtos de forma eficiente, com funcionalidades de CRUD (Create, Read, Update, Delete) e integração com banco de dados relacional.

Tecnologias Utilizadas
Java 17: Linguagem de programação.
Spring Boot 3.3.2: Framework para criação de aplicações web e microservices.
Spring Data JPA: Abstração para manipulação de dados usando JPA.
PostgreSQL: Banco de dados relacional.
Hibernate Validator: Validações de dados de entrada.
Lombok: Facilita a criação de getters, setters e construtores.
Maven: Gerenciamento de dependências e build.
Requisitos
Java 17 ou superior
PostgreSQL instalado e configurado
Maven para gerenciamento de dependências
Docker e docker-compose (opcional, para subir o ambiente de forma automatizada)
Dependências
As principais dependências utilizadas no projeto estão listadas no arquivo pom.xml:

xml
Copiar código
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	<dependency>
		<groupId>org.postgresql</groupId>
		<artifactId>postgresql</artifactId>
		<scope>runtime</scope>
	</dependency>
	<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<optional>true</optional>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-test</artifactId>
		<scope>test</scope>
	</dependency>
	<dependency>
		<groupId>org.hibernate.validator</groupId>
		<artifactId>hibernate-validator</artifactId>
		<version>8.0.1.Final</version>
	</dependency>
</dependencies>
Configuração
Banco de Dados
A API utiliza o PostgreSQL como banco de dados. Para configurar a conexão, edite o arquivo application.properties ou application.yml com as credenciais do seu banco de dados:

properties
Copiar código
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=usuario
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
Docker (opcional)
Para executar o ambiente com Docker e Docker Compose, certifique-se de que o docker-compose.yml esteja configurado corretamente. Use o comando:

bash
Copiar código
docker-compose up
Execução
Para rodar a aplicação, utilize sua IDE de preferência, como o IntelliJ IDEA:

bash
Copiar código
./mvnw spring-boot:run
Testes
Os testes estão configurados com Spring Boot Starter Test. Para rodá-los, utilize o comando:

bash
Copiar código
./mvnw test
Ferramentas Utilizadas
IntelliJ IDEA: IDE principal para o desenvolvimento do projeto.
Insomnia: Ferramenta para testar as requisições HTTP da API.
Docker e Docker Compose: Usados para facilitar o setup do ambiente de desenvolvimento.
Autor
Este projeto foi desenvolvido no Curso Presencial Programação Fullstack ministrado por Prof. MSc. Kelson | Senior Software Engineer.

Licença
Este projeto está sob a licença [a definir].






Você disse:
agora crie uma descrição para usar no github
O ChatGPT disse:
ChatGPT
Gerenciador de Produtos API
API backend para um sistema de gerenciamento de produtos, desenvolvido utilizando Spring Boot e PostgreSQL como parte do curso Programação Fullstack Presencial do Prof. MSc. Kelson | Senior Software Engineer. O projeto inclui operações de CRUD (Create, Read, Update, Delete) para produtos, integração com banco de dados relacional, e validações com Hibernate Validator.

Tecnologias Utilizadas
Java 17
Spring Boot 3.3.2
Spring Data JPA
PostgreSQL
Lombok
Hibernate Validator
Maven
Funcionalidades
Gerenciamento de produtos (CRUD)
Validações de dados de entrada
Integração com banco de dados PostgreSQL
Suporte para execução via Docker e Docker Compose
Como Executar
Clone este repositório
Configure o banco de dados PostgreSQL
Execute a aplicação via Maven:
bash
Copiar código
./mvnw spring-boot:run
Requisitos
Java 17 ou superior
PostgreSQL
Maven
Docker (opcional)
