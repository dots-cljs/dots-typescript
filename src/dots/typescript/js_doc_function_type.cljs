(ns dots.typescript.js-doc-function-type
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [js-doc-function-type]
  (.-kind ^js js-doc-function-type))

(defn flags
  ^js [js-doc-function-type]
  (.-flags ^js js-doc-function-type))

(defn parent
  ^js [js-doc-function-type]
  (.-parent ^js js-doc-function-type))

(defn source-file
  ^js [js-doc-function-type]
  (.getSourceFile ^js js-doc-function-type))

(defn child-count
  (^js [js-doc-function-type]
   (.getChildCount ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getChildCount ^js js-doc-function-type source-file)))

(defn child-at
  (^js [js-doc-function-type index]
   (.getChildAt ^js js-doc-function-type index))
  (^js [js-doc-function-type index source-file]
   (.getChildAt ^js js-doc-function-type index source-file)))

(defn children
  (^js [js-doc-function-type]
   (.getChildren ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getChildren ^js js-doc-function-type source-file)))

(defn start
  (^js [js-doc-function-type]
   (.getStart ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getStart ^js js-doc-function-type source-file))
  (^js [js-doc-function-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-function-type source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-function-type]
  (.getFullStart ^js js-doc-function-type))

(defn get-end
  ^js [js-doc-function-type]
  (.getEnd ^js js-doc-function-type))

(defn width
  (^js [js-doc-function-type]
   (.getWidth ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getWidth ^js js-doc-function-type source-file)))

(defn full-width
  ^js [js-doc-function-type]
  (.getFullWidth ^js js-doc-function-type))

(defn leading-trivia-width
  (^js [js-doc-function-type]
   (.getLeadingTriviaWidth ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-function-type source-file)))

(defn full-text
  (^js [js-doc-function-type]
   (.getFullText ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getFullText ^js js-doc-function-type source-file)))

(defn text
  (^js [js-doc-function-type]
   (.getText ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getText ^js js-doc-function-type source-file)))

(defn first-token
  (^js [js-doc-function-type]
   (.getFirstToken ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getFirstToken ^js js-doc-function-type source-file)))

(defn last-token
  (^js [js-doc-function-type]
   (.getLastToken ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getLastToken ^js js-doc-function-type source-file)))

(defn for-each-child
  (^js [js-doc-function-type cb-node]
   (.forEachChild ^js js-doc-function-type cb-node))
  (^js [js-doc-function-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-function-type cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-function-type]
  (.-decorators ^js js-doc-function-type))

(defn modifiers
  ^js [js-doc-function-type]
  (.-modifiers ^js js-doc-function-type))

(defn pos
  ^js [js-doc-function-type]
  (.-pos ^js js-doc-function-type))

(defn end
  ^js [js-doc-function-type]
  (.-end ^js js-doc-function-type))

(defn name
  ^js [js-doc-function-type]
  (.-name ^js js-doc-function-type))

(defn type-parameters
  ^js [js-doc-function-type]
  (.-typeParameters ^js js-doc-function-type))

(defn parameters
  ^js [js-doc-function-type]
  (.-parameters ^js js-doc-function-type))

(defn type
  ^js [js-doc-function-type]
  (.-type ^js js-doc-function-type))
