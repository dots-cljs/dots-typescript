(ns dots.typescript.this-expression)

(defn kind
  ^js [this-expression]
  (.-kind ^js this-expression))

(defn flags
  ^js [this-expression]
  (.-flags ^js this-expression))

(defn parent
  ^js [this-expression]
  (.-parent ^js this-expression))

(defn source-file
  ^js [this-expression]
  (.getSourceFile ^js this-expression))

(defn child-count
  (^js [this-expression]
   (.getChildCount ^js this-expression))
  (^js [this-expression source-file]
   (.getChildCount ^js this-expression source-file)))

(defn child-at
  (^js [this-expression index]
   (.getChildAt ^js this-expression index))
  (^js [this-expression index source-file]
   (.getChildAt ^js this-expression index source-file)))

(defn children
  (^js [this-expression]
   (.getChildren ^js this-expression))
  (^js [this-expression source-file]
   (.getChildren ^js this-expression source-file)))

(defn start
  (^js [this-expression]
   (.getStart ^js this-expression))
  (^js [this-expression source-file]
   (.getStart ^js this-expression source-file))
  (^js [this-expression source-file include-js-doc-comment?]
   (.getStart ^js this-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [this-expression]
  (.getFullStart ^js this-expression))

(defn get-end
  ^js [this-expression]
  (.getEnd ^js this-expression))

(defn width
  (^js [this-expression]
   (.getWidth ^js this-expression))
  (^js [this-expression source-file]
   (.getWidth ^js this-expression source-file)))

(defn full-width
  ^js [this-expression]
  (.getFullWidth ^js this-expression))

(defn leading-trivia-width
  (^js [this-expression]
   (.getLeadingTriviaWidth ^js this-expression))
  (^js [this-expression source-file]
   (.getLeadingTriviaWidth ^js this-expression source-file)))

(defn full-text
  (^js [this-expression]
   (.getFullText ^js this-expression))
  (^js [this-expression source-file]
   (.getFullText ^js this-expression source-file)))

(defn text
  (^js [this-expression]
   (.getText ^js this-expression))
  (^js [this-expression source-file]
   (.getText ^js this-expression source-file)))

(defn first-token
  (^js [this-expression]
   (.getFirstToken ^js this-expression))
  (^js [this-expression source-file]
   (.getFirstToken ^js this-expression source-file)))

(defn last-token
  (^js [this-expression]
   (.getLastToken ^js this-expression))
  (^js [this-expression source-file]
   (.getLastToken ^js this-expression source-file)))

(defn for-each-child
  (^js [this-expression cb-node]
   (.forEachChild ^js this-expression cb-node))
  (^js [this-expression cb-node cb-node-array]
   (.forEachChild ^js this-expression cb-node cb-node-array)))

(defn pos
  ^js [this-expression]
  (.-pos ^js this-expression))

(defn end
  ^js [this-expression]
  (.-end ^js this-expression))
