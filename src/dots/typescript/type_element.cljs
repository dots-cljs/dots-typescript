(ns dots.typescript.type-element
  (:refer-clojure :exclude [name]))

(defn name
  ^js [type-element]
  (.-name ^js type-element))

(defn question-token
  ^js [type-element]
  (.-questionToken ^js type-element))

(defn kind
  ^js [type-element]
  (.-kind ^js type-element))

(defn flags
  ^js [type-element]
  (.-flags ^js type-element))

(defn parent
  ^js [type-element]
  (.-parent ^js type-element))

(defn source-file
  ^js [type-element]
  (.getSourceFile ^js type-element))

(defn child-count
  (^js [type-element]
   (.getChildCount ^js type-element))
  (^js [type-element source-file]
   (.getChildCount ^js type-element source-file)))

(defn child-at
  (^js [type-element index]
   (.getChildAt ^js type-element index))
  (^js [type-element index source-file]
   (.getChildAt ^js type-element index source-file)))

(defn children
  (^js [type-element]
   (.getChildren ^js type-element))
  (^js [type-element source-file]
   (.getChildren ^js type-element source-file)))

(defn start
  (^js [type-element]
   (.getStart ^js type-element))
  (^js [type-element source-file]
   (.getStart ^js type-element source-file))
  (^js [type-element source-file include-js-doc-comment?]
   (.getStart ^js type-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [type-element]
  (.getFullStart ^js type-element))

(defn get-end
  ^js [type-element]
  (.getEnd ^js type-element))

(defn width
  (^js [type-element]
   (.getWidth ^js type-element))
  (^js [type-element source-file]
   (.getWidth ^js type-element source-file)))

(defn full-width
  ^js [type-element]
  (.getFullWidth ^js type-element))

(defn leading-trivia-width
  (^js [type-element]
   (.getLeadingTriviaWidth ^js type-element))
  (^js [type-element source-file]
   (.getLeadingTriviaWidth ^js type-element source-file)))

(defn full-text
  (^js [type-element]
   (.getFullText ^js type-element))
  (^js [type-element source-file]
   (.getFullText ^js type-element source-file)))

(defn text
  (^js [type-element]
   (.getText ^js type-element))
  (^js [type-element source-file]
   (.getText ^js type-element source-file)))

(defn first-token
  (^js [type-element]
   (.getFirstToken ^js type-element))
  (^js [type-element source-file]
   (.getFirstToken ^js type-element source-file)))

(defn last-token
  (^js [type-element]
   (.getLastToken ^js type-element))
  (^js [type-element source-file]
   (.getLastToken ^js type-element source-file)))

(defn for-each-child
  (^js [type-element cb-node]
   (.forEachChild ^js type-element cb-node))
  (^js [type-element cb-node cb-node-array]
   (.forEachChild ^js type-element cb-node cb-node-array)))

(defn decorators
  ^js [type-element]
  (.-decorators ^js type-element))

(defn modifiers
  ^js [type-element]
  (.-modifiers ^js type-element))

(defn pos
  ^js [type-element]
  (.-pos ^js type-element))

(defn end
  ^js [type-element]
  (.-end ^js type-element))
