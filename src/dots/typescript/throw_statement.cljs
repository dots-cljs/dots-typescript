(ns dots.typescript.throw-statement)

(defn kind
  ^js [throw-statement]
  (.-kind ^js throw-statement))

(defn expression
  ^js [throw-statement]
  (.-expression ^js throw-statement))

(defn flags
  ^js [throw-statement]
  (.-flags ^js throw-statement))

(defn parent
  ^js [throw-statement]
  (.-parent ^js throw-statement))

(defn source-file
  ^js [throw-statement]
  (.getSourceFile ^js throw-statement))

(defn child-count
  (^js [throw-statement]
   (.getChildCount ^js throw-statement))
  (^js [throw-statement source-file]
   (.getChildCount ^js throw-statement source-file)))

(defn child-at
  (^js [throw-statement index]
   (.getChildAt ^js throw-statement index))
  (^js [throw-statement index source-file]
   (.getChildAt ^js throw-statement index source-file)))

(defn children
  (^js [throw-statement]
   (.getChildren ^js throw-statement))
  (^js [throw-statement source-file]
   (.getChildren ^js throw-statement source-file)))

(defn start
  (^js [throw-statement]
   (.getStart ^js throw-statement))
  (^js [throw-statement source-file]
   (.getStart ^js throw-statement source-file))
  (^js [throw-statement source-file include-js-doc-comment?]
   (.getStart ^js throw-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [throw-statement]
  (.getFullStart ^js throw-statement))

(defn get-end
  ^js [throw-statement]
  (.getEnd ^js throw-statement))

(defn width
  (^js [throw-statement]
   (.getWidth ^js throw-statement))
  (^js [throw-statement source-file]
   (.getWidth ^js throw-statement source-file)))

(defn full-width
  ^js [throw-statement]
  (.getFullWidth ^js throw-statement))

(defn leading-trivia-width
  (^js [throw-statement]
   (.getLeadingTriviaWidth ^js throw-statement))
  (^js [throw-statement source-file]
   (.getLeadingTriviaWidth ^js throw-statement source-file)))

(defn full-text
  (^js [throw-statement]
   (.getFullText ^js throw-statement))
  (^js [throw-statement source-file]
   (.getFullText ^js throw-statement source-file)))

(defn text
  (^js [throw-statement]
   (.getText ^js throw-statement))
  (^js [throw-statement source-file]
   (.getText ^js throw-statement source-file)))

(defn first-token
  (^js [throw-statement]
   (.getFirstToken ^js throw-statement))
  (^js [throw-statement source-file]
   (.getFirstToken ^js throw-statement source-file)))

(defn last-token
  (^js [throw-statement]
   (.getLastToken ^js throw-statement))
  (^js [throw-statement source-file]
   (.getLastToken ^js throw-statement source-file)))

(defn for-each-child
  (^js [throw-statement cb-node]
   (.forEachChild ^js throw-statement cb-node))
  (^js [throw-statement cb-node cb-node-array]
   (.forEachChild ^js throw-statement cb-node cb-node-array)))

(defn decorators
  ^js [throw-statement]
  (.-decorators ^js throw-statement))

(defn modifiers
  ^js [throw-statement]
  (.-modifiers ^js throw-statement))

(defn pos
  ^js [throw-statement]
  (.-pos ^js throw-statement))

(defn end
  ^js [throw-statement]
  (.-end ^js throw-statement))
