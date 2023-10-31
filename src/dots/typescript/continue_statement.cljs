(ns dots.typescript.continue-statement)

(defn kind
  ^js [continue-statement]
  (.-kind ^js continue-statement))

(defn label
  ^js [continue-statement]
  (.-label ^js continue-statement))

(defn flags
  ^js [continue-statement]
  (.-flags ^js continue-statement))

(defn parent
  ^js [continue-statement]
  (.-parent ^js continue-statement))

(defn source-file
  ^js [continue-statement]
  (.getSourceFile ^js continue-statement))

(defn child-count
  (^js [continue-statement]
   (.getChildCount ^js continue-statement))
  (^js [continue-statement source-file]
   (.getChildCount ^js continue-statement source-file)))

(defn child-at
  (^js [continue-statement index]
   (.getChildAt ^js continue-statement index))
  (^js [continue-statement index source-file]
   (.getChildAt ^js continue-statement index source-file)))

(defn children
  (^js [continue-statement]
   (.getChildren ^js continue-statement))
  (^js [continue-statement source-file]
   (.getChildren ^js continue-statement source-file)))

(defn start
  (^js [continue-statement]
   (.getStart ^js continue-statement))
  (^js [continue-statement source-file]
   (.getStart ^js continue-statement source-file))
  (^js [continue-statement source-file include-js-doc-comment?]
   (.getStart ^js continue-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [continue-statement]
  (.getFullStart ^js continue-statement))

(defn get-end
  ^js [continue-statement]
  (.getEnd ^js continue-statement))

(defn width
  (^js [continue-statement]
   (.getWidth ^js continue-statement))
  (^js [continue-statement source-file]
   (.getWidth ^js continue-statement source-file)))

(defn full-width
  ^js [continue-statement]
  (.getFullWidth ^js continue-statement))

(defn leading-trivia-width
  (^js [continue-statement]
   (.getLeadingTriviaWidth ^js continue-statement))
  (^js [continue-statement source-file]
   (.getLeadingTriviaWidth ^js continue-statement source-file)))

(defn full-text
  (^js [continue-statement]
   (.getFullText ^js continue-statement))
  (^js [continue-statement source-file]
   (.getFullText ^js continue-statement source-file)))

(defn text
  (^js [continue-statement]
   (.getText ^js continue-statement))
  (^js [continue-statement source-file]
   (.getText ^js continue-statement source-file)))

(defn first-token
  (^js [continue-statement]
   (.getFirstToken ^js continue-statement))
  (^js [continue-statement source-file]
   (.getFirstToken ^js continue-statement source-file)))

(defn last-token
  (^js [continue-statement]
   (.getLastToken ^js continue-statement))
  (^js [continue-statement source-file]
   (.getLastToken ^js continue-statement source-file)))

(defn for-each-child
  (^js [continue-statement cb-node]
   (.forEachChild ^js continue-statement cb-node))
  (^js [continue-statement cb-node cb-node-array]
   (.forEachChild ^js continue-statement cb-node cb-node-array)))

(defn pos
  ^js [continue-statement]
  (.-pos ^js continue-statement))

(defn end
  ^js [continue-statement]
  (.-end ^js continue-statement))
