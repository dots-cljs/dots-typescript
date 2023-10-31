(ns dots.typescript.jsx-opening-fragment)

(defn kind
  ^js [jsx-opening-fragment]
  (.-kind ^js jsx-opening-fragment))

(defn parent
  ^js [jsx-opening-fragment]
  (.-parent ^js jsx-opening-fragment))

(defn flags
  ^js [jsx-opening-fragment]
  (.-flags ^js jsx-opening-fragment))

(defn source-file
  ^js [jsx-opening-fragment]
  (.getSourceFile ^js jsx-opening-fragment))

(defn child-count
  (^js [jsx-opening-fragment]
   (.getChildCount ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getChildCount ^js jsx-opening-fragment source-file)))

(defn child-at
  (^js [jsx-opening-fragment index]
   (.getChildAt ^js jsx-opening-fragment index))
  (^js [jsx-opening-fragment index source-file]
   (.getChildAt ^js jsx-opening-fragment index source-file)))

(defn children
  (^js [jsx-opening-fragment]
   (.getChildren ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getChildren ^js jsx-opening-fragment source-file)))

(defn start
  (^js [jsx-opening-fragment]
   (.getStart ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getStart ^js jsx-opening-fragment source-file))
  (^js [jsx-opening-fragment source-file include-js-doc-comment?]
   (.getStart ^js jsx-opening-fragment source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-opening-fragment]
  (.getFullStart ^js jsx-opening-fragment))

(defn get-end
  ^js [jsx-opening-fragment]
  (.getEnd ^js jsx-opening-fragment))

(defn width
  (^js [jsx-opening-fragment]
   (.getWidth ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getWidth ^js jsx-opening-fragment source-file)))

(defn full-width
  ^js [jsx-opening-fragment]
  (.getFullWidth ^js jsx-opening-fragment))

(defn leading-trivia-width
  (^js [jsx-opening-fragment]
   (.getLeadingTriviaWidth ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getLeadingTriviaWidth ^js jsx-opening-fragment source-file)))

(defn full-text
  (^js [jsx-opening-fragment]
   (.getFullText ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getFullText ^js jsx-opening-fragment source-file)))

(defn text
  (^js [jsx-opening-fragment]
   (.getText ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getText ^js jsx-opening-fragment source-file)))

(defn first-token
  (^js [jsx-opening-fragment]
   (.getFirstToken ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getFirstToken ^js jsx-opening-fragment source-file)))

(defn last-token
  (^js [jsx-opening-fragment]
   (.getLastToken ^js jsx-opening-fragment))
  (^js [jsx-opening-fragment source-file]
   (.getLastToken ^js jsx-opening-fragment source-file)))

(defn for-each-child
  (^js [jsx-opening-fragment cb-node]
   (.forEachChild ^js jsx-opening-fragment cb-node))
  (^js [jsx-opening-fragment cb-node cb-node-array]
   (.forEachChild ^js jsx-opening-fragment cb-node cb-node-array)))

(defn pos
  ^js [jsx-opening-fragment]
  (.-pos ^js jsx-opening-fragment))

(defn end
  ^js [jsx-opening-fragment]
  (.-end ^js jsx-opening-fragment))
