(ns dots.typescript.js-doc-unknown-type)

(defn kind
  ^js [js-doc-unknown-type]
  (.-kind ^js js-doc-unknown-type))

(defn flags
  ^js [js-doc-unknown-type]
  (.-flags ^js js-doc-unknown-type))

(defn parent
  ^js [js-doc-unknown-type]
  (.-parent ^js js-doc-unknown-type))

(defn source-file
  ^js [js-doc-unknown-type]
  (.getSourceFile ^js js-doc-unknown-type))

(defn child-count
  (^js [js-doc-unknown-type]
   (.getChildCount ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getChildCount ^js js-doc-unknown-type source-file)))

(defn child-at
  (^js [js-doc-unknown-type index]
   (.getChildAt ^js js-doc-unknown-type index))
  (^js [js-doc-unknown-type index source-file]
   (.getChildAt ^js js-doc-unknown-type index source-file)))

(defn children
  (^js [js-doc-unknown-type]
   (.getChildren ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getChildren ^js js-doc-unknown-type source-file)))

(defn start
  (^js [js-doc-unknown-type]
   (.getStart ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getStart ^js js-doc-unknown-type source-file))
  (^js [js-doc-unknown-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-unknown-type source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-unknown-type]
  (.getFullStart ^js js-doc-unknown-type))

(defn get-end
  ^js [js-doc-unknown-type]
  (.getEnd ^js js-doc-unknown-type))

(defn width
  (^js [js-doc-unknown-type]
   (.getWidth ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getWidth ^js js-doc-unknown-type source-file)))

(defn full-width
  ^js [js-doc-unknown-type]
  (.getFullWidth ^js js-doc-unknown-type))

(defn leading-trivia-width
  (^js [js-doc-unknown-type]
   (.getLeadingTriviaWidth ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-unknown-type source-file)))

(defn full-text
  (^js [js-doc-unknown-type]
   (.getFullText ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getFullText ^js js-doc-unknown-type source-file)))

(defn text
  (^js [js-doc-unknown-type]
   (.getText ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getText ^js js-doc-unknown-type source-file)))

(defn first-token
  (^js [js-doc-unknown-type]
   (.getFirstToken ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getFirstToken ^js js-doc-unknown-type source-file)))

(defn last-token
  (^js [js-doc-unknown-type]
   (.getLastToken ^js js-doc-unknown-type))
  (^js [js-doc-unknown-type source-file]
   (.getLastToken ^js js-doc-unknown-type source-file)))

(defn for-each-child
  (^js [js-doc-unknown-type cb-node]
   (.forEachChild ^js js-doc-unknown-type cb-node))
  (^js [js-doc-unknown-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-unknown-type cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-unknown-type]
  (.-decorators ^js js-doc-unknown-type))

(defn modifiers
  ^js [js-doc-unknown-type]
  (.-modifiers ^js js-doc-unknown-type))

(defn pos
  ^js [js-doc-unknown-type]
  (.-pos ^js js-doc-unknown-type))

(defn end
  ^js [js-doc-unknown-type]
  (.-end ^js js-doc-unknown-type))
