(ns dots.typescript.constructor-type-node
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [constructor-type-node]
  (.-kind ^js constructor-type-node))

(defn modifiers
  ^js [constructor-type-node]
  (.-modifiers ^js constructor-type-node))

(defn type
  ^js [constructor-type-node]
  (.-type ^js constructor-type-node))

(defn flags
  ^js [constructor-type-node]
  (.-flags ^js constructor-type-node))

(defn parent
  ^js [constructor-type-node]
  (.-parent ^js constructor-type-node))

(defn source-file
  ^js [constructor-type-node]
  (.getSourceFile ^js constructor-type-node))

(defn child-count
  (^js [constructor-type-node]
   (.getChildCount ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getChildCount ^js constructor-type-node source-file)))

(defn child-at
  (^js [constructor-type-node index]
   (.getChildAt ^js constructor-type-node index))
  (^js [constructor-type-node index source-file]
   (.getChildAt ^js constructor-type-node index source-file)))

(defn children
  (^js [constructor-type-node]
   (.getChildren ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getChildren ^js constructor-type-node source-file)))

(defn start
  (^js [constructor-type-node]
   (.getStart ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getStart ^js constructor-type-node source-file))
  (^js [constructor-type-node source-file include-js-doc-comment?]
   (.getStart ^js constructor-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [constructor-type-node]
  (.getFullStart ^js constructor-type-node))

(defn get-end
  ^js [constructor-type-node]
  (.getEnd ^js constructor-type-node))

(defn width
  (^js [constructor-type-node]
   (.getWidth ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getWidth ^js constructor-type-node source-file)))

(defn full-width
  ^js [constructor-type-node]
  (.getFullWidth ^js constructor-type-node))

(defn leading-trivia-width
  (^js [constructor-type-node]
   (.getLeadingTriviaWidth ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getLeadingTriviaWidth ^js constructor-type-node source-file)))

(defn full-text
  (^js [constructor-type-node]
   (.getFullText ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getFullText ^js constructor-type-node source-file)))

(defn text
  (^js [constructor-type-node]
   (.getText ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getText ^js constructor-type-node source-file)))

(defn first-token
  (^js [constructor-type-node]
   (.getFirstToken ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getFirstToken ^js constructor-type-node source-file)))

(defn last-token
  (^js [constructor-type-node]
   (.getLastToken ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getLastToken ^js constructor-type-node source-file)))

(defn for-each-child
  (^js [constructor-type-node cb-node]
   (.forEachChild ^js constructor-type-node cb-node))
  (^js [constructor-type-node cb-node cb-node-array]
   (.forEachChild ^js constructor-type-node cb-node cb-node-array)))

(defn decorators
  ^js [constructor-type-node]
  (.-decorators ^js constructor-type-node))

(defn pos
  ^js [constructor-type-node]
  (.-pos ^js constructor-type-node))

(defn end
  ^js [constructor-type-node]
  (.-end ^js constructor-type-node))

(defn name
  ^js [constructor-type-node]
  (.-name ^js constructor-type-node))

(defn type-parameters
  ^js [constructor-type-node]
  (.-typeParameters ^js constructor-type-node))

(defn parameters
  ^js [constructor-type-node]
  (.-parameters ^js constructor-type-node))
