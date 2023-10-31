(ns dots.typescript.js-doc-nullable-type
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-nullable-type]
  (.-kind ^js js-doc-nullable-type))

(defn type
  ^js [js-doc-nullable-type]
  (.-type ^js js-doc-nullable-type))

(defn postfix?
  ^js [js-doc-nullable-type]
  (.-postfix ^js js-doc-nullable-type))

(defn flags
  ^js [js-doc-nullable-type]
  (.-flags ^js js-doc-nullable-type))

(defn parent
  ^js [js-doc-nullable-type]
  (.-parent ^js js-doc-nullable-type))

(defn source-file
  ^js [js-doc-nullable-type]
  (.getSourceFile ^js js-doc-nullable-type))

(defn child-count
  (^js [js-doc-nullable-type]
   (.getChildCount ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getChildCount ^js js-doc-nullable-type source-file)))

(defn child-at
  (^js [js-doc-nullable-type index]
   (.getChildAt ^js js-doc-nullable-type index))
  (^js [js-doc-nullable-type index source-file]
   (.getChildAt ^js js-doc-nullable-type index source-file)))

(defn children
  (^js [js-doc-nullable-type]
   (.getChildren ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getChildren ^js js-doc-nullable-type source-file)))

(defn start
  (^js [js-doc-nullable-type]
   (.getStart ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getStart ^js js-doc-nullable-type source-file))
  (^js [js-doc-nullable-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-nullable-type source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-nullable-type]
  (.getFullStart ^js js-doc-nullable-type))

(defn get-end
  ^js [js-doc-nullable-type]
  (.getEnd ^js js-doc-nullable-type))

(defn width
  (^js [js-doc-nullable-type]
   (.getWidth ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getWidth ^js js-doc-nullable-type source-file)))

(defn full-width
  ^js [js-doc-nullable-type]
  (.getFullWidth ^js js-doc-nullable-type))

(defn leading-trivia-width
  (^js [js-doc-nullable-type]
   (.getLeadingTriviaWidth ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-nullable-type source-file)))

(defn full-text
  (^js [js-doc-nullable-type]
   (.getFullText ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getFullText ^js js-doc-nullable-type source-file)))

(defn text
  (^js [js-doc-nullable-type]
   (.getText ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getText ^js js-doc-nullable-type source-file)))

(defn first-token
  (^js [js-doc-nullable-type]
   (.getFirstToken ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getFirstToken ^js js-doc-nullable-type source-file)))

(defn last-token
  (^js [js-doc-nullable-type]
   (.getLastToken ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getLastToken ^js js-doc-nullable-type source-file)))

(defn for-each-child
  (^js [js-doc-nullable-type cb-node]
   (.forEachChild ^js js-doc-nullable-type cb-node))
  (^js [js-doc-nullable-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-nullable-type cb-node cb-node-array)))

(defn pos
  ^js [js-doc-nullable-type]
  (.-pos ^js js-doc-nullable-type))

(defn end
  ^js [js-doc-nullable-type]
  (.-end ^js js-doc-nullable-type))
