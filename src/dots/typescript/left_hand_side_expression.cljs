(ns dots.typescript.left-hand-side-expression)

(defn kind
  ^js [left-hand-side-expression]
  (.-kind ^js left-hand-side-expression))

(defn flags
  ^js [left-hand-side-expression]
  (.-flags ^js left-hand-side-expression))

(defn parent
  ^js [left-hand-side-expression]
  (.-parent ^js left-hand-side-expression))

(defn source-file
  ^js [left-hand-side-expression]
  (.getSourceFile ^js left-hand-side-expression))

(defn child-count
  (^js [left-hand-side-expression]
   (.getChildCount ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getChildCount ^js left-hand-side-expression source-file)))

(defn child-at
  (^js [left-hand-side-expression index]
   (.getChildAt ^js left-hand-side-expression index))
  (^js [left-hand-side-expression index source-file]
   (.getChildAt ^js left-hand-side-expression index source-file)))

(defn children
  (^js [left-hand-side-expression]
   (.getChildren ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getChildren ^js left-hand-side-expression source-file)))

(defn start
  (^js [left-hand-side-expression]
   (.getStart ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getStart ^js left-hand-side-expression source-file))
  (^js [left-hand-side-expression source-file include-js-doc-comment?]
   (.getStart ^js left-hand-side-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [left-hand-side-expression]
  (.getFullStart ^js left-hand-side-expression))

(defn get-end
  ^js [left-hand-side-expression]
  (.getEnd ^js left-hand-side-expression))

(defn width
  (^js [left-hand-side-expression]
   (.getWidth ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getWidth ^js left-hand-side-expression source-file)))

(defn full-width
  ^js [left-hand-side-expression]
  (.getFullWidth ^js left-hand-side-expression))

(defn leading-trivia-width
  (^js [left-hand-side-expression]
   (.getLeadingTriviaWidth ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getLeadingTriviaWidth ^js left-hand-side-expression source-file)))

(defn full-text
  (^js [left-hand-side-expression]
   (.getFullText ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getFullText ^js left-hand-side-expression source-file)))

(defn text
  (^js [left-hand-side-expression]
   (.getText ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getText ^js left-hand-side-expression source-file)))

(defn first-token
  (^js [left-hand-side-expression]
   (.getFirstToken ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getFirstToken ^js left-hand-side-expression source-file)))

(defn last-token
  (^js [left-hand-side-expression]
   (.getLastToken ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getLastToken ^js left-hand-side-expression source-file)))

(defn for-each-child
  (^js [left-hand-side-expression cb-node]
   (.forEachChild ^js left-hand-side-expression cb-node))
  (^js [left-hand-side-expression cb-node cb-node-array]
   (.forEachChild ^js left-hand-side-expression cb-node cb-node-array)))

(defn pos
  ^js [left-hand-side-expression]
  (.-pos ^js left-hand-side-expression))

(defn end
  ^js [left-hand-side-expression]
  (.-end ^js left-hand-side-expression))
