package creational;

import java.io.IOException;
// Write code same CSVBookMetadataExporter
public class JSONBookMetadataExporter extends BookMetadataExporter  {
	
	private BookMetadataFormatter formatter = null;
	JSONBookMetadataExporter() throws IOException{
		if(formatter == null) {
			formatter = new JSONBookMetadataFormatter();
		}
	}
	
	@Override
	protected BookMetadataFormatter getFormatter() {
		return formatter;
	}

}