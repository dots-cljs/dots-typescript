(ns dots.typescript.binary-expression)

(defn kind
  ^js [binary-expression]
  (.-kind ^js binary-expression))

(defn left
  ^js [binary-expression]
  (.-left ^js binary-expression))

(defn operator-token
  ^js [binary-expression]
  (.-operatorToken ^js binary-expression))

(defn right
  ^js [binary-expression]
  (.-right ^js binary-expression))

(defn flags
  ^js [binary-expression]
  (.-flags ^js binary-expression))

(defn parent
  ^js [binary-expression]
  (.-parent ^js binary-expression))

(defn source-file
  ^js [binary-expression]
  (.getSourceFile ^js binary-expression))

(defn child-count
  (^js [binary-expression]
   (.getChildCount ^js binary-expression))
  (^js [binary-expression source-file]
   (.getChildCount ^js binary-expression source-file)))

(defn child-at
  (^js [binary-expression index]
   (.getChildAt ^js binary-expression index))
  (^js [binary-expression index source-file]
   (.getChildAt ^js binary-expression index source-file)))

(defn children
  (^js [binary-expression]
   (.getChildren ^js binary-expression))
  (^js [binary-expression source-file]
   (.getChildren ^js binary-expression source-file)))

(defn start
  (^js [binary-expression]
   (.getStart ^js binary-expression))
  (^js [binary-expression source-file]
   (.getStart ^js binary-expression source-file))
  (^js [binary-expression source-file include-js-doc-comment?]
   (.getStart ^js binary-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [binary-expression]
  (.getFullStart ^js binary-expression))

(defn get-end
  ^js [binary-expression]
  (.getEnd ^js binary-expression))

(defn width
  (^js [binary-expression]
   (.getWidth ^js binary-expression))
  (^js [binary-expression source-file]
   (.getWidth ^js binary-expression source-file)))

(defn full-width
  ^js [binary-expression]
  (.getFullWidth ^js binary-expression))

(defn leading-trivia-width
  (^js [binary-expression]
   (.getLeadingTriviaWidth ^js binary-expression))
  (^js [binary-expression source-file]
   (.getLeadingTriviaWidth ^js binary-expression source-file)))

(defn full-text
  (^js [binary-expression]
   (.getFullText ^js binary-expression))
  (^js [binary-expression source-file]
   (.getFullText ^js binary-expression source-file)))

(defn text
  (^js [binary-expression]
   (.getText ^js binary-expression))
  (^js [binary-expression source-file]
   (.getText ^js binary-expression source-file)))

(defn first-token
  (^js [binary-expression]
   (.getFirstToken ^js binary-expression))
  (^js [binary-expression source-file]
   (.getFirstToken ^js binary-expression source-file)))

(defn last-token
  (^js [binary-expression]
   (.getLastToken ^js binary-expression))
  (^js [binary-expression source-file]
   (.getLastToken ^js binary-expression source-file)))

(defn for-each-child
  (^js [binary-expression cb-node]
   (.forEachChild ^js binary-expression cb-node))
  (^js [binary-expression cb-node cb-node-array]
   (.forEachChild ^js binary-expression cb-node cb-node-array)))

(defn decorators
  ^js [binary-expression]
  (.-decorators ^js binary-expression))

(defn modifiers
  ^js [binary-expression]
  (.-modifiers ^js binary-expression))

(defn pos
  ^js [binary-expression]
  (.-pos ^js binary-expression))

(defn end
  ^js [binary-expression]
  (.-end ^js binary-expression))
