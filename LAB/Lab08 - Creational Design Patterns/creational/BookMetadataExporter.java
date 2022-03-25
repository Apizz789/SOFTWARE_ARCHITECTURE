package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    abstract protected BookMetadataFormatter getFormatter();

    public void export(PrintStream stream) {
        BookMetadataFormatter formatter = this.getFormatter();
        for (Book book : books) {
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());
    }
}