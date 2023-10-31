(ns dots.typescript.property-assignment
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [property-assignment]
  (.-kind ^js property-assignment))

(defn parent
  ^js [property-assignment]
  (.-parent ^js property-assignment))

(defn name
  ^js [property-assignment]
  (.-name ^js property-assignment))

(defn initializer
  ^js [property-assignment]
  (.-initializer ^js property-assignment))

(defn question-token
  ^js [property-assignment]
  (.-questionToken ^js property-assignment))

(defn exclamation-token
  ^js [property-assignment]
  (.-exclamationToken ^js property-assignment))

(defn flags
  ^js [property-assignment]
  (.-flags ^js property-assignment))

(defn source-file
  ^js [property-assignment]
  (.getSourceFile ^js property-assignment))

(defn child-count
  (^js [property-assignment]
   (.getChildCount ^js property-assignment))
  (^js [property-assignment source-file]
   (.getChildCount ^js property-assignment source-file)))

(defn child-at
  (^js [property-assignment index]
   (.getChildAt ^js property-assignment index))
  (^js [property-assignment index source-file]
   (.getChildAt ^js property-assignment index source-file)))

(defn children
  (^js [property-assignment]
   (.getChildren ^js property-assignment))
  (^js [property-assignment source-file]
   (.getChildren ^js property-assignment source-file)))

(defn start
  (^js [property-assignment]
   (.getStart ^js property-assignment))
  (^js [property-assignment source-file]
   (.getStart ^js property-assignment source-file))
  (^js [property-assignment source-file include-js-doc-comment?]
   (.getStart ^js property-assignment source-file include-js-doc-comment?)))

(defn full-start
  ^js [property-assignment]
  (.getFullStart ^js property-assignment))

(defn get-end
  ^js [property-assignment]
  (.getEnd ^js property-assignment))

(defn width
  (^js [property-assignment]
   (.getWidth ^js property-assignment))
  (^js [property-assignment source-file]
   (.getWidth ^js property-assignment source-file)))

(defn full-width
  ^js [property-assignment]
  (.getFullWidth ^js property-assignment))

(defn leading-trivia-width
  (^js [property-assignment]
   (.getLeadingTriviaWidth ^js property-assignment))
  (^js [property-assignment source-file]
   (.getLeadingTriviaWidth ^js property-assignment source-file)))

(defn full-text
  (^js [property-assignment]
   (.getFullText ^js property-assignment))
  (^js [property-assignment source-file]
   (.getFullText ^js property-assignment source-file)))

(defn text
  (^js [property-assignment]
   (.getText ^js property-assignment))
  (^js [property-assignment source-file]
   (.getText ^js property-assignment source-file)))

(defn first-token
  (^js [property-assignment]
   (.getFirstToken ^js property-assignment))
  (^js [property-assignment source-file]
   (.getFirstToken ^js property-assignment source-file)))

(defn last-token
  (^js [property-assignment]
   (.getLastToken ^js property-assignment))
  (^js [property-assignment source-file]
   (.getLastToken ^js property-assignment source-file)))

(defn for-each-child
  (^js [property-assignment cb-node]
   (.forEachChild ^js property-assignment cb-node))
  (^js [property-assignment cb-node cb-node-array]
   (.forEachChild ^js property-assignment cb-node cb-node-array)))

(defn decorators
  ^js [property-assignment]
  (.-decorators ^js property-assignment))

(defn modifiers
  ^js [property-assignment]
  (.-modifiers ^js property-assignment))

(defn pos
  ^js [property-assignment]
  (.-pos ^js property-assignment))

(defn end
  ^js [property-assignment]
  (.-end ^js property-assignment))
