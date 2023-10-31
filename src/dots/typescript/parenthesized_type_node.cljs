(ns dots.typescript.parenthesized-type-node
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [parenthesized-type-node]
  (.-kind ^js parenthesized-type-node))

(defn type
  ^js [parenthesized-type-node]
  (.-type ^js parenthesized-type-node))

(defn flags
  ^js [parenthesized-type-node]
  (.-flags ^js parenthesized-type-node))

(defn parent
  ^js [parenthesized-type-node]
  (.-parent ^js parenthesized-type-node))

(defn source-file
  ^js [parenthesized-type-node]
  (.getSourceFile ^js parenthesized-type-node))

(defn child-count
  (^js [parenthesized-type-node]
   (.getChildCount ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getChildCount ^js parenthesized-type-node source-file)))

(defn child-at
  (^js [parenthesized-type-node index]
   (.getChildAt ^js parenthesized-type-node index))
  (^js [parenthesized-type-node index source-file]
   (.getChildAt ^js parenthesized-type-node index source-file)))

(defn children
  (^js [parenthesized-type-node]
   (.getChildren ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getChildren ^js parenthesized-type-node source-file)))

(defn start
  (^js [parenthesized-type-node]
   (.getStart ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getStart ^js parenthesized-type-node source-file))
  (^js [parenthesized-type-node source-file include-js-doc-comment?]
   (.getStart ^js parenthesized-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [parenthesized-type-node]
  (.getFullStart ^js parenthesized-type-node))

(defn get-end
  ^js [parenthesized-type-node]
  (.getEnd ^js parenthesized-type-node))

(defn width
  (^js [parenthesized-type-node]
   (.getWidth ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getWidth ^js parenthesized-type-node source-file)))

(defn full-width
  ^js [parenthesized-type-node]
  (.getFullWidth ^js parenthesized-type-node))

(defn leading-trivia-width
  (^js [parenthesized-type-node]
   (.getLeadingTriviaWidth ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getLeadingTriviaWidth ^js parenthesized-type-node source-file)))

(defn full-text
  (^js [parenthesized-type-node]
   (.getFullText ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getFullText ^js parenthesized-type-node source-file)))

(defn text
  (^js [parenthesized-type-node]
   (.getText ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getText ^js parenthesized-type-node source-file)))

(defn first-token
  (^js [parenthesized-type-node]
   (.getFirstToken ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getFirstToken ^js parenthesized-type-node source-file)))

(defn last-token
  (^js [parenthesized-type-node]
   (.getLastToken ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getLastToken ^js parenthesized-type-node source-file)))

(defn for-each-child
  (^js [parenthesized-type-node cb-node]
   (.forEachChild ^js parenthesized-type-node cb-node))
  (^js [parenthesized-type-node cb-node cb-node-array]
   (.forEachChild ^js parenthesized-type-node cb-node cb-node-array)))

(defn pos
  ^js [parenthesized-type-node]
  (.-pos ^js parenthesized-type-node))

(defn end
  ^js [parenthesized-type-node]
  (.-end ^js parenthesized-type-node))
