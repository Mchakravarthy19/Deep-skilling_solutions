// ExcelDocumentFactory.java
public class ExelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExelDocument();
    }
}

