### Funcionamento da Arquitetura:
A Clean Architecture é uma abordagem estratégica que põe mais ênfase em características como <br>
a manutenção da organização e estrutura do código de forma que o domínio da aplicação se mantenha <br>
resiliente a mudanças de tecnologia, frameworks ou requisitos do negócio. A ideia é que isolando <br>
o núcleo da aplicação desses componentes, o software se mantenha mais fácil de modificar, testar e entender <br>

### Surgimento da Clean Architecture:
Durante uma conversa entre Robert C. Martin (Uncle Bob) e seu filho Micah Martin, que também é desenvolvedor <br>
de software, ele mostrou a Robert a estrutura de diretórios do projeto em que estava trabalhando.<br><br>

Ao observar aquela estrutura de alto nível, Robert rapidamente identificou que a tecnologia usada era Ruby on Rails, <br>
sem precisar se aprofundar na arquitetura do projeto. Para Uncle Bob, isso era evidente e o incomodou profundamente, <br>
o que o motivou a desenvolver a Arquitetura Limpa, ou Clean Architecture.

A Clean Architecture foi apresentada pela primeira vez em seu blog, The Clean Code Blog, em 2012, onde Micah Martin<br> 
também é coautor de vários tópicos. Posteriormente, em 2017, a arquitetura foi detalhada no livro "Clean Architecture: <br>
A Craftsman’s Guide to Software Structure."

### Quais são os propósitos da Clean Architecture?
1. Independência de Frameworks: As camadas internas não devem depender de frameworks externos. Os detalhes de implementação<br>
 devem permanecer isolados.<br>
2. Independência de Detalhes: As camadas internas não devem conhecer os detalhes de implementação das camadas externas. <br>
A inversão de dependência é fundamental aqui.<br>
3. Separação de Responsabilidades: Cada camada tem uma função específica e não deve se intrometer nas responsabilidades <br>
das outras camadas.<br>
4. Testabilidade: A arquitetura deve facilitar a criação de testes unitários e de integração para cada componente.<br>

### Quais problemas a Clean Architecture resolve?
1. Manutenção Simplificada: A separação clara de responsabilidades entre camadas torna o código mais fácil de entender e <br>
modificar, o que reduz a probabilidade de introduzir erros ao fazer alterações. Isso também facilita a correção de bugs <br>
e a implementação de novas funcionalidades sem impactar outras partes do sistema.<br>

2. Testabilidade Aprimorada: A independência de detalhes de implementação e a organização baseada em regras de negócios <br>
permitem que o código seja testado de forma isolada, tornando os testes unitários e de integração mais fáceis de escrever <br>
e executar. Isso resulta em maior confiabilidade e menos retrabalho.<br>

3. Adaptabilidade e Flexibilidade: A Clean Architecture facilita a substituição de componentes (como trocar um banco de dados<br>
 ou uma API) sem causar grandes impactos no sistema. Como as dependências são invertidas e os detalhes técnicos estão desacoplados<br>
  da lógica de negócios, as mudanças tecnológicas podem ser feitas com menor esforço e risco.<br>

4. Escalabilidade: Devido à estrutura modular, é mais fácil adicionar novas funcionalidades ou escalar o sistema conforme a <br> necessidade. Cada componente ou serviço pode crescer de forma independente, sem prejudicar o restante da aplicação.<br>

5. Facilidade de Evolução: À medida que o sistema evolui, novas tecnologias ou requisitos podem ser incorporados sem necessidade <br>
de reescrever o código existente. A arquitetura limpa promove uma base sólida e flexível para o crescimento do software, tornando-o<br> mais resistente à obsolescência.

6. Reuso de Código: A clara separação entre camadas permite que certos componentes sejam reutilizados em diferentes partes da <br>
aplicação ou até em outros projetos, economizando tempo e esforço no desenvolvimento.<br>

### Quais problemas ainda persistem na Clean Architecture?
1. Curva de aprendizado relativamente íngreme, considerando que todas as camadas funcionam juntas, exigindo um certo tempo para entender seus conceitos, principalmente desenvolvedores provenientes de padrões como MVVM e MVP simples;<br>

2. Pela arquitetura exigir o acréscimo de muitas classes adicionais, este modelo não é ideal para projetos de baixa complexidade.<br>

3. A adoção da Clean Architecture e dos Design Patterns pode aumentar os custos de desenvolvimento de software. Isso se deve ao fato <br>
 de que a aplicação adequada dessas práticas pode exigir mais tempo e recursos. Além disso, pode ser necessário investir em <br>
 treinamento para garantir que a equipe de desenvolvimento compreenda e aplique esses conceitos de maneira eficaz.<br>
Em projetos com recursos financeiros limitados ou prazos apertados, os benefícios a longo prazo das práticas de design podem<br>
 ser compensados pelos custos iniciais mais elevados.