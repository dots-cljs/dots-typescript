(ns dots.typescript.tagged-template-expression)

(defn kind
  ^js [tagged-template-expression]
  (.-kind ^js tagged-template-expression))

(defn tag
  ^js [tagged-template-expression]
  (.-tag ^js tagged-template-expression))

(defn type-arguments
  ^js [tagged-template-expression]
  (.-typeArguments ^js tagged-template-expression))

(defn template
  ^js [tagged-template-expression]
  (.-template ^js tagged-template-expression))

(defn flags
  ^js [tagged-template-expression]
  (.-flags ^js tagged-template-expression))

(defn parent
  ^js [tagged-template-expression]
  (.-parent ^js tagged-template-expression))

(defn source-file
  ^js [tagged-template-expression]
  (.getSourceFile ^js tagged-template-expression))

(defn child-count
  (^js [tagged-template-expression]
   (.getChildCount ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getChildCount ^js tagged-template-expression source-file)))

(defn child-at
  (^js [tagged-template-expression index]
   (.getChildAt ^js tagged-template-expression index))
  (^js [tagged-template-expression index source-file]
   (.getChildAt ^js tagged-template-expression index source-file)))

(defn children
  (^js [tagged-template-expression]
   (.getChildren ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getChildren ^js tagged-template-expression source-file)))

(defn start
  (^js [tagged-template-expression]
   (.getStart ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getStart ^js tagged-template-expression source-file))
  (^js [tagged-template-expression source-file include-js-doc-comment?]
   (.getStart ^js tagged-template-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [tagged-template-expression]
  (.getFullStart ^js tagged-template-expression))

(defn get-end
  ^js [tagged-template-expression]
  (.getEnd ^js tagged-template-expression))

(defn width
  (^js [tagged-template-expression]
   (.getWidth ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getWidth ^js tagged-template-expression source-file)))

(defn full-width
  ^js [tagged-template-expression]
  (.getFullWidth ^js tagged-template-expression))

(defn leading-trivia-width
  (^js [tagged-template-expression]
   (.getLeadingTriviaWidth ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getLeadingTriviaWidth ^js tagged-template-expression source-file)))

(defn full-text
  (^js [tagged-template-expression]
   (.getFullText ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getFullText ^js tagged-template-expression source-file)))

(defn text
  (^js [tagged-template-expression]
   (.getText ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getText ^js tagged-template-expression source-file)))

(defn first-token
  (^js [tagged-template-expression]
   (.getFirstToken ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getFirstToken ^js tagged-template-expression source-file)))

(defn last-token
  (^js [tagged-template-expression]
   (.getLastToken ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getLastToken ^js tagged-template-expression source-file)))

(defn for-each-child
  (^js [tagged-template-expression cb-node]
   (.forEachChild ^js tagged-template-expression cb-node))
  (^js [tagged-template-expression cb-node cb-node-array]
   (.forEachChild ^js tagged-template-expression cb-node cb-node-array)))

(defn decorators
  ^js [tagged-template-expression]
  (.-decorators ^js tagged-template-expression))

(defn modifiers
  ^js [tagged-template-expression]
  (.-modifiers ^js tagged-template-expression))

(defn pos
  ^js [tagged-template-expression]
  (.-pos ^js tagged-template-expression))

(defn end
  ^js [tagged-template-expression]
  (.-end ^js tagged-template-expression))
