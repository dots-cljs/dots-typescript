(ns dots.typescript.with-statement)

(defn kind
  ^js [with-statement]
  (.-kind ^js with-statement))

(defn expression
  ^js [with-statement]
  (.-expression ^js with-statement))

(defn statement
  ^js [with-statement]
  (.-statement ^js with-statement))

(defn flags
  ^js [with-statement]
  (.-flags ^js with-statement))

(defn parent
  ^js [with-statement]
  (.-parent ^js with-statement))

(defn source-file
  ^js [with-statement]
  (.getSourceFile ^js with-statement))

(defn child-count
  (^js [with-statement]
   (.getChildCount ^js with-statement))
  (^js [with-statement source-file]
   (.getChildCount ^js with-statement source-file)))

(defn child-at
  (^js [with-statement index]
   (.getChildAt ^js with-statement index))
  (^js [with-statement index source-file]
   (.getChildAt ^js with-statement index source-file)))

(defn children
  (^js [with-statement]
   (.getChildren ^js with-statement))
  (^js [with-statement source-file]
   (.getChildren ^js with-statement source-file)))

(defn start
  (^js [with-statement]
   (.getStart ^js with-statement))
  (^js [with-statement source-file]
   (.getStart ^js with-statement source-file))
  (^js [with-statement source-file include-js-doc-comment?]
   (.getStart ^js with-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [with-statement]
  (.getFullStart ^js with-statement))

(defn get-end
  ^js [with-statement]
  (.getEnd ^js with-statement))

(defn width
  (^js [with-statement]
   (.getWidth ^js with-statement))
  (^js [with-statement source-file]
   (.getWidth ^js with-statement source-file)))

(defn full-width
  ^js [with-statement]
  (.getFullWidth ^js with-statement))

(defn leading-trivia-width
  (^js [with-statement]
   (.getLeadingTriviaWidth ^js with-statement))
  (^js [with-statement source-file]
   (.getLeadingTriviaWidth ^js with-statement source-file)))

(defn full-text
  (^js [with-statement]
   (.getFullText ^js with-statement))
  (^js [with-statement source-file]
   (.getFullText ^js with-statement source-file)))

(defn text
  (^js [with-statement]
   (.getText ^js with-statement))
  (^js [with-statement source-file]
   (.getText ^js with-statement source-file)))

(defn first-token
  (^js [with-statement]
   (.getFirstToken ^js with-statement))
  (^js [with-statement source-file]
   (.getFirstToken ^js with-statement source-file)))

(defn last-token
  (^js [with-statement]
   (.getLastToken ^js with-statement))
  (^js [with-statement source-file]
   (.getLastToken ^js with-statement source-file)))

(defn for-each-child
  (^js [with-statement cb-node]
   (.forEachChild ^js with-statement cb-node))
  (^js [with-statement cb-node cb-node-array]
   (.forEachChild ^js with-statement cb-node cb-node-array)))

(defn decorators
  ^js [with-statement]
  (.-decorators ^js with-statement))

(defn modifiers
  ^js [with-statement]
  (.-modifiers ^js with-statement))

(defn pos
  ^js [with-statement]
  (.-pos ^js with-statement))

(defn end
  ^js [with-statement]
  (.-end ^js with-statement))
