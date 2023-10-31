(ns dots.typescript.iteration-statement)

(defn statement
  ^js [iteration-statement]
  (.-statement ^js iteration-statement))

(defn kind
  ^js [iteration-statement]
  (.-kind ^js iteration-statement))

(defn flags
  ^js [iteration-statement]
  (.-flags ^js iteration-statement))

(defn parent
  ^js [iteration-statement]
  (.-parent ^js iteration-statement))

(defn source-file
  ^js [iteration-statement]
  (.getSourceFile ^js iteration-statement))

(defn child-count
  (^js [iteration-statement]
   (.getChildCount ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getChildCount ^js iteration-statement source-file)))

(defn child-at
  (^js [iteration-statement index]
   (.getChildAt ^js iteration-statement index))
  (^js [iteration-statement index source-file]
   (.getChildAt ^js iteration-statement index source-file)))

(defn children
  (^js [iteration-statement]
   (.getChildren ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getChildren ^js iteration-statement source-file)))

(defn start
  (^js [iteration-statement]
   (.getStart ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getStart ^js iteration-statement source-file))
  (^js [iteration-statement source-file include-js-doc-comment?]
   (.getStart ^js iteration-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [iteration-statement]
  (.getFullStart ^js iteration-statement))

(defn get-end
  ^js [iteration-statement]
  (.getEnd ^js iteration-statement))

(defn width
  (^js [iteration-statement]
   (.getWidth ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getWidth ^js iteration-statement source-file)))

(defn full-width
  ^js [iteration-statement]
  (.getFullWidth ^js iteration-statement))

(defn leading-trivia-width
  (^js [iteration-statement]
   (.getLeadingTriviaWidth ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getLeadingTriviaWidth ^js iteration-statement source-file)))

(defn full-text
  (^js [iteration-statement]
   (.getFullText ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getFullText ^js iteration-statement source-file)))

(defn text
  (^js [iteration-statement]
   (.getText ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getText ^js iteration-statement source-file)))

(defn first-token
  (^js [iteration-statement]
   (.getFirstToken ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getFirstToken ^js iteration-statement source-file)))

(defn last-token
  (^js [iteration-statement]
   (.getLastToken ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getLastToken ^js iteration-statement source-file)))

(defn for-each-child
  (^js [iteration-statement cb-node]
   (.forEachChild ^js iteration-statement cb-node))
  (^js [iteration-statement cb-node cb-node-array]
   (.forEachChild ^js iteration-statement cb-node cb-node-array)))

(defn pos
  ^js [iteration-statement]
  (.-pos ^js iteration-statement))

(defn end
  ^js [iteration-statement]
  (.-end ^js iteration-statement))
