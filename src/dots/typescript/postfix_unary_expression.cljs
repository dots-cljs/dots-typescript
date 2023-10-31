(ns dots.typescript.postfix-unary-expression)

(defn kind
  ^js [postfix-unary-expression]
  (.-kind ^js postfix-unary-expression))

(defn operand
  ^js [postfix-unary-expression]
  (.-operand ^js postfix-unary-expression))

(defn operator
  ^js [postfix-unary-expression]
  (.-operator ^js postfix-unary-expression))

(defn flags
  ^js [postfix-unary-expression]
  (.-flags ^js postfix-unary-expression))

(defn parent
  ^js [postfix-unary-expression]
  (.-parent ^js postfix-unary-expression))

(defn source-file
  ^js [postfix-unary-expression]
  (.getSourceFile ^js postfix-unary-expression))

(defn child-count
  (^js [postfix-unary-expression]
   (.getChildCount ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getChildCount ^js postfix-unary-expression source-file)))

(defn child-at
  (^js [postfix-unary-expression index]
   (.getChildAt ^js postfix-unary-expression index))
  (^js [postfix-unary-expression index source-file]
   (.getChildAt ^js postfix-unary-expression index source-file)))

(defn children
  (^js [postfix-unary-expression]
   (.getChildren ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getChildren ^js postfix-unary-expression source-file)))

(defn start
  (^js [postfix-unary-expression]
   (.getStart ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getStart ^js postfix-unary-expression source-file))
  (^js [postfix-unary-expression source-file include-js-doc-comment?]
   (.getStart ^js postfix-unary-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [postfix-unary-expression]
  (.getFullStart ^js postfix-unary-expression))

(defn get-end
  ^js [postfix-unary-expression]
  (.getEnd ^js postfix-unary-expression))

(defn width
  (^js [postfix-unary-expression]
   (.getWidth ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getWidth ^js postfix-unary-expression source-file)))

(defn full-width
  ^js [postfix-unary-expression]
  (.getFullWidth ^js postfix-unary-expression))

(defn leading-trivia-width
  (^js [postfix-unary-expression]
   (.getLeadingTriviaWidth ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getLeadingTriviaWidth ^js postfix-unary-expression source-file)))

(defn full-text
  (^js [postfix-unary-expression]
   (.getFullText ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getFullText ^js postfix-unary-expression source-file)))

(defn text
  (^js [postfix-unary-expression]
   (.getText ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getText ^js postfix-unary-expression source-file)))

(defn first-token
  (^js [postfix-unary-expression]
   (.getFirstToken ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getFirstToken ^js postfix-unary-expression source-file)))

(defn last-token
  (^js [postfix-unary-expression]
   (.getLastToken ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getLastToken ^js postfix-unary-expression source-file)))

(defn for-each-child
  (^js [postfix-unary-expression cb-node]
   (.forEachChild ^js postfix-unary-expression cb-node))
  (^js [postfix-unary-expression cb-node cb-node-array]
   (.forEachChild ^js postfix-unary-expression cb-node cb-node-array)))

(defn pos
  ^js [postfix-unary-expression]
  (.-pos ^js postfix-unary-expression))

(defn end
  ^js [postfix-unary-expression]
  (.-end ^js postfix-unary-expression))
