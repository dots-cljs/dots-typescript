(ns dots.typescript.js-doc-type-expression
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-type-expression]
  (.-kind ^js js-doc-type-expression))

(defn type
  ^js [js-doc-type-expression]
  (.-type ^js js-doc-type-expression))

(defn flags
  ^js [js-doc-type-expression]
  (.-flags ^js js-doc-type-expression))

(defn parent
  ^js [js-doc-type-expression]
  (.-parent ^js js-doc-type-expression))

(defn source-file
  ^js [js-doc-type-expression]
  (.getSourceFile ^js js-doc-type-expression))

(defn child-count
  (^js [js-doc-type-expression]
   (.getChildCount ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getChildCount ^js js-doc-type-expression source-file)))

(defn child-at
  (^js [js-doc-type-expression index]
   (.getChildAt ^js js-doc-type-expression index))
  (^js [js-doc-type-expression index source-file]
   (.getChildAt ^js js-doc-type-expression index source-file)))

(defn children
  (^js [js-doc-type-expression]
   (.getChildren ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getChildren ^js js-doc-type-expression source-file)))

(defn start
  (^js [js-doc-type-expression]
   (.getStart ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getStart ^js js-doc-type-expression source-file))
  (^js [js-doc-type-expression source-file include-js-doc-comment?]
   (.getStart ^js js-doc-type-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-type-expression]
  (.getFullStart ^js js-doc-type-expression))

(defn get-end
  ^js [js-doc-type-expression]
  (.getEnd ^js js-doc-type-expression))

(defn width
  (^js [js-doc-type-expression]
   (.getWidth ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getWidth ^js js-doc-type-expression source-file)))

(defn full-width
  ^js [js-doc-type-expression]
  (.getFullWidth ^js js-doc-type-expression))

(defn leading-trivia-width
  (^js [js-doc-type-expression]
   (.getLeadingTriviaWidth ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getLeadingTriviaWidth ^js js-doc-type-expression source-file)))

(defn full-text
  (^js [js-doc-type-expression]
   (.getFullText ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getFullText ^js js-doc-type-expression source-file)))

(defn text
  (^js [js-doc-type-expression]
   (.getText ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getText ^js js-doc-type-expression source-file)))

(defn first-token
  (^js [js-doc-type-expression]
   (.getFirstToken ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getFirstToken ^js js-doc-type-expression source-file)))

(defn last-token
  (^js [js-doc-type-expression]
   (.getLastToken ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getLastToken ^js js-doc-type-expression source-file)))

(defn for-each-child
  (^js [js-doc-type-expression cb-node]
   (.forEachChild ^js js-doc-type-expression cb-node))
  (^js [js-doc-type-expression cb-node cb-node-array]
   (.forEachChild ^js js-doc-type-expression cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-type-expression]
  (.-decorators ^js js-doc-type-expression))

(defn modifiers
  ^js [js-doc-type-expression]
  (.-modifiers ^js js-doc-type-expression))

(defn pos
  ^js [js-doc-type-expression]
  (.-pos ^js js-doc-type-expression))

(defn end
  ^js [js-doc-type-expression]
  (.-end ^js js-doc-type-expression))
