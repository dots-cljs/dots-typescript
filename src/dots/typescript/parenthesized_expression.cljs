(ns dots.typescript.parenthesized-expression)

(defn kind
  ^js [parenthesized-expression]
  (.-kind ^js parenthesized-expression))

(defn expression
  ^js [parenthesized-expression]
  (.-expression ^js parenthesized-expression))

(defn flags
  ^js [parenthesized-expression]
  (.-flags ^js parenthesized-expression))

(defn parent
  ^js [parenthesized-expression]
  (.-parent ^js parenthesized-expression))

(defn source-file
  ^js [parenthesized-expression]
  (.getSourceFile ^js parenthesized-expression))

(defn child-count
  (^js [parenthesized-expression]
   (.getChildCount ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getChildCount ^js parenthesized-expression source-file)))

(defn child-at
  (^js [parenthesized-expression index]
   (.getChildAt ^js parenthesized-expression index))
  (^js [parenthesized-expression index source-file]
   (.getChildAt ^js parenthesized-expression index source-file)))

(defn children
  (^js [parenthesized-expression]
   (.getChildren ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getChildren ^js parenthesized-expression source-file)))

(defn start
  (^js [parenthesized-expression]
   (.getStart ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getStart ^js parenthesized-expression source-file))
  (^js [parenthesized-expression source-file include-js-doc-comment?]
   (.getStart ^js parenthesized-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [parenthesized-expression]
  (.getFullStart ^js parenthesized-expression))

(defn get-end
  ^js [parenthesized-expression]
  (.getEnd ^js parenthesized-expression))

(defn width
  (^js [parenthesized-expression]
   (.getWidth ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getWidth ^js parenthesized-expression source-file)))

(defn full-width
  ^js [parenthesized-expression]
  (.getFullWidth ^js parenthesized-expression))

(defn leading-trivia-width
  (^js [parenthesized-expression]
   (.getLeadingTriviaWidth ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getLeadingTriviaWidth ^js parenthesized-expression source-file)))

(defn full-text
  (^js [parenthesized-expression]
   (.getFullText ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getFullText ^js parenthesized-expression source-file)))

(defn text
  (^js [parenthesized-expression]
   (.getText ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getText ^js parenthesized-expression source-file)))

(defn first-token
  (^js [parenthesized-expression]
   (.getFirstToken ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getFirstToken ^js parenthesized-expression source-file)))

(defn last-token
  (^js [parenthesized-expression]
   (.getLastToken ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getLastToken ^js parenthesized-expression source-file)))

(defn for-each-child
  (^js [parenthesized-expression cb-node]
   (.forEachChild ^js parenthesized-expression cb-node))
  (^js [parenthesized-expression cb-node cb-node-array]
   (.forEachChild ^js parenthesized-expression cb-node cb-node-array)))

(defn pos
  ^js [parenthesized-expression]
  (.-pos ^js parenthesized-expression))

(defn end
  ^js [parenthesized-expression]
  (.-end ^js parenthesized-expression))
