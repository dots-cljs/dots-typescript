(ns dots.typescript.jsx-attributes)

(defn properties
  ^js [jsx-attributes]
  (.-properties ^js jsx-attributes))

(defn kind
  ^js [jsx-attributes]
  (.-kind ^js jsx-attributes))

(defn parent
  ^js [jsx-attributes]
  (.-parent ^js jsx-attributes))

(defn flags
  ^js [jsx-attributes]
  (.-flags ^js jsx-attributes))

(defn source-file
  ^js [jsx-attributes]
  (.getSourceFile ^js jsx-attributes))

(defn child-count
  (^js [jsx-attributes]
   (.getChildCount ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getChildCount ^js jsx-attributes source-file)))

(defn child-at
  (^js [jsx-attributes index]
   (.getChildAt ^js jsx-attributes index))
  (^js [jsx-attributes index source-file]
   (.getChildAt ^js jsx-attributes index source-file)))

(defn children
  (^js [jsx-attributes]
   (.getChildren ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getChildren ^js jsx-attributes source-file)))

(defn start
  (^js [jsx-attributes]
   (.getStart ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getStart ^js jsx-attributes source-file))
  (^js [jsx-attributes source-file include-js-doc-comment?]
   (.getStart ^js jsx-attributes source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-attributes]
  (.getFullStart ^js jsx-attributes))

(defn get-end
  ^js [jsx-attributes]
  (.getEnd ^js jsx-attributes))

(defn width
  (^js [jsx-attributes]
   (.getWidth ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getWidth ^js jsx-attributes source-file)))

(defn full-width
  ^js [jsx-attributes]
  (.getFullWidth ^js jsx-attributes))

(defn leading-trivia-width
  (^js [jsx-attributes]
   (.getLeadingTriviaWidth ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getLeadingTriviaWidth ^js jsx-attributes source-file)))

(defn full-text
  (^js [jsx-attributes]
   (.getFullText ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getFullText ^js jsx-attributes source-file)))

(defn text
  (^js [jsx-attributes]
   (.getText ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getText ^js jsx-attributes source-file)))

(defn first-token
  (^js [jsx-attributes]
   (.getFirstToken ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getFirstToken ^js jsx-attributes source-file)))

(defn last-token
  (^js [jsx-attributes]
   (.getLastToken ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getLastToken ^js jsx-attributes source-file)))

(defn for-each-child
  (^js [jsx-attributes cb-node]
   (.forEachChild ^js jsx-attributes cb-node))
  (^js [jsx-attributes cb-node cb-node-array]
   (.forEachChild ^js jsx-attributes cb-node cb-node-array)))

(defn pos
  ^js [jsx-attributes]
  (.-pos ^js jsx-attributes))

(defn end
  ^js [jsx-attributes]
  (.-end ^js jsx-attributes))
