(ns dots.typescript.json-object-expression-statement)

(defn expression
  ^js [json-object-expression-statement]
  (.-expression ^js json-object-expression-statement))

(defn kind
  ^js [json-object-expression-statement]
  (.-kind ^js json-object-expression-statement))

(defn flags
  ^js [json-object-expression-statement]
  (.-flags ^js json-object-expression-statement))

(defn parent
  ^js [json-object-expression-statement]
  (.-parent ^js json-object-expression-statement))

(defn source-file
  ^js [json-object-expression-statement]
  (.getSourceFile ^js json-object-expression-statement))

(defn child-count
  (^js [json-object-expression-statement]
   (.getChildCount ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getChildCount ^js json-object-expression-statement source-file)))

(defn child-at
  (^js [json-object-expression-statement index]
   (.getChildAt ^js json-object-expression-statement index))
  (^js [json-object-expression-statement index source-file]
   (.getChildAt ^js json-object-expression-statement index source-file)))

(defn children
  (^js [json-object-expression-statement]
   (.getChildren ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getChildren ^js json-object-expression-statement source-file)))

(defn start
  (^js [json-object-expression-statement]
   (.getStart ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getStart ^js json-object-expression-statement source-file))
  (^js [json-object-expression-statement source-file include-js-doc-comment?]
   (.getStart ^js json-object-expression-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [json-object-expression-statement]
  (.getFullStart ^js json-object-expression-statement))

(defn get-end
  ^js [json-object-expression-statement]
  (.getEnd ^js json-object-expression-statement))

(defn width
  (^js [json-object-expression-statement]
   (.getWidth ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getWidth ^js json-object-expression-statement source-file)))

(defn full-width
  ^js [json-object-expression-statement]
  (.getFullWidth ^js json-object-expression-statement))

(defn leading-trivia-width
  (^js [json-object-expression-statement]
   (.getLeadingTriviaWidth ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getLeadingTriviaWidth ^js json-object-expression-statement source-file)))

(defn full-text
  (^js [json-object-expression-statement]
   (.getFullText ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getFullText ^js json-object-expression-statement source-file)))

(defn text
  (^js [json-object-expression-statement]
   (.getText ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getText ^js json-object-expression-statement source-file)))

(defn first-token
  (^js [json-object-expression-statement]
   (.getFirstToken ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getFirstToken ^js json-object-expression-statement source-file)))

(defn last-token
  (^js [json-object-expression-statement]
   (.getLastToken ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getLastToken ^js json-object-expression-statement source-file)))

(defn for-each-child
  (^js [json-object-expression-statement cb-node]
   (.forEachChild ^js json-object-expression-statement cb-node))
  (^js [json-object-expression-statement cb-node cb-node-array]
   (.forEachChild ^js json-object-expression-statement cb-node cb-node-array)))

(defn pos
  ^js [json-object-expression-statement]
  (.-pos ^js json-object-expression-statement))

(defn end
  ^js [json-object-expression-statement]
  (.-end ^js json-object-expression-statement))
