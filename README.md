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

3. O servidor embutido será iniciado, e a aplicação estará disponível em `http://localhost:8080/meusegundoprojetojsf/`.

4. Acesse a aplicação pelo navegador e explore as páginas de registro e listagem de usuários.

Certifique-se de seguir essas instruções cuidadosamente para garantir uma execução suave do projeto em seu ambiente local. Se encontrar problemas durante o processo, verifique se todos os pré-requisitos foram atendidos e se as configurações do banco de dados estão corretas.
