(ns dots.typescript.punctuation-token)

(defn kind
  ^js [punctuation-token]
  (.-kind ^js punctuation-token))

(defn flags
  ^js [punctuation-token]
  (.-flags ^js punctuation-token))

(defn parent
  ^js [punctuation-token]
  (.-parent ^js punctuation-token))

(defn source-file
  ^js [punctuation-token]
  (.getSourceFile ^js punctuation-token))

(defn child-count
  (^js [punctuation-token]
   (.getChildCount ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getChildCount ^js punctuation-token source-file)))

(defn child-at
  (^js [punctuation-token index]
   (.getChildAt ^js punctuation-token index))
  (^js [punctuation-token index source-file]
   (.getChildAt ^js punctuation-token index source-file)))

(defn children
  (^js [punctuation-token]
   (.getChildren ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getChildren ^js punctuation-token source-file)))

(defn start
  (^js [punctuation-token]
   (.getStart ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getStart ^js punctuation-token source-file))
  (^js [punctuation-token source-file include-js-doc-comment?]
   (.getStart ^js punctuation-token source-file include-js-doc-comment?)))

(defn full-start
  ^js [punctuation-token]
  (.getFullStart ^js punctuation-token))

(defn get-end
  ^js [punctuation-token]
  (.getEnd ^js punctuation-token))

(defn width
  (^js [punctuation-token]
   (.getWidth ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getWidth ^js punctuation-token source-file)))

(defn full-width
  ^js [punctuation-token]
  (.getFullWidth ^js punctuation-token))

(defn leading-trivia-width
  (^js [punctuation-token]
   (.getLeadingTriviaWidth ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getLeadingTriviaWidth ^js punctuation-token source-file)))

(defn full-text
  (^js [punctuation-token]
   (.getFullText ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getFullText ^js punctuation-token source-file)))

(defn text
  (^js [punctuation-token]
   (.getText ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getText ^js punctuation-token source-file)))

(defn first-token
  (^js [punctuation-token]
   (.getFirstToken ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getFirstToken ^js punctuation-token source-file)))

(defn last-token
  (^js [punctuation-token]
   (.getLastToken ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getLastToken ^js punctuation-token source-file)))

(defn for-each-child
  (^js [punctuation-token cb-node]
   (.forEachChild ^js punctuation-token cb-node))
  (^js [punctuation-token cb-node cb-node-array]
   (.forEachChild ^js punctuation-token cb-node cb-node-array)))

(defn decorators
  ^js [punctuation-token]
  (.-decorators ^js punctuation-token))

(defn modifiers
  ^js [punctuation-token]
  (.-modifiers ^js punctuation-token))

(defn pos
  ^js [punctuation-token]
  (.-pos ^js punctuation-token))

(defn end
  ^js [punctuation-token]
  (.-end ^js punctuation-token))
