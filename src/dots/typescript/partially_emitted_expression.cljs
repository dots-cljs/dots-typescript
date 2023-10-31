(ns dots.typescript.partially-emitted-expression)

(defn kind
  ^js [partially-emitted-expression]
  (.-kind ^js partially-emitted-expression))

(defn expression
  ^js [partially-emitted-expression]
  (.-expression ^js partially-emitted-expression))

(defn flags
  ^js [partially-emitted-expression]
  (.-flags ^js partially-emitted-expression))

(defn parent
  ^js [partially-emitted-expression]
  (.-parent ^js partially-emitted-expression))

(defn source-file
  ^js [partially-emitted-expression]
  (.getSourceFile ^js partially-emitted-expression))

(defn child-count
  (^js [partially-emitted-expression]
   (.getChildCount ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getChildCount ^js partially-emitted-expression source-file)))

(defn child-at
  (^js [partially-emitted-expression index]
   (.getChildAt ^js partially-emitted-expression index))
  (^js [partially-emitted-expression index source-file]
   (.getChildAt ^js partially-emitted-expression index source-file)))

(defn children
  (^js [partially-emitted-expression]
   (.getChildren ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getChildren ^js partially-emitted-expression source-file)))

(defn start
  (^js [partially-emitted-expression]
   (.getStart ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getStart ^js partially-emitted-expression source-file))
  (^js [partially-emitted-expression source-file include-js-doc-comment?]
   (.getStart ^js partially-emitted-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [partially-emitted-expression]
  (.getFullStart ^js partially-emitted-expression))

(defn get-end
  ^js [partially-emitted-expression]
  (.getEnd ^js partially-emitted-expression))

(defn width
  (^js [partially-emitted-expression]
   (.getWidth ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getWidth ^js partially-emitted-expression source-file)))

(defn full-width
  ^js [partially-emitted-expression]
  (.getFullWidth ^js partially-emitted-expression))

(defn leading-trivia-width
  (^js [partially-emitted-expression]
   (.getLeadingTriviaWidth ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getLeadingTriviaWidth ^js partially-emitted-expression source-file)))

(defn full-text
  (^js [partially-emitted-expression]
   (.getFullText ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getFullText ^js partially-emitted-expression source-file)))

(defn text
  (^js [partially-emitted-expression]
   (.getText ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getText ^js partially-emitted-expression source-file)))

(defn first-token
  (^js [partially-emitted-expression]
   (.getFirstToken ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getFirstToken ^js partially-emitted-expression source-file)))

(defn last-token
  (^js [partially-emitted-expression]
   (.getLastToken ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getLastToken ^js partially-emitted-expression source-file)))

(defn for-each-child
  (^js [partially-emitted-expression cb-node]
   (.forEachChild ^js partially-emitted-expression cb-node))
  (^js [partially-emitted-expression cb-node cb-node-array]
   (.forEachChild ^js partially-emitted-expression cb-node cb-node-array)))

(defn decorators
  ^js [partially-emitted-expression]
  (.-decorators ^js partially-emitted-expression))

(defn modifiers
  ^js [partially-emitted-expression]
  (.-modifiers ^js partially-emitted-expression))

(defn pos
  ^js [partially-emitted-expression]
  (.-pos ^js partially-emitted-expression))

(defn end
  ^js [partially-emitted-expression]
  (.-end ^js partially-emitted-expression))
