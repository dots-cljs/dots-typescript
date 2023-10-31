(ns dots.typescript.delete-expression)

(defn kind
  ^js [delete-expression]
  (.-kind ^js delete-expression))

(defn expression
  ^js [delete-expression]
  (.-expression ^js delete-expression))

(defn flags
  ^js [delete-expression]
  (.-flags ^js delete-expression))

(defn parent
  ^js [delete-expression]
  (.-parent ^js delete-expression))

(defn source-file
  ^js [delete-expression]
  (.getSourceFile ^js delete-expression))

(defn child-count
  (^js [delete-expression]
   (.getChildCount ^js delete-expression))
  (^js [delete-expression source-file]
   (.getChildCount ^js delete-expression source-file)))

(defn child-at
  (^js [delete-expression index]
   (.getChildAt ^js delete-expression index))
  (^js [delete-expression index source-file]
   (.getChildAt ^js delete-expression index source-file)))

(defn children
  (^js [delete-expression]
   (.getChildren ^js delete-expression))
  (^js [delete-expression source-file]
   (.getChildren ^js delete-expression source-file)))

(defn start
  (^js [delete-expression]
   (.getStart ^js delete-expression))
  (^js [delete-expression source-file]
   (.getStart ^js delete-expression source-file))
  (^js [delete-expression source-file include-js-doc-comment?]
   (.getStart ^js delete-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [delete-expression]
  (.getFullStart ^js delete-expression))

(defn get-end
  ^js [delete-expression]
  (.getEnd ^js delete-expression))

(defn width
  (^js [delete-expression]
   (.getWidth ^js delete-expression))
  (^js [delete-expression source-file]
   (.getWidth ^js delete-expression source-file)))

(defn full-width
  ^js [delete-expression]
  (.getFullWidth ^js delete-expression))

(defn leading-trivia-width
  (^js [delete-expression]
   (.getLeadingTriviaWidth ^js delete-expression))
  (^js [delete-expression source-file]
   (.getLeadingTriviaWidth ^js delete-expression source-file)))

(defn full-text
  (^js [delete-expression]
   (.getFullText ^js delete-expression))
  (^js [delete-expression source-file]
   (.getFullText ^js delete-expression source-file)))

(defn text
  (^js [delete-expression]
   (.getText ^js delete-expression))
  (^js [delete-expression source-file]
   (.getText ^js delete-expression source-file)))

(defn first-token
  (^js [delete-expression]
   (.getFirstToken ^js delete-expression))
  (^js [delete-expression source-file]
   (.getFirstToken ^js delete-expression source-file)))

(defn last-token
  (^js [delete-expression]
   (.getLastToken ^js delete-expression))
  (^js [delete-expression source-file]
   (.getLastToken ^js delete-expression source-file)))

(defn for-each-child
  (^js [delete-expression cb-node]
   (.forEachChild ^js delete-expression cb-node))
  (^js [delete-expression cb-node cb-node-array]
   (.forEachChild ^js delete-expression cb-node cb-node-array)))

(defn pos
  ^js [delete-expression]
  (.-pos ^js delete-expression))

(defn end
  ^js [delete-expression]
  (.-end ^js delete-expression))
