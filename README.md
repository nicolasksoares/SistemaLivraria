# 📚 Desafio: Sistema de Livraria (Java)

Bem-vindo(a) ao repositório do desafio de Sistema de Livraria, parte da formação de Java da Rocketseat! Este projeto foi desenvolvido para reforçar e aplicar de forma prática os conceitos de programação orientada a objetos (POO) e manipulação de coleções em Java.

## 🚀 Sobre o Projeto

Este é um sistema básico de gerenciamento de livros e empréstimos para uma pequena biblioteca. O foco principal é na listagem de livros disponíveis e na funcionalidade de empréstimo de forma simples e interativa via console.

### ✨ Funcionalidades Principais

* **Listagem de Livros Disponíveis:** O sistema interage com o usuário, perguntando se ele deseja visualizar os livros que estão atualmente disponíveis para empréstimo.
* **Realização de Empréstimo:** Se o usuário optar por ver os livros, ele pode escolher um livro pelo ID e informar seu nome para registrar o empréstimo. O livro é então marcado como indisponível.
* **Encerramento do Sistema:** O sistema pode ser encerrado a qualquer momento com uma mensagem de despedida.

### 💡 Funcionalidades "Indo Além" (Implementadas)

Para ir além do desafio básico e aprimorar o sistema, foram incorporadas as seguintes funcionalidades:

* **Gerenciamento de Autores:** A classe `Autor` foi criada para associar livros a autores específicos.
* **Gerenciamento de Clientes:** A classe `Cliente` foi implementada para representar os usuários da biblioteca, permitindo que os empréstimos sejam associados a um objeto `Cliente` em vez de apenas um nome (conforme a evolução do nosso diagrama).
* **Registro de Empréstimos:** A classe `Emprestimo` gerencia os detalhes de cada empréstimo, incluindo o livro, o cliente, a data do empréstimo e a data de devolução (ainda que a funcionalidade de devolução não esteja no escopo inicial do console).

## 📊 Diagrama UML

A estrutura do projeto foi planejada utilizando um Diagrama de Classes UML, que pode ser visualizado abaixo. Ele representa as classes (`Biblioteca`, `Livro`, `Autor`, `Emprestimo`, `Cliente`), seus atributos e os relacionamentos entre elas.

<img width="731" height="780" alt="UML" src="https://github.com/user-attachments/assets/1db00a6f-bcca-4f0d-af33-2ae7888d2c17" />


*Para uma visualização mais detalhada do diagrama, clique na imagem acima ou abra o arquivo `Diagrama sem nome.drawio (3).png`.*

## 💻 Tecnologias Utilizadas

* **Java:** Linguagem de programação principal.
