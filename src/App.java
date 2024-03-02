class App {
  public static void main(String[] args) {
    // // instanciar  Construtor
    Marcador m = new Marcador("Azul", "Pilot");
    // m.cor = "Verde";
    System.out.println(m.cor); // Azul
    System.out.println(m.marca); // null
    System.out.println(m.tinta); // 100
    // m.cor = "Amarelo"; // não devia ser possível
    System.out.println(m.cor); // Amarelo

    m.escrever(); // método escrever, verbo!
    System.out.println(m.tinta); // 99
    m.escrever();
    m.escrever();
    m.escrever();
    m.escrever();
    m.tinta = -10;
    System.out.println(m.tinta); // 0
    
  }

}