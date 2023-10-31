(ns dots.typescript.modifier-token)

(defn kind
  ^js [modifier-token]
  (.-kind ^js modifier-token))

(defn flags
  ^js [modifier-token]
  (.-flags ^js modifier-token))

(defn parent
  ^js [modifier-token]
  (.-parent ^js modifier-token))

(defn source-file
  ^js [modifier-token]
  (.getSourceFile ^js modifier-token))

(defn child-count
  (^js [modifier-token]
   (.getChildCount ^js modifier-token))
  (^js [modifier-token source-file]
   (.getChildCount ^js modifier-token source-file)))

(defn child-at
  (^js [modifier-token index]
   (.getChildAt ^js modifier-token index))
  (^js [modifier-token index source-file]
   (.getChildAt ^js modifier-token index source-file)))

(defn children
  (^js [modifier-token]
   (.getChildren ^js modifier-token))
  (^js [modifier-token source-file]
   (.getChildren ^js modifier-token source-file)))

(defn start
  (^js [modifier-token]
   (.getStart ^js modifier-token))
  (^js [modifier-token source-file]
   (.getStart ^js modifier-token source-file))
  (^js [modifier-token source-file include-js-doc-comment?]
   (.getStart ^js modifier-token source-file include-js-doc-comment?)))

(defn full-start
  ^js [modifier-token]
  (.getFullStart ^js modifier-token))

(defn get-end
  ^js [modifier-token]
  (.getEnd ^js modifier-token))

(defn width
  (^js [modifier-token]
   (.getWidth ^js modifier-token))
  (^js [modifier-token source-file]
   (.getWidth ^js modifier-token source-file)))

(defn full-width
  ^js [modifier-token]
  (.getFullWidth ^js modifier-token))

(defn leading-trivia-width
  (^js [modifier-token]
   (.getLeadingTriviaWidth ^js modifier-token))
  (^js [modifier-token source-file]
   (.getLeadingTriviaWidth ^js modifier-token source-file)))

(defn full-text
  (^js [modifier-token]
   (.getFullText ^js modifier-token))
  (^js [modifier-token source-file]
   (.getFullText ^js modifier-token source-file)))

(defn text
  (^js [modifier-token]
   (.getText ^js modifier-token))
  (^js [modifier-token source-file]
   (.getText ^js modifier-token source-file)))

(defn first-token
  (^js [modifier-token]
   (.getFirstToken ^js modifier-token))
  (^js [modifier-token source-file]
   (.getFirstToken ^js modifier-token source-file)))

(defn last-token
  (^js [modifier-token]
   (.getLastToken ^js modifier-token))
  (^js [modifier-token source-file]
   (.getLastToken ^js modifier-token source-file)))

(defn for-each-child
  (^js [modifier-token cb-node]
   (.forEachChild ^js modifier-token cb-node))
  (^js [modifier-token cb-node cb-node-array]
   (.forEachChild ^js modifier-token cb-node cb-node-array)))

(defn decorators
  ^js [modifier-token]
  (.-decorators ^js modifier-token))

(defn modifiers
  ^js [modifier-token]
  (.-modifiers ^js modifier-token))

(defn pos
  ^js [modifier-token]
  (.-pos ^js modifier-token))

(defn end
  ^js [modifier-token]
  (.-end ^js modifier-token))
