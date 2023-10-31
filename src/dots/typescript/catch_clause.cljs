(ns dots.typescript.catch-clause)

(defn kind
  ^js [catch-clause]
  (.-kind ^js catch-clause))

(defn parent
  ^js [catch-clause]
  (.-parent ^js catch-clause))

(defn variable-declaration
  ^js [catch-clause]
  (.-variableDeclaration ^js catch-clause))

(defn block
  ^js [catch-clause]
  (.-block ^js catch-clause))

(defn flags
  ^js [catch-clause]
  (.-flags ^js catch-clause))

(defn source-file
  ^js [catch-clause]
  (.getSourceFile ^js catch-clause))

(defn child-count
  (^js [catch-clause]
   (.getChildCount ^js catch-clause))
  (^js [catch-clause source-file]
   (.getChildCount ^js catch-clause source-file)))

(defn child-at
  (^js [catch-clause index]
   (.getChildAt ^js catch-clause index))
  (^js [catch-clause index source-file]
   (.getChildAt ^js catch-clause index source-file)))

(defn children
  (^js [catch-clause]
   (.getChildren ^js catch-clause))
  (^js [catch-clause source-file]
   (.getChildren ^js catch-clause source-file)))

(defn start
  (^js [catch-clause]
   (.getStart ^js catch-clause))
  (^js [catch-clause source-file]
   (.getStart ^js catch-clause source-file))
  (^js [catch-clause source-file include-js-doc-comment?]
   (.getStart ^js catch-clause source-file include-js-doc-comment?)))

(defn full-start
  ^js [catch-clause]
  (.getFullStart ^js catch-clause))

(defn get-end
  ^js [catch-clause]
  (.getEnd ^js catch-clause))

(defn width
  (^js [catch-clause]
   (.getWidth ^js catch-clause))
  (^js [catch-clause source-file]
   (.getWidth ^js catch-clause source-file)))

(defn full-width
  ^js [catch-clause]
  (.getFullWidth ^js catch-clause))

(defn leading-trivia-width
  (^js [catch-clause]
   (.getLeadingTriviaWidth ^js catch-clause))
  (^js [catch-clause source-file]
   (.getLeadingTriviaWidth ^js catch-clause source-file)))

(defn full-text
  (^js [catch-clause]
   (.getFullText ^js catch-clause))
  (^js [catch-clause source-file]
   (.getFullText ^js catch-clause source-file)))

(defn text
  (^js [catch-clause]
   (.getText ^js catch-clause))
  (^js [catch-clause source-file]
   (.getText ^js catch-clause source-file)))

(defn first-token
  (^js [catch-clause]
   (.getFirstToken ^js catch-clause))
  (^js [catch-clause source-file]
   (.getFirstToken ^js catch-clause source-file)))

(defn last-token
  (^js [catch-clause]
   (.getLastToken ^js catch-clause))
  (^js [catch-clause source-file]
   (.getLastToken ^js catch-clause source-file)))

(defn for-each-child
  (^js [catch-clause cb-node]
   (.forEachChild ^js catch-clause cb-node))
  (^js [catch-clause cb-node cb-node-array]
   (.forEachChild ^js catch-clause cb-node cb-node-array)))

(defn decorators
  ^js [catch-clause]
  (.-decorators ^js catch-clause))

(defn modifiers
  ^js [catch-clause]
  (.-modifiers ^js catch-clause))

(defn pos
  ^js [catch-clause]
  (.-pos ^js catch-clause))

(defn end
  ^js [catch-clause]
  (.-end ^js catch-clause))
