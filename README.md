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

1. Certifique-se de que o PostgreSQL está em execução.

2. Crie um banco de dados no PostgreSQL chamado `db_gerenciamentodeusuarios`:

   ```sql
   CREATE DATABASE db_gerenciamentodeusuarios;
   ```

3. Abra o arquivo `src/main/resources/META-INF/persistence.xml` e ajuste as configurações de conexão, incluindo o nome do banco de dados recém-criado. Certifique-se de modificar também o usuário (`user`) e a senha (`password`) de acordo com suas credenciais do PostgreSQL.

   ```xml
   <persistence-unit name="GerenciamentoUsuariosPU" transaction-type="RESOURCE_LOCAL">
       <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
       <class>br.com.teste.Usuario</class>
       <properties>
           <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/db_gerenciamentodeusuarios"/>
           <property name="javax.persistence.jdbc.user" value="seu_usuario"/>
           <property name="javax.persistence.jdbc.password" value="sua_senha"/>
           <!-- ... outras propriedades ... -->
       </properties>
   </persistence-unit>
   ```

Lembre-se de substituir `"seu_usuario"` e `"sua_senha"` pelos valores corretos do seu usuário e senha do PostgreSQL.

## Teste Banco de Dados(opcional)

1.Encontre o arquivo GerenciamentoDeUsuarios.java em src/test/java no pacote br.com.teste.

2.Execute como aplicativo Java, para criar a tabela no banco de dados como teste.

## Configuração do Projeto

1. Clone este repositório para o seu ambiente local:

   ```bash
   git clone https://github.com/AndersonSantos07/GerenciamentoDeUsuarios-MVC-JavaJsf.git
   ```

2. Abra o projeto em sua IDE Java.

3. Certifique-se de que as dependências do Maven são baixadas e o projeto é construído com sucesso.

## Executando o Projeto

1. Certifique-se de que o servidor Tomcat 8.5 ou inferior está configurado corretamente em sua IDE.

2. Aguarde o servidor iniciar, e a aplicação estará disponível em `http://localhost:8080/meusegundoprojetojsf/`. Certifique-se de que o contexto da aplicação esteja configurado de acordo com o seu ambiente.

3. Acesse a aplicação pelo navegador e explore as páginas de registro e listagem de usuários.

Certifique-se de seguir essas instruções cuidadosamente para garantir uma execução suave do projeto em seu ambiente local. Se encontrar problemas durante o processo, verifique se todos os pré-requisitos foram atendidos e se as configurações do banco de dados estão corretas. Se necessário, ajuste o contexto da aplicação de acordo com a configuração do seu ambiente de execução no Tomcat.
