# payment-gateway

Este projeto é um microsserviço para processamento de pagamentos, desenvolvido em Java usando Spring Boot. Ele é responsável por receber solicitações de pagamento, processar a transação e retornar o status do pagamento (`SUCCESS` ou `FAILED`) de forma randomica. Este serviço é integrado com outros microsserviços, como o serviço de gestão de pedidos [`checkout-service`](https://github.com/7feeh7/checkout-service/tree/main?tab=readme-ov-file), que depende deste gateway para concluir ou cancelar pedidos com base no resultado do pagamento.

## Tecnologias

- [Java 11+](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)

## Features

- [x] Receber solicitações de pagamento via HTTP
- [x] Processar pagamentos simulados
- [x] Retornar o status do pagamento (`SUCCESS` ou `FAILED`)
- [x] Integrar com outros microsserviços através de APIs REST

## Próximos passos

- [] Adicionar autentiação
- [] Validar orderId
- [] Integrar com uma plataforma de pagamentos
- [] Adicionar testes

## Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

## Instalação

1. Clonar o repositório:

   ```bash
   git clone https://github.com/7feeh7/payment-gateway.git
   ```

2. Instalando as dependências:

   ```bash
   mvn clean install
   ```

   ou

   ```bash
   Importe o projeto como Existing Maven Project

   ```

3. Inicie o servidor:

   ```bash
   mvn spring-boot:run
   ```

   ou

   ```bash
   Execute a classe PaymentGatewayApplication

   ```

4. O servidor agora deve estar em execução em http://localhost:8080.

## Contribuindo

Contribuições para o projeto são bem vindas! Pra contribuir com o projeto, siga estas etapas:

1. De um fork no repositorio.
2. Crie uma nova branch para sua feature ou bug fix.
3. Faça suas alterações, confirmando e pressionando conforme necessário.
4. Envie uma solicitação pull com uma descrição detalhada de suas alterações.

## Contato

Para qualquer dúvida ou consulta, entre em contato com [F-softtech](mailto:felipe.pires.soaresti@gmail.com).

Sinta-se à vontade para entrar em contato conosco se tiver algum comentário, sugestão ou se encontrar algum problema ao usar o save-income-backend. Sua opinião é valiosa para nós e nos ajuda a melhorar a aplicação.
