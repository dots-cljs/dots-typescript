(ns dots.typescript.update-expression)

(defn kind
  ^js [update-expression]
  (.-kind ^js update-expression))

(defn flags
  ^js [update-expression]
  (.-flags ^js update-expression))

(defn parent
  ^js [update-expression]
  (.-parent ^js update-expression))

(defn source-file
  ^js [update-expression]
  (.getSourceFile ^js update-expression))

(defn child-count
  (^js [update-expression]
   (.getChildCount ^js update-expression))
  (^js [update-expression source-file]
   (.getChildCount ^js update-expression source-file)))

(defn child-at
  (^js [update-expression index]
   (.getChildAt ^js update-expression index))
  (^js [update-expression index source-file]
   (.getChildAt ^js update-expression index source-file)))

(defn children
  (^js [update-expression]
   (.getChildren ^js update-expression))
  (^js [update-expression source-file]
   (.getChildren ^js update-expression source-file)))

(defn start
  (^js [update-expression]
   (.getStart ^js update-expression))
  (^js [update-expression source-file]
   (.getStart ^js update-expression source-file))
  (^js [update-expression source-file include-js-doc-comment?]
   (.getStart ^js update-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [update-expression]
  (.getFullStart ^js update-expression))

(defn get-end
  ^js [update-expression]
  (.getEnd ^js update-expression))

(defn width
  (^js [update-expression]
   (.getWidth ^js update-expression))
  (^js [update-expression source-file]
   (.getWidth ^js update-expression source-file)))

(defn full-width
  ^js [update-expression]
  (.getFullWidth ^js update-expression))

(defn leading-trivia-width
  (^js [update-expression]
   (.getLeadingTriviaWidth ^js update-expression))
  (^js [update-expression source-file]
   (.getLeadingTriviaWidth ^js update-expression source-file)))

(defn full-text
  (^js [update-expression]
   (.getFullText ^js update-expression))
  (^js [update-expression source-file]
   (.getFullText ^js update-expression source-file)))

(defn text
  (^js [update-expression]
   (.getText ^js update-expression))
  (^js [update-expression source-file]
   (.getText ^js update-expression source-file)))

(defn first-token
  (^js [update-expression]
   (.getFirstToken ^js update-expression))
  (^js [update-expression source-file]
   (.getFirstToken ^js update-expression source-file)))

(defn last-token
  (^js [update-expression]
   (.getLastToken ^js update-expression))
  (^js [update-expression source-file]
   (.getLastToken ^js update-expression source-file)))

(defn for-each-child
  (^js [update-expression cb-node]
   (.forEachChild ^js update-expression cb-node))
  (^js [update-expression cb-node cb-node-array]
   (.forEachChild ^js update-expression cb-node cb-node-array)))

(defn pos
  ^js [update-expression]
  (.-pos ^js update-expression))

(defn end
  ^js [update-expression]
  (.-end ^js update-expression))
