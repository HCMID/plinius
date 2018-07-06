# Morphological analysis

**What we're doing**

We are morphologically parsing our digital edition of Pliny the Elder's *Natural Histories*. Our aim is to parse every word in our edition.  

**How we're doing it**

With [Tabulae](http://neelsmith.github.io/tabulae/), we are able to build a Latin parser using nothing more than a simple tabular text file. In tandem with building a parser for Pliny, we are treating the vocabulary found in the paradigms of *Allen and Greenough's New Latin Grammar* as a corpus, from which we are creating rules for every possible form found in the grammar. These rules, since they cover the vast majority of extant classical Latin, are imported into a parser we build using vocabulary from Pliny.
