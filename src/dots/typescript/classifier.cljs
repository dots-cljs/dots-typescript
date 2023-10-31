(ns dots.typescript.classifier)

(defn classifications-for-line
  "Gives lexical classifications of tokens on a line without any syntactic context.
   For instance, a token consisting of the text 'string' can be either an identifier
   named 'string' or the keyword 'string', however, because this classifier is not aware,
   it relies on certain heuristics to give acceptable results. For classifications where
   speed trumps accuracy, this function is preferable; however, for true accuracy, the
   syntactic classifier is ideal. In fact, in certain editing scenarios, combining the
   lexical, syntactic, and semantic classifiers may issue the best user experience."
  ^js [classifier text lex-state syntactic-classifier-absent?]
  (.getClassificationsForLine ^js classifier text lex-state syntactic-classifier-absent?))

(defn encoded-lexical-classifications
  ^js [classifier text end-of-line-state syntactic-classifier-absent?]
  (.getEncodedLexicalClassifications ^js classifier text end-of-line-state syntactic-classifier-absent?))
