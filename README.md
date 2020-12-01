# Padrão Visitor

## Centro Universitário UNIESP

### Professora: Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno: Roberto Mendes ([robertompfm@gmail.com](mailto:robertompfm@gmail.com))

## Visitor

O Visitor é um padrão de projeto comportamental do escopo de Objeto. E representa uma operação a ser realizada em elementos de uma estrutura de objetos. O Visitor permite serparar essas operações dos objetos sobre os quais elas atuam, permite também que novas operações sejam adicionadas, sem alterar as classes desses objetos

## Problema

Imagine que você deseja vender uma lista de pertences (interface Pertence), esses pertences podem ser de três diferentes classes (Casa, Movel, Eletrodomestico). Para vende-los com mais facilidade você resolve anunciá-los através da empresa CAPSLOCK, para isso você precisará fornecer informações sobre os pertences no padrão ALL CAPS utilizado pela empresa. Você poderia colocar métodos nas classes de pertences que irão gerar Strings nesse formato. Porém você não quer colocar essa operação dentro dessas classes pois vai contra os principios de Orientação a Objeto que você aprendeu.

## Solução

1. Criar uma interface Visitor, a qual pertencerá uma classe RepresentanteCAPSLOCK, que possuirá métodos apropriados para gerar anúncios para os diferentes tipos de classes Pertence.
2. Criar um método accept para a interface Pertence, que irá receber um Visitor. E em cada uma das classes pertences, esse método accept irá chamar o método do Visitor apropriado.

## Consequências

1. É possível adicionar novas operações de forma simples, apenas criando uma nova implementação do Visitor. Por exemplo, poderia criar um Representante_snake ou um RepresentantePascal, para gerar anúncios para diferentes empresas;
2. Possibilita uma melhor separação das classes de acordo com suas funções;
3. Se torna mais difícil adicionar novos elementos concretos. Por exemplo, se eu quiser adicionar a classe Carro implementando Pertence, eu terei que fazer muitas alterações no código.
