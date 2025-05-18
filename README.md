# 🧾 Exercícios de Relacionamento Entre Objetos (Java)

Este repositório contém uma série de exercícios propostos para praticar **POO (Programação Orientada a Objetos)** em **Java**, abordando encapsulamento, construtores, métodos personalizados, listas (`ArrayList`), e interações entre objetos.

---

## ✅ Requisitos Gerais

Para todos os exercícios:

- Usar atributos **privados**
- Criar **métodos construtores**
- Implementar **getters e setters**
- Criar **método `toString()`**
- Utilizar **tratamento de exceções** onde necessário
- Utilizar **ArrayList** para armazenar objetos quando apropriado

---

## 📘 Exercícios Implementados

### 1. Retângulo
- Classe `Retangulo` com `altura` e `largura`.
- Métodos para calcular **área** e **perímetro**.
- Armazena 5 objetos em uma lista.
- Métodos para encontrar:
    - Retângulo com **maior área**
    - Retângulo com **maior perímetro**

### 2. Floricultura
- Classe `Flor` com:
    - Nome da flor, preço, nome do cliente, e boolean se é para presente.
- Funções:
    - Flor **mais cara**
    - Comparar receita de flores para presente e comuns

### 3. Loja de Materiais de Construção
- Classe `Material` com:
    - Nome, descrição, preço, volume, peso e estoque
- Métodos:
    - Adicionar ao estoque
    - Vender item
    - Colocar em promoção (com desconto %)
- Descobrir:
    - Material mais caro
    - Material mais caro por **m³**
    - Material mais **denso**
    - Material que ocupa mais **espaço total no estoque**

### 4. Conta Bancária
- Classe `Conta` com nome do titular e saldo
- Métodos:
    - Sacar
    - Depositar
    - Transferir entre contas

### 5. Pessoa e Endereço
- Classe `Pessoa` com nome e endereço
- Classe `Endereco` com:
    - Logradouro, complemento e número
- Relacionamento: **Pessoa possui um Endereço**

### 6. Câmara de Vereadores
- Classe `Vereador` com:
    - Nome, partido, projetos apresentados e aprovados
- Cálculo de desempenho:
    - `desempenho = (aprovados / apresentados) * índice`
- Descobrir:
    - Total de projetos
    - Vereador com mais aprovações
    - Melhor desempenho
    - Desempenhos acima da média
    - **Desafio**: Partido com melhor desempenho médio

### 7. Inteiro Positivo
- Classe `InteiroPositivo` com:
    - Garantia de valor positivo no `setValor`
    - Multiplicação entre objetos
    - Fatorial
    - Divisores inteiros e sua contagem
    - Série de Fibonacci com X elementos

### 8. Laboratório de Informática
- Classe `Computador` com:
    - Número de série, processador, clock, armazenamento, memória, consumo, fonte
- Overclock:
    - Permitido se processador termina com `K`, `KF`, `X`
    - Até 10% do clock original
    - +75W a cada 100 MHz, limitado a 95% da fonte
- Classe `Laboratorio` com:
    - Armazenamento total
    - Potência mínima para 3 salas (com 10% segurança)
    - Gasto diário com energia elétrica

---

## 🛠️ Tecnologias Utilizadas

- Linguagem: **Java 11+**
- IDE recomendada: **IntelliJ IDEA**, **Eclipse** ou **VS Code**
- Utilização de:
    - `ArrayList`
    - Encapsulamento
    - Classes auxiliares
    - `Scanner` (opcional)

---

## 📎 Como Executar

1. Clone este repositório
2. Compile e execute as classes `main()` nos respectivos exercícios
3. Modifique ou adicione testes conforme desejar

---

