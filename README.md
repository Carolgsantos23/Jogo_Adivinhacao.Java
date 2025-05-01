
# Jogo de Adivinhação - Java

Este é um jogo de adivinhação onde o usuário tenta adivinhar um número gerado aleatoriamente pelo programa, dentro de um limite de 5 tentativas.

## Funcionalidade

O programa gera um número aleatório entre 0 e 99 e o usuário precisa adivinhar esse número. A cada tentativa, o sistema informa se o número digitado é maior ou menor que o número gerado. O jogo termina após 5 tentativas ou quando o usuário acerta o número.

### Regras:
- O número gerado é aleatório, entre 0 e 99.
- O usuário tem no máximo 5 tentativas para acertar o número.
- A cada tentativa, o sistema informa se o número digitado é maior ou menor que o número gerado.
- Caso o usuário acerte o número antes de esgotar as tentativas, o programa informa o número de tentativas necessárias para acertar.
- Se o usuário não acertar em 5 tentativas, o número gerado é revelado.

## Tecnologias Utilizadas
- **Linguagem**: Java
- **IDE**: IntelliJ IDEA
- **Biblioteca**: `java.util.Random` para geração de números aleatórios e `java.util.Scanner` para capturar a entrada do usuário.

## Resultados Esperados
Durante o jogo, o usuário verá as mensagens informando se o número digitado é maior ou menor que o número gerado, e também a quantidade de tentativas utilizadas. No final, o programa indicará se o usuário acertou ou não o número.