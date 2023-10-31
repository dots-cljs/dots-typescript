(ns dots.typescript.js-doc-name-reference
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [js-doc-name-reference]
  (.-kind ^js js-doc-name-reference))

(defn name
  ^js [js-doc-name-reference]
  (.-name ^js js-doc-name-reference))

(defn flags
  ^js [js-doc-name-reference]
  (.-flags ^js js-doc-name-reference))

(defn parent
  ^js [js-doc-name-reference]
  (.-parent ^js js-doc-name-reference))

(defn source-file
  ^js [js-doc-name-reference]
  (.getSourceFile ^js js-doc-name-reference))

(defn child-count
  (^js [js-doc-name-reference]
   (.getChildCount ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getChildCount ^js js-doc-name-reference source-file)))

(defn child-at
  (^js [js-doc-name-reference index]
   (.getChildAt ^js js-doc-name-reference index))
  (^js [js-doc-name-reference index source-file]
   (.getChildAt ^js js-doc-name-reference index source-file)))

(defn children
  (^js [js-doc-name-reference]
   (.getChildren ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getChildren ^js js-doc-name-reference source-file)))

(defn start
  (^js [js-doc-name-reference]
   (.getStart ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getStart ^js js-doc-name-reference source-file))
  (^js [js-doc-name-reference source-file include-js-doc-comment?]
   (.getStart ^js js-doc-name-reference source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-name-reference]
  (.getFullStart ^js js-doc-name-reference))

(defn get-end
  ^js [js-doc-name-reference]
  (.getEnd ^js js-doc-name-reference))

(defn width
  (^js [js-doc-name-reference]
   (.getWidth ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getWidth ^js js-doc-name-reference source-file)))

(defn full-width
  ^js [js-doc-name-reference]
  (.getFullWidth ^js js-doc-name-reference))

(defn leading-trivia-width
  (^js [js-doc-name-reference]
   (.getLeadingTriviaWidth ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getLeadingTriviaWidth ^js js-doc-name-reference source-file)))

(defn full-text
  (^js [js-doc-name-reference]
   (.getFullText ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getFullText ^js js-doc-name-reference source-file)))

(defn text
  (^js [js-doc-name-reference]
   (.getText ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getText ^js js-doc-name-reference source-file)))

(defn first-token
  (^js [js-doc-name-reference]
   (.getFirstToken ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getFirstToken ^js js-doc-name-reference source-file)))

(defn last-token
  (^js [js-doc-name-reference]
   (.getLastToken ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getLastToken ^js js-doc-name-reference source-file)))

(defn for-each-child
  (^js [js-doc-name-reference cb-node]
   (.forEachChild ^js js-doc-name-reference cb-node))
  (^js [js-doc-name-reference cb-node cb-node-array]
   (.forEachChild ^js js-doc-name-reference cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-name-reference]
  (.-decorators ^js js-doc-name-reference))

(defn modifiers
  ^js [js-doc-name-reference]
  (.-modifiers ^js js-doc-name-reference))

(defn pos
  ^js [js-doc-name-reference]
  (.-pos ^js js-doc-name-reference))

(defn end
  ^js [js-doc-name-reference]
  (.-end ^js js-doc-name-reference))
