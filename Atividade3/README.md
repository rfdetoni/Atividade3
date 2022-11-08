### PERGUNTA 1

**Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir:** 
 
>**Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;** 

>**Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;**

>**Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);**

>**Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista;**

>**Passo 5: Repita os passos 2 e 3.**

>**Passo 6: Exiba todos os números que foram inseridos na fila.** 
 
**Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido.** 
 
**O programa desenvolvido pelo aluno e a sua justificativa deverá ser postado em um ambiente virtual. Esse programa será avaliado pelo tutor responsável pela disciplina.**


# Resposta:

>Ao realizar a execução do programa, pode se ver que a ordem não é igual a inserida,
Ocorreu que ao fazer a remoção no incio no passo 2, você acaba jogando os numeros no final da pilha exemplo: {1,2,3,4,5} estão na lista ,
ao enviar a pilha fica da seguinte maneira {5,4,3,2,1} ao desfazer a pilha e enviar para fila, 
seguirá a seguinte ordem {5,4,3,2,1}. Por este motivo a ordem sai errado. Caso a lista fosse removida pelo final, não ocorreria o erro de ordenação.