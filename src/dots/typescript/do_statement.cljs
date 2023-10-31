(ns dots.typescript.do-statement)

(defn kind
  ^js [do-statement]
  (.-kind ^js do-statement))

(defn expression
  ^js [do-statement]
  (.-expression ^js do-statement))

(defn statement
  ^js [do-statement]
  (.-statement ^js do-statement))

(defn flags
  ^js [do-statement]
  (.-flags ^js do-statement))

(defn parent
  ^js [do-statement]
  (.-parent ^js do-statement))

(defn source-file
  ^js [do-statement]
  (.getSourceFile ^js do-statement))

(defn child-count
  (^js [do-statement]
   (.getChildCount ^js do-statement))
  (^js [do-statement source-file]
   (.getChildCount ^js do-statement source-file)))

(defn child-at
  (^js [do-statement index]
   (.getChildAt ^js do-statement index))
  (^js [do-statement index source-file]
   (.getChildAt ^js do-statement index source-file)))

(defn children
  (^js [do-statement]
   (.getChildren ^js do-statement))
  (^js [do-statement source-file]
   (.getChildren ^js do-statement source-file)))

(defn start
  (^js [do-statement]
   (.getStart ^js do-statement))
  (^js [do-statement source-file]
   (.getStart ^js do-statement source-file))
  (^js [do-statement source-file include-js-doc-comment?]
   (.getStart ^js do-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [do-statement]
  (.getFullStart ^js do-statement))

(defn get-end
  ^js [do-statement]
  (.getEnd ^js do-statement))

(defn width
  (^js [do-statement]
   (.getWidth ^js do-statement))
  (^js [do-statement source-file]
   (.getWidth ^js do-statement source-file)))

(defn full-width
  ^js [do-statement]
  (.getFullWidth ^js do-statement))

(defn leading-trivia-width
  (^js [do-statement]
   (.getLeadingTriviaWidth ^js do-statement))
  (^js [do-statement source-file]
   (.getLeadingTriviaWidth ^js do-statement source-file)))

(defn full-text
  (^js [do-statement]
   (.getFullText ^js do-statement))
  (^js [do-statement source-file]
   (.getFullText ^js do-statement source-file)))

(defn text
  (^js [do-statement]
   (.getText ^js do-statement))
  (^js [do-statement source-file]
   (.getText ^js do-statement source-file)))

(defn first-token
  (^js [do-statement]
   (.getFirstToken ^js do-statement))
  (^js [do-statement source-file]
   (.getFirstToken ^js do-statement source-file)))

(defn last-token
  (^js [do-statement]
   (.getLastToken ^js do-statement))
  (^js [do-statement source-file]
   (.getLastToken ^js do-statement source-file)))

(defn for-each-child
  (^js [do-statement cb-node]
   (.forEachChild ^js do-statement cb-node))
  (^js [do-statement cb-node cb-node-array]
   (.forEachChild ^js do-statement cb-node cb-node-array)))

(defn pos
  ^js [do-statement]
  (.-pos ^js do-statement))

(defn end
  ^js [do-statement]
  (.-end ^js do-statement))
