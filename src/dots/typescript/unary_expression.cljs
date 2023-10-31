(ns dots.typescript.unary-expression)

(defn kind
  ^js [unary-expression]
  (.-kind ^js unary-expression))

(defn flags
  ^js [unary-expression]
  (.-flags ^js unary-expression))

(defn parent
  ^js [unary-expression]
  (.-parent ^js unary-expression))

(defn source-file
  ^js [unary-expression]
  (.getSourceFile ^js unary-expression))

(defn child-count
  (^js [unary-expression]
   (.getChildCount ^js unary-expression))
  (^js [unary-expression source-file]
   (.getChildCount ^js unary-expression source-file)))

(defn child-at
  (^js [unary-expression index]
   (.getChildAt ^js unary-expression index))
  (^js [unary-expression index source-file]
   (.getChildAt ^js unary-expression index source-file)))

(defn children
  (^js [unary-expression]
   (.getChildren ^js unary-expression))
  (^js [unary-expression source-file]
   (.getChildren ^js unary-expression source-file)))

(defn start
  (^js [unary-expression]
   (.getStart ^js unary-expression))
  (^js [unary-expression source-file]
   (.getStart ^js unary-expression source-file))
  (^js [unary-expression source-file include-js-doc-comment?]
   (.getStart ^js unary-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [unary-expression]
  (.getFullStart ^js unary-expression))

(defn get-end
  ^js [unary-expression]
  (.getEnd ^js unary-expression))

(defn width
  (^js [unary-expression]
   (.getWidth ^js unary-expression))
  (^js [unary-expression source-file]
   (.getWidth ^js unary-expression source-file)))

(defn full-width
  ^js [unary-expression]
  (.getFullWidth ^js unary-expression))

(defn leading-trivia-width
  (^js [unary-expression]
   (.getLeadingTriviaWidth ^js unary-expression))
  (^js [unary-expression source-file]
   (.getLeadingTriviaWidth ^js unary-expression source-file)))

(defn full-text
  (^js [unary-expression]
   (.getFullText ^js unary-expression))
  (^js [unary-expression source-file]
   (.getFullText ^js unary-expression source-file)))

(defn text
  (^js [unary-expression]
   (.getText ^js unary-expression))
  (^js [unary-expression source-file]
   (.getText ^js unary-expression source-file)))

(defn first-token
  (^js [unary-expression]
   (.getFirstToken ^js unary-expression))
  (^js [unary-expression source-file]
   (.getFirstToken ^js unary-expression source-file)))

(defn last-token
  (^js [unary-expression]
   (.getLastToken ^js unary-expression))
  (^js [unary-expression source-file]
   (.getLastToken ^js unary-expression source-file)))

(defn for-each-child
  (^js [unary-expression cb-node]
   (.forEachChild ^js unary-expression cb-node))
  (^js [unary-expression cb-node cb-node-array]
   (.forEachChild ^js unary-expression cb-node cb-node-array)))

(defn pos
  ^js [unary-expression]
  (.-pos ^js unary-expression))

(defn end
  ^js [unary-expression]
  (.-end ^js unary-expression))
