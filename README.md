# Teste Técnico QA – Web, API e Performance

Este repositório contém a solução do **Teste Técnico de QA**, contemplando **automação Web**, **automação de testes de API** e **testes de performance**, conforme especificado no documento fornecido pelo recrutador.

---

## 📌 Índice

- #visão-geral
- #tecnologias-utilizadas
- #automação-web
  - #cenários-automatizados
  - #como-executar-web
- #automação-de-api
  - #endpoints-testados
  - #como-executar-api
  - #relatórios-api
- #teste-de-performance
  - #cenário-testado
  - #critério-de-aceitação
  - #como-executar-performance
  - #resultados-e-conclusão
- #cicd
- #considerações-finais

---

## 📖 Visão Geral

O objetivo deste projeto é demonstrar conhecimentos em **qualidade de software**, aplicando boas práticas de automação de testes e análise de desempenho, garantindo confiabilidade, legibilidade e fácil execução em qualquer sistema operacional (Linux, Windows ou MacOS).

---

## 🛠 Tecnologias Utilizadas

### Automação Web
- Java 17+
- Selenium WebDriver
- JUnit 5
- Maven
- Page Object Model (POM)

### Automação de API
- Java 17+
- RestAssured
- JUnit 5
- Maven
- Allure Reports

### Performance
- Apache JMeter
- JMeter HTML Report

### Outros
- Git
- GitHub Actions (CI)

---

# 🌐 Automação Web

**Site testado:** https://blogdoagi.com.br  
**Funcionalidade:** Pesquisa de artigos (lupa no canto superior direito)

## ✅ Cenários Automatizados

### 1️⃣ Pesquisa com termo válido
- O sistema deve retornar artigos relacionados ao termo pesquisado.

### 2️⃣ Pesquisa sem resultados
- O sistema deve exibir mensagem informando que não há resultados encontrados.

Os testes validam:
- Comportamento funcional
- Experiência do usuário
- Estabilidade da aplicação

---

## ▶️ Como Executar (Web)

### Pré-requisitos
- Java instalado
- Maven instalado
- Google Chrome
- ChromeDriver compatível

### Execução
```bash
mvn clean test


✅ **Compatível com Apache JMeter 5.6+**

***

# 🎯 O que este `.jmx` faz (explicação técnica)

## 🔹 Test Plan

*   Nome: **BlazeDemo - Compra de Passagem**
*   Objetivo: Teste de carga e pico para o fluxo de compra

***

## 🔹 Thread Group — Teste de Carga

*   **Usuários (Threads):** 250
*   **Ramp-up:** 10 segundos
*   **Loop:** contínuo (ideal para medir throughput)

➡️ Configurado para atender o critério de **250 requisições por segundo** conforme solicitado no desafio.

***

## 🔹 Samplers HTTP

### ✅ Home

```text
GET https://www.blazedemo.com/
```

*   Acessa a página inicial

### ✅ Find Flights

```text
POST https://www.blazedemo.com/reserve.php
```

**Parâmetros enviados:**

*   `fromPort = Paris`
*   `toPort = London`

Simula a **busca de voos**, etapa essencial do fluxo de compra.

# ▶️ Como Executar o `.jmx`

```bash
jmeter -n -t blazedemo_test.jmx -l results.jtl -e -o report
```

Depois, abra no navegador:

```text
.../performance-tests/report/index.html
```

```bash
jmeter
```

*   File → Open → `blazedemo_test.jmx`
***