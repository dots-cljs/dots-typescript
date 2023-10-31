(ns dots.typescript.expression-with-type-arguments)

(defn kind
  ^js [expression-with-type-arguments]
  (.-kind ^js expression-with-type-arguments))

(defn expression
  ^js [expression-with-type-arguments]
  (.-expression ^js expression-with-type-arguments))

(defn flags
  ^js [expression-with-type-arguments]
  (.-flags ^js expression-with-type-arguments))

(defn parent
  ^js [expression-with-type-arguments]
  (.-parent ^js expression-with-type-arguments))

(defn source-file
  ^js [expression-with-type-arguments]
  (.getSourceFile ^js expression-with-type-arguments))

(defn child-count
  (^js [expression-with-type-arguments]
   (.getChildCount ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getChildCount ^js expression-with-type-arguments source-file)))

(defn child-at
  (^js [expression-with-type-arguments index]
   (.getChildAt ^js expression-with-type-arguments index))
  (^js [expression-with-type-arguments index source-file]
   (.getChildAt ^js expression-with-type-arguments index source-file)))

(defn children
  (^js [expression-with-type-arguments]
   (.getChildren ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getChildren ^js expression-with-type-arguments source-file)))

(defn start
  (^js [expression-with-type-arguments]
   (.getStart ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getStart ^js expression-with-type-arguments source-file))
  (^js [expression-with-type-arguments source-file include-js-doc-comment?]
   (.getStart ^js expression-with-type-arguments source-file include-js-doc-comment?)))

(defn full-start
  ^js [expression-with-type-arguments]
  (.getFullStart ^js expression-with-type-arguments))

(defn get-end
  ^js [expression-with-type-arguments]
  (.getEnd ^js expression-with-type-arguments))

(defn width
  (^js [expression-with-type-arguments]
   (.getWidth ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getWidth ^js expression-with-type-arguments source-file)))

(defn full-width
  ^js [expression-with-type-arguments]
  (.getFullWidth ^js expression-with-type-arguments))

(defn leading-trivia-width
  (^js [expression-with-type-arguments]
   (.getLeadingTriviaWidth ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getLeadingTriviaWidth ^js expression-with-type-arguments source-file)))

(defn full-text
  (^js [expression-with-type-arguments]
   (.getFullText ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getFullText ^js expression-with-type-arguments source-file)))

(defn text
  (^js [expression-with-type-arguments]
   (.getText ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getText ^js expression-with-type-arguments source-file)))

(defn first-token
  (^js [expression-with-type-arguments]
   (.getFirstToken ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getFirstToken ^js expression-with-type-arguments source-file)))

(defn last-token
  (^js [expression-with-type-arguments]
   (.getLastToken ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getLastToken ^js expression-with-type-arguments source-file)))

(defn for-each-child
  (^js [expression-with-type-arguments cb-node]
   (.forEachChild ^js expression-with-type-arguments cb-node))
  (^js [expression-with-type-arguments cb-node cb-node-array]
   (.forEachChild ^js expression-with-type-arguments cb-node cb-node-array)))

(defn decorators
  ^js [expression-with-type-arguments]
  (.-decorators ^js expression-with-type-arguments))

(defn modifiers
  ^js [expression-with-type-arguments]
  (.-modifiers ^js expression-with-type-arguments))

(defn pos
  ^js [expression-with-type-arguments]
  (.-pos ^js expression-with-type-arguments))

(defn end
  ^js [expression-with-type-arguments]
  (.-end ^js expression-with-type-arguments))

(defn type-arguments
  ^js [expression-with-type-arguments]
  (.-typeArguments ^js expression-with-type-arguments))
