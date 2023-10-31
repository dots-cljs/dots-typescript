(ns dots.typescript.object-literal-element
  (:refer-clojure :exclude [name]))

(defn name
  ^js [object-literal-element]
  (.-name ^js object-literal-element))

(defn kind
  ^js [object-literal-element]
  (.-kind ^js object-literal-element))

(defn flags
  ^js [object-literal-element]
  (.-flags ^js object-literal-element))

(defn parent
  ^js [object-literal-element]
  (.-parent ^js object-literal-element))

(defn source-file
  ^js [object-literal-element]
  (.getSourceFile ^js object-literal-element))

(defn child-count
  (^js [object-literal-element]
   (.getChildCount ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getChildCount ^js object-literal-element source-file)))

(defn child-at
  (^js [object-literal-element index]
   (.getChildAt ^js object-literal-element index))
  (^js [object-literal-element index source-file]
   (.getChildAt ^js object-literal-element index source-file)))

(defn children
  (^js [object-literal-element]
   (.getChildren ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getChildren ^js object-literal-element source-file)))

(defn start
  (^js [object-literal-element]
   (.getStart ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getStart ^js object-literal-element source-file))
  (^js [object-literal-element source-file include-js-doc-comment?]
   (.getStart ^js object-literal-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [object-literal-element]
  (.getFullStart ^js object-literal-element))

(defn get-end
  ^js [object-literal-element]
  (.getEnd ^js object-literal-element))

(defn width
  (^js [object-literal-element]
   (.getWidth ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getWidth ^js object-literal-element source-file)))

(defn full-width
  ^js [object-literal-element]
  (.getFullWidth ^js object-literal-element))

(defn leading-trivia-width
  (^js [object-literal-element]
   (.getLeadingTriviaWidth ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getLeadingTriviaWidth ^js object-literal-element source-file)))

(defn full-text
  (^js [object-literal-element]
   (.getFullText ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getFullText ^js object-literal-element source-file)))

(defn text
  (^js [object-literal-element]
   (.getText ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getText ^js object-literal-element source-file)))

(defn first-token
  (^js [object-literal-element]
   (.getFirstToken ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getFirstToken ^js object-literal-element source-file)))

(defn last-token
  (^js [object-literal-element]
   (.getLastToken ^js object-literal-element))
  (^js [object-literal-element source-file]
   (.getLastToken ^js object-literal-element source-file)))

(defn for-each-child
  (^js [object-literal-element cb-node]
   (.forEachChild ^js object-literal-element cb-node))
  (^js [object-literal-element cb-node cb-node-array]
   (.forEachChild ^js object-literal-element cb-node cb-node-array)))

(defn pos
  ^js [object-literal-element]
  (.-pos ^js object-literal-element))

(defn end
  ^js [object-literal-element]
  (.-end ^js object-literal-element))
