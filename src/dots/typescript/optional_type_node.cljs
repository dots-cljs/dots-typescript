(ns dots.typescript.optional-type-node
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [optional-type-node]
  (.-kind ^js optional-type-node))

(defn type
  ^js [optional-type-node]
  (.-type ^js optional-type-node))

(defn flags
  ^js [optional-type-node]
  (.-flags ^js optional-type-node))

(defn parent
  ^js [optional-type-node]
  (.-parent ^js optional-type-node))

(defn source-file
  ^js [optional-type-node]
  (.getSourceFile ^js optional-type-node))

(defn child-count
  (^js [optional-type-node]
   (.getChildCount ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getChildCount ^js optional-type-node source-file)))

(defn child-at
  (^js [optional-type-node index]
   (.getChildAt ^js optional-type-node index))
  (^js [optional-type-node index source-file]
   (.getChildAt ^js optional-type-node index source-file)))

(defn children
  (^js [optional-type-node]
   (.getChildren ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getChildren ^js optional-type-node source-file)))

(defn start
  (^js [optional-type-node]
   (.getStart ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getStart ^js optional-type-node source-file))
  (^js [optional-type-node source-file include-js-doc-comment?]
   (.getStart ^js optional-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [optional-type-node]
  (.getFullStart ^js optional-type-node))

(defn get-end
  ^js [optional-type-node]
  (.getEnd ^js optional-type-node))

(defn width
  (^js [optional-type-node]
   (.getWidth ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getWidth ^js optional-type-node source-file)))

(defn full-width
  ^js [optional-type-node]
  (.getFullWidth ^js optional-type-node))

(defn leading-trivia-width
  (^js [optional-type-node]
   (.getLeadingTriviaWidth ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getLeadingTriviaWidth ^js optional-type-node source-file)))

(defn full-text
  (^js [optional-type-node]
   (.getFullText ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getFullText ^js optional-type-node source-file)))

(defn text
  (^js [optional-type-node]
   (.getText ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getText ^js optional-type-node source-file)))

(defn first-token
  (^js [optional-type-node]
   (.getFirstToken ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getFirstToken ^js optional-type-node source-file)))

(defn last-token
  (^js [optional-type-node]
   (.getLastToken ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getLastToken ^js optional-type-node source-file)))

(defn for-each-child
  (^js [optional-type-node cb-node]
   (.forEachChild ^js optional-type-node cb-node))
  (^js [optional-type-node cb-node cb-node-array]
   (.forEachChild ^js optional-type-node cb-node cb-node-array)))

(defn decorators
  ^js [optional-type-node]
  (.-decorators ^js optional-type-node))

(defn modifiers
  ^js [optional-type-node]
  (.-modifiers ^js optional-type-node))

(defn pos
  ^js [optional-type-node]
  (.-pos ^js optional-type-node))

(defn end
  ^js [optional-type-node]
  (.-end ^js optional-type-node))
