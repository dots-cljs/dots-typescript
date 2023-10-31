(ns dots.typescript.function-type-node
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [function-type-node]
  (.-kind ^js function-type-node))

(defn modifiers
  ^js [function-type-node]
  (.-modifiers ^js function-type-node))

(defn type
  ^js [function-type-node]
  (.-type ^js function-type-node))

(defn flags
  ^js [function-type-node]
  (.-flags ^js function-type-node))

(defn parent
  ^js [function-type-node]
  (.-parent ^js function-type-node))

(defn source-file
  ^js [function-type-node]
  (.getSourceFile ^js function-type-node))

(defn child-count
  (^js [function-type-node]
   (.getChildCount ^js function-type-node))
  (^js [function-type-node source-file]
   (.getChildCount ^js function-type-node source-file)))

(defn child-at
  (^js [function-type-node index]
   (.getChildAt ^js function-type-node index))
  (^js [function-type-node index source-file]
   (.getChildAt ^js function-type-node index source-file)))

(defn children
  (^js [function-type-node]
   (.getChildren ^js function-type-node))
  (^js [function-type-node source-file]
   (.getChildren ^js function-type-node source-file)))

(defn start
  (^js [function-type-node]
   (.getStart ^js function-type-node))
  (^js [function-type-node source-file]
   (.getStart ^js function-type-node source-file))
  (^js [function-type-node source-file include-js-doc-comment?]
   (.getStart ^js function-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [function-type-node]
  (.getFullStart ^js function-type-node))

(defn get-end
  ^js [function-type-node]
  (.getEnd ^js function-type-node))

(defn width
  (^js [function-type-node]
   (.getWidth ^js function-type-node))
  (^js [function-type-node source-file]
   (.getWidth ^js function-type-node source-file)))

(defn full-width
  ^js [function-type-node]
  (.getFullWidth ^js function-type-node))

(defn leading-trivia-width
  (^js [function-type-node]
   (.getLeadingTriviaWidth ^js function-type-node))
  (^js [function-type-node source-file]
   (.getLeadingTriviaWidth ^js function-type-node source-file)))

(defn full-text
  (^js [function-type-node]
   (.getFullText ^js function-type-node))
  (^js [function-type-node source-file]
   (.getFullText ^js function-type-node source-file)))

(defn text
  (^js [function-type-node]
   (.getText ^js function-type-node))
  (^js [function-type-node source-file]
   (.getText ^js function-type-node source-file)))

(defn first-token
  (^js [function-type-node]
   (.getFirstToken ^js function-type-node))
  (^js [function-type-node source-file]
   (.getFirstToken ^js function-type-node source-file)))

(defn last-token
  (^js [function-type-node]
   (.getLastToken ^js function-type-node))
  (^js [function-type-node source-file]
   (.getLastToken ^js function-type-node source-file)))

(defn for-each-child
  (^js [function-type-node cb-node]
   (.forEachChild ^js function-type-node cb-node))
  (^js [function-type-node cb-node cb-node-array]
   (.forEachChild ^js function-type-node cb-node cb-node-array)))

(defn decorators
  ^js [function-type-node]
  (.-decorators ^js function-type-node))

(defn pos
  ^js [function-type-node]
  (.-pos ^js function-type-node))

(defn end
  ^js [function-type-node]
  (.-end ^js function-type-node))

(defn name
  ^js [function-type-node]
  (.-name ^js function-type-node))

(defn type-parameters
  ^js [function-type-node]
  (.-typeParameters ^js function-type-node))

(defn parameters
  ^js [function-type-node]
  (.-parameters ^js function-type-node))
