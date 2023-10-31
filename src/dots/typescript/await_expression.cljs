(ns dots.typescript.await-expression)

(defn kind
  ^js [await-expression]
  (.-kind ^js await-expression))

(defn expression
  ^js [await-expression]
  (.-expression ^js await-expression))

(defn flags
  ^js [await-expression]
  (.-flags ^js await-expression))

(defn parent
  ^js [await-expression]
  (.-parent ^js await-expression))

(defn source-file
  ^js [await-expression]
  (.getSourceFile ^js await-expression))

(defn child-count
  (^js [await-expression]
   (.getChildCount ^js await-expression))
  (^js [await-expression source-file]
   (.getChildCount ^js await-expression source-file)))

(defn child-at
  (^js [await-expression index]
   (.getChildAt ^js await-expression index))
  (^js [await-expression index source-file]
   (.getChildAt ^js await-expression index source-file)))

(defn children
  (^js [await-expression]
   (.getChildren ^js await-expression))
  (^js [await-expression source-file]
   (.getChildren ^js await-expression source-file)))

(defn start
  (^js [await-expression]
   (.getStart ^js await-expression))
  (^js [await-expression source-file]
   (.getStart ^js await-expression source-file))
  (^js [await-expression source-file include-js-doc-comment?]
   (.getStart ^js await-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [await-expression]
  (.getFullStart ^js await-expression))

(defn get-end
  ^js [await-expression]
  (.getEnd ^js await-expression))

(defn width
  (^js [await-expression]
   (.getWidth ^js await-expression))
  (^js [await-expression source-file]
   (.getWidth ^js await-expression source-file)))

(defn full-width
  ^js [await-expression]
  (.getFullWidth ^js await-expression))

(defn leading-trivia-width
  (^js [await-expression]
   (.getLeadingTriviaWidth ^js await-expression))
  (^js [await-expression source-file]
   (.getLeadingTriviaWidth ^js await-expression source-file)))

(defn full-text
  (^js [await-expression]
   (.getFullText ^js await-expression))
  (^js [await-expression source-file]
   (.getFullText ^js await-expression source-file)))

(defn text
  (^js [await-expression]
   (.getText ^js await-expression))
  (^js [await-expression source-file]
   (.getText ^js await-expression source-file)))

(defn first-token
  (^js [await-expression]
   (.getFirstToken ^js await-expression))
  (^js [await-expression source-file]
   (.getFirstToken ^js await-expression source-file)))

(defn last-token
  (^js [await-expression]
   (.getLastToken ^js await-expression))
  (^js [await-expression source-file]
   (.getLastToken ^js await-expression source-file)))

(defn for-each-child
  (^js [await-expression cb-node]
   (.forEachChild ^js await-expression cb-node))
  (^js [await-expression cb-node cb-node-array]
   (.forEachChild ^js await-expression cb-node cb-node-array)))

(defn pos
  ^js [await-expression]
  (.-pos ^js await-expression))

(defn end
  ^js [await-expression]
  (.-end ^js await-expression))
