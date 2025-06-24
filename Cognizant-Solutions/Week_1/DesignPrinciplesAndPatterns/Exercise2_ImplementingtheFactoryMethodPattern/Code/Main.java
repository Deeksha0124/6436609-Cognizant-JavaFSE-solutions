package Week_1.DesignPrinciplesAndPatterns.Exercise2_ImplementingtheFactoryMethodPattern.Code;


//INTERFACE - Different classes need to follow the same rules
interface Document {
    void open();
}
class WordDocument implements Document{
    public void open() {
        System.out.println("Opening Word document...");
    }
}
class PDFDocument implements Document{
    public void open(){
        System.out.println("Opening PDF document...");
    }
}
class ExcelDocument implements Document{
    public void open(){
        System.out.println("Opening Excel document...");
    }
}

//ABSTRACT CLASS - You want to reuse some common code and add some custom parts
abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}
class PDFFactory extends DocumentFactory{
    public Document createDocument(){
        return new PDFDocument();
    }
}
class ExcelFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
}


//Main Class for Testing
public class Main{
    public static void main(String[] args) {
        DocumentFactory doc1 = new WordFactory();
        Document word = doc1.createDocument();
        word.open();

        DocumentFactory doc2 = new PDFFactory();
        Document pdf = doc2.createDocument();
        pdf.open();

        DocumentFactory doc3 = new ExcelFactory();
        Document excel = doc3.createDocument();
        excel.open();

    }
}
