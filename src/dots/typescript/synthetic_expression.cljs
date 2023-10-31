(ns dots.typescript.synthetic-expression
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [synthetic-expression]
  (.-kind ^js synthetic-expression))

(defn spread?
  ^js [synthetic-expression]
  (.-isSpread ^js synthetic-expression))

(defn type
  ^js [synthetic-expression]
  (.-type ^js synthetic-expression))

(defn tuple-name-source
  ^js [synthetic-expression]
  (.-tupleNameSource ^js synthetic-expression))

(defn flags
  ^js [synthetic-expression]
  (.-flags ^js synthetic-expression))

(defn parent
  ^js [synthetic-expression]
  (.-parent ^js synthetic-expression))

(defn source-file
  ^js [synthetic-expression]
  (.getSourceFile ^js synthetic-expression))

(defn child-count
  (^js [synthetic-expression]
   (.getChildCount ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getChildCount ^js synthetic-expression source-file)))

(defn child-at
  (^js [synthetic-expression index]
   (.getChildAt ^js synthetic-expression index))
  (^js [synthetic-expression index source-file]
   (.getChildAt ^js synthetic-expression index source-file)))

(defn children
  (^js [synthetic-expression]
   (.getChildren ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getChildren ^js synthetic-expression source-file)))

(defn start
  (^js [synthetic-expression]
   (.getStart ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getStart ^js synthetic-expression source-file))
  (^js [synthetic-expression source-file include-js-doc-comment?]
   (.getStart ^js synthetic-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [synthetic-expression]
  (.getFullStart ^js synthetic-expression))

(defn get-end
  ^js [synthetic-expression]
  (.getEnd ^js synthetic-expression))

(defn width
  (^js [synthetic-expression]
   (.getWidth ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getWidth ^js synthetic-expression source-file)))

(defn full-width
  ^js [synthetic-expression]
  (.getFullWidth ^js synthetic-expression))

(defn leading-trivia-width
  (^js [synthetic-expression]
   (.getLeadingTriviaWidth ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getLeadingTriviaWidth ^js synthetic-expression source-file)))

(defn full-text
  (^js [synthetic-expression]
   (.getFullText ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getFullText ^js synthetic-expression source-file)))

(defn text
  (^js [synthetic-expression]
   (.getText ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getText ^js synthetic-expression source-file)))

(defn first-token
  (^js [synthetic-expression]
   (.getFirstToken ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getFirstToken ^js synthetic-expression source-file)))

(defn last-token
  (^js [synthetic-expression]
   (.getLastToken ^js synthetic-expression))
  (^js [synthetic-expression source-file]
   (.getLastToken ^js synthetic-expression source-file)))

(defn for-each-child
  (^js [synthetic-expression cb-node]
   (.forEachChild ^js synthetic-expression cb-node))
  (^js [synthetic-expression cb-node cb-node-array]
   (.forEachChild ^js synthetic-expression cb-node cb-node-array)))

(defn pos
  ^js [synthetic-expression]
  (.-pos ^js synthetic-expression))

(defn end
  ^js [synthetic-expression]
  (.-end ^js synthetic-expression))
