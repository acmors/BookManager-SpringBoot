<h1>📚 Gerenciador de Livros</h1>

<p>Este é um projeto de uma API REST para gerenciamento de livros, desenvolvido com Spring Boot. A aplicação permite criar, listar, atualizar e deletar livros.</p>
<a href="https://youtu.be/Gc4G4wU_obg" target="_blank">Clique AQui para ver a demonstração do Projeto</a>

<h2>🚀 Tecnologias Utilizadas</h2>
    <ul>
        <li>Java 17</li>
        <li>Spring Boot</li>
        <li>Spring MVC</li>
        <li>Spring Data JPA</li>
        <li>MySQL</li>
        <li>SpringDoc OpenAPI 3 (Swagger)</li>
    </ul>

 <h2>📋 Funcionalidades</h2>
    <ul>
        <li>Adicionar um novo livro</li>
        <li>Listar todos os livros</li>
        <li>Buscar um livro por ID</li>
        <li>Atualizar informações de um livro</li>
        <li>Deletar um livro</li>
    </ul>

 <h2>🔧 Configuração do Ambiente</h2>
    <p>Para rodar a aplicação, siga os passos abaixo:</p>
    <ol>
        <li>Certifique-se de ter o <strong>Java 17</strong> e <strong>Maven</strong> instalados.</li>
        <li>Clone este repositório: <code>git clone https://github.com/seu-usuario/seu-repositorio.git</code></li>
        <li>Configure o banco de dados MySQL no arquivo <code>application.properties</code>:</li>
    </ol>

<pre>
        <code>
# application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/gerenciador_livros
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
        </code>
    </pre>

 <p>Após configurar, execute o comando:</p>
    <pre><code>mvn spring-boot:run</code></pre>

 <h2>📖 Documentação da API</h2>
    <p>A documentação da API é gerada automaticamente pelo Swagger/OpenAPI e pode ser acessada em:</p>
    <p><a href="http://localhost:8080/swagger-ui.html" target="_blank">http://localhost:8080/swagger-ui.html</a></p>

 <h2>🛠️ Endpoints</h2>
<p>Alguns exemplos de endpoints disponíveis:</p>
<ul>
    <li><code>GET /books</code> - Lista todos os livros</li>
    <li><code>GET /books/{id}</code> - Retorna detalhes de um livro específico</li>
    <li><code>POST /books</code> - Adiciona um novo livro</li>
    <li><code>PUT /books/{id}</code> - Atualiza um livro existente</li>
    <li><code>DELETE /books/{id}</code> - Deleta um livro</li>
</ul>

<h2>🧑‍💻 Autor</h2>
    <p>Desenvolvido por Marcos Antonio (Acmors).</p>
