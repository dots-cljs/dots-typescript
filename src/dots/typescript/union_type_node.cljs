(ns dots.typescript.union-type-node)

(defn kind
  ^js [union-type-node]
  (.-kind ^js union-type-node))

(defn types
  ^js [union-type-node]
  (.-types ^js union-type-node))

(defn flags
  ^js [union-type-node]
  (.-flags ^js union-type-node))

(defn parent
  ^js [union-type-node]
  (.-parent ^js union-type-node))

(defn source-file
  ^js [union-type-node]
  (.getSourceFile ^js union-type-node))

(defn child-count
  (^js [union-type-node]
   (.getChildCount ^js union-type-node))
  (^js [union-type-node source-file]
   (.getChildCount ^js union-type-node source-file)))

(defn child-at
  (^js [union-type-node index]
   (.getChildAt ^js union-type-node index))
  (^js [union-type-node index source-file]
   (.getChildAt ^js union-type-node index source-file)))

(defn children
  (^js [union-type-node]
   (.getChildren ^js union-type-node))
  (^js [union-type-node source-file]
   (.getChildren ^js union-type-node source-file)))

(defn start
  (^js [union-type-node]
   (.getStart ^js union-type-node))
  (^js [union-type-node source-file]
   (.getStart ^js union-type-node source-file))
  (^js [union-type-node source-file include-js-doc-comment?]
   (.getStart ^js union-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [union-type-node]
  (.getFullStart ^js union-type-node))

(defn get-end
  ^js [union-type-node]
  (.getEnd ^js union-type-node))

(defn width
  (^js [union-type-node]
   (.getWidth ^js union-type-node))
  (^js [union-type-node source-file]
   (.getWidth ^js union-type-node source-file)))

(defn full-width
  ^js [union-type-node]
  (.getFullWidth ^js union-type-node))

(defn leading-trivia-width
  (^js [union-type-node]
   (.getLeadingTriviaWidth ^js union-type-node))
  (^js [union-type-node source-file]
   (.getLeadingTriviaWidth ^js union-type-node source-file)))

(defn full-text
  (^js [union-type-node]
   (.getFullText ^js union-type-node))
  (^js [union-type-node source-file]
   (.getFullText ^js union-type-node source-file)))

(defn text
  (^js [union-type-node]
   (.getText ^js union-type-node))
  (^js [union-type-node source-file]
   (.getText ^js union-type-node source-file)))

(defn first-token
  (^js [union-type-node]
   (.getFirstToken ^js union-type-node))
  (^js [union-type-node source-file]
   (.getFirstToken ^js union-type-node source-file)))

(defn last-token
  (^js [union-type-node]
   (.getLastToken ^js union-type-node))
  (^js [union-type-node source-file]
   (.getLastToken ^js union-type-node source-file)))

(defn for-each-child
  (^js [union-type-node cb-node]
   (.forEachChild ^js union-type-node cb-node))
  (^js [union-type-node cb-node cb-node-array]
   (.forEachChild ^js union-type-node cb-node cb-node-array)))

(defn pos
  ^js [union-type-node]
  (.-pos ^js union-type-node))

(defn end
  ^js [union-type-node]
  (.-end ^js union-type-node))
