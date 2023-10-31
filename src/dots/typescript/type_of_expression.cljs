(ns dots.typescript.type-of-expression)

(defn kind
  ^js [type-of-expression]
  (.-kind ^js type-of-expression))

(defn expression
  ^js [type-of-expression]
  (.-expression ^js type-of-expression))

(defn flags
  ^js [type-of-expression]
  (.-flags ^js type-of-expression))

(defn parent
  ^js [type-of-expression]
  (.-parent ^js type-of-expression))

(defn source-file
  ^js [type-of-expression]
  (.getSourceFile ^js type-of-expression))

(defn child-count
  (^js [type-of-expression]
   (.getChildCount ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getChildCount ^js type-of-expression source-file)))

(defn child-at
  (^js [type-of-expression index]
   (.getChildAt ^js type-of-expression index))
  (^js [type-of-expression index source-file]
   (.getChildAt ^js type-of-expression index source-file)))

(defn children
  (^js [type-of-expression]
   (.getChildren ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getChildren ^js type-of-expression source-file)))

(defn start
  (^js [type-of-expression]
   (.getStart ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getStart ^js type-of-expression source-file))
  (^js [type-of-expression source-file include-js-doc-comment?]
   (.getStart ^js type-of-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [type-of-expression]
  (.getFullStart ^js type-of-expression))

(defn get-end
  ^js [type-of-expression]
  (.getEnd ^js type-of-expression))

(defn width
  (^js [type-of-expression]
   (.getWidth ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getWidth ^js type-of-expression source-file)))

(defn full-width
  ^js [type-of-expression]
  (.getFullWidth ^js type-of-expression))

(defn leading-trivia-width
  (^js [type-of-expression]
   (.getLeadingTriviaWidth ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getLeadingTriviaWidth ^js type-of-expression source-file)))

(defn full-text
  (^js [type-of-expression]
   (.getFullText ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getFullText ^js type-of-expression source-file)))

(defn text
  (^js [type-of-expression]
   (.getText ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getText ^js type-of-expression source-file)))

(defn first-token
  (^js [type-of-expression]
   (.getFirstToken ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getFirstToken ^js type-of-expression source-file)))

(defn last-token
  (^js [type-of-expression]
   (.getLastToken ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getLastToken ^js type-of-expression source-file)))

(defn for-each-child
  (^js [type-of-expression cb-node]
   (.forEachChild ^js type-of-expression cb-node))
  (^js [type-of-expression cb-node cb-node-array]
   (.forEachChild ^js type-of-expression cb-node cb-node-array)))

(defn pos
  ^js [type-of-expression]
  (.-pos ^js type-of-expression))

(defn end
  ^js [type-of-expression]
  (.-end ^js type-of-expression))
