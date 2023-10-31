(ns dots.typescript.try-statement)

(defn kind
  ^js [try-statement]
  (.-kind ^js try-statement))

(defn try-block
  ^js [try-statement]
  (.-tryBlock ^js try-statement))

(defn catch-clause
  ^js [try-statement]
  (.-catchClause ^js try-statement))

(defn finally-block
  ^js [try-statement]
  (.-finallyBlock ^js try-statement))

(defn flags
  ^js [try-statement]
  (.-flags ^js try-statement))

(defn parent
  ^js [try-statement]
  (.-parent ^js try-statement))

(defn source-file
  ^js [try-statement]
  (.getSourceFile ^js try-statement))

(defn child-count
  (^js [try-statement]
   (.getChildCount ^js try-statement))
  (^js [try-statement source-file]
   (.getChildCount ^js try-statement source-file)))

(defn child-at
  (^js [try-statement index]
   (.getChildAt ^js try-statement index))
  (^js [try-statement index source-file]
   (.getChildAt ^js try-statement index source-file)))

(defn children
  (^js [try-statement]
   (.getChildren ^js try-statement))
  (^js [try-statement source-file]
   (.getChildren ^js try-statement source-file)))

(defn start
  (^js [try-statement]
   (.getStart ^js try-statement))
  (^js [try-statement source-file]
   (.getStart ^js try-statement source-file))
  (^js [try-statement source-file include-js-doc-comment?]
   (.getStart ^js try-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [try-statement]
  (.getFullStart ^js try-statement))

(defn get-end
  ^js [try-statement]
  (.getEnd ^js try-statement))

(defn width
  (^js [try-statement]
   (.getWidth ^js try-statement))
  (^js [try-statement source-file]
   (.getWidth ^js try-statement source-file)))

(defn full-width
  ^js [try-statement]
  (.getFullWidth ^js try-statement))

(defn leading-trivia-width
  (^js [try-statement]
   (.getLeadingTriviaWidth ^js try-statement))
  (^js [try-statement source-file]
   (.getLeadingTriviaWidth ^js try-statement source-file)))

(defn full-text
  (^js [try-statement]
   (.getFullText ^js try-statement))
  (^js [try-statement source-file]
   (.getFullText ^js try-statement source-file)))

(defn text
  (^js [try-statement]
   (.getText ^js try-statement))
  (^js [try-statement source-file]
   (.getText ^js try-statement source-file)))

(defn first-token
  (^js [try-statement]
   (.getFirstToken ^js try-statement))
  (^js [try-statement source-file]
   (.getFirstToken ^js try-statement source-file)))

(defn last-token
  (^js [try-statement]
   (.getLastToken ^js try-statement))
  (^js [try-statement source-file]
   (.getLastToken ^js try-statement source-file)))

(defn for-each-child
  (^js [try-statement cb-node]
   (.forEachChild ^js try-statement cb-node))
  (^js [try-statement cb-node cb-node-array]
   (.forEachChild ^js try-statement cb-node cb-node-array)))

(defn pos
  ^js [try-statement]
  (.-pos ^js try-statement))

(defn end
  ^js [try-statement]
  (.-end ^js try-statement))
