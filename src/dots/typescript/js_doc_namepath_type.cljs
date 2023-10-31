(ns dots.typescript.js-doc-namepath-type
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-namepath-type]
  (.-kind ^js js-doc-namepath-type))

(defn type
  ^js [js-doc-namepath-type]
  (.-type ^js js-doc-namepath-type))

(defn flags
  ^js [js-doc-namepath-type]
  (.-flags ^js js-doc-namepath-type))

(defn parent
  ^js [js-doc-namepath-type]
  (.-parent ^js js-doc-namepath-type))

(defn source-file
  ^js [js-doc-namepath-type]
  (.getSourceFile ^js js-doc-namepath-type))

(defn child-count
  (^js [js-doc-namepath-type]
   (.getChildCount ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getChildCount ^js js-doc-namepath-type source-file)))

(defn child-at
  (^js [js-doc-namepath-type index]
   (.getChildAt ^js js-doc-namepath-type index))
  (^js [js-doc-namepath-type index source-file]
   (.getChildAt ^js js-doc-namepath-type index source-file)))

(defn children
  (^js [js-doc-namepath-type]
   (.getChildren ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getChildren ^js js-doc-namepath-type source-file)))

(defn start
  (^js [js-doc-namepath-type]
   (.getStart ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getStart ^js js-doc-namepath-type source-file))
  (^js [js-doc-namepath-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-namepath-type source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-namepath-type]
  (.getFullStart ^js js-doc-namepath-type))

(defn get-end
  ^js [js-doc-namepath-type]
  (.getEnd ^js js-doc-namepath-type))

(defn width
  (^js [js-doc-namepath-type]
   (.getWidth ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getWidth ^js js-doc-namepath-type source-file)))

(defn full-width
  ^js [js-doc-namepath-type]
  (.getFullWidth ^js js-doc-namepath-type))

(defn leading-trivia-width
  (^js [js-doc-namepath-type]
   (.getLeadingTriviaWidth ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-namepath-type source-file)))

(defn full-text
  (^js [js-doc-namepath-type]
   (.getFullText ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getFullText ^js js-doc-namepath-type source-file)))

(defn text
  (^js [js-doc-namepath-type]
   (.getText ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getText ^js js-doc-namepath-type source-file)))

(defn first-token
  (^js [js-doc-namepath-type]
   (.getFirstToken ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getFirstToken ^js js-doc-namepath-type source-file)))

(defn last-token
  (^js [js-doc-namepath-type]
   (.getLastToken ^js js-doc-namepath-type))
  (^js [js-doc-namepath-type source-file]
   (.getLastToken ^js js-doc-namepath-type source-file)))

(defn for-each-child
  (^js [js-doc-namepath-type cb-node]
   (.forEachChild ^js js-doc-namepath-type cb-node))
  (^js [js-doc-namepath-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-namepath-type cb-node cb-node-array)))

(defn pos
  ^js [js-doc-namepath-type]
  (.-pos ^js js-doc-namepath-type))

(defn end
  ^js [js-doc-namepath-type]
  (.-end ^js js-doc-namepath-type))
