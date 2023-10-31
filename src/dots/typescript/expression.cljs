(ns dots.typescript.expression)

(defn kind
  ^js [expression]
  (.-kind ^js expression))

(defn flags
  ^js [expression]
  (.-flags ^js expression))

(defn parent
  ^js [expression]
  (.-parent ^js expression))

(defn source-file
  ^js [expression]
  (.getSourceFile ^js expression))

(defn child-count
  (^js [expression]
   (.getChildCount ^js expression))
  (^js [expression source-file]
   (.getChildCount ^js expression source-file)))

(defn child-at
  (^js [expression index]
   (.getChildAt ^js expression index))
  (^js [expression index source-file]
   (.getChildAt ^js expression index source-file)))

(defn children
  (^js [expression]
   (.getChildren ^js expression))
  (^js [expression source-file]
   (.getChildren ^js expression source-file)))

(defn start
  (^js [expression]
   (.getStart ^js expression))
  (^js [expression source-file]
   (.getStart ^js expression source-file))
  (^js [expression source-file include-js-doc-comment?]
   (.getStart ^js expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [expression]
  (.getFullStart ^js expression))

(defn get-end
  ^js [expression]
  (.getEnd ^js expression))

(defn width
  (^js [expression]
   (.getWidth ^js expression))
  (^js [expression source-file]
   (.getWidth ^js expression source-file)))

(defn full-width
  ^js [expression]
  (.getFullWidth ^js expression))

(defn leading-trivia-width
  (^js [expression]
   (.getLeadingTriviaWidth ^js expression))
  (^js [expression source-file]
   (.getLeadingTriviaWidth ^js expression source-file)))

(defn full-text
  (^js [expression]
   (.getFullText ^js expression))
  (^js [expression source-file]
   (.getFullText ^js expression source-file)))

(defn text
  (^js [expression]
   (.getText ^js expression))
  (^js [expression source-file]
   (.getText ^js expression source-file)))

(defn first-token
  (^js [expression]
   (.getFirstToken ^js expression))
  (^js [expression source-file]
   (.getFirstToken ^js expression source-file)))

(defn last-token
  (^js [expression]
   (.getLastToken ^js expression))
  (^js [expression source-file]
   (.getLastToken ^js expression source-file)))

(defn for-each-child
  (^js [expression cb-node]
   (.forEachChild ^js expression cb-node))
  (^js [expression cb-node cb-node-array]
   (.forEachChild ^js expression cb-node cb-node-array)))

(defn decorators
  ^js [expression]
  (.-decorators ^js expression))

(defn modifiers
  ^js [expression]
  (.-modifiers ^js expression))

(defn pos
  ^js [expression]
  (.-pos ^js expression))

(defn end
  ^js [expression]
  (.-end ^js expression))
