# Instruções para Executar o Projeto de Gerenciamento de Usuários - JavaJSF

Este repositório contém um projeto de gerenciamento de informações de usuários desenvolvido em Java, Hibernate, JPA, PostgreSQL, JSF e PrimeFaces. A seguir, são apresentadas as instruções para configurar e executar o projeto em seu computador.

## Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/)
- [PostgreSQL](https://www.postgresql.org/download/)
- [IDE Java, como Eclipse ou IntelliJ](https://www.eclipse.org/downloads/)

Certifique-se de que o PostgreSQL está em execução e crie um banco de dados chamado "gerenciamento_usuarios". Configure o arquivo `src/main/resources/META-INF/persistence.xml` com as informações de conexão adequadas para o seu ambiente.

## Configuração do Banco de Dados

Execute o script SQL a seguir para criar a tabela necessária no banco de dados:

```sql
CREATE TABLE Usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone VARCHAR(20),
    data_nascimento DATE
);
```

## Configuração do Projeto

1. Clone este repositório para o seu ambiente local:

```bash
git clone https://github.com/AndersonSantos07/GerenciamentoDeUsuarios-MVC-JavaJsf.git
```

2. Abra o projeto em sua IDE Java.

3. Certifique-se de que as dependências do Maven são baixadas e o projeto é construído com sucesso.

## Executando o Projeto

1. Encontre o arquivo `GerenciamentoDeUsuarios.java` no pacote `br.com.teste`.

2. Execute o arquivo como um aplicativo Java.

3. O servidor embutido será iniciado, e a aplicação estará disponível em `http://localhost:8080/GerenciamentoDeUsuarios`.

4. Acesse a aplicação pelo navegador e explore as páginas de registro e listagem de usuários.

## Funcionalidades

- **Página Home:** Acesse a página inicial da aplicação.
- **Registrar Usuário:** Adicione novos usuários ao sistema.
- **Listar Usuários:** Visualize todos os usuários registrados, com opções para editar e excluir cada usuário individualmente.

Certifique-se de seguir essas instruções cuidadosamente para garantir uma execução suave do projeto em seu ambiente local. Se encontrar problemas durante o processo, verifique se todos os pré-requisitos foram atendidos e se as configurações do banco de dados estão corretas.
