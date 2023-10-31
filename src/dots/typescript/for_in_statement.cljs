(ns dots.typescript.for-in-statement)

(defn kind
  ^js [for-in-statement]
  (.-kind ^js for-in-statement))

(defn initializer
  ^js [for-in-statement]
  (.-initializer ^js for-in-statement))

(defn expression
  ^js [for-in-statement]
  (.-expression ^js for-in-statement))

(defn statement
  ^js [for-in-statement]
  (.-statement ^js for-in-statement))

(defn flags
  ^js [for-in-statement]
  (.-flags ^js for-in-statement))

(defn parent
  ^js [for-in-statement]
  (.-parent ^js for-in-statement))

(defn source-file
  ^js [for-in-statement]
  (.getSourceFile ^js for-in-statement))

(defn child-count
  (^js [for-in-statement]
   (.getChildCount ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getChildCount ^js for-in-statement source-file)))

(defn child-at
  (^js [for-in-statement index]
   (.getChildAt ^js for-in-statement index))
  (^js [for-in-statement index source-file]
   (.getChildAt ^js for-in-statement index source-file)))

(defn children
  (^js [for-in-statement]
   (.getChildren ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getChildren ^js for-in-statement source-file)))

(defn start
  (^js [for-in-statement]
   (.getStart ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getStart ^js for-in-statement source-file))
  (^js [for-in-statement source-file include-js-doc-comment?]
   (.getStart ^js for-in-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [for-in-statement]
  (.getFullStart ^js for-in-statement))

(defn get-end
  ^js [for-in-statement]
  (.getEnd ^js for-in-statement))

(defn width
  (^js [for-in-statement]
   (.getWidth ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getWidth ^js for-in-statement source-file)))

(defn full-width
  ^js [for-in-statement]
  (.getFullWidth ^js for-in-statement))

(defn leading-trivia-width
  (^js [for-in-statement]
   (.getLeadingTriviaWidth ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getLeadingTriviaWidth ^js for-in-statement source-file)))

(defn full-text
  (^js [for-in-statement]
   (.getFullText ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getFullText ^js for-in-statement source-file)))

(defn text
  (^js [for-in-statement]
   (.getText ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getText ^js for-in-statement source-file)))

(defn first-token
  (^js [for-in-statement]
   (.getFirstToken ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getFirstToken ^js for-in-statement source-file)))

(defn last-token
  (^js [for-in-statement]
   (.getLastToken ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getLastToken ^js for-in-statement source-file)))

(defn for-each-child
  (^js [for-in-statement cb-node]
   (.forEachChild ^js for-in-statement cb-node))
  (^js [for-in-statement cb-node cb-node-array]
   (.forEachChild ^js for-in-statement cb-node cb-node-array)))

(defn pos
  ^js [for-in-statement]
  (.-pos ^js for-in-statement))

(defn end
  ^js [for-in-statement]
  (.-end ^js for-in-statement))
