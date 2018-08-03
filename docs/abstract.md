# Project Abstract

We are morphologically parsing a digital edition of a 9th century manuscript of Pliny the Elder's *Natural Histories*. Since Latin is an inflected language, semantics and syntax are tied in with the recognition of word form. A parser automates this process.

With new system [Tabulae](http://neelsmith.github.io/tabulae/), we can build a Latin parser using nothing more than simple, tabular text files. The process begins by creating tables of rules. Word endings are recorded in this table with a identifying grammatical information. For example, in a table of rules for first conjugation verbs, "o" is matched with the appropriate person, number, tense, mood, and voice. Lexical stems are recorded in separate tables and matched with the appropriate rule set. So "am-" (the stem for "amo") would automatically be matched with rules for first conjugation verbs.  

In tandem with building a parser for Pliny, we are also creating a demonstration parser for *Allen and Greenough's New Latin Grammar*. In treating the vocabulary found in *A&G*'s paradigms as a corpus, we can build out rules for every possible form found in the grammar. Since the rules found in *A&G* cover the vast majority of forms seen in classical Latin, we are importing these rules into our Pliny parser. Then, only lexical stems for Pliny need to be added.

- Add a "so what"

-acknowledge funding source 
