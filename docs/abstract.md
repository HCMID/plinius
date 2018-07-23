# Project Abstract

We are morphologically parsing our digital edition of Pliny the Elder's *Natural Histories*, with the aim to parse every word in the edition. Since Latin is an inflected language, semantics and syntax are often tied in with the recognition of word endings. A parser automates this process.

With [Tabulae](http://neelsmith.github.io/tabulae/), we can build a Latin parser using nothing more than a simple, tabular text file. The process begins by creating tables of rules. Word endings are recorded into a table with a corresponding set of characteristics. For example, in a table of rules for first conjugation verbs, "o" is matched with the appropriate person, number, tense, mood, and voice. Lexical stems are, then, created in a separate table and matched with the appropriate rule set. So "am" (the stem for "amo") would be matched with rules tables for first conjugation verbs.  

In tandem with building a parser for Pliny, we are also creating a parser for *Allen and Greenough's New Latin Grammar*. In treating the vocabulary found in *A&G*'s paradigms as a corpus, we can build out rules for every possible form found in the grammar. Since the rules found in *A&G* cover the vast majority of extant classical Latin, we are importing these rules into our Pliny parser. Then, only lexical stems from Pliny need to be added.
