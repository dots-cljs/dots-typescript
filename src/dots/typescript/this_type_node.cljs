(ns dots.typescript.this-type-node)

(defn kind
  ^js [this-type-node]
  (.-kind ^js this-type-node))

(defn flags
  ^js [this-type-node]
  (.-flags ^js this-type-node))

(defn parent
  ^js [this-type-node]
  (.-parent ^js this-type-node))

(defn source-file
  ^js [this-type-node]
  (.getSourceFile ^js this-type-node))

(defn child-count
  (^js [this-type-node]
   (.getChildCount ^js this-type-node))
  (^js [this-type-node source-file]
   (.getChildCount ^js this-type-node source-file)))

(defn child-at
  (^js [this-type-node index]
   (.getChildAt ^js this-type-node index))
  (^js [this-type-node index source-file]
   (.getChildAt ^js this-type-node index source-file)))

(defn children
  (^js [this-type-node]
   (.getChildren ^js this-type-node))
  (^js [this-type-node source-file]
   (.getChildren ^js this-type-node source-file)))

(defn start
  (^js [this-type-node]
   (.getStart ^js this-type-node))
  (^js [this-type-node source-file]
   (.getStart ^js this-type-node source-file))
  (^js [this-type-node source-file include-js-doc-comment?]
   (.getStart ^js this-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [this-type-node]
  (.getFullStart ^js this-type-node))

(defn get-end
  ^js [this-type-node]
  (.getEnd ^js this-type-node))

(defn width
  (^js [this-type-node]
   (.getWidth ^js this-type-node))
  (^js [this-type-node source-file]
   (.getWidth ^js this-type-node source-file)))

(defn full-width
  ^js [this-type-node]
  (.getFullWidth ^js this-type-node))

(defn leading-trivia-width
  (^js [this-type-node]
   (.getLeadingTriviaWidth ^js this-type-node))
  (^js [this-type-node source-file]
   (.getLeadingTriviaWidth ^js this-type-node source-file)))

(defn full-text
  (^js [this-type-node]
   (.getFullText ^js this-type-node))
  (^js [this-type-node source-file]
   (.getFullText ^js this-type-node source-file)))

(defn text
  (^js [this-type-node]
   (.getText ^js this-type-node))
  (^js [this-type-node source-file]
   (.getText ^js this-type-node source-file)))

(defn first-token
  (^js [this-type-node]
   (.getFirstToken ^js this-type-node))
  (^js [this-type-node source-file]
   (.getFirstToken ^js this-type-node source-file)))

(defn last-token
  (^js [this-type-node]
   (.getLastToken ^js this-type-node))
  (^js [this-type-node source-file]
   (.getLastToken ^js this-type-node source-file)))

(defn for-each-child
  (^js [this-type-node cb-node]
   (.forEachChild ^js this-type-node cb-node))
  (^js [this-type-node cb-node cb-node-array]
   (.forEachChild ^js this-type-node cb-node cb-node-array)))

(defn pos
  ^js [this-type-node]
  (.-pos ^js this-type-node))

(defn end
  ^js [this-type-node]
  (.-end ^js this-type-node))
