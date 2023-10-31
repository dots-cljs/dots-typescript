(ns dots.typescript.break-statement)

(defn kind
  ^js [break-statement]
  (.-kind ^js break-statement))

(defn label
  ^js [break-statement]
  (.-label ^js break-statement))

(defn flags
  ^js [break-statement]
  (.-flags ^js break-statement))

(defn parent
  ^js [break-statement]
  (.-parent ^js break-statement))

(defn source-file
  ^js [break-statement]
  (.getSourceFile ^js break-statement))

(defn child-count
  (^js [break-statement]
   (.getChildCount ^js break-statement))
  (^js [break-statement source-file]
   (.getChildCount ^js break-statement source-file)))

(defn child-at
  (^js [break-statement index]
   (.getChildAt ^js break-statement index))
  (^js [break-statement index source-file]
   (.getChildAt ^js break-statement index source-file)))

(defn children
  (^js [break-statement]
   (.getChildren ^js break-statement))
  (^js [break-statement source-file]
   (.getChildren ^js break-statement source-file)))

(defn start
  (^js [break-statement]
   (.getStart ^js break-statement))
  (^js [break-statement source-file]
   (.getStart ^js break-statement source-file))
  (^js [break-statement source-file include-js-doc-comment?]
   (.getStart ^js break-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [break-statement]
  (.getFullStart ^js break-statement))

(defn get-end
  ^js [break-statement]
  (.getEnd ^js break-statement))

(defn width
  (^js [break-statement]
   (.getWidth ^js break-statement))
  (^js [break-statement source-file]
   (.getWidth ^js break-statement source-file)))

(defn full-width
  ^js [break-statement]
  (.getFullWidth ^js break-statement))

(defn leading-trivia-width
  (^js [break-statement]
   (.getLeadingTriviaWidth ^js break-statement))
  (^js [break-statement source-file]
   (.getLeadingTriviaWidth ^js break-statement source-file)))

(defn full-text
  (^js [break-statement]
   (.getFullText ^js break-statement))
  (^js [break-statement source-file]
   (.getFullText ^js break-statement source-file)))

(defn text
  (^js [break-statement]
   (.getText ^js break-statement))
  (^js [break-statement source-file]
   (.getText ^js break-statement source-file)))

(defn first-token
  (^js [break-statement]
   (.getFirstToken ^js break-statement))
  (^js [break-statement source-file]
   (.getFirstToken ^js break-statement source-file)))

(defn last-token
  (^js [break-statement]
   (.getLastToken ^js break-statement))
  (^js [break-statement source-file]
   (.getLastToken ^js break-statement source-file)))

(defn for-each-child
  (^js [break-statement cb-node]
   (.forEachChild ^js break-statement cb-node))
  (^js [break-statement cb-node cb-node-array]
   (.forEachChild ^js break-statement cb-node cb-node-array)))

(defn decorators
  ^js [break-statement]
  (.-decorators ^js break-statement))

(defn modifiers
  ^js [break-statement]
  (.-modifiers ^js break-statement))

(defn pos
  ^js [break-statement]
  (.-pos ^js break-statement))

(defn end
  ^js [break-statement]
  (.-end ^js break-statement))
