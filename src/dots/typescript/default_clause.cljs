(ns dots.typescript.default-clause)

(defn kind
  ^js [default-clause]
  (.-kind ^js default-clause))

(defn parent
  ^js [default-clause]
  (.-parent ^js default-clause))

(defn statements
  ^js [default-clause]
  (.-statements ^js default-clause))

(defn flags
  ^js [default-clause]
  (.-flags ^js default-clause))

(defn source-file
  ^js [default-clause]
  (.getSourceFile ^js default-clause))

(defn child-count
  (^js [default-clause]
   (.getChildCount ^js default-clause))
  (^js [default-clause source-file]
   (.getChildCount ^js default-clause source-file)))

(defn child-at
  (^js [default-clause index]
   (.getChildAt ^js default-clause index))
  (^js [default-clause index source-file]
   (.getChildAt ^js default-clause index source-file)))

(defn children
  (^js [default-clause]
   (.getChildren ^js default-clause))
  (^js [default-clause source-file]
   (.getChildren ^js default-clause source-file)))

(defn start
  (^js [default-clause]
   (.getStart ^js default-clause))
  (^js [default-clause source-file]
   (.getStart ^js default-clause source-file))
  (^js [default-clause source-file include-js-doc-comment?]
   (.getStart ^js default-clause source-file include-js-doc-comment?)))

(defn full-start
  ^js [default-clause]
  (.getFullStart ^js default-clause))

(defn get-end
  ^js [default-clause]
  (.getEnd ^js default-clause))

(defn width
  (^js [default-clause]
   (.getWidth ^js default-clause))
  (^js [default-clause source-file]
   (.getWidth ^js default-clause source-file)))

(defn full-width
  ^js [default-clause]
  (.getFullWidth ^js default-clause))

(defn leading-trivia-width
  (^js [default-clause]
   (.getLeadingTriviaWidth ^js default-clause))
  (^js [default-clause source-file]
   (.getLeadingTriviaWidth ^js default-clause source-file)))

(defn full-text
  (^js [default-clause]
   (.getFullText ^js default-clause))
  (^js [default-clause source-file]
   (.getFullText ^js default-clause source-file)))

(defn text
  (^js [default-clause]
   (.getText ^js default-clause))
  (^js [default-clause source-file]
   (.getText ^js default-clause source-file)))

(defn first-token
  (^js [default-clause]
   (.getFirstToken ^js default-clause))
  (^js [default-clause source-file]
   (.getFirstToken ^js default-clause source-file)))

(defn last-token
  (^js [default-clause]
   (.getLastToken ^js default-clause))
  (^js [default-clause source-file]
   (.getLastToken ^js default-clause source-file)))

(defn for-each-child
  (^js [default-clause cb-node]
   (.forEachChild ^js default-clause cb-node))
  (^js [default-clause cb-node cb-node-array]
   (.forEachChild ^js default-clause cb-node cb-node-array)))

(defn decorators
  ^js [default-clause]
  (.-decorators ^js default-clause))

(defn modifiers
  ^js [default-clause]
  (.-modifiers ^js default-clause))

(defn pos
  ^js [default-clause]
  (.-pos ^js default-clause))

(defn end
  ^js [default-clause]
  (.-end ^js default-clause))
