package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    abstract protected BookMetadataFormatter getFormatter();

    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see
        // fit.
        BookMetadataFormatter formatter = this.getFormatter();
        for (Book book : books) {
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());
    }
}