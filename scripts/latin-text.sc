import edu.holycross.shot.ohco2._
import edu.holycross.shot.cite._

import edu.holycross.shot.mid.latinmodel._

val coll = Cite2Urn("urn:cite2:mid:orcafied.plinius:")


// Obtain a full TextRepository object from source files:
val catalog = "editions/textcatalog.cex"
val citation = "editions/citationconfig.cex"
val editions = "editions"
val textRepo = TextRepositorySource.fromFiles(catalog, citation, editions)

// q&d word generator...
val node1 = textRepo.corpus.nodes(0)
val u = node1.urn
val t = node1.text

val analysisV = TeiReader.teiToTokens(u,t,coll)

val wordList = analysisV.map(_.readWithAlternate.text).mkString("\n")


import java.io.PrintWriter
new PrintWriter("wordlist.txt"){write (wordList); close;}
