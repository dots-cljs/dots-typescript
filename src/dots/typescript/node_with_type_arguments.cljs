(ns dots.typescript.node-with-type-arguments)

(defn type-arguments
  ^js [node-with-type-arguments]
  (.-typeArguments ^js node-with-type-arguments))

(defn kind
  ^js [node-with-type-arguments]
  (.-kind ^js node-with-type-arguments))

(defn flags
  ^js [node-with-type-arguments]
  (.-flags ^js node-with-type-arguments))

(defn parent
  ^js [node-with-type-arguments]
  (.-parent ^js node-with-type-arguments))

(defn source-file
  ^js [node-with-type-arguments]
  (.getSourceFile ^js node-with-type-arguments))

(defn child-count
  (^js [node-with-type-arguments]
   (.getChildCount ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getChildCount ^js node-with-type-arguments source-file)))

(defn child-at
  (^js [node-with-type-arguments index]
   (.getChildAt ^js node-with-type-arguments index))
  (^js [node-with-type-arguments index source-file]
   (.getChildAt ^js node-with-type-arguments index source-file)))

(defn children
  (^js [node-with-type-arguments]
   (.getChildren ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getChildren ^js node-with-type-arguments source-file)))

(defn start
  (^js [node-with-type-arguments]
   (.getStart ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getStart ^js node-with-type-arguments source-file))
  (^js [node-with-type-arguments source-file include-js-doc-comment?]
   (.getStart ^js node-with-type-arguments source-file include-js-doc-comment?)))

(defn full-start
  ^js [node-with-type-arguments]
  (.getFullStart ^js node-with-type-arguments))

(defn get-end
  ^js [node-with-type-arguments]
  (.getEnd ^js node-with-type-arguments))

(defn width
  (^js [node-with-type-arguments]
   (.getWidth ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getWidth ^js node-with-type-arguments source-file)))

(defn full-width
  ^js [node-with-type-arguments]
  (.getFullWidth ^js node-with-type-arguments))

(defn leading-trivia-width
  (^js [node-with-type-arguments]
   (.getLeadingTriviaWidth ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getLeadingTriviaWidth ^js node-with-type-arguments source-file)))

(defn full-text
  (^js [node-with-type-arguments]
   (.getFullText ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getFullText ^js node-with-type-arguments source-file)))

(defn text
  (^js [node-with-type-arguments]
   (.getText ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getText ^js node-with-type-arguments source-file)))

(defn first-token
  (^js [node-with-type-arguments]
   (.getFirstToken ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getFirstToken ^js node-with-type-arguments source-file)))

(defn last-token
  (^js [node-with-type-arguments]
   (.getLastToken ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getLastToken ^js node-with-type-arguments source-file)))

(defn for-each-child
  (^js [node-with-type-arguments cb-node]
   (.forEachChild ^js node-with-type-arguments cb-node))
  (^js [node-with-type-arguments cb-node cb-node-array]
   (.forEachChild ^js node-with-type-arguments cb-node cb-node-array)))

(defn decorators
  ^js [node-with-type-arguments]
  (.-decorators ^js node-with-type-arguments))

(defn modifiers
  ^js [node-with-type-arguments]
  (.-modifiers ^js node-with-type-arguments))

(defn pos
  ^js [node-with-type-arguments]
  (.-pos ^js node-with-type-arguments))

(defn end
  ^js [node-with-type-arguments]
  (.-end ^js node-with-type-arguments))
