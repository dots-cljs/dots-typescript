(ns dots.typescript.for-statement)

(defn kind
  ^js [for-statement]
  (.-kind ^js for-statement))

(defn initializer
  ^js [for-statement]
  (.-initializer ^js for-statement))

(defn condition
  ^js [for-statement]
  (.-condition ^js for-statement))

(defn incrementor
  ^js [for-statement]
  (.-incrementor ^js for-statement))

(defn statement
  ^js [for-statement]
  (.-statement ^js for-statement))

(defn flags
  ^js [for-statement]
  (.-flags ^js for-statement))

(defn parent
  ^js [for-statement]
  (.-parent ^js for-statement))

(defn source-file
  ^js [for-statement]
  (.getSourceFile ^js for-statement))

(defn child-count
  (^js [for-statement]
   (.getChildCount ^js for-statement))
  (^js [for-statement source-file]
   (.getChildCount ^js for-statement source-file)))

(defn child-at
  (^js [for-statement index]
   (.getChildAt ^js for-statement index))
  (^js [for-statement index source-file]
   (.getChildAt ^js for-statement index source-file)))

(defn children
  (^js [for-statement]
   (.getChildren ^js for-statement))
  (^js [for-statement source-file]
   (.getChildren ^js for-statement source-file)))

(defn start
  (^js [for-statement]
   (.getStart ^js for-statement))
  (^js [for-statement source-file]
   (.getStart ^js for-statement source-file))
  (^js [for-statement source-file include-js-doc-comment?]
   (.getStart ^js for-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [for-statement]
  (.getFullStart ^js for-statement))

(defn get-end
  ^js [for-statement]
  (.getEnd ^js for-statement))

(defn width
  (^js [for-statement]
   (.getWidth ^js for-statement))
  (^js [for-statement source-file]
   (.getWidth ^js for-statement source-file)))

(defn full-width
  ^js [for-statement]
  (.getFullWidth ^js for-statement))

(defn leading-trivia-width
  (^js [for-statement]
   (.getLeadingTriviaWidth ^js for-statement))
  (^js [for-statement source-file]
   (.getLeadingTriviaWidth ^js for-statement source-file)))

(defn full-text
  (^js [for-statement]
   (.getFullText ^js for-statement))
  (^js [for-statement source-file]
   (.getFullText ^js for-statement source-file)))

(defn text
  (^js [for-statement]
   (.getText ^js for-statement))
  (^js [for-statement source-file]
   (.getText ^js for-statement source-file)))

(defn first-token
  (^js [for-statement]
   (.getFirstToken ^js for-statement))
  (^js [for-statement source-file]
   (.getFirstToken ^js for-statement source-file)))

(defn last-token
  (^js [for-statement]
   (.getLastToken ^js for-statement))
  (^js [for-statement source-file]
   (.getLastToken ^js for-statement source-file)))

(defn for-each-child
  (^js [for-statement cb-node]
   (.forEachChild ^js for-statement cb-node))
  (^js [for-statement cb-node cb-node-array]
   (.forEachChild ^js for-statement cb-node cb-node-array)))

(defn pos
  ^js [for-statement]
  (.-pos ^js for-statement))

(defn end
  ^js [for-statement]
  (.-end ^js for-statement))
