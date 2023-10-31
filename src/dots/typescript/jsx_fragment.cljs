(ns dots.typescript.jsx-fragment)

(defn kind
  ^js [jsx-fragment]
  (.-kind ^js jsx-fragment))

(defn opening-fragment
  ^js [jsx-fragment]
  (.-openingFragment ^js jsx-fragment))

(defn children
  ^js [jsx-fragment]
  (.-children ^js jsx-fragment))

(defn closing-fragment
  ^js [jsx-fragment]
  (.-closingFragment ^js jsx-fragment))

(defn flags
  ^js [jsx-fragment]
  (.-flags ^js jsx-fragment))

(defn parent
  ^js [jsx-fragment]
  (.-parent ^js jsx-fragment))

(defn source-file
  ^js [jsx-fragment]
  (.getSourceFile ^js jsx-fragment))

(defn child-count
  (^js [jsx-fragment]
   (.getChildCount ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getChildCount ^js jsx-fragment source-file)))

(defn child-at
  (^js [jsx-fragment index]
   (.getChildAt ^js jsx-fragment index))
  (^js [jsx-fragment index source-file]
   (.getChildAt ^js jsx-fragment index source-file)))

(defn get-children
  (^js [jsx-fragment]
   (.getChildren ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getChildren ^js jsx-fragment source-file)))

(defn start
  (^js [jsx-fragment]
   (.getStart ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getStart ^js jsx-fragment source-file))
  (^js [jsx-fragment source-file include-js-doc-comment?]
   (.getStart ^js jsx-fragment source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-fragment]
  (.getFullStart ^js jsx-fragment))

(defn get-end
  ^js [jsx-fragment]
  (.getEnd ^js jsx-fragment))

(defn width
  (^js [jsx-fragment]
   (.getWidth ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getWidth ^js jsx-fragment source-file)))

(defn full-width
  ^js [jsx-fragment]
  (.getFullWidth ^js jsx-fragment))

(defn leading-trivia-width
  (^js [jsx-fragment]
   (.getLeadingTriviaWidth ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getLeadingTriviaWidth ^js jsx-fragment source-file)))

(defn full-text
  (^js [jsx-fragment]
   (.getFullText ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getFullText ^js jsx-fragment source-file)))

(defn text
  (^js [jsx-fragment]
   (.getText ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getText ^js jsx-fragment source-file)))

(defn first-token
  (^js [jsx-fragment]
   (.getFirstToken ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getFirstToken ^js jsx-fragment source-file)))

(defn last-token
  (^js [jsx-fragment]
   (.getLastToken ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getLastToken ^js jsx-fragment source-file)))

(defn for-each-child
  (^js [jsx-fragment cb-node]
   (.forEachChild ^js jsx-fragment cb-node))
  (^js [jsx-fragment cb-node cb-node-array]
   (.forEachChild ^js jsx-fragment cb-node cb-node-array)))

(defn pos
  ^js [jsx-fragment]
  (.-pos ^js jsx-fragment))

(defn end
  ^js [jsx-fragment]
  (.-end ^js jsx-fragment))
