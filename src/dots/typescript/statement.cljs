(ns dots.typescript.statement)

(defn kind
  ^js [statement]
  (.-kind ^js statement))

(defn flags
  ^js [statement]
  (.-flags ^js statement))

(defn parent
  ^js [statement]
  (.-parent ^js statement))

(defn source-file
  ^js [statement]
  (.getSourceFile ^js statement))

(defn child-count
  (^js [statement]
   (.getChildCount ^js statement))
  (^js [statement source-file]
   (.getChildCount ^js statement source-file)))

(defn child-at
  (^js [statement index]
   (.getChildAt ^js statement index))
  (^js [statement index source-file]
   (.getChildAt ^js statement index source-file)))

(defn children
  (^js [statement]
   (.getChildren ^js statement))
  (^js [statement source-file]
   (.getChildren ^js statement source-file)))

(defn start
  (^js [statement]
   (.getStart ^js statement))
  (^js [statement source-file]
   (.getStart ^js statement source-file))
  (^js [statement source-file include-js-doc-comment?]
   (.getStart ^js statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [statement]
  (.getFullStart ^js statement))

(defn get-end
  ^js [statement]
  (.getEnd ^js statement))

(defn width
  (^js [statement]
   (.getWidth ^js statement))
  (^js [statement source-file]
   (.getWidth ^js statement source-file)))

(defn full-width
  ^js [statement]
  (.getFullWidth ^js statement))

(defn leading-trivia-width
  (^js [statement]
   (.getLeadingTriviaWidth ^js statement))
  (^js [statement source-file]
   (.getLeadingTriviaWidth ^js statement source-file)))

(defn full-text
  (^js [statement]
   (.getFullText ^js statement))
  (^js [statement source-file]
   (.getFullText ^js statement source-file)))

(defn text
  (^js [statement]
   (.getText ^js statement))
  (^js [statement source-file]
   (.getText ^js statement source-file)))

(defn first-token
  (^js [statement]
   (.getFirstToken ^js statement))
  (^js [statement source-file]
   (.getFirstToken ^js statement source-file)))

(defn last-token
  (^js [statement]
   (.getLastToken ^js statement))
  (^js [statement source-file]
   (.getLastToken ^js statement source-file)))

(defn for-each-child
  (^js [statement cb-node]
   (.forEachChild ^js statement cb-node))
  (^js [statement cb-node cb-node-array]
   (.forEachChild ^js statement cb-node cb-node-array)))

(defn decorators
  ^js [statement]
  (.-decorators ^js statement))

(defn modifiers
  ^js [statement]
  (.-modifiers ^js statement))

(defn pos
  ^js [statement]
  (.-pos ^js statement))

(defn end
  ^js [statement]
  (.-end ^js statement))
