#📌 Workshop JavaFX + JDBC
Aplicação Java Desktop desenvolvida com JavaFX e JDBC, aplicando conceitos de CRUD, arquitetura MVC, padrão DAO e boas práticas de programação.
O objetivo do projeto é integrar interface gráfica a um banco de dados MySQL, de forma simples e eficiente, sem uso de ORM.

🚀 Funcionalidades
✅ Cadastro de Vendedores (Create)

✅ Consulta de Registros (Read)

✅ Atualização de Dados (Update)

✅ Exclusão de Registros (Delete)

✅ Interface amigável construída com JavaFX

✅ Conexão direta com MySQL via JDBC

✅ Arquitetura organizada em MVC + DAO

🛠 Tecnologias Utilizadas
Java 17

JavaFX 17

JDBC (Java Database Connectivity)

MySQL

FXML para construção das telas

Scene Builder para prototipação visual

📂 Estrutura do Projeto
bash
Copiar
Editar
src/
 ├── application/       # Classe principal e inicialização da aplicação
 ├── gui/               # Controladores e telas (JavaFX Controllers)
 ├── model/             
 │    ├── entities/     # Classes de entidade (Seller, Department)
 │    ├── dao/          # Interfaces DAO
 │    ├── dao.impl/     # Implementações DAO com JDBC
 └── db/                # Configurações e utilitários de conexão
⚡ Como Executar o Projeto
Clonar o repositório

bash
Copiar
Editar
git clone https://github.com/melzaninelli/workshop-javafx-jdbc.git
Configurar o banco de dados MySQL

Criar um schema no MySQL

Executar o script SQL disponível em db/script.sql

Configurar a biblioteca JavaFX e JDBC no seu IDE (Eclipse/IntelliJ/NetBeans)

Executar a classe Main

🎯 Objetivo Profissional
Este projeto foi desenvolvido para consolidar conhecimentos em Java desktop, banco de dados e boas práticas de arquitetura, sendo um exemplo de aplicação real que combina frontend (JavaFX) e backend (JDBC/MySQL).
É também parte do meu portfólio como desenvolvedor, demonstrando minha capacidade de construir aplicações completas do zero.


👤 Autora
Mel Zaninelli
📧 melzaninelli233@gmail.com
💼 LinkedIn | GitHub

