(ns dots.typescript.empty-statement)

(defn kind
  ^js [empty-statement]
  (.-kind ^js empty-statement))

(defn flags
  ^js [empty-statement]
  (.-flags ^js empty-statement))

(defn parent
  ^js [empty-statement]
  (.-parent ^js empty-statement))

(defn source-file
  ^js [empty-statement]
  (.getSourceFile ^js empty-statement))

(defn child-count
  (^js [empty-statement]
   (.getChildCount ^js empty-statement))
  (^js [empty-statement source-file]
   (.getChildCount ^js empty-statement source-file)))

(defn child-at
  (^js [empty-statement index]
   (.getChildAt ^js empty-statement index))
  (^js [empty-statement index source-file]
   (.getChildAt ^js empty-statement index source-file)))

(defn children
  (^js [empty-statement]
   (.getChildren ^js empty-statement))
  (^js [empty-statement source-file]
   (.getChildren ^js empty-statement source-file)))

(defn start
  (^js [empty-statement]
   (.getStart ^js empty-statement))
  (^js [empty-statement source-file]
   (.getStart ^js empty-statement source-file))
  (^js [empty-statement source-file include-js-doc-comment?]
   (.getStart ^js empty-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [empty-statement]
  (.getFullStart ^js empty-statement))

(defn get-end
  ^js [empty-statement]
  (.getEnd ^js empty-statement))

(defn width
  (^js [empty-statement]
   (.getWidth ^js empty-statement))
  (^js [empty-statement source-file]
   (.getWidth ^js empty-statement source-file)))

(defn full-width
  ^js [empty-statement]
  (.getFullWidth ^js empty-statement))

(defn leading-trivia-width
  (^js [empty-statement]
   (.getLeadingTriviaWidth ^js empty-statement))
  (^js [empty-statement source-file]
   (.getLeadingTriviaWidth ^js empty-statement source-file)))

(defn full-text
  (^js [empty-statement]
   (.getFullText ^js empty-statement))
  (^js [empty-statement source-file]
   (.getFullText ^js empty-statement source-file)))

(defn text
  (^js [empty-statement]
   (.getText ^js empty-statement))
  (^js [empty-statement source-file]
   (.getText ^js empty-statement source-file)))

(defn first-token
  (^js [empty-statement]
   (.getFirstToken ^js empty-statement))
  (^js [empty-statement source-file]
   (.getFirstToken ^js empty-statement source-file)))

(defn last-token
  (^js [empty-statement]
   (.getLastToken ^js empty-statement))
  (^js [empty-statement source-file]
   (.getLastToken ^js empty-statement source-file)))

(defn for-each-child
  (^js [empty-statement cb-node]
   (.forEachChild ^js empty-statement cb-node))
  (^js [empty-statement cb-node cb-node-array]
   (.forEachChild ^js empty-statement cb-node cb-node-array)))

(defn pos
  ^js [empty-statement]
  (.-pos ^js empty-statement))

(defn end
  ^js [empty-statement]
  (.-end ^js empty-statement))
