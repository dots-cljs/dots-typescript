(ns dots.typescript.as-expression
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [as-expression]
  (.-kind ^js as-expression))

(defn expression
  ^js [as-expression]
  (.-expression ^js as-expression))

(defn type
  ^js [as-expression]
  (.-type ^js as-expression))

(defn flags
  ^js [as-expression]
  (.-flags ^js as-expression))

(defn parent
  ^js [as-expression]
  (.-parent ^js as-expression))

(defn source-file
  ^js [as-expression]
  (.getSourceFile ^js as-expression))

(defn child-count
  (^js [as-expression]
   (.getChildCount ^js as-expression))
  (^js [as-expression source-file]
   (.getChildCount ^js as-expression source-file)))

(defn child-at
  (^js [as-expression index]
   (.getChildAt ^js as-expression index))
  (^js [as-expression index source-file]
   (.getChildAt ^js as-expression index source-file)))

(defn children
  (^js [as-expression]
   (.getChildren ^js as-expression))
  (^js [as-expression source-file]
   (.getChildren ^js as-expression source-file)))

(defn start
  (^js [as-expression]
   (.getStart ^js as-expression))
  (^js [as-expression source-file]
   (.getStart ^js as-expression source-file))
  (^js [as-expression source-file include-js-doc-comment?]
   (.getStart ^js as-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [as-expression]
  (.getFullStart ^js as-expression))

(defn get-end
  ^js [as-expression]
  (.getEnd ^js as-expression))

(defn width
  (^js [as-expression]
   (.getWidth ^js as-expression))
  (^js [as-expression source-file]
   (.getWidth ^js as-expression source-file)))

(defn full-width
  ^js [as-expression]
  (.getFullWidth ^js as-expression))

(defn leading-trivia-width
  (^js [as-expression]
   (.getLeadingTriviaWidth ^js as-expression))
  (^js [as-expression source-file]
   (.getLeadingTriviaWidth ^js as-expression source-file)))

(defn full-text
  (^js [as-expression]
   (.getFullText ^js as-expression))
  (^js [as-expression source-file]
   (.getFullText ^js as-expression source-file)))

(defn text
  (^js [as-expression]
   (.getText ^js as-expression))
  (^js [as-expression source-file]
   (.getText ^js as-expression source-file)))

(defn first-token
  (^js [as-expression]
   (.getFirstToken ^js as-expression))
  (^js [as-expression source-file]
   (.getFirstToken ^js as-expression source-file)))

(defn last-token
  (^js [as-expression]
   (.getLastToken ^js as-expression))
  (^js [as-expression source-file]
   (.getLastToken ^js as-expression source-file)))

(defn for-each-child
  (^js [as-expression cb-node]
   (.forEachChild ^js as-expression cb-node))
  (^js [as-expression cb-node cb-node-array]
   (.forEachChild ^js as-expression cb-node cb-node-array)))

(defn decorators
  ^js [as-expression]
  (.-decorators ^js as-expression))

(defn modifiers
  ^js [as-expression]
  (.-modifiers ^js as-expression))

(defn pos
  ^js [as-expression]
  (.-pos ^js as-expression))

(defn end
  ^js [as-expression]
  (.-end ^js as-expression))
