(ns dots.typescript.js-doc-all-type)

(defn kind
  ^js [js-doc-all-type]
  (.-kind ^js js-doc-all-type))

(defn flags
  ^js [js-doc-all-type]
  (.-flags ^js js-doc-all-type))

(defn parent
  ^js [js-doc-all-type]
  (.-parent ^js js-doc-all-type))

(defn source-file
  ^js [js-doc-all-type]
  (.getSourceFile ^js js-doc-all-type))

(defn child-count
  (^js [js-doc-all-type]
   (.getChildCount ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getChildCount ^js js-doc-all-type source-file)))

(defn child-at
  (^js [js-doc-all-type index]
   (.getChildAt ^js js-doc-all-type index))
  (^js [js-doc-all-type index source-file]
   (.getChildAt ^js js-doc-all-type index source-file)))

(defn children
  (^js [js-doc-all-type]
   (.getChildren ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getChildren ^js js-doc-all-type source-file)))

(defn start
  (^js [js-doc-all-type]
   (.getStart ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getStart ^js js-doc-all-type source-file))
  (^js [js-doc-all-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-all-type source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-all-type]
  (.getFullStart ^js js-doc-all-type))

(defn get-end
  ^js [js-doc-all-type]
  (.getEnd ^js js-doc-all-type))

(defn width
  (^js [js-doc-all-type]
   (.getWidth ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getWidth ^js js-doc-all-type source-file)))

(defn full-width
  ^js [js-doc-all-type]
  (.getFullWidth ^js js-doc-all-type))

(defn leading-trivia-width
  (^js [js-doc-all-type]
   (.getLeadingTriviaWidth ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-all-type source-file)))

(defn full-text
  (^js [js-doc-all-type]
   (.getFullText ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getFullText ^js js-doc-all-type source-file)))

(defn text
  (^js [js-doc-all-type]
   (.getText ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getText ^js js-doc-all-type source-file)))

(defn first-token
  (^js [js-doc-all-type]
   (.getFirstToken ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getFirstToken ^js js-doc-all-type source-file)))

(defn last-token
  (^js [js-doc-all-type]
   (.getLastToken ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getLastToken ^js js-doc-all-type source-file)))

(defn for-each-child
  (^js [js-doc-all-type cb-node]
   (.forEachChild ^js js-doc-all-type cb-node))
  (^js [js-doc-all-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-all-type cb-node cb-node-array)))

(defn pos
  ^js [js-doc-all-type]
  (.-pos ^js js-doc-all-type))

(defn end
  ^js [js-doc-all-type]
  (.-end ^js js-doc-all-type))
