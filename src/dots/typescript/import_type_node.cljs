(ns dots.typescript.import-type-node)

(defn kind
  ^js [import-type-node]
  (.-kind ^js import-type-node))

(defn type-of?
  ^js [import-type-node]
  (.-isTypeOf ^js import-type-node))

(defn argument
  ^js [import-type-node]
  (.-argument ^js import-type-node))

(defn assertions
  ^js [import-type-node]
  (.-assertions ^js import-type-node))

(defn qualifier
  ^js [import-type-node]
  (.-qualifier ^js import-type-node))

(defn type-arguments
  ^js [import-type-node]
  (.-typeArguments ^js import-type-node))

(defn flags
  ^js [import-type-node]
  (.-flags ^js import-type-node))

(defn parent
  ^js [import-type-node]
  (.-parent ^js import-type-node))

(defn source-file
  ^js [import-type-node]
  (.getSourceFile ^js import-type-node))

(defn child-count
  (^js [import-type-node]
   (.getChildCount ^js import-type-node))
  (^js [import-type-node source-file]
   (.getChildCount ^js import-type-node source-file)))

(defn child-at
  (^js [import-type-node index]
   (.getChildAt ^js import-type-node index))
  (^js [import-type-node index source-file]
   (.getChildAt ^js import-type-node index source-file)))

(defn children
  (^js [import-type-node]
   (.getChildren ^js import-type-node))
  (^js [import-type-node source-file]
   (.getChildren ^js import-type-node source-file)))

(defn start
  (^js [import-type-node]
   (.getStart ^js import-type-node))
  (^js [import-type-node source-file]
   (.getStart ^js import-type-node source-file))
  (^js [import-type-node source-file include-js-doc-comment?]
   (.getStart ^js import-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [import-type-node]
  (.getFullStart ^js import-type-node))

(defn get-end
  ^js [import-type-node]
  (.getEnd ^js import-type-node))

(defn width
  (^js [import-type-node]
   (.getWidth ^js import-type-node))
  (^js [import-type-node source-file]
   (.getWidth ^js import-type-node source-file)))

(defn full-width
  ^js [import-type-node]
  (.getFullWidth ^js import-type-node))

(defn leading-trivia-width
  (^js [import-type-node]
   (.getLeadingTriviaWidth ^js import-type-node))
  (^js [import-type-node source-file]
   (.getLeadingTriviaWidth ^js import-type-node source-file)))

(defn full-text
  (^js [import-type-node]
   (.getFullText ^js import-type-node))
  (^js [import-type-node source-file]
   (.getFullText ^js import-type-node source-file)))

(defn text
  (^js [import-type-node]
   (.getText ^js import-type-node))
  (^js [import-type-node source-file]
   (.getText ^js import-type-node source-file)))

(defn first-token
  (^js [import-type-node]
   (.getFirstToken ^js import-type-node))
  (^js [import-type-node source-file]
   (.getFirstToken ^js import-type-node source-file)))

(defn last-token
  (^js [import-type-node]
   (.getLastToken ^js import-type-node))
  (^js [import-type-node source-file]
   (.getLastToken ^js import-type-node source-file)))

(defn for-each-child
  (^js [import-type-node cb-node]
   (.forEachChild ^js import-type-node cb-node))
  (^js [import-type-node cb-node cb-node-array]
   (.forEachChild ^js import-type-node cb-node cb-node-array)))

(defn pos
  ^js [import-type-node]
  (.-pos ^js import-type-node))

(defn end
  ^js [import-type-node]
  (.-end ^js import-type-node))
