(ns dots.typescript.js-doc-variadic-type
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-variadic-type]
  (.-kind ^js js-doc-variadic-type))

(defn type
  ^js [js-doc-variadic-type]
  (.-type ^js js-doc-variadic-type))

(defn flags
  ^js [js-doc-variadic-type]
  (.-flags ^js js-doc-variadic-type))

(defn parent
  ^js [js-doc-variadic-type]
  (.-parent ^js js-doc-variadic-type))

(defn source-file
  ^js [js-doc-variadic-type]
  (.getSourceFile ^js js-doc-variadic-type))

(defn child-count
  (^js [js-doc-variadic-type]
   (.getChildCount ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getChildCount ^js js-doc-variadic-type source-file)))

(defn child-at
  (^js [js-doc-variadic-type index]
   (.getChildAt ^js js-doc-variadic-type index))
  (^js [js-doc-variadic-type index source-file]
   (.getChildAt ^js js-doc-variadic-type index source-file)))

(defn children
  (^js [js-doc-variadic-type]
   (.getChildren ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getChildren ^js js-doc-variadic-type source-file)))

(defn start
  (^js [js-doc-variadic-type]
   (.getStart ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getStart ^js js-doc-variadic-type source-file))
  (^js [js-doc-variadic-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-variadic-type source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-variadic-type]
  (.getFullStart ^js js-doc-variadic-type))

(defn get-end
  ^js [js-doc-variadic-type]
  (.getEnd ^js js-doc-variadic-type))

(defn width
  (^js [js-doc-variadic-type]
   (.getWidth ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getWidth ^js js-doc-variadic-type source-file)))

(defn full-width
  ^js [js-doc-variadic-type]
  (.getFullWidth ^js js-doc-variadic-type))

(defn leading-trivia-width
  (^js [js-doc-variadic-type]
   (.getLeadingTriviaWidth ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-variadic-type source-file)))

(defn full-text
  (^js [js-doc-variadic-type]
   (.getFullText ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getFullText ^js js-doc-variadic-type source-file)))

(defn text
  (^js [js-doc-variadic-type]
   (.getText ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getText ^js js-doc-variadic-type source-file)))

(defn first-token
  (^js [js-doc-variadic-type]
   (.getFirstToken ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getFirstToken ^js js-doc-variadic-type source-file)))

(defn last-token
  (^js [js-doc-variadic-type]
   (.getLastToken ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getLastToken ^js js-doc-variadic-type source-file)))

(defn for-each-child
  (^js [js-doc-variadic-type cb-node]
   (.forEachChild ^js js-doc-variadic-type cb-node))
  (^js [js-doc-variadic-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-variadic-type cb-node cb-node-array)))

(defn pos
  ^js [js-doc-variadic-type]
  (.-pos ^js js-doc-variadic-type))

(defn end
  ^js [js-doc-variadic-type]
  (.-end ^js js-doc-variadic-type))
