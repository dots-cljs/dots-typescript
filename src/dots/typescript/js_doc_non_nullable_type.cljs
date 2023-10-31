(ns dots.typescript.js-doc-non-nullable-type
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-non-nullable-type]
  (.-kind ^js js-doc-non-nullable-type))

(defn type
  ^js [js-doc-non-nullable-type]
  (.-type ^js js-doc-non-nullable-type))

(defn postfix?
  ^js [js-doc-non-nullable-type]
  (.-postfix ^js js-doc-non-nullable-type))

(defn flags
  ^js [js-doc-non-nullable-type]
  (.-flags ^js js-doc-non-nullable-type))

(defn parent
  ^js [js-doc-non-nullable-type]
  (.-parent ^js js-doc-non-nullable-type))

(defn source-file
  ^js [js-doc-non-nullable-type]
  (.getSourceFile ^js js-doc-non-nullable-type))

(defn child-count
  (^js [js-doc-non-nullable-type]
   (.getChildCount ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getChildCount ^js js-doc-non-nullable-type source-file)))

(defn child-at
  (^js [js-doc-non-nullable-type index]
   (.getChildAt ^js js-doc-non-nullable-type index))
  (^js [js-doc-non-nullable-type index source-file]
   (.getChildAt ^js js-doc-non-nullable-type index source-file)))

(defn children
  (^js [js-doc-non-nullable-type]
   (.getChildren ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getChildren ^js js-doc-non-nullable-type source-file)))

(defn start
  (^js [js-doc-non-nullable-type]
   (.getStart ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getStart ^js js-doc-non-nullable-type source-file))
  (^js [js-doc-non-nullable-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-non-nullable-type source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-non-nullable-type]
  (.getFullStart ^js js-doc-non-nullable-type))

(defn get-end
  ^js [js-doc-non-nullable-type]
  (.getEnd ^js js-doc-non-nullable-type))

(defn width
  (^js [js-doc-non-nullable-type]
   (.getWidth ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getWidth ^js js-doc-non-nullable-type source-file)))

(defn full-width
  ^js [js-doc-non-nullable-type]
  (.getFullWidth ^js js-doc-non-nullable-type))

(defn leading-trivia-width
  (^js [js-doc-non-nullable-type]
   (.getLeadingTriviaWidth ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-non-nullable-type source-file)))

(defn full-text
  (^js [js-doc-non-nullable-type]
   (.getFullText ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getFullText ^js js-doc-non-nullable-type source-file)))

(defn text
  (^js [js-doc-non-nullable-type]
   (.getText ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getText ^js js-doc-non-nullable-type source-file)))

(defn first-token
  (^js [js-doc-non-nullable-type]
   (.getFirstToken ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getFirstToken ^js js-doc-non-nullable-type source-file)))

(defn last-token
  (^js [js-doc-non-nullable-type]
   (.getLastToken ^js js-doc-non-nullable-type))
  (^js [js-doc-non-nullable-type source-file]
   (.getLastToken ^js js-doc-non-nullable-type source-file)))

(defn for-each-child
  (^js [js-doc-non-nullable-type cb-node]
   (.forEachChild ^js js-doc-non-nullable-type cb-node))
  (^js [js-doc-non-nullable-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-non-nullable-type cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-non-nullable-type]
  (.-decorators ^js js-doc-non-nullable-type))

(defn modifiers
  ^js [js-doc-non-nullable-type]
  (.-modifiers ^js js-doc-non-nullable-type))

(defn pos
  ^js [js-doc-non-nullable-type]
  (.-pos ^js js-doc-non-nullable-type))

(defn end
  ^js [js-doc-non-nullable-type]
  (.-end ^js js-doc-non-nullable-type))
