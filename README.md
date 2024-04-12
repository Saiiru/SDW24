## SDW24
# Sobre o Projeto
Neste repositório, você encontrará o código-fonte de uma REST API e seu respectivo Frontend (pasta /docs), desenvolvidos durante a Santander Dev Week 2024, fruto de uma colaboração entre a DIO e o Santander. Este projeto, construído com Java 21 e Spring Boot 3, é o resultado de quatro dias de lives, com um propósito singular:

# Note

Objetivo: "Permitir que os usuários conversem com os campeões do League of Legends (LOL)".

Para isso, utilizamos algumas das mais recentes Inteligências Artificiais (IAs) Generativas, possibilitando que nossa API "entenda" a personalidade única de cada campeão para criar interações que capturam sua essência, tornando cada conversa uma experiência única.

# Pré-Requisitos

Caso queira reproduzir este projeto, você terá os seguintes pré-requisitos:

Vontade de Aprender 😉
Instalação da JDK 21 (versão LTS do Java na data das lives);
Instalação do IntelliJ IDEA Community Edition ou a IDE de sua preferência (Eclipse, VSCode etc);
[Opcional] Conta na AWS (caso queira publicar a sua API REST na Nuvem usando o AWS Elastic Beanstalk;
[Opcional] Conta na OpenAI e/ou Google para integração com os modelos GPT e/ou Gemini respectivamente.


# Estrutura de Diretórios:

Refletindo a organização apresentada no diagrama arquitetural, a estrutura de diretórios do projeto sugere uma Clean Architecture simplificada, visando a uma clara separação das responsabilidades e promovendo a autonomia das camadas em um projeto Spring Boot. Esta abordagem estrutural não só facilita a manutenção e a evolução do código, mas também sustenta a integração e a colaboração eficaz entre as diferentes partes da aplicação. A seguir, detalhamos a disposição dos diretórios que compõem a aplicação, cada um desempenhando um papel específico dentro do ecossistema de software:

adapters/: Inclui os adaptadores que facilitam a comunicação entre a aplicação e o mundo externo (único diretório que "conhece" o Spring).
in/: Abriga os adaptadores de entrada, tais como controladores REST, que lidam com as requisições dos usuários.
out/: Contém os adaptadores de saída, responsáveis da interação com bancos de dados e APIs externas, por exemplo.
application/: Hospeda os casos de uso da aplicação, encapsulando a lógica de negócios essencial.
domain/: Representa o coração da aplicação, englobando entidades, exceções e interfaces (portas) que articulam as regras de negócio fundamentais.
exception/: Define as exceções personalizadas pertinentes ao domínio.
model/: Modela as entidades do domínio, refletindo os conceitos centrais da aplicação.
ports/: Estabelece as interfaces que delineiam os contratos para os adaptadores e serviços externos.
Application.java: A classe principal que orquestra a configuração e o execução da aplicação.
Banco de Dados SQL em Memória
A utilização do banco de dados H2 neste projeto serve como uma fundação ágil e flexível para modelar nosso domínio de conhecimento — os campeões do LOL. Essa escolha permite uma rápida prototipação e um ambiente de desenvolvimento eficiente, essencial para armazenar e recuperar informações detalhadas sobre cada campeão. Dessa forma, garantimos que as IAs Generativas que integramos possam acessar um repositório rico e detalhado, permitindo-lhes capturar com precisão a essência e a personalidade única de cada campeão, enriquecendo assim a interatividade e a profundidade das interações realizadas.

