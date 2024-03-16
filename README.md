# Projeto Web Services com Spring Boot e JPA / Hibernate

Este é um projeto Spring Boot Java que implementa um sistema de Web Services utilizando JPA (Java Persistence API) e Hibernate. O objetivo principal é criar uma aplicação com funcionalidades de CRUD (Create, Retrieve, Update, Delete), tratamento de exceções e estruturação em camadas.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para facilitar a configuração e o desenvolvimento de aplicações Java.
- **Spring Web**: Módulo do Spring Framework para criar aplicativos web.
- **Spring Data JPA**: Facilita a implementação de repositórios baseados em JPA.
- **Hibernate**: Framework de mapeamento objeto-relacional para o Java.
- **H2 Database**: Banco de dados em memória para testes.
- **Java 17**: Linguagem de programação principal.
- **Maven**: Gerenciador de dependências.

## Funcionalidades da Aplicação

### Modelo de Domínio

![image](https://github.com/marialuizaleitao/workshop-springboot3-jpa/assets/88951059/738d5306-10e8-41fa-95ef-e2fcb9bfa4b1)

![image](https://github.com/marialuizaleitao/workshop-springboot3-jpa/assets/88951059/9322e252-03e0-4b37-a043-46f0f4860a34)

### Camadas Lógicas

![image](https://github.com/marialuizaleitao/workshop-springboot3-jpa/assets/88951059/ab6f951b-1213-4bde-923c-b7499a540e78)

### Checklist

- **Spring Initializr**: Utilizado para configurar o projeto com Maven, Java 17 e empacotamento JAR, juntamente com a dependência do Spring Web.
- **Entidade e Recurso de Usuário**: Implementação da entidade de Usuário com atributos básicos, associações, construtores, getters, setters, hashCode, equals e serialização.
- **Banco de Dados H2, Perfil de Teste e JPA**: Configuração do banco de dados H2 para testes, perfil de teste no arquivo `application.properties` e mapeamento JPA para as entidades.
- **Repositório JPA, Injeção de Dependência e Povoamento do Banco de Dados**: Utilização do `UserRepository` para operações CRUD, injeção de dependência, e povoamento do banco de dados com usuários.
- **Camada de Serviço e Registro de Componentes**: Implementação da camada de serviço e registro de componentes Spring.
- **Nova Entidade de Pedido**: Implementação da entidade de Pedido com associações e mapeamento JPA.
- **Enumeração de Status de Pedido**, **Categoria** e **Produto**: Implementação das entidades relacionadas aos pedidos, categorias e produtos.
- **Associação Muitos-para-Muitos com JoinTable** e **Associação Um-para-Muitos**: Implementação das associações entre Pedido e Produto.
- **Associação Um-para-Um com Pagamento**: Implementação da associação entre Pedido e Pagamento.
- **Métodos para Subtotal e Total dos Pedidos**: Implementação de métodos para calcular o subtotal e total dos pedidos.
- **Inserção, Exclusão e Atualização de Usuários**: Implementação de serviços e recursos para inserir, excluir e atualizar usuários.
- **Tratamento de Exceções**: Implementação de tratamento de exceções para operações de busca, exclusão e atualização de usuários.

## Como Executar o Projeto

1. Faça o clone deste repositório.
2. Importe o projeto em sua IDE preferida (recomendado: IntelliJ IDEA, Eclipse).
3. Certifique-se de ter o Java 17 e o Maven instalados em sua máquina.
4. Execute o projeto como uma aplicação Spring Boot.

## Exemplos de Testes

### Inserção de Usuário

```json
{
 "name": "Fernando Alonso",
 "email": "alonso33@gmail.com",
 "phone": "977557733",
 "password": "123456"
}
```

### Atualização de Usuário

```json
{
 "name": "Fernando Alonso",
 "email": "alonso14@gmail.com",
 "phone": "977557714"
}
```
## Contribuindo
Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões, por favor, abra uma issue neste repositório.
