(ns dots.typescript.assert-clause)

(defn kind
  ^js [assert-clause]
  (.-kind ^js assert-clause))

(defn parent
  ^js [assert-clause]
  (.-parent ^js assert-clause))

(defn elements
  ^js [assert-clause]
  (.-elements ^js assert-clause))

(defn multi-line?
  ^js [assert-clause]
  (.-multiLine ^js assert-clause))

(defn flags
  ^js [assert-clause]
  (.-flags ^js assert-clause))

(defn source-file
  ^js [assert-clause]
  (.getSourceFile ^js assert-clause))

(defn child-count
  (^js [assert-clause]
   (.getChildCount ^js assert-clause))
  (^js [assert-clause source-file]
   (.getChildCount ^js assert-clause source-file)))

(defn child-at
  (^js [assert-clause index]
   (.getChildAt ^js assert-clause index))
  (^js [assert-clause index source-file]
   (.getChildAt ^js assert-clause index source-file)))

(defn children
  (^js [assert-clause]
   (.getChildren ^js assert-clause))
  (^js [assert-clause source-file]
   (.getChildren ^js assert-clause source-file)))

(defn start
  (^js [assert-clause]
   (.getStart ^js assert-clause))
  (^js [assert-clause source-file]
   (.getStart ^js assert-clause source-file))
  (^js [assert-clause source-file include-js-doc-comment?]
   (.getStart ^js assert-clause source-file include-js-doc-comment?)))

(defn full-start
  ^js [assert-clause]
  (.getFullStart ^js assert-clause))

(defn get-end
  ^js [assert-clause]
  (.getEnd ^js assert-clause))

(defn width
  (^js [assert-clause]
   (.getWidth ^js assert-clause))
  (^js [assert-clause source-file]
   (.getWidth ^js assert-clause source-file)))

(defn full-width
  ^js [assert-clause]
  (.getFullWidth ^js assert-clause))

(defn leading-trivia-width
  (^js [assert-clause]
   (.getLeadingTriviaWidth ^js assert-clause))
  (^js [assert-clause source-file]
   (.getLeadingTriviaWidth ^js assert-clause source-file)))

(defn full-text
  (^js [assert-clause]
   (.getFullText ^js assert-clause))
  (^js [assert-clause source-file]
   (.getFullText ^js assert-clause source-file)))

(defn text
  (^js [assert-clause]
   (.getText ^js assert-clause))
  (^js [assert-clause source-file]
   (.getText ^js assert-clause source-file)))

(defn first-token
  (^js [assert-clause]
   (.getFirstToken ^js assert-clause))
  (^js [assert-clause source-file]
   (.getFirstToken ^js assert-clause source-file)))

(defn last-token
  (^js [assert-clause]
   (.getLastToken ^js assert-clause))
  (^js [assert-clause source-file]
   (.getLastToken ^js assert-clause source-file)))

(defn for-each-child
  (^js [assert-clause cb-node]
   (.forEachChild ^js assert-clause cb-node))
  (^js [assert-clause cb-node cb-node-array]
   (.forEachChild ^js assert-clause cb-node cb-node-array)))

(defn pos
  ^js [assert-clause]
  (.-pos ^js assert-clause))

(defn end
  ^js [assert-clause]
  (.-end ^js assert-clause))
