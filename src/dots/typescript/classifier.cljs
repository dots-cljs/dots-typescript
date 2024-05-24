(ns dots.typescript.classifier)

(defn classifications-for-line
  "Gives lexical classifications of tokens on a line without any syntactic context.
   For instance, a token consisting of the text 'string' can be either an identifier
   named 'string' or the keyword 'string', however, because this classifier is not aware,
   it relies on certain heuristics to give acceptable results. For classifications where
   speed trumps accuracy, this function is preferable; however, for true accuracy, the
   syntactic classifier is ideal. In fact, in certain editing scenarios, combining the
   lexical, syntactic, and semantic classifiers may issue the best user experience.
   
   **Parameters:**
   - `text`: `string` - The text of a line to classify.
   - `lex-state`: `EndOfLineState` - The state of the lexical classifier at the end of the previous line.
   - `syntactic-classifier-absent?`: `boolean` - Whether the client is *not* using a syntactic classifier.
   If there is no syntactic classifier (syntacticClassifierAbsent=true),
   certain heuristics may be used in its place; however, if there is a
   syntactic classifier (syntacticClassifierAbsent=false), certain
   classifications which may be incorrectly categorized will be given
   back as Identifiers in order to allow the syntactic classifier to
   subsume the classification.
   
   **Returns:** `ClassificationResult`"
  ^js [classifier text lex-state syntactic-classifier-absent?]
  (.getClassificationsForLine ^js classifier text lex-state syntactic-classifier-absent?))

(defn encoded-lexical-classifications
  "**Parameters:**
   - `text`: `string`
   - `end-of-line-state`: `EndOfLineState`
   - `syntactic-classifier-absent?`: `boolean`
   
   **Returns:** `Classifications`"
  ^js [classifier text end-of-line-state syntactic-classifier-absent?]
  (.getEncodedLexicalClassifications ^js classifier text end-of-line-state syntactic-classifier-absent?))
