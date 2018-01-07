import numpy
class EntradaDados:

    def __init__(self, prova1, prova2):
        self.prova1 = prova1
        self.prova2 = prova2


    def media(self):
        media = [self.prova1, self.prova2]
        calculo = numpy.mean(media)
        return calculo

    def verificaMedia(self):
        verificar = self.media()
        if verificar <= 6:
            return print("Aluno reprovado", verificar)
        else:
            return print("Aluno aprovado", verificar)



aluno1 = EntradaDados(5, 5)
aluno2 = EntradaDados(8, 7)


print(aluno1.verificaMedia())
print(aluno2.verificaMedia())
