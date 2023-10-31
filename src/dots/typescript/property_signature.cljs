(ns dots.typescript.property-signature
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [property-signature]
  (.-kind ^js property-signature))

(defn parent
  ^js [property-signature]
  (.-parent ^js property-signature))

(defn modifiers
  ^js [property-signature]
  (.-modifiers ^js property-signature))

(defn name
  ^js [property-signature]
  (.-name ^js property-signature))

(defn question-token
  ^js [property-signature]
  (.-questionToken ^js property-signature))

(defn type
  ^js [property-signature]
  (.-type ^js property-signature))

(defn flags
  ^js [property-signature]
  (.-flags ^js property-signature))

(defn source-file
  ^js [property-signature]
  (.getSourceFile ^js property-signature))

(defn child-count
  (^js [property-signature]
   (.getChildCount ^js property-signature))
  (^js [property-signature source-file]
   (.getChildCount ^js property-signature source-file)))

(defn child-at
  (^js [property-signature index]
   (.getChildAt ^js property-signature index))
  (^js [property-signature index source-file]
   (.getChildAt ^js property-signature index source-file)))

(defn children
  (^js [property-signature]
   (.getChildren ^js property-signature))
  (^js [property-signature source-file]
   (.getChildren ^js property-signature source-file)))

(defn start
  (^js [property-signature]
   (.getStart ^js property-signature))
  (^js [property-signature source-file]
   (.getStart ^js property-signature source-file))
  (^js [property-signature source-file include-js-doc-comment?]
   (.getStart ^js property-signature source-file include-js-doc-comment?)))

(defn full-start
  ^js [property-signature]
  (.getFullStart ^js property-signature))

(defn get-end
  ^js [property-signature]
  (.getEnd ^js property-signature))

(defn width
  (^js [property-signature]
   (.getWidth ^js property-signature))
  (^js [property-signature source-file]
   (.getWidth ^js property-signature source-file)))

(defn full-width
  ^js [property-signature]
  (.getFullWidth ^js property-signature))

(defn leading-trivia-width
  (^js [property-signature]
   (.getLeadingTriviaWidth ^js property-signature))
  (^js [property-signature source-file]
   (.getLeadingTriviaWidth ^js property-signature source-file)))

(defn full-text
  (^js [property-signature]
   (.getFullText ^js property-signature))
  (^js [property-signature source-file]
   (.getFullText ^js property-signature source-file)))

(defn text
  (^js [property-signature]
   (.getText ^js property-signature))
  (^js [property-signature source-file]
   (.getText ^js property-signature source-file)))

(defn first-token
  (^js [property-signature]
   (.getFirstToken ^js property-signature))
  (^js [property-signature source-file]
   (.getFirstToken ^js property-signature source-file)))

(defn last-token
  (^js [property-signature]
   (.getLastToken ^js property-signature))
  (^js [property-signature source-file]
   (.getLastToken ^js property-signature source-file)))

(defn for-each-child
  (^js [property-signature cb-node]
   (.forEachChild ^js property-signature cb-node))
  (^js [property-signature cb-node cb-node-array]
   (.forEachChild ^js property-signature cb-node cb-node-array)))

(defn pos
  ^js [property-signature]
  (.-pos ^js property-signature))

(defn end
  ^js [property-signature]
  (.-end ^js property-signature))
