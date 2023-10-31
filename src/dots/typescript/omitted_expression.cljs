(ns dots.typescript.omitted-expression)

(defn kind
  ^js [omitted-expression]
  (.-kind ^js omitted-expression))

(defn flags
  ^js [omitted-expression]
  (.-flags ^js omitted-expression))

(defn parent
  ^js [omitted-expression]
  (.-parent ^js omitted-expression))

(defn source-file
  ^js [omitted-expression]
  (.getSourceFile ^js omitted-expression))

(defn child-count
  (^js [omitted-expression]
   (.getChildCount ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getChildCount ^js omitted-expression source-file)))

(defn child-at
  (^js [omitted-expression index]
   (.getChildAt ^js omitted-expression index))
  (^js [omitted-expression index source-file]
   (.getChildAt ^js omitted-expression index source-file)))

(defn children
  (^js [omitted-expression]
   (.getChildren ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getChildren ^js omitted-expression source-file)))

(defn start
  (^js [omitted-expression]
   (.getStart ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getStart ^js omitted-expression source-file))
  (^js [omitted-expression source-file include-js-doc-comment?]
   (.getStart ^js omitted-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [omitted-expression]
  (.getFullStart ^js omitted-expression))

(defn get-end
  ^js [omitted-expression]
  (.getEnd ^js omitted-expression))

(defn width
  (^js [omitted-expression]
   (.getWidth ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getWidth ^js omitted-expression source-file)))

(defn full-width
  ^js [omitted-expression]
  (.getFullWidth ^js omitted-expression))

(defn leading-trivia-width
  (^js [omitted-expression]
   (.getLeadingTriviaWidth ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getLeadingTriviaWidth ^js omitted-expression source-file)))

(defn full-text
  (^js [omitted-expression]
   (.getFullText ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getFullText ^js omitted-expression source-file)))

(defn text
  (^js [omitted-expression]
   (.getText ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getText ^js omitted-expression source-file)))

(defn first-token
  (^js [omitted-expression]
   (.getFirstToken ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getFirstToken ^js omitted-expression source-file)))

(defn last-token
  (^js [omitted-expression]
   (.getLastToken ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getLastToken ^js omitted-expression source-file)))

(defn for-each-child
  (^js [omitted-expression cb-node]
   (.forEachChild ^js omitted-expression cb-node))
  (^js [omitted-expression cb-node cb-node-array]
   (.forEachChild ^js omitted-expression cb-node cb-node-array)))

(defn pos
  ^js [omitted-expression]
  (.-pos ^js omitted-expression))

(defn end
  ^js [omitted-expression]
  (.-end ^js omitted-expression))
