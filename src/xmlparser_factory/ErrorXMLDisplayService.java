package xmlparser_factory;

public class ErrorXMLDisplayService extends DisplayService {

	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}

}
