package xmlparser_factory;

public class FeedbackXMLDisplayService extends DisplayService {

	@Override
	public XMLParser getParser() {
		return new FeedbackXML();
	}

}