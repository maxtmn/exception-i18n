# exception-i18n

Excluding hardcoded text messages from exception messages. </br>
Working with messages resources through java.util.ResourceBundle.</br>
Enrich exceptions with 'code'. </br>

All exception codes must be declared with enums implemented ErrorCodeable interface.</br>
And provide methods: </br>
String code(); //String representation of exception code</br>
String messagePattern(); //String pattern for MessageFormat</br>

Each enum will hold own Resource. All codes and message-formats will be categorized with one resource file.</br>

AbstractRichException.class  has an ErrorCodeable field and a container for FormatArguments.</br>

Custom Exception classes which will inherit AbstractRichException obligated to initialize errorCodeable field </br>
and specify message format arguments on need.</br>