// Aluno: Paulo Moisés Gonçalves Vieira
// R.A.: 159047-23

// ------------------- ***** ------------------- ***** -------------------

// Importanto biblioteca de Lista e de Array
import java.util.ArrayList;
import java.util.List;

// Declaração da classe Pessoa
// O Uso do private nas variáveis é para garantir que elas não sejam instanciadas de qualquer 'lugar'.
public class Pessoa{
    // Variavel usada para contar quantas pessoas foram criadas,
    // ela precisa ser estatica para receber o mesmo quando for instanciada
    private static int contador = 0;
    private int id;
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        // Verifica se o nome está de acordo com a regra criada abaixo que verifica o tamanho da variavel
        if (!setNome(nome)) {
            // Mensagem de erro caso o nome tiver menos que cinco caracteres
            System.out.println("O nome deve ter pelo menos cinco caracteres!");
            System.out.println();
        }
        if (!setTelefone(telefone)) {
            // Mensagem de erro caso o telefone tenha menos que seis caracteres e/ou inicie com zero
            System.out.println("O telefone deve ter pelo menos seis caracteres e nao deve iniciar com zero!"); 
            System.out.println();
        }
        // id inicia no mil, e cada vez que instanciada, o ID recebe mais um
        this.id = 1000 + contador; // Atribui 1000 ao ID e adiciona o numero do contador
        contador++; // cada vez que instanciada, o contador recebe + um
    }

    // Método que verifica se o nome tem cinco caracteres.
    // setNome tem o tipo boleano por retornar um valor verdadeiro ou falso, que facilita o uso do método
    public boolean setNome(String nome) {
        // IF que verifica se o tamanho da variavel é igual ou menor que seis
        if (nome.length() >= 5) {
            this.nome = nome;
            // Retorna valor VERDADEIRO caso o nome tenha cinco ou mais caracteres
            return true;
        } else {
            // Retorna valor FALSO caso o nome tenha quatro ou menos caracteres
            return false;
        }
    }

    // Método que verifica se o telefone tem seis caracteres e inicia com zero
    // setTelefone tem o tipo boleano por retornar um valor verdadeiro ou falso, que facilita o uso do método
    public boolean setTelefone(String telefone) {
        // Verifica se o telefone tem pelo menos 6 dígitos e não começa com 0
        // Para verificar se o primeiro número é 0, usamos o charAt(), que é uma forma de ver o valor de uma parte especifica
        // de uma variavel, por exemplo, estamos verificando se o indice 0 que é o primeiro item da variavel é diferente de zero
        if (telefone.length() >= 6 && telefone.charAt(0) != '0') {
            this.telefone = telefone;
            // Retorna valor VERDADEIRO caso o telefone esteja dentro dos parametros
            return true;
        } else {
            // Retorna valor FALSO caso o telefone NÃO esteja dentro dos parametros
            return false;
        }
    }

    // Método para retornar valor do Id
    public static void mostrarContador() {
        System.out.println("CONTADOR: " + contador);
    }

    public void mostrarPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("ID: " + this.id);
    }

// Método Main que faz o Teste de Pessoa
// Usada para ver se está tudo funcionando como o esperado
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar as pessoas
        List<Pessoa> pessoas = new ArrayList<>();

        // Instanciando pessoas e adicionando diretamente na array
        System.out.println("Teste: Adicionando pessoas");
        pessoas.add(new Pessoa("Luana", "449840234"));
        pessoas.add(new Pessoa("Guilherme", "438873468"));
        pessoas.add(new Pessoa("Maria", "123456789"));

        // For each com o metodo Mostrar Pessoa do tamanho do array pessoas
        for (Pessoa pessoa : pessoas) {
            pessoa.mostrarPessoa();
            System.out.println();
        }

        // Instanciando pessoas com informações invalidas por fora do array apenas como teste.
        System.out.println("Teste: Adicionando tres pessoas com informacoes invalidas.");
        // Teste de NOME invalido
        Pessoa p1 = new Pessoa ("Joao", "4455678");
        // Teste de TELEFONE que inicia com 0
        Pessoa p2 = new Pessoa ("Paulo", "0456486");
        // Teste de TELEFONE que tem menos de seis caracteres
        Pessoa p3 = new Pessoa ("Alfredo", "12345");

        // Executando o contador
        mostrarContador();
        // Ele tem o resultado de seis, que por mais que p1, p2 e p3 estão com informações invalidas, o contador recebe a contagem.
    }
}