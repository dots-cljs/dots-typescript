(ns dots.typescript.return-statement)

(defn kind
  ^js [return-statement]
  (.-kind ^js return-statement))

(defn expression
  ^js [return-statement]
  (.-expression ^js return-statement))

(defn flags
  ^js [return-statement]
  (.-flags ^js return-statement))

(defn parent
  ^js [return-statement]
  (.-parent ^js return-statement))

(defn source-file
  ^js [return-statement]
  (.getSourceFile ^js return-statement))

(defn child-count
  (^js [return-statement]
   (.getChildCount ^js return-statement))
  (^js [return-statement source-file]
   (.getChildCount ^js return-statement source-file)))

(defn child-at
  (^js [return-statement index]
   (.getChildAt ^js return-statement index))
  (^js [return-statement index source-file]
   (.getChildAt ^js return-statement index source-file)))

(defn children
  (^js [return-statement]
   (.getChildren ^js return-statement))
  (^js [return-statement source-file]
   (.getChildren ^js return-statement source-file)))

(defn start
  (^js [return-statement]
   (.getStart ^js return-statement))
  (^js [return-statement source-file]
   (.getStart ^js return-statement source-file))
  (^js [return-statement source-file include-js-doc-comment?]
   (.getStart ^js return-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [return-statement]
  (.getFullStart ^js return-statement))

(defn get-end
  ^js [return-statement]
  (.getEnd ^js return-statement))

(defn width
  (^js [return-statement]
   (.getWidth ^js return-statement))
  (^js [return-statement source-file]
   (.getWidth ^js return-statement source-file)))

(defn full-width
  ^js [return-statement]
  (.getFullWidth ^js return-statement))

(defn leading-trivia-width
  (^js [return-statement]
   (.getLeadingTriviaWidth ^js return-statement))
  (^js [return-statement source-file]
   (.getLeadingTriviaWidth ^js return-statement source-file)))

(defn full-text
  (^js [return-statement]
   (.getFullText ^js return-statement))
  (^js [return-statement source-file]
   (.getFullText ^js return-statement source-file)))

(defn text
  (^js [return-statement]
   (.getText ^js return-statement))
  (^js [return-statement source-file]
   (.getText ^js return-statement source-file)))

(defn first-token
  (^js [return-statement]
   (.getFirstToken ^js return-statement))
  (^js [return-statement source-file]
   (.getFirstToken ^js return-statement source-file)))

(defn last-token
  (^js [return-statement]
   (.getLastToken ^js return-statement))
  (^js [return-statement source-file]
   (.getLastToken ^js return-statement source-file)))

(defn for-each-child
  (^js [return-statement cb-node]
   (.forEachChild ^js return-statement cb-node))
  (^js [return-statement cb-node cb-node-array]
   (.forEachChild ^js return-statement cb-node cb-node-array)))

(defn decorators
  ^js [return-statement]
  (.-decorators ^js return-statement))

(defn modifiers
  ^js [return-statement]
  (.-modifiers ^js return-statement))

(defn pos
  ^js [return-statement]
  (.-pos ^js return-statement))

(defn end
  ^js [return-statement]
  (.-end ^js return-statement))
