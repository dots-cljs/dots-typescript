(ns dots.typescript.jsx-closing-fragment)

(defn kind
  ^js [jsx-closing-fragment]
  (.-kind ^js jsx-closing-fragment))

(defn parent
  ^js [jsx-closing-fragment]
  (.-parent ^js jsx-closing-fragment))

(defn flags
  ^js [jsx-closing-fragment]
  (.-flags ^js jsx-closing-fragment))

(defn source-file
  ^js [jsx-closing-fragment]
  (.getSourceFile ^js jsx-closing-fragment))

(defn child-count
  (^js [jsx-closing-fragment]
   (.getChildCount ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getChildCount ^js jsx-closing-fragment source-file)))

(defn child-at
  (^js [jsx-closing-fragment index]
   (.getChildAt ^js jsx-closing-fragment index))
  (^js [jsx-closing-fragment index source-file]
   (.getChildAt ^js jsx-closing-fragment index source-file)))

(defn children
  (^js [jsx-closing-fragment]
   (.getChildren ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getChildren ^js jsx-closing-fragment source-file)))

(defn start
  (^js [jsx-closing-fragment]
   (.getStart ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getStart ^js jsx-closing-fragment source-file))
  (^js [jsx-closing-fragment source-file include-js-doc-comment?]
   (.getStart ^js jsx-closing-fragment source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-closing-fragment]
  (.getFullStart ^js jsx-closing-fragment))

(defn get-end
  ^js [jsx-closing-fragment]
  (.getEnd ^js jsx-closing-fragment))

(defn width
  (^js [jsx-closing-fragment]
   (.getWidth ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getWidth ^js jsx-closing-fragment source-file)))

(defn full-width
  ^js [jsx-closing-fragment]
  (.getFullWidth ^js jsx-closing-fragment))

(defn leading-trivia-width
  (^js [jsx-closing-fragment]
   (.getLeadingTriviaWidth ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getLeadingTriviaWidth ^js jsx-closing-fragment source-file)))

(defn full-text
  (^js [jsx-closing-fragment]
   (.getFullText ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getFullText ^js jsx-closing-fragment source-file)))

(defn text
  (^js [jsx-closing-fragment]
   (.getText ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getText ^js jsx-closing-fragment source-file)))

(defn first-token
  (^js [jsx-closing-fragment]
   (.getFirstToken ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getFirstToken ^js jsx-closing-fragment source-file)))

(defn last-token
  (^js [jsx-closing-fragment]
   (.getLastToken ^js jsx-closing-fragment))
  (^js [jsx-closing-fragment source-file]
   (.getLastToken ^js jsx-closing-fragment source-file)))

(defn for-each-child
  (^js [jsx-closing-fragment cb-node]
   (.forEachChild ^js jsx-closing-fragment cb-node))
  (^js [jsx-closing-fragment cb-node cb-node-array]
   (.forEachChild ^js jsx-closing-fragment cb-node cb-node-array)))

(defn pos
  ^js [jsx-closing-fragment]
  (.-pos ^js jsx-closing-fragment))

(defn end
  ^js [jsx-closing-fragment]
  (.-end ^js jsx-closing-fragment))
