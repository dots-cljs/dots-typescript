(ns dots.typescript.type-operator-node
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [type-operator-node]
  (.-kind ^js type-operator-node))

(defn operator
  ^js [type-operator-node]
  (.-operator ^js type-operator-node))

(defn type
  ^js [type-operator-node]
  (.-type ^js type-operator-node))

(defn flags
  ^js [type-operator-node]
  (.-flags ^js type-operator-node))

(defn parent
  ^js [type-operator-node]
  (.-parent ^js type-operator-node))

(defn source-file
  ^js [type-operator-node]
  (.getSourceFile ^js type-operator-node))

(defn child-count
  (^js [type-operator-node]
   (.getChildCount ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getChildCount ^js type-operator-node source-file)))

(defn child-at
  (^js [type-operator-node index]
   (.getChildAt ^js type-operator-node index))
  (^js [type-operator-node index source-file]
   (.getChildAt ^js type-operator-node index source-file)))

(defn children
  (^js [type-operator-node]
   (.getChildren ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getChildren ^js type-operator-node source-file)))

(defn start
  (^js [type-operator-node]
   (.getStart ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getStart ^js type-operator-node source-file))
  (^js [type-operator-node source-file include-js-doc-comment?]
   (.getStart ^js type-operator-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [type-operator-node]
  (.getFullStart ^js type-operator-node))

(defn get-end
  ^js [type-operator-node]
  (.getEnd ^js type-operator-node))

(defn width
  (^js [type-operator-node]
   (.getWidth ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getWidth ^js type-operator-node source-file)))

(defn full-width
  ^js [type-operator-node]
  (.getFullWidth ^js type-operator-node))

(defn leading-trivia-width
  (^js [type-operator-node]
   (.getLeadingTriviaWidth ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getLeadingTriviaWidth ^js type-operator-node source-file)))

(defn full-text
  (^js [type-operator-node]
   (.getFullText ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getFullText ^js type-operator-node source-file)))

(defn text
  (^js [type-operator-node]
   (.getText ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getText ^js type-operator-node source-file)))

(defn first-token
  (^js [type-operator-node]
   (.getFirstToken ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getFirstToken ^js type-operator-node source-file)))

(defn last-token
  (^js [type-operator-node]
   (.getLastToken ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getLastToken ^js type-operator-node source-file)))

(defn for-each-child
  (^js [type-operator-node cb-node]
   (.forEachChild ^js type-operator-node cb-node))
  (^js [type-operator-node cb-node cb-node-array]
   (.forEachChild ^js type-operator-node cb-node cb-node-array)))

(defn pos
  ^js [type-operator-node]
  (.-pos ^js type-operator-node))

(defn end
  ^js [type-operator-node]
  (.-end ^js type-operator-node))
