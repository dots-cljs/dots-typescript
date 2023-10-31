(ns dots.typescript.import-expression)

(defn kind
  ^js [import-expression]
  (.-kind ^js import-expression))

(defn flags
  ^js [import-expression]
  (.-flags ^js import-expression))

(defn parent
  ^js [import-expression]
  (.-parent ^js import-expression))

(defn source-file
  ^js [import-expression]
  (.getSourceFile ^js import-expression))

(defn child-count
  (^js [import-expression]
   (.getChildCount ^js import-expression))
  (^js [import-expression source-file]
   (.getChildCount ^js import-expression source-file)))

(defn child-at
  (^js [import-expression index]
   (.getChildAt ^js import-expression index))
  (^js [import-expression index source-file]
   (.getChildAt ^js import-expression index source-file)))

(defn children
  (^js [import-expression]
   (.getChildren ^js import-expression))
  (^js [import-expression source-file]
   (.getChildren ^js import-expression source-file)))

(defn start
  (^js [import-expression]
   (.getStart ^js import-expression))
  (^js [import-expression source-file]
   (.getStart ^js import-expression source-file))
  (^js [import-expression source-file include-js-doc-comment?]
   (.getStart ^js import-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [import-expression]
  (.getFullStart ^js import-expression))

(defn get-end
  ^js [import-expression]
  (.getEnd ^js import-expression))

(defn width
  (^js [import-expression]
   (.getWidth ^js import-expression))
  (^js [import-expression source-file]
   (.getWidth ^js import-expression source-file)))

(defn full-width
  ^js [import-expression]
  (.getFullWidth ^js import-expression))

(defn leading-trivia-width
  (^js [import-expression]
   (.getLeadingTriviaWidth ^js import-expression))
  (^js [import-expression source-file]
   (.getLeadingTriviaWidth ^js import-expression source-file)))

(defn full-text
  (^js [import-expression]
   (.getFullText ^js import-expression))
  (^js [import-expression source-file]
   (.getFullText ^js import-expression source-file)))

(defn text
  (^js [import-expression]
   (.getText ^js import-expression))
  (^js [import-expression source-file]
   (.getText ^js import-expression source-file)))

(defn first-token
  (^js [import-expression]
   (.getFirstToken ^js import-expression))
  (^js [import-expression source-file]
   (.getFirstToken ^js import-expression source-file)))

(defn last-token
  (^js [import-expression]
   (.getLastToken ^js import-expression))
  (^js [import-expression source-file]
   (.getLastToken ^js import-expression source-file)))

(defn for-each-child
  (^js [import-expression cb-node]
   (.forEachChild ^js import-expression cb-node))
  (^js [import-expression cb-node cb-node-array]
   (.forEachChild ^js import-expression cb-node cb-node-array)))

(defn pos
  ^js [import-expression]
  (.-pos ^js import-expression))

(defn end
  ^js [import-expression]
  (.-end ^js import-expression))
