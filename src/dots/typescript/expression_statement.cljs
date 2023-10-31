(ns dots.typescript.expression-statement)

(defn kind
  ^js [expression-statement]
  (.-kind ^js expression-statement))

(defn expression
  ^js [expression-statement]
  (.-expression ^js expression-statement))

(defn flags
  ^js [expression-statement]
  (.-flags ^js expression-statement))

(defn parent
  ^js [expression-statement]
  (.-parent ^js expression-statement))

(defn source-file
  ^js [expression-statement]
  (.getSourceFile ^js expression-statement))

(defn child-count
  (^js [expression-statement]
   (.getChildCount ^js expression-statement))
  (^js [expression-statement source-file]
   (.getChildCount ^js expression-statement source-file)))

(defn child-at
  (^js [expression-statement index]
   (.getChildAt ^js expression-statement index))
  (^js [expression-statement index source-file]
   (.getChildAt ^js expression-statement index source-file)))

(defn children
  (^js [expression-statement]
   (.getChildren ^js expression-statement))
  (^js [expression-statement source-file]
   (.getChildren ^js expression-statement source-file)))

(defn start
  (^js [expression-statement]
   (.getStart ^js expression-statement))
  (^js [expression-statement source-file]
   (.getStart ^js expression-statement source-file))
  (^js [expression-statement source-file include-js-doc-comment?]
   (.getStart ^js expression-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [expression-statement]
  (.getFullStart ^js expression-statement))

(defn get-end
  ^js [expression-statement]
  (.getEnd ^js expression-statement))

(defn width
  (^js [expression-statement]
   (.getWidth ^js expression-statement))
  (^js [expression-statement source-file]
   (.getWidth ^js expression-statement source-file)))

(defn full-width
  ^js [expression-statement]
  (.getFullWidth ^js expression-statement))

(defn leading-trivia-width
  (^js [expression-statement]
   (.getLeadingTriviaWidth ^js expression-statement))
  (^js [expression-statement source-file]
   (.getLeadingTriviaWidth ^js expression-statement source-file)))

(defn full-text
  (^js [expression-statement]
   (.getFullText ^js expression-statement))
  (^js [expression-statement source-file]
   (.getFullText ^js expression-statement source-file)))

(defn text
  (^js [expression-statement]
   (.getText ^js expression-statement))
  (^js [expression-statement source-file]
   (.getText ^js expression-statement source-file)))

(defn first-token
  (^js [expression-statement]
   (.getFirstToken ^js expression-statement))
  (^js [expression-statement source-file]
   (.getFirstToken ^js expression-statement source-file)))

(defn last-token
  (^js [expression-statement]
   (.getLastToken ^js expression-statement))
  (^js [expression-statement source-file]
   (.getLastToken ^js expression-statement source-file)))

(defn for-each-child
  (^js [expression-statement cb-node]
   (.forEachChild ^js expression-statement cb-node))
  (^js [expression-statement cb-node cb-node-array]
   (.forEachChild ^js expression-statement cb-node cb-node-array)))

(defn decorators
  ^js [expression-statement]
  (.-decorators ^js expression-statement))

(defn modifiers
  ^js [expression-statement]
  (.-modifiers ^js expression-statement))

(defn pos
  ^js [expression-statement]
  (.-pos ^js expression-statement))

(defn end
  ^js [expression-statement]
  (.-end ^js expression-statement))
