
**Objetivo:**

O objetivo desse desafio é demonstrar sua experiência, conhecimento e criatividade como desenvolvedor, assim teremos uma noção de como você pensa e como resolve problemas na vida real.

**O Problema:**

Um time de robôs devem ser colocados pela SpaceX para explorar um terreno em Marte.
Esse terreno, que é retangular, precisa ser navegado pelos robôs de tal forma que suas câmeras acopladas possam obter uma visão completa da região, enviando essas imagens novamente para a Terra.

A posição de cada robô é representada pela combinação de coordenadas cartesianas (x, y) e por uma letra, que pode representar uma das quatro orientações: NORTH, SOUTH, EAST e WEST. Para simplificar a navegação, a região “marciana” a ser explorada foi subdividida em sub-regiões retangulares.

Uma posição válida de um robô, seria (0, 0, N), que significa que o robô está posicionado no canto esquerdo inferior do terreno, voltado para o Norte.

Para controlar cada robô, a SpaceX deve utilizar uma interface visual, que permita enviar uma string simples, que pode conter as letras ‘L’, ‘R’ e ‘M’. As letras ‘L’ e ‘R’ fazem o robô rotacionar em seu próprio eixo 90 graus para esquerda ou para direita, respectivamente, sem se mover da sua posição atual. A letra ‘M’ faz o robô deslocar-se uma posição para frente.

Assuma que um robô se movimenta para o NORTE em relação ao eixo y. Ou seja, um passo para o NORTE da posição (x,y), é a posição (x, y+1)
Exemplo: Se o robô está na posição (0,0,N), o comando "MML" fará ele chegar na posição (0,2,W)

Escreva um programa que permita aos engenheiros da SpaceX enviar comandos para o Robô e saber onde ele se encontra. Os engenheiros irão rodar testes no seu software para garantir que ele se comporta da forma esperada, antes de enviar o Robô para marte.

**Requisitos do desafio:**

O terreno deverá ser iniciado com 5x5 posições;
O robô inicia na coordenada (0,0,N);
Deverá ser possível enviar um comando para o Robô que me retorne a posição final dele;
O Robô não pode se movimentar para fora da área especificada;
Não é necessário guardar o estado do robô para consulta posterior;


**Alguns cenários de teste:**

Movimento com rotações para direita:
        curl -s --request POST http://localhost:8080/rest/mars/MMRMMRMM
        Saída esperada: (2, 0, S)

Movimento para esquerda:
        Entrada: curl -s --request POST http://localhost:8080/rest/mars/MML
        Saída esperada: (0, 2, W)

Repetição da requisição com movimento para esquerda:
        Entrada: curl -s --request POST http://localhost:8080/rest/mars/MML
        Saída esperada: (0, 2, W)

Comando inválido:
        curl -s --request POST http://localhost:8080/rest/mars/AAA
        Saída esperada: 400 Bad Request

Posição inválida:
        curl -s --request POST http://localhost:8080/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM
        Saída esperada: 400 Bad Request

**Requisitos técnicos:**

O desafio deve ser entregue escrito em Java e Angular;


**Entrega:**

Crie um fork do repositório no seu GitHub

Faça o push do código desenvolvido no seu Github

Informe ao recrutador quando concluir o desafio junto com o link do repositório

Após revisão do projeto junto com a equipe de desevolvimento deixe seu repositório privado

**Boa sorte :)**
