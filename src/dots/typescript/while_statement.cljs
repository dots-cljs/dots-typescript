(ns dots.typescript.while-statement)

(defn kind
  ^js [while-statement]
  (.-kind ^js while-statement))

(defn expression
  ^js [while-statement]
  (.-expression ^js while-statement))

(defn statement
  ^js [while-statement]
  (.-statement ^js while-statement))

(defn flags
  ^js [while-statement]
  (.-flags ^js while-statement))

(defn parent
  ^js [while-statement]
  (.-parent ^js while-statement))

(defn source-file
  ^js [while-statement]
  (.getSourceFile ^js while-statement))

(defn child-count
  (^js [while-statement]
   (.getChildCount ^js while-statement))
  (^js [while-statement source-file]
   (.getChildCount ^js while-statement source-file)))

(defn child-at
  (^js [while-statement index]
   (.getChildAt ^js while-statement index))
  (^js [while-statement index source-file]
   (.getChildAt ^js while-statement index source-file)))

(defn children
  (^js [while-statement]
   (.getChildren ^js while-statement))
  (^js [while-statement source-file]
   (.getChildren ^js while-statement source-file)))

(defn start
  (^js [while-statement]
   (.getStart ^js while-statement))
  (^js [while-statement source-file]
   (.getStart ^js while-statement source-file))
  (^js [while-statement source-file include-js-doc-comment?]
   (.getStart ^js while-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [while-statement]
  (.getFullStart ^js while-statement))

(defn get-end
  ^js [while-statement]
  (.getEnd ^js while-statement))

(defn width
  (^js [while-statement]
   (.getWidth ^js while-statement))
  (^js [while-statement source-file]
   (.getWidth ^js while-statement source-file)))

(defn full-width
  ^js [while-statement]
  (.getFullWidth ^js while-statement))

(defn leading-trivia-width
  (^js [while-statement]
   (.getLeadingTriviaWidth ^js while-statement))
  (^js [while-statement source-file]
   (.getLeadingTriviaWidth ^js while-statement source-file)))

(defn full-text
  (^js [while-statement]
   (.getFullText ^js while-statement))
  (^js [while-statement source-file]
   (.getFullText ^js while-statement source-file)))

(defn text
  (^js [while-statement]
   (.getText ^js while-statement))
  (^js [while-statement source-file]
   (.getText ^js while-statement source-file)))

(defn first-token
  (^js [while-statement]
   (.getFirstToken ^js while-statement))
  (^js [while-statement source-file]
   (.getFirstToken ^js while-statement source-file)))

(defn last-token
  (^js [while-statement]
   (.getLastToken ^js while-statement))
  (^js [while-statement source-file]
   (.getLastToken ^js while-statement source-file)))

(defn for-each-child
  (^js [while-statement cb-node]
   (.forEachChild ^js while-statement cb-node))
  (^js [while-statement cb-node cb-node-array]
   (.forEachChild ^js while-statement cb-node cb-node-array)))

(defn decorators
  ^js [while-statement]
  (.-decorators ^js while-statement))

(defn modifiers
  ^js [while-statement]
  (.-modifiers ^js while-statement))

(defn pos
  ^js [while-statement]
  (.-pos ^js while-statement))

(defn end
  ^js [while-statement]
  (.-end ^js while-statement))
