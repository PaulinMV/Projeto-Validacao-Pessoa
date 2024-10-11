# Projeto de Teste de Validação de Classe Pessoa

### Aluno: Paulo Moisés Gonçalves Vieira
### R.A.: 159047-23

## Descrição
Este projeto implementa uma classe `Pessoa` em Java, com foco em validações de nome e telefone. A classe inclui métodos que garantem que cada pessoa tenha um nome com pelo menos cinco caracteres e um telefone válido, com no mínimo seis caracteres e que não inicie com o número zero.

O programa principal (`main`) testa essas validações instanciando objetos `Pessoa` válidos e inválidos, demonstrando o comportamento da classe.

## Funcionalidades Principais

### 1. Validação de Dados:
- **Nome:** Deve ter pelo menos 5 caracteres. Se o nome não atender a essa regra, o sistema exibe uma mensagem de erro.
- **Telefone:** Deve ter no mínimo 6 caracteres e não pode começar com '0'. Caso contrário, uma mensagem de erro é exibida.

### 2. Contador Estático:
- A classe `Pessoa` possui um contador estático que mantém a contagem de todas as instâncias criadas, independentemente de suas informações serem válidas ou não. Esse contador é utilizado para atribuir um ID único a cada pessoa, começando em 1000.

### 3. Exibição de Dados:
- O programa possui um método `mostrarPessoa()` que exibe as informações de cada pessoa criada (nome, telefone e ID).
- O método `mostrarContador()` exibe o número total de pessoas instanciadas.

## Estrutura da Classe `Pessoa`

- **Atributos:**
  - `static int contador`: Conta quantas instâncias de `Pessoa` foram criadas.
  - `int id`: Armazena o ID único da pessoa.
  - `String nome`: Armazena o nome da pessoa.
  - `String telefone`: Armazena o telefone da pessoa.

- **Construtor:**
  - O construtor recebe dois parâmetros (`nome` e `telefone`) e aplica as devidas validações usando os métodos `setNome()` e `setTelefone()`. Se os dados forem inválidos, uma mensagem de erro é exibida.

- **Métodos:**
  - `boolean setNome(String nome)`: Valida o nome, garantindo que tenha ao menos cinco caracteres.
  - `boolean setTelefone(String telefone)`: Valida o telefone, garantindo que tenha ao menos seis caracteres e que não comece com '0'.
  - `void mostrarPessoa()`: Exibe o nome, telefone e ID da pessoa.
  - `static void mostrarContador()`: Exibe o número total de pessoas instanciadas.

## Como Executar o Projeto

1. Compile o código fonte utilizando um compilador Java, como o `javac`:
   ```
   javac Pessoa.java
   ```

2. Execute o programa com o seguinte comando:
   ```
   java Pessoa
   ```

O programa exibirá uma série de saídas mostrando as informações das pessoas criadas com dados válidos e as mensagens de erro relacionadas às tentativas de criação de pessoas com dados inválidos.

## Exemplo de Saída

```bash
Teste: Adicionando pessoas
Nome: Luana
Telefone: 449840234
ID: 1000

Nome: Guilherme
Telefone: 438873468
ID: 1001

Nome: Maria
Telefone: 123456789
ID: 1002

Teste: Adicionando tres pessoas com informacoes invalidas.
O nome deve ter pelo menos cinco caracteres!

O telefone deve ter pelo menos seis caracteres e nao deve iniciar com zero!

O telefone deve ter pelo menos seis caracteres e nao deve iniciar com zero!

CONTADOR: 6
```

## Observações
- O código demonstra conceitos básicos de encapsulamento, onde as variáveis de instância são privadas e acessadas por meio de métodos de configuração (`setters`).
- Apesar de as validações falharem para alguns objetos de teste, o contador de instâncias continua incrementando, o que é intencional para demonstrar o funcionamento de variáveis estáticas.

