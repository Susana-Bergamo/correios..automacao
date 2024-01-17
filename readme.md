# Projeto de automação do site do Correios

Neste projeto de automação de testes, está validando funcionalidades de consulta no site do Correios. 
Utilizando a linguagem:

- Selenium ( framework para testes web);
- Cucumber (transforma descrições em linguagem natural em código executável no formato Gherkin);
- WebDriverManager (ferramenta que simplifica o gerenciamento de drivers de navegador ao usar o Selenium, tornando o desenvolvimento e a execução de testes de automação mais eficientes.);
- Padrão Page Objects (para organizar e estruturar os elementos da interface do usuário em páginas).

## Configuração do ambiente 

Para a execução de testes, é necessário que seja realizada a configuração do seu ambiente de desenvolvimento.
Para isso, verifique se as seguintes ferramentas estão instaladas:

- JDK;
- Maven;
- Git;
- Variáveis do ambiente.

## Instalação e Execução

Para instalar e executar os testes, siga os passos:

1º Copie o repositório para o seu ambiente local;

2º Navegue até a raiz do projeto e executando o comaneto: mvn test-Dtest=Executa. 

## Relatório de Teste

Depois da execução dos testes de automação, podemos acessar o relatório de testes gerados para obter informações detalhadas sobre os resultados dos testes. Nele inclui informações sobre os testes bem-sucedidos, falhas e estatísticas de execução. 

Após a execução dos testes, acesse o relatório de testes da seguinte forma:

1º Verifique a pasta "target" no diretório raiz do projeto;

2º Na pasta "target", encontre o repositório "cucumber-reports";

3º Abra este repositório para obter os relatórios gerados. 

No repositório "cucumber-reports", é possível encontrar arquivos de relatórios em diversos formatos. Tais como: HTML, JSON , entre outros, dependendo da configuração definida no seu arquivo "Executa.java".

Os relatórios nos ajudam a identificar qualquer problema ou falha que possa ter ocorrido durante a execução dos testes. Por isso, verifique de revisá-lo para obter informações sobre o processo e os resultados dos testes de automação.


