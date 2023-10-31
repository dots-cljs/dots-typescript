(ns dots.typescript.case-clause)

(defn kind
  ^js [case-clause]
  (.-kind ^js case-clause))

(defn parent
  ^js [case-clause]
  (.-parent ^js case-clause))

(defn expression
  ^js [case-clause]
  (.-expression ^js case-clause))

(defn statements
  ^js [case-clause]
  (.-statements ^js case-clause))

(defn flags
  ^js [case-clause]
  (.-flags ^js case-clause))

(defn source-file
  ^js [case-clause]
  (.getSourceFile ^js case-clause))

(defn child-count
  (^js [case-clause]
   (.getChildCount ^js case-clause))
  (^js [case-clause source-file]
   (.getChildCount ^js case-clause source-file)))

(defn child-at
  (^js [case-clause index]
   (.getChildAt ^js case-clause index))
  (^js [case-clause index source-file]
   (.getChildAt ^js case-clause index source-file)))

(defn children
  (^js [case-clause]
   (.getChildren ^js case-clause))
  (^js [case-clause source-file]
   (.getChildren ^js case-clause source-file)))

(defn start
  (^js [case-clause]
   (.getStart ^js case-clause))
  (^js [case-clause source-file]
   (.getStart ^js case-clause source-file))
  (^js [case-clause source-file include-js-doc-comment?]
   (.getStart ^js case-clause source-file include-js-doc-comment?)))

(defn full-start
  ^js [case-clause]
  (.getFullStart ^js case-clause))

(defn get-end
  ^js [case-clause]
  (.getEnd ^js case-clause))

(defn width
  (^js [case-clause]
   (.getWidth ^js case-clause))
  (^js [case-clause source-file]
   (.getWidth ^js case-clause source-file)))

(defn full-width
  ^js [case-clause]
  (.getFullWidth ^js case-clause))

(defn leading-trivia-width
  (^js [case-clause]
   (.getLeadingTriviaWidth ^js case-clause))
  (^js [case-clause source-file]
   (.getLeadingTriviaWidth ^js case-clause source-file)))

(defn full-text
  (^js [case-clause]
   (.getFullText ^js case-clause))
  (^js [case-clause source-file]
   (.getFullText ^js case-clause source-file)))

(defn text
  (^js [case-clause]
   (.getText ^js case-clause))
  (^js [case-clause source-file]
   (.getText ^js case-clause source-file)))

(defn first-token
  (^js [case-clause]
   (.getFirstToken ^js case-clause))
  (^js [case-clause source-file]
   (.getFirstToken ^js case-clause source-file)))

(defn last-token
  (^js [case-clause]
   (.getLastToken ^js case-clause))
  (^js [case-clause source-file]
   (.getLastToken ^js case-clause source-file)))

(defn for-each-child
  (^js [case-clause cb-node]
   (.forEachChild ^js case-clause cb-node))
  (^js [case-clause cb-node cb-node-array]
   (.forEachChild ^js case-clause cb-node cb-node-array)))

(defn decorators
  ^js [case-clause]
  (.-decorators ^js case-clause))

(defn modifiers
  ^js [case-clause]
  (.-modifiers ^js case-clause))

(defn pos
  ^js [case-clause]
  (.-pos ^js case-clause))

(defn end
  ^js [case-clause]
  (.-end ^js case-clause))
