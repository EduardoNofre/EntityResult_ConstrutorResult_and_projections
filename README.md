## Support & Feedback<BR>
Este projeto é mantido por Eduardo Nofre. Por favor, entenda que não poderemos fornecer suporte individual por e-mail. Acredito também que a ajuda é muito mais valiosa se for partilhada publicamente, para que mais pessoas possam beneficiar dela.

# Exemplo de utilização do Spring EntityResult, ConstrutorResult e Projection.

## Spring SqlResultSetMapping?
Cada anotação SqlResultSetMapping  requer apenas uma propriedade, nome. Entretanto, sem um dos tipos de membros, nada será mapeado. Os tipos de membros são ColumnResult , ConstructorResult e EntityResult .
Nesse caso,  ColumnResult  mapeia qualquer coluna para um tipo de resultado escalar:

## Spring EntityResult?
EntityResult exige que especifiquemos a classe de entidade Employee .
Usamos a propriedade opcional de campos  para obter mais controle. Combinado com  FieldResult, podemos mapear aliases e campos que não correspondem:

## Spring ConstrutorResult?
A anotação @ConstrutorResult define um mapeamento nomeado a partir de um
resultado da consulta para uma chamada de construtor

## Spring SqlResultSetMappings? 
È como se fosse um array de varias query na mesma entity ou um array de mappings.

## O que Spring Projection?
As projections sao interfaces que voce cria para pegar os atributos de queries nativas. elas serao o espelho do nome do campo que voce atribui na query nativa. 
tem que ser o mesmo nome se nao da errado. eu coloco elas na mesma ordem que defini no select

## Aqui neste repositorio iremos encontrar exemplos Utlizando:
 - SqlResultSetMapping
 - EntityResult
 - ConstrutorResult
 - SqlResultSetMappings
 - Projection TODO
   
