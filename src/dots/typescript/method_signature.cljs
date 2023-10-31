(ns dots.typescript.method-signature
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [method-signature]
  (.-kind ^js method-signature))

(defn parent
  ^js [method-signature]
  (.-parent ^js method-signature))

(defn modifiers
  ^js [method-signature]
  (.-modifiers ^js method-signature))

(defn name
  ^js [method-signature]
  (.-name ^js method-signature))

(defn type-parameters
  ^js [method-signature]
  (.-typeParameters ^js method-signature))

(defn parameters
  ^js [method-signature]
  (.-parameters ^js method-signature))

(defn type
  ^js [method-signature]
  (.-type ^js method-signature))

(defn flags
  ^js [method-signature]
  (.-flags ^js method-signature))

(defn source-file
  ^js [method-signature]
  (.getSourceFile ^js method-signature))

(defn child-count
  (^js [method-signature]
   (.getChildCount ^js method-signature))
  (^js [method-signature source-file]
   (.getChildCount ^js method-signature source-file)))

(defn child-at
  (^js [method-signature index]
   (.getChildAt ^js method-signature index))
  (^js [method-signature index source-file]
   (.getChildAt ^js method-signature index source-file)))

(defn children
  (^js [method-signature]
   (.getChildren ^js method-signature))
  (^js [method-signature source-file]
   (.getChildren ^js method-signature source-file)))

(defn start
  (^js [method-signature]
   (.getStart ^js method-signature))
  (^js [method-signature source-file]
   (.getStart ^js method-signature source-file))
  (^js [method-signature source-file include-js-doc-comment?]
   (.getStart ^js method-signature source-file include-js-doc-comment?)))

(defn full-start
  ^js [method-signature]
  (.getFullStart ^js method-signature))

(defn get-end
  ^js [method-signature]
  (.getEnd ^js method-signature))

(defn width
  (^js [method-signature]
   (.getWidth ^js method-signature))
  (^js [method-signature source-file]
   (.getWidth ^js method-signature source-file)))

(defn full-width
  ^js [method-signature]
  (.getFullWidth ^js method-signature))

(defn leading-trivia-width
  (^js [method-signature]
   (.getLeadingTriviaWidth ^js method-signature))
  (^js [method-signature source-file]
   (.getLeadingTriviaWidth ^js method-signature source-file)))

(defn full-text
  (^js [method-signature]
   (.getFullText ^js method-signature))
  (^js [method-signature source-file]
   (.getFullText ^js method-signature source-file)))

(defn text
  (^js [method-signature]
   (.getText ^js method-signature))
  (^js [method-signature source-file]
   (.getText ^js method-signature source-file)))

(defn first-token
  (^js [method-signature]
   (.getFirstToken ^js method-signature))
  (^js [method-signature source-file]
   (.getFirstToken ^js method-signature source-file)))

(defn last-token
  (^js [method-signature]
   (.getLastToken ^js method-signature))
  (^js [method-signature source-file]
   (.getLastToken ^js method-signature source-file)))

(defn for-each-child
  (^js [method-signature cb-node]
   (.forEachChild ^js method-signature cb-node))
  (^js [method-signature cb-node cb-node-array]
   (.forEachChild ^js method-signature cb-node cb-node-array)))

(defn decorators
  ^js [method-signature]
  (.-decorators ^js method-signature))

(defn pos
  ^js [method-signature]
  (.-pos ^js method-signature))

(defn end
  ^js [method-signature]
  (.-end ^js method-signature))

(defn question-token
  ^js [method-signature]
  (.-questionToken ^js method-signature))
