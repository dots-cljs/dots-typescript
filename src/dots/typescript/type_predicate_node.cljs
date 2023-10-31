(ns dots.typescript.type-predicate-node
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [type-predicate-node]
  (.-kind ^js type-predicate-node))

(defn parent
  ^js [type-predicate-node]
  (.-parent ^js type-predicate-node))

(defn asserts-modifier
  ^js [type-predicate-node]
  (.-assertsModifier ^js type-predicate-node))

(defn parameter-name
  ^js [type-predicate-node]
  (.-parameterName ^js type-predicate-node))

(defn type
  ^js [type-predicate-node]
  (.-type ^js type-predicate-node))

(defn flags
  ^js [type-predicate-node]
  (.-flags ^js type-predicate-node))

(defn source-file
  ^js [type-predicate-node]
  (.getSourceFile ^js type-predicate-node))

(defn child-count
  (^js [type-predicate-node]
   (.getChildCount ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getChildCount ^js type-predicate-node source-file)))

(defn child-at
  (^js [type-predicate-node index]
   (.getChildAt ^js type-predicate-node index))
  (^js [type-predicate-node index source-file]
   (.getChildAt ^js type-predicate-node index source-file)))

(defn children
  (^js [type-predicate-node]
   (.getChildren ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getChildren ^js type-predicate-node source-file)))

(defn start
  (^js [type-predicate-node]
   (.getStart ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getStart ^js type-predicate-node source-file))
  (^js [type-predicate-node source-file include-js-doc-comment?]
   (.getStart ^js type-predicate-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [type-predicate-node]
  (.getFullStart ^js type-predicate-node))

(defn get-end
  ^js [type-predicate-node]
  (.getEnd ^js type-predicate-node))

(defn width
  (^js [type-predicate-node]
   (.getWidth ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getWidth ^js type-predicate-node source-file)))

(defn full-width
  ^js [type-predicate-node]
  (.getFullWidth ^js type-predicate-node))

(defn leading-trivia-width
  (^js [type-predicate-node]
   (.getLeadingTriviaWidth ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getLeadingTriviaWidth ^js type-predicate-node source-file)))

(defn full-text
  (^js [type-predicate-node]
   (.getFullText ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getFullText ^js type-predicate-node source-file)))

(defn text
  (^js [type-predicate-node]
   (.getText ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getText ^js type-predicate-node source-file)))

(defn first-token
  (^js [type-predicate-node]
   (.getFirstToken ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getFirstToken ^js type-predicate-node source-file)))

(defn last-token
  (^js [type-predicate-node]
   (.getLastToken ^js type-predicate-node))
  (^js [type-predicate-node source-file]
   (.getLastToken ^js type-predicate-node source-file)))

(defn for-each-child
  (^js [type-predicate-node cb-node]
   (.forEachChild ^js type-predicate-node cb-node))
  (^js [type-predicate-node cb-node cb-node-array]
   (.forEachChild ^js type-predicate-node cb-node cb-node-array)))

(defn decorators
  ^js [type-predicate-node]
  (.-decorators ^js type-predicate-node))

(defn modifiers
  ^js [type-predicate-node]
  (.-modifiers ^js type-predicate-node))

(defn pos
  ^js [type-predicate-node]
  (.-pos ^js type-predicate-node))

(defn end
  ^js [type-predicate-node]
  (.-end ^js type-predicate-node))
