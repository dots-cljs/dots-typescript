(ns dots.typescript.if-statement)

(defn kind
  ^js [if-statement]
  (.-kind ^js if-statement))

(defn expression
  ^js [if-statement]
  (.-expression ^js if-statement))

(defn then-statement
  ^js [if-statement]
  (.-thenStatement ^js if-statement))

(defn else-statement
  ^js [if-statement]
  (.-elseStatement ^js if-statement))

(defn flags
  ^js [if-statement]
  (.-flags ^js if-statement))

(defn parent
  ^js [if-statement]
  (.-parent ^js if-statement))

(defn source-file
  ^js [if-statement]
  (.getSourceFile ^js if-statement))

(defn child-count
  (^js [if-statement]
   (.getChildCount ^js if-statement))
  (^js [if-statement source-file]
   (.getChildCount ^js if-statement source-file)))

(defn child-at
  (^js [if-statement index]
   (.getChildAt ^js if-statement index))
  (^js [if-statement index source-file]
   (.getChildAt ^js if-statement index source-file)))

(defn children
  (^js [if-statement]
   (.getChildren ^js if-statement))
  (^js [if-statement source-file]
   (.getChildren ^js if-statement source-file)))

(defn start
  (^js [if-statement]
   (.getStart ^js if-statement))
  (^js [if-statement source-file]
   (.getStart ^js if-statement source-file))
  (^js [if-statement source-file include-js-doc-comment?]
   (.getStart ^js if-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [if-statement]
  (.getFullStart ^js if-statement))

(defn get-end
  ^js [if-statement]
  (.getEnd ^js if-statement))

(defn width
  (^js [if-statement]
   (.getWidth ^js if-statement))
  (^js [if-statement source-file]
   (.getWidth ^js if-statement source-file)))

(defn full-width
  ^js [if-statement]
  (.getFullWidth ^js if-statement))

(defn leading-trivia-width
  (^js [if-statement]
   (.getLeadingTriviaWidth ^js if-statement))
  (^js [if-statement source-file]
   (.getLeadingTriviaWidth ^js if-statement source-file)))

(defn full-text
  (^js [if-statement]
   (.getFullText ^js if-statement))
  (^js [if-statement source-file]
   (.getFullText ^js if-statement source-file)))

(defn text
  (^js [if-statement]
   (.getText ^js if-statement))
  (^js [if-statement source-file]
   (.getText ^js if-statement source-file)))

(defn first-token
  (^js [if-statement]
   (.getFirstToken ^js if-statement))
  (^js [if-statement source-file]
   (.getFirstToken ^js if-statement source-file)))

(defn last-token
  (^js [if-statement]
   (.getLastToken ^js if-statement))
  (^js [if-statement source-file]
   (.getLastToken ^js if-statement source-file)))

(defn for-each-child
  (^js [if-statement cb-node]
   (.forEachChild ^js if-statement cb-node))
  (^js [if-statement cb-node cb-node-array]
   (.forEachChild ^js if-statement cb-node cb-node-array)))

(defn decorators
  ^js [if-statement]
  (.-decorators ^js if-statement))

(defn modifiers
  ^js [if-statement]
  (.-modifiers ^js if-statement))

(defn pos
  ^js [if-statement]
  (.-pos ^js if-statement))

(defn end
  ^js [if-statement]
  (.-end ^js if-statement))
