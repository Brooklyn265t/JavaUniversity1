package Mirea.Homework22;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Запуск");
    // Создание фабрик
    ChairFactory chairFactory = new ChairFactory();

    // Создание стульев с помощью фабрик
    IChair victorianChair = chairFactory.createVictorianChair();
    IChair multifunctionalChair = chairFactory.createMultifuctionalChair();
    IChair magicChair = chairFactory.createMagicChair();

    Client client = new Client();

    client.Sit(victorianChair);
    client.Sit(multifunctionalChair);
    client.Sit(magicChair);

    client.Age((VictorianChair) victorianChair);
    client.Sum((MultifunctionalChair) multifunctionalChair);

    ICreateDocument textDocumentFactory = new CreateTextDocument();
    EditorWindow editorWindow = new EditorWindow(textDocumentFactory);

    editorWindow.createNewDocument();

    editorWindow.openDocument();

    editorWindow.saveDocument();

    client.doMagic((MagicChair) magicChair);
  }
}