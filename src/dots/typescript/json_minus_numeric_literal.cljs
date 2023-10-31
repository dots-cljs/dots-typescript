(ns dots.typescript.json-minus-numeric-literal)

(defn kind
  ^js [json-minus-numeric-literal]
  (.-kind ^js json-minus-numeric-literal))

(defn operator
  ^js [json-minus-numeric-literal]
  (.-operator ^js json-minus-numeric-literal))

(defn operand
  ^js [json-minus-numeric-literal]
  (.-operand ^js json-minus-numeric-literal))

(defn flags
  ^js [json-minus-numeric-literal]
  (.-flags ^js json-minus-numeric-literal))

(defn parent
  ^js [json-minus-numeric-literal]
  (.-parent ^js json-minus-numeric-literal))

(defn source-file
  ^js [json-minus-numeric-literal]
  (.getSourceFile ^js json-minus-numeric-literal))

(defn child-count
  (^js [json-minus-numeric-literal]
   (.getChildCount ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getChildCount ^js json-minus-numeric-literal source-file)))

(defn child-at
  (^js [json-minus-numeric-literal index]
   (.getChildAt ^js json-minus-numeric-literal index))
  (^js [json-minus-numeric-literal index source-file]
   (.getChildAt ^js json-minus-numeric-literal index source-file)))

(defn children
  (^js [json-minus-numeric-literal]
   (.getChildren ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getChildren ^js json-minus-numeric-literal source-file)))

(defn start
  (^js [json-minus-numeric-literal]
   (.getStart ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getStart ^js json-minus-numeric-literal source-file))
  (^js [json-minus-numeric-literal source-file include-js-doc-comment?]
   (.getStart ^js json-minus-numeric-literal source-file include-js-doc-comment?)))

(defn full-start
  ^js [json-minus-numeric-literal]
  (.getFullStart ^js json-minus-numeric-literal))

(defn get-end
  ^js [json-minus-numeric-literal]
  (.getEnd ^js json-minus-numeric-literal))

(defn width
  (^js [json-minus-numeric-literal]
   (.getWidth ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getWidth ^js json-minus-numeric-literal source-file)))

(defn full-width
  ^js [json-minus-numeric-literal]
  (.getFullWidth ^js json-minus-numeric-literal))

(defn leading-trivia-width
  (^js [json-minus-numeric-literal]
   (.getLeadingTriviaWidth ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getLeadingTriviaWidth ^js json-minus-numeric-literal source-file)))

(defn full-text
  (^js [json-minus-numeric-literal]
   (.getFullText ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getFullText ^js json-minus-numeric-literal source-file)))

(defn text
  (^js [json-minus-numeric-literal]
   (.getText ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getText ^js json-minus-numeric-literal source-file)))

(defn first-token
  (^js [json-minus-numeric-literal]
   (.getFirstToken ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getFirstToken ^js json-minus-numeric-literal source-file)))

(defn last-token
  (^js [json-minus-numeric-literal]
   (.getLastToken ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getLastToken ^js json-minus-numeric-literal source-file)))

(defn for-each-child
  (^js [json-minus-numeric-literal cb-node]
   (.forEachChild ^js json-minus-numeric-literal cb-node))
  (^js [json-minus-numeric-literal cb-node cb-node-array]
   (.forEachChild ^js json-minus-numeric-literal cb-node cb-node-array)))

(defn decorators
  ^js [json-minus-numeric-literal]
  (.-decorators ^js json-minus-numeric-literal))

(defn modifiers
  ^js [json-minus-numeric-literal]
  (.-modifiers ^js json-minus-numeric-literal))

(defn pos
  ^js [json-minus-numeric-literal]
  (.-pos ^js json-minus-numeric-literal))

(defn end
  ^js [json-minus-numeric-literal]
  (.-end ^js json-minus-numeric-literal))
