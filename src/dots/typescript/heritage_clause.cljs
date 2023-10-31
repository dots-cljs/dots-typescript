(ns dots.typescript.heritage-clause)

(defn kind
  ^js [heritage-clause]
  (.-kind ^js heritage-clause))

(defn parent
  ^js [heritage-clause]
  (.-parent ^js heritage-clause))

(defn token
  ^js [heritage-clause]
  (.-token ^js heritage-clause))

(defn types
  ^js [heritage-clause]
  (.-types ^js heritage-clause))

(defn flags
  ^js [heritage-clause]
  (.-flags ^js heritage-clause))

(defn source-file
  ^js [heritage-clause]
  (.getSourceFile ^js heritage-clause))

(defn child-count
  (^js [heritage-clause]
   (.getChildCount ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getChildCount ^js heritage-clause source-file)))

(defn child-at
  (^js [heritage-clause index]
   (.getChildAt ^js heritage-clause index))
  (^js [heritage-clause index source-file]
   (.getChildAt ^js heritage-clause index source-file)))

(defn children
  (^js [heritage-clause]
   (.getChildren ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getChildren ^js heritage-clause source-file)))

(defn start
  (^js [heritage-clause]
   (.getStart ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getStart ^js heritage-clause source-file))
  (^js [heritage-clause source-file include-js-doc-comment?]
   (.getStart ^js heritage-clause source-file include-js-doc-comment?)))

(defn full-start
  ^js [heritage-clause]
  (.getFullStart ^js heritage-clause))

(defn get-end
  ^js [heritage-clause]
  (.getEnd ^js heritage-clause))

(defn width
  (^js [heritage-clause]
   (.getWidth ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getWidth ^js heritage-clause source-file)))

(defn full-width
  ^js [heritage-clause]
  (.getFullWidth ^js heritage-clause))

(defn leading-trivia-width
  (^js [heritage-clause]
   (.getLeadingTriviaWidth ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getLeadingTriviaWidth ^js heritage-clause source-file)))

(defn full-text
  (^js [heritage-clause]
   (.getFullText ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getFullText ^js heritage-clause source-file)))

(defn text
  (^js [heritage-clause]
   (.getText ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getText ^js heritage-clause source-file)))

(defn first-token
  (^js [heritage-clause]
   (.getFirstToken ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getFirstToken ^js heritage-clause source-file)))

(defn last-token
  (^js [heritage-clause]
   (.getLastToken ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getLastToken ^js heritage-clause source-file)))

(defn for-each-child
  (^js [heritage-clause cb-node]
   (.forEachChild ^js heritage-clause cb-node))
  (^js [heritage-clause cb-node cb-node-array]
   (.forEachChild ^js heritage-clause cb-node cb-node-array)))

(defn pos
  ^js [heritage-clause]
  (.-pos ^js heritage-clause))

(defn end
  ^js [heritage-clause]
  (.-end ^js heritage-clause))
