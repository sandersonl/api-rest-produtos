# API REST de Produtos - Estudo

Este projeto é um estudo de uma API REST de gestão de produtos, desenvolvido a partir de um tutorial ministrado pela Michelli Brito no [YouTube](https://youtube.com/playlist?list=PL8iIphQOyG-D2FP9wkg12AavzmVRWEcnJ&si=6YXp0t9josLdcq87). O objetivo desse estudo é aprender e aplicar os conceitos fundamentais de construção de uma API utilizando tecnologias como Java, Spring Boot e Swagger.

## Descrição

A API REST de Produtos permite realizar operações básicas de CRUD (Create, Read, Update, Delete) em uma lista de produtos. Cada produto possui as seguintes propriedades:

- **id**: Identificador único do produto (gerado automaticamente).
- **nome**: Nome do produto.
- **preco**: Preço do produto.
- **quantidade**: Quantidade disponível do produto.

## Funcionalidades

A API implementa as seguintes funcionalidades:

- **POST /produtos**: Adicionar um novo produto.
- **GET /produtos**: Listar todos os produtos.
- **GET /produtos/:id**: Buscar um produto específico pelo ID.
- **PUT /produtos/:id**: Atualizar as informações de um produto.
- **DELETE /produtos/:id**: Deletar um produto.
