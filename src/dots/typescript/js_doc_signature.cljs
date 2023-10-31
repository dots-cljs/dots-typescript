(ns dots.typescript.js-doc-signature
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-signature]
  (.-kind ^js js-doc-signature))

(defn type-parameters
  ^js [js-doc-signature]
  (.-typeParameters ^js js-doc-signature))

(defn parameters
  ^js [js-doc-signature]
  (.-parameters ^js js-doc-signature))

(defn type
  ^js [js-doc-signature]
  (.-type ^js js-doc-signature))

(defn flags
  ^js [js-doc-signature]
  (.-flags ^js js-doc-signature))

(defn parent
  ^js [js-doc-signature]
  (.-parent ^js js-doc-signature))

(defn source-file
  ^js [js-doc-signature]
  (.getSourceFile ^js js-doc-signature))

(defn child-count
  (^js [js-doc-signature]
   (.getChildCount ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getChildCount ^js js-doc-signature source-file)))

(defn child-at
  (^js [js-doc-signature index]
   (.getChildAt ^js js-doc-signature index))
  (^js [js-doc-signature index source-file]
   (.getChildAt ^js js-doc-signature index source-file)))

(defn children
  (^js [js-doc-signature]
   (.getChildren ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getChildren ^js js-doc-signature source-file)))

(defn start
  (^js [js-doc-signature]
   (.getStart ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getStart ^js js-doc-signature source-file))
  (^js [js-doc-signature source-file include-js-doc-comment?]
   (.getStart ^js js-doc-signature source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-signature]
  (.getFullStart ^js js-doc-signature))

(defn get-end
  ^js [js-doc-signature]
  (.getEnd ^js js-doc-signature))

(defn width
  (^js [js-doc-signature]
   (.getWidth ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getWidth ^js js-doc-signature source-file)))

(defn full-width
  ^js [js-doc-signature]
  (.getFullWidth ^js js-doc-signature))

(defn leading-trivia-width
  (^js [js-doc-signature]
   (.getLeadingTriviaWidth ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getLeadingTriviaWidth ^js js-doc-signature source-file)))

(defn full-text
  (^js [js-doc-signature]
   (.getFullText ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getFullText ^js js-doc-signature source-file)))

(defn text
  (^js [js-doc-signature]
   (.getText ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getText ^js js-doc-signature source-file)))

(defn first-token
  (^js [js-doc-signature]
   (.getFirstToken ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getFirstToken ^js js-doc-signature source-file)))

(defn last-token
  (^js [js-doc-signature]
   (.getLastToken ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getLastToken ^js js-doc-signature source-file)))

(defn for-each-child
  (^js [js-doc-signature cb-node]
   (.forEachChild ^js js-doc-signature cb-node))
  (^js [js-doc-signature cb-node cb-node-array]
   (.forEachChild ^js js-doc-signature cb-node cb-node-array)))

(defn pos
  ^js [js-doc-signature]
  (.-pos ^js js-doc-signature))

(defn end
  ^js [js-doc-signature]
  (.-end ^js js-doc-signature))
