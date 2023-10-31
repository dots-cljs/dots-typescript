(ns dots.typescript.not-emitted-statement)

(defn kind
  ^js [not-emitted-statement]
  (.-kind ^js not-emitted-statement))

(defn flags
  ^js [not-emitted-statement]
  (.-flags ^js not-emitted-statement))

(defn parent
  ^js [not-emitted-statement]
  (.-parent ^js not-emitted-statement))

(defn source-file
  ^js [not-emitted-statement]
  (.getSourceFile ^js not-emitted-statement))

(defn child-count
  (^js [not-emitted-statement]
   (.getChildCount ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getChildCount ^js not-emitted-statement source-file)))

(defn child-at
  (^js [not-emitted-statement index]
   (.getChildAt ^js not-emitted-statement index))
  (^js [not-emitted-statement index source-file]
   (.getChildAt ^js not-emitted-statement index source-file)))

(defn children
  (^js [not-emitted-statement]
   (.getChildren ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getChildren ^js not-emitted-statement source-file)))

(defn start
  (^js [not-emitted-statement]
   (.getStart ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getStart ^js not-emitted-statement source-file))
  (^js [not-emitted-statement source-file include-js-doc-comment?]
   (.getStart ^js not-emitted-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [not-emitted-statement]
  (.getFullStart ^js not-emitted-statement))

(defn get-end
  ^js [not-emitted-statement]
  (.getEnd ^js not-emitted-statement))

(defn width
  (^js [not-emitted-statement]
   (.getWidth ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getWidth ^js not-emitted-statement source-file)))

(defn full-width
  ^js [not-emitted-statement]
  (.getFullWidth ^js not-emitted-statement))

(defn leading-trivia-width
  (^js [not-emitted-statement]
   (.getLeadingTriviaWidth ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getLeadingTriviaWidth ^js not-emitted-statement source-file)))

(defn full-text
  (^js [not-emitted-statement]
   (.getFullText ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getFullText ^js not-emitted-statement source-file)))

(defn text
  (^js [not-emitted-statement]
   (.getText ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getText ^js not-emitted-statement source-file)))

(defn first-token
  (^js [not-emitted-statement]
   (.getFirstToken ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getFirstToken ^js not-emitted-statement source-file)))

(defn last-token
  (^js [not-emitted-statement]
   (.getLastToken ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getLastToken ^js not-emitted-statement source-file)))

(defn for-each-child
  (^js [not-emitted-statement cb-node]
   (.forEachChild ^js not-emitted-statement cb-node))
  (^js [not-emitted-statement cb-node cb-node-array]
   (.forEachChild ^js not-emitted-statement cb-node cb-node-array)))

(defn pos
  ^js [not-emitted-statement]
  (.-pos ^js not-emitted-statement))

(defn end
  ^js [not-emitted-statement]
  (.-end ^js not-emitted-statement))
