# Criando um Banco Digital com Java e Orientação a Objetos

## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

### ***************** Melhorias no código: *****************

1 - Data de Criação nas Contas:
  Cada conta agora tem um atributo 'dataCriacao' que registra a data de abertura da conta.

2 - Histórico de Transações:
  Cada conta possui um histórico de transações, armazenado em uma lista de objetos 'Transacao'.

3 - Taxa de Operação para Conta Corrente:
  Ao realizar saques e transferências em uma conta corrente, é cobrada uma taxa de operação.

4 - Rendimento para Conta Poupança:
  A conta poupança possui um método 'aplicarRendimento' que calcula e adiciona os rendimentos anuais ao saldo.

### Detalhes das Novas Classes e Métodos:

Transacao.java:
  Classe que representa uma transação, contendo a data, descrição e valor da transação.

Conta.java:
  Atualizada para incluir o histórico de transações e a data de criação da conta.

ContaCorrente.java:
  Adiciona a cobrança de taxa de operação em saques e transferências.

ContaPoupanca.java:
  Adiciona a funcionalidade de calcular e aplicar rendimentos anuais.
