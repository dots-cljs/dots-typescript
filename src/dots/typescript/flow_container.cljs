(ns dots.typescript.flow-container)

(defn kind
  ^js [flow-container]
  (.-kind ^js flow-container))

(defn flags
  ^js [flow-container]
  (.-flags ^js flow-container))

(defn parent
  ^js [flow-container]
  (.-parent ^js flow-container))

(defn source-file
  ^js [flow-container]
  (.getSourceFile ^js flow-container))

(defn child-count
  (^js [flow-container]
   (.getChildCount ^js flow-container))
  (^js [flow-container source-file]
   (.getChildCount ^js flow-container source-file)))

(defn child-at
  (^js [flow-container index]
   (.getChildAt ^js flow-container index))
  (^js [flow-container index source-file]
   (.getChildAt ^js flow-container index source-file)))

(defn children
  (^js [flow-container]
   (.getChildren ^js flow-container))
  (^js [flow-container source-file]
   (.getChildren ^js flow-container source-file)))

(defn start
  (^js [flow-container]
   (.getStart ^js flow-container))
  (^js [flow-container source-file]
   (.getStart ^js flow-container source-file))
  (^js [flow-container source-file include-js-doc-comment?]
   (.getStart ^js flow-container source-file include-js-doc-comment?)))

(defn full-start
  ^js [flow-container]
  (.getFullStart ^js flow-container))

(defn get-end
  ^js [flow-container]
  (.getEnd ^js flow-container))

(defn width
  (^js [flow-container]
   (.getWidth ^js flow-container))
  (^js [flow-container source-file]
   (.getWidth ^js flow-container source-file)))

(defn full-width
  ^js [flow-container]
  (.getFullWidth ^js flow-container))

(defn leading-trivia-width
  (^js [flow-container]
   (.getLeadingTriviaWidth ^js flow-container))
  (^js [flow-container source-file]
   (.getLeadingTriviaWidth ^js flow-container source-file)))

(defn full-text
  (^js [flow-container]
   (.getFullText ^js flow-container))
  (^js [flow-container source-file]
   (.getFullText ^js flow-container source-file)))

(defn text
  (^js [flow-container]
   (.getText ^js flow-container))
  (^js [flow-container source-file]
   (.getText ^js flow-container source-file)))

(defn first-token
  (^js [flow-container]
   (.getFirstToken ^js flow-container))
  (^js [flow-container source-file]
   (.getFirstToken ^js flow-container source-file)))

(defn last-token
  (^js [flow-container]
   (.getLastToken ^js flow-container))
  (^js [flow-container source-file]
   (.getLastToken ^js flow-container source-file)))

(defn for-each-child
  (^js [flow-container cb-node]
   (.forEachChild ^js flow-container cb-node))
  (^js [flow-container cb-node cb-node-array]
   (.forEachChild ^js flow-container cb-node cb-node-array)))

(defn pos
  ^js [flow-container]
  (.-pos ^js flow-container))

(defn end
  ^js [flow-container]
  (.-end ^js flow-container))
