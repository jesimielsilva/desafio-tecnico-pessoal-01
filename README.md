# 🧪 Desafio Técnico - Sistema de Cadastro e Listagem de Tarefas

## 🧠 Contexto

Uma empresa precisa de um sistema simples para que os colaboradores possam cadastrar e gerenciar tarefas do dia a dia. O sistema deve permitir:

- Cadastro de tarefas com título, descrição, status (`pendente`, `em andamento`, `concluída`) e data limite.
- Listagem das tarefas com filtro por status.
- Atualização do status da tarefa.
- Exclusão de tarefas.

O projeto deve ser dividido conforme **Clean Architecture** e aplicar princípios de **DDD (Domain-Driven Design)**.

---

## 📌 Requisitos

### Backend - Java (Spring Boot)

- API RESTful.
- Camadas:
  - **Domain**: entidades, interfaces (ports), casos de uso.
  - **Application**: serviços de aplicação.
  - **Infrastructure**: persistência (JPA/PostgreSQL), API controllers.
- Validações de entrada (ex: título obrigatório, data futura).
- Testes unitários em pelo menos os casos de uso.
- Persistência com **PostgreSQL**.

### Frontend - Angular

- Telas para:
  - Listar tarefas.
  - Criar nova tarefa.
  - Editar status da tarefa.
  - Excluir tarefa.
- Estrutura de projeto modular (por domínio ou feature).
- Comunicação com a API via `HttpClient`.
- Formulários reativos com validação.

---

## 🎯 Critérios de Avaliação

- Clareza e organização do código.
- Aplicação correta de Clean Architecture.
- Separação adequada de responsabilidades (DDD).
- Boas práticas (nomes, modularização, testes).
- Uso correto do Angular (serviços, reactive forms, roteamento).
- Instruções claras de como rodar o projeto (`README.md`).

---

## 🔧 Tecnologias Esperadas

- **Backend**: Java 17+, Spring Boot, Maven/Gradle, PostgreSQL.
- **Frontend**: Angular 15+, RxJS, Angular CLI.
- **Extras (opcional)**: Docker, Swagger, Tailwind/Material UI.

---

## 📝 Entrega

- Repositório Git (GitHub, GitLab ou Bitbucket).
- Incluir instruções de execução (`README.md`).
- Scripts de build e execução.
- *(Opcional)* Link com vídeo de demonstração.
