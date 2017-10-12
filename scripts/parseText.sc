import edu.holycross.shot.ohco2._

// Obtain a full TextRepository object from source files:
val catalog = "editions/textcatalog.cex"
val citation = "editions/citationconfig.cex"
val editions = "editions"
val textRepo = TextRepositorySource.fromFiles(catalog, citation, editions)
