(ns dots.typescript.template-expression)

(defn kind
  ^js [template-expression]
  (.-kind ^js template-expression))

(defn head
  ^js [template-expression]
  (.-head ^js template-expression))

(defn template-spans
  ^js [template-expression]
  (.-templateSpans ^js template-expression))

(defn flags
  ^js [template-expression]
  (.-flags ^js template-expression))

(defn parent
  ^js [template-expression]
  (.-parent ^js template-expression))

(defn source-file
  ^js [template-expression]
  (.getSourceFile ^js template-expression))

(defn child-count
  (^js [template-expression]
   (.getChildCount ^js template-expression))
  (^js [template-expression source-file]
   (.getChildCount ^js template-expression source-file)))

(defn child-at
  (^js [template-expression index]
   (.getChildAt ^js template-expression index))
  (^js [template-expression index source-file]
   (.getChildAt ^js template-expression index source-file)))

(defn children
  (^js [template-expression]
   (.getChildren ^js template-expression))
  (^js [template-expression source-file]
   (.getChildren ^js template-expression source-file)))

(defn start
  (^js [template-expression]
   (.getStart ^js template-expression))
  (^js [template-expression source-file]
   (.getStart ^js template-expression source-file))
  (^js [template-expression source-file include-js-doc-comment?]
   (.getStart ^js template-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [template-expression]
  (.getFullStart ^js template-expression))

(defn get-end
  ^js [template-expression]
  (.getEnd ^js template-expression))

(defn width
  (^js [template-expression]
   (.getWidth ^js template-expression))
  (^js [template-expression source-file]
   (.getWidth ^js template-expression source-file)))

(defn full-width
  ^js [template-expression]
  (.getFullWidth ^js template-expression))

(defn leading-trivia-width
  (^js [template-expression]
   (.getLeadingTriviaWidth ^js template-expression))
  (^js [template-expression source-file]
   (.getLeadingTriviaWidth ^js template-expression source-file)))

(defn full-text
  (^js [template-expression]
   (.getFullText ^js template-expression))
  (^js [template-expression source-file]
   (.getFullText ^js template-expression source-file)))

(defn text
  (^js [template-expression]
   (.getText ^js template-expression))
  (^js [template-expression source-file]
   (.getText ^js template-expression source-file)))

(defn first-token
  (^js [template-expression]
   (.getFirstToken ^js template-expression))
  (^js [template-expression source-file]
   (.getFirstToken ^js template-expression source-file)))

(defn last-token
  (^js [template-expression]
   (.getLastToken ^js template-expression))
  (^js [template-expression source-file]
   (.getLastToken ^js template-expression source-file)))

(defn for-each-child
  (^js [template-expression cb-node]
   (.forEachChild ^js template-expression cb-node))
  (^js [template-expression cb-node cb-node-array]
   (.forEachChild ^js template-expression cb-node cb-node-array)))

(defn decorators
  ^js [template-expression]
  (.-decorators ^js template-expression))

(defn modifiers
  ^js [template-expression]
  (.-modifiers ^js template-expression))

(defn pos
  ^js [template-expression]
  (.-pos ^js template-expression))

(defn end
  ^js [template-expression]
  (.-end ^js template-expression))
