(ns dots.typescript.labeled-statement)

(defn kind
  ^js [labeled-statement]
  (.-kind ^js labeled-statement))

(defn label
  ^js [labeled-statement]
  (.-label ^js labeled-statement))

(defn statement
  ^js [labeled-statement]
  (.-statement ^js labeled-statement))

(defn flags
  ^js [labeled-statement]
  (.-flags ^js labeled-statement))

(defn parent
  ^js [labeled-statement]
  (.-parent ^js labeled-statement))

(defn source-file
  ^js [labeled-statement]
  (.getSourceFile ^js labeled-statement))

(defn child-count
  (^js [labeled-statement]
   (.getChildCount ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getChildCount ^js labeled-statement source-file)))

(defn child-at
  (^js [labeled-statement index]
   (.getChildAt ^js labeled-statement index))
  (^js [labeled-statement index source-file]
   (.getChildAt ^js labeled-statement index source-file)))

(defn children
  (^js [labeled-statement]
   (.getChildren ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getChildren ^js labeled-statement source-file)))

(defn start
  (^js [labeled-statement]
   (.getStart ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getStart ^js labeled-statement source-file))
  (^js [labeled-statement source-file include-js-doc-comment?]
   (.getStart ^js labeled-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [labeled-statement]
  (.getFullStart ^js labeled-statement))

(defn get-end
  ^js [labeled-statement]
  (.getEnd ^js labeled-statement))

(defn width
  (^js [labeled-statement]
   (.getWidth ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getWidth ^js labeled-statement source-file)))

(defn full-width
  ^js [labeled-statement]
  (.getFullWidth ^js labeled-statement))

(defn leading-trivia-width
  (^js [labeled-statement]
   (.getLeadingTriviaWidth ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getLeadingTriviaWidth ^js labeled-statement source-file)))

(defn full-text
  (^js [labeled-statement]
   (.getFullText ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getFullText ^js labeled-statement source-file)))

(defn text
  (^js [labeled-statement]
   (.getText ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getText ^js labeled-statement source-file)))

(defn first-token
  (^js [labeled-statement]
   (.getFirstToken ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getFirstToken ^js labeled-statement source-file)))

(defn last-token
  (^js [labeled-statement]
   (.getLastToken ^js labeled-statement))
  (^js [labeled-statement source-file]
   (.getLastToken ^js labeled-statement source-file)))

(defn for-each-child
  (^js [labeled-statement cb-node]
   (.forEachChild ^js labeled-statement cb-node))
  (^js [labeled-statement cb-node cb-node-array]
   (.forEachChild ^js labeled-statement cb-node cb-node-array)))

(defn pos
  ^js [labeled-statement]
  (.-pos ^js labeled-statement))

(defn end
  ^js [labeled-statement]
  (.-end ^js labeled-statement))
