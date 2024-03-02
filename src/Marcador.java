// tipo Marcador, classe de marcadores,
// descrição do objeto.
class Marcador { // Validade do Estado
  // atributos, características, propriedades
  // cor é imutável
  final String cor; // azul, vermelhor, verde, ...
  final String marca; // pilot, faber, ...
  // final: uma vez atribuído, não pode ser alterado
  private int tinta = 100; // mL

  // construtor, paramCor = "Azul",
  // obrigação!
  Marcador(String paramCor, String paramMarca) {
    cor = paramCor;
    marca = paramMarca;
  }

  void escrever() {
    if (tinta > 0) tinta--;
    tinta = -100;
  }
}
