(ns dots.typescript.switch-statement)

(defn kind
  ^js [switch-statement]
  (.-kind ^js switch-statement))

(defn expression
  ^js [switch-statement]
  (.-expression ^js switch-statement))

(defn case-block
  ^js [switch-statement]
  (.-caseBlock ^js switch-statement))

(defn possibly-exhaustive?
  ^js [switch-statement]
  (.-possiblyExhaustive ^js switch-statement))

(defn set-possibly-exhaustive!
  ^js [switch-statement value]
  (set! (.-possiblyExhaustive ^js switch-statement) value))

(defn flags
  ^js [switch-statement]
  (.-flags ^js switch-statement))

(defn parent
  ^js [switch-statement]
  (.-parent ^js switch-statement))

(defn source-file
  ^js [switch-statement]
  (.getSourceFile ^js switch-statement))

(defn child-count
  (^js [switch-statement]
   (.getChildCount ^js switch-statement))
  (^js [switch-statement source-file]
   (.getChildCount ^js switch-statement source-file)))

(defn child-at
  (^js [switch-statement index]
   (.getChildAt ^js switch-statement index))
  (^js [switch-statement index source-file]
   (.getChildAt ^js switch-statement index source-file)))

(defn children
  (^js [switch-statement]
   (.getChildren ^js switch-statement))
  (^js [switch-statement source-file]
   (.getChildren ^js switch-statement source-file)))

(defn start
  (^js [switch-statement]
   (.getStart ^js switch-statement))
  (^js [switch-statement source-file]
   (.getStart ^js switch-statement source-file))
  (^js [switch-statement source-file include-js-doc-comment?]
   (.getStart ^js switch-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [switch-statement]
  (.getFullStart ^js switch-statement))

(defn get-end
  ^js [switch-statement]
  (.getEnd ^js switch-statement))

(defn width
  (^js [switch-statement]
   (.getWidth ^js switch-statement))
  (^js [switch-statement source-file]
   (.getWidth ^js switch-statement source-file)))

(defn full-width
  ^js [switch-statement]
  (.getFullWidth ^js switch-statement))

(defn leading-trivia-width
  (^js [switch-statement]
   (.getLeadingTriviaWidth ^js switch-statement))
  (^js [switch-statement source-file]
   (.getLeadingTriviaWidth ^js switch-statement source-file)))

(defn full-text
  (^js [switch-statement]
   (.getFullText ^js switch-statement))
  (^js [switch-statement source-file]
   (.getFullText ^js switch-statement source-file)))

(defn text
  (^js [switch-statement]
   (.getText ^js switch-statement))
  (^js [switch-statement source-file]
   (.getText ^js switch-statement source-file)))

(defn first-token
  (^js [switch-statement]
   (.getFirstToken ^js switch-statement))
  (^js [switch-statement source-file]
   (.getFirstToken ^js switch-statement source-file)))

(defn last-token
  (^js [switch-statement]
   (.getLastToken ^js switch-statement))
  (^js [switch-statement source-file]
   (.getLastToken ^js switch-statement source-file)))

(defn for-each-child
  (^js [switch-statement cb-node]
   (.forEachChild ^js switch-statement cb-node))
  (^js [switch-statement cb-node cb-node-array]
   (.forEachChild ^js switch-statement cb-node cb-node-array)))

(defn pos
  ^js [switch-statement]
  (.-pos ^js switch-statement))

(defn end
  ^js [switch-statement]
  (.-end ^js switch-statement))
