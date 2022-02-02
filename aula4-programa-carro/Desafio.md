Desafio Aula 4

Crie uma classe em Java chamada Fatura para uma loja de
suprimentos de informática. A classe deve conter quatro variáveis – o número (String), a descrição (String), a quantidade comprada de um item (int) e o preço por item
(double). 

Crie um novo método construtor para a classe Fatura de modo que os valores das propriedades sejam fornecidos na criação de uma fatura. O construtor anterior não pode ser perdido. 

Crie um método get e set para cada variável de instância. 

Além disso, forneça um método chamado getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. 

Faça um sobrecarga no método getTotalFatura criando um novo método que receba como parâmetro a quantidade comprada de um item e depois retorna o valor como um double também.