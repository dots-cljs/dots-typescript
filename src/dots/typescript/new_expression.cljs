(ns dots.typescript.new-expression)

(defn kind
  ^js [new-expression]
  (.-kind ^js new-expression))

(defn expression
  ^js [new-expression]
  (.-expression ^js new-expression))

(defn type-arguments
  ^js [new-expression]
  (.-typeArguments ^js new-expression))

(defn arguments
  ^js [new-expression]
  (.-arguments ^js new-expression))

(defn flags
  ^js [new-expression]
  (.-flags ^js new-expression))

(defn parent
  ^js [new-expression]
  (.-parent ^js new-expression))

(defn source-file
  ^js [new-expression]
  (.getSourceFile ^js new-expression))

(defn child-count
  (^js [new-expression]
   (.getChildCount ^js new-expression))
  (^js [new-expression source-file]
   (.getChildCount ^js new-expression source-file)))

(defn child-at
  (^js [new-expression index]
   (.getChildAt ^js new-expression index))
  (^js [new-expression index source-file]
   (.getChildAt ^js new-expression index source-file)))

(defn children
  (^js [new-expression]
   (.getChildren ^js new-expression))
  (^js [new-expression source-file]
   (.getChildren ^js new-expression source-file)))

(defn start
  (^js [new-expression]
   (.getStart ^js new-expression))
  (^js [new-expression source-file]
   (.getStart ^js new-expression source-file))
  (^js [new-expression source-file include-js-doc-comment?]
   (.getStart ^js new-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [new-expression]
  (.getFullStart ^js new-expression))

(defn get-end
  ^js [new-expression]
  (.getEnd ^js new-expression))

(defn width
  (^js [new-expression]
   (.getWidth ^js new-expression))
  (^js [new-expression source-file]
   (.getWidth ^js new-expression source-file)))

(defn full-width
  ^js [new-expression]
  (.getFullWidth ^js new-expression))

(defn leading-trivia-width
  (^js [new-expression]
   (.getLeadingTriviaWidth ^js new-expression))
  (^js [new-expression source-file]
   (.getLeadingTriviaWidth ^js new-expression source-file)))

(defn full-text
  (^js [new-expression]
   (.getFullText ^js new-expression))
  (^js [new-expression source-file]
   (.getFullText ^js new-expression source-file)))

(defn text
  (^js [new-expression]
   (.getText ^js new-expression))
  (^js [new-expression source-file]
   (.getText ^js new-expression source-file)))

(defn first-token
  (^js [new-expression]
   (.getFirstToken ^js new-expression))
  (^js [new-expression source-file]
   (.getFirstToken ^js new-expression source-file)))

(defn last-token
  (^js [new-expression]
   (.getLastToken ^js new-expression))
  (^js [new-expression source-file]
   (.getLastToken ^js new-expression source-file)))

(defn for-each-child
  (^js [new-expression cb-node]
   (.forEachChild ^js new-expression cb-node))
  (^js [new-expression cb-node cb-node-array]
   (.forEachChild ^js new-expression cb-node cb-node-array)))

(defn decorators
  ^js [new-expression]
  (.-decorators ^js new-expression))

(defn modifiers
  ^js [new-expression]
  (.-modifiers ^js new-expression))

(defn pos
  ^js [new-expression]
  (.-pos ^js new-expression))

(defn end
  ^js [new-expression]
  (.-end ^js new-expression))
