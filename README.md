# Introdução-POO

Programação Orientada a Objeto
Exercício de Fixação

## 1)	Elabore as classes para os exemplos abaixo:

*Programa 1*

Classe: Pessoa.
Atributos: nome, idade.
Método: void fazAniversario() 
ImprimisIdade()
Crie uma pessoa, coloque seu nome e idade inicial, faça alguns aniversários (aumentando a idade) e imprima seu nome e sua idade.

*Programa 2*

Classe: Porta
Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
Métodos: void abre(), void fecha(), void pinta(String cor), boolean estaAberta()
Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas
dimensões e use o metodo estaAberta para verificar se ela esta aberta.

*Programa 3*

Classe: Casa
Atributos: cor, porta1, porta2, porta3
Método: void pinta(String s), int quantasPortasEstaoAbertas()
Crie uma casa e pinte-a. 
Crie três portas (utilize a classe porta criada no exemplo anterior) e coloque-as na casa; abra e feche as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas

## 2)	Elabore um sistema para locação de veículos. Para essa atividade identifique inicialmente as classes e atributos do texto. Após isso, identifique quais ações o sistemas deverá ter e em qual classe essas ações(métodos) deverão ser incluídos.

O sistemas de locação de veículos deverá ter uma classe para descrever um automóvel. Cada automóvel tem atributos como número da placa, cor, ano, tipo de combustível, número de portas, quilo­metragem, renavam, chassi, valor de locação etc.
Cada carro tem um modelo e uma marca. Modelo e marca são classes que possuem os seguintes atributos: código e descrição.
Faz-se necessário o cadastro dos clientes. Para isso, devemos armazenar as seguintes informações: nome, cpf, telefone e endereço. O endereço trata-se de uma classe que contém os seguintes atributos: rua, número, bairro, cidade.
Um carro pode ser alugado por muitos clientes, em momentos diferentes, e um cliente pode alugar muitos carros. 
Para cada locação é preciso saber qual carro foi locado, a data e horário da locação, a data e horário de devolução, o valor da locação e para qual cliente foi locado. 
O sistema deve possuir funções para imprimir a descrição dos clientes, dos automóveis e das locações.





