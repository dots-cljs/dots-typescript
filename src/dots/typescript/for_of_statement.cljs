(ns dots.typescript.for-of-statement)

(defn kind
  ^js [for-of-statement]
  (.-kind ^js for-of-statement))

(defn await-modifier
  ^js [for-of-statement]
  (.-awaitModifier ^js for-of-statement))

(defn initializer
  ^js [for-of-statement]
  (.-initializer ^js for-of-statement))

(defn expression
  ^js [for-of-statement]
  (.-expression ^js for-of-statement))

(defn statement
  ^js [for-of-statement]
  (.-statement ^js for-of-statement))

(defn flags
  ^js [for-of-statement]
  (.-flags ^js for-of-statement))

(defn parent
  ^js [for-of-statement]
  (.-parent ^js for-of-statement))

(defn source-file
  ^js [for-of-statement]
  (.getSourceFile ^js for-of-statement))

(defn child-count
  (^js [for-of-statement]
   (.getChildCount ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getChildCount ^js for-of-statement source-file)))

(defn child-at
  (^js [for-of-statement index]
   (.getChildAt ^js for-of-statement index))
  (^js [for-of-statement index source-file]
   (.getChildAt ^js for-of-statement index source-file)))

(defn children
  (^js [for-of-statement]
   (.getChildren ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getChildren ^js for-of-statement source-file)))

(defn start
  (^js [for-of-statement]
   (.getStart ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getStart ^js for-of-statement source-file))
  (^js [for-of-statement source-file include-js-doc-comment?]
   (.getStart ^js for-of-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [for-of-statement]
  (.getFullStart ^js for-of-statement))

(defn get-end
  ^js [for-of-statement]
  (.getEnd ^js for-of-statement))

(defn width
  (^js [for-of-statement]
   (.getWidth ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getWidth ^js for-of-statement source-file)))

(defn full-width
  ^js [for-of-statement]
  (.getFullWidth ^js for-of-statement))

(defn leading-trivia-width
  (^js [for-of-statement]
   (.getLeadingTriviaWidth ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getLeadingTriviaWidth ^js for-of-statement source-file)))

(defn full-text
  (^js [for-of-statement]
   (.getFullText ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getFullText ^js for-of-statement source-file)))

(defn text
  (^js [for-of-statement]
   (.getText ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getText ^js for-of-statement source-file)))

(defn first-token
  (^js [for-of-statement]
   (.getFirstToken ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getFirstToken ^js for-of-statement source-file)))

(defn last-token
  (^js [for-of-statement]
   (.getLastToken ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getLastToken ^js for-of-statement source-file)))

(defn for-each-child
  (^js [for-of-statement cb-node]
   (.forEachChild ^js for-of-statement cb-node))
  (^js [for-of-statement cb-node cb-node-array]
   (.forEachChild ^js for-of-statement cb-node cb-node-array)))

(defn pos
  ^js [for-of-statement]
  (.-pos ^js for-of-statement))

(defn end
  ^js [for-of-statement]
  (.-end ^js for-of-statement))
