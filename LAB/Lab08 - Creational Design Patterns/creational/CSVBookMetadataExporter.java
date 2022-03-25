package creational;

import java.io.IOException;
// Write code same JSONBookMetadataExporter
public class CSVBookMetadataExporter extends BookMetadataExporter {

    private BookMetadataFormatter formatter = null;
    CSVBookMetadataExporter() throws IOException {
        if (formatter == null) {
            formatter = new CSVBookMetadataFormatter();
        }
    }

    @Override
    protected BookMetadataFormatter getFormatter() {
        return formatter;
    }
}