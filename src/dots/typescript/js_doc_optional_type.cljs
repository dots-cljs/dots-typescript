(ns dots.typescript.js-doc-optional-type
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-optional-type]
  (.-kind ^js js-doc-optional-type))

(defn type
  ^js [js-doc-optional-type]
  (.-type ^js js-doc-optional-type))

(defn flags
  ^js [js-doc-optional-type]
  (.-flags ^js js-doc-optional-type))

(defn parent
  ^js [js-doc-optional-type]
  (.-parent ^js js-doc-optional-type))

(defn source-file
  ^js [js-doc-optional-type]
  (.getSourceFile ^js js-doc-optional-type))

(defn child-count
  (^js [js-doc-optional-type]
   (.getChildCount ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getChildCount ^js js-doc-optional-type source-file)))

(defn child-at
  (^js [js-doc-optional-type index]
   (.getChildAt ^js js-doc-optional-type index))
  (^js [js-doc-optional-type index source-file]
   (.getChildAt ^js js-doc-optional-type index source-file)))

(defn children
  (^js [js-doc-optional-type]
   (.getChildren ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getChildren ^js js-doc-optional-type source-file)))

(defn start
  (^js [js-doc-optional-type]
   (.getStart ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getStart ^js js-doc-optional-type source-file))
  (^js [js-doc-optional-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-optional-type source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-optional-type]
  (.getFullStart ^js js-doc-optional-type))

(defn get-end
  ^js [js-doc-optional-type]
  (.getEnd ^js js-doc-optional-type))

(defn width
  (^js [js-doc-optional-type]
   (.getWidth ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getWidth ^js js-doc-optional-type source-file)))

(defn full-width
  ^js [js-doc-optional-type]
  (.getFullWidth ^js js-doc-optional-type))

(defn leading-trivia-width
  (^js [js-doc-optional-type]
   (.getLeadingTriviaWidth ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-optional-type source-file)))

(defn full-text
  (^js [js-doc-optional-type]
   (.getFullText ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getFullText ^js js-doc-optional-type source-file)))

(defn text
  (^js [js-doc-optional-type]
   (.getText ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getText ^js js-doc-optional-type source-file)))

(defn first-token
  (^js [js-doc-optional-type]
   (.getFirstToken ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getFirstToken ^js js-doc-optional-type source-file)))

(defn last-token
  (^js [js-doc-optional-type]
   (.getLastToken ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getLastToken ^js js-doc-optional-type source-file)))

(defn for-each-child
  (^js [js-doc-optional-type cb-node]
   (.forEachChild ^js js-doc-optional-type cb-node))
  (^js [js-doc-optional-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-optional-type cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-optional-type]
  (.-decorators ^js js-doc-optional-type))

(defn modifiers
  ^js [js-doc-optional-type]
  (.-modifiers ^js js-doc-optional-type))

(defn pos
  ^js [js-doc-optional-type]
  (.-pos ^js js-doc-optional-type))

(defn end
  ^js [js-doc-optional-type]
  (.-end ^js js-doc-optional-type))
