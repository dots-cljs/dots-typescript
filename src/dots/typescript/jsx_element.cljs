(ns dots.typescript.jsx-element)

(defn kind
  ^js [jsx-element]
  (.-kind ^js jsx-element))

(defn opening-element
  ^js [jsx-element]
  (.-openingElement ^js jsx-element))

(defn children
  ^js [jsx-element]
  (.-children ^js jsx-element))

(defn closing-element
  ^js [jsx-element]
  (.-closingElement ^js jsx-element))

(defn flags
  ^js [jsx-element]
  (.-flags ^js jsx-element))

(defn parent
  ^js [jsx-element]
  (.-parent ^js jsx-element))

(defn source-file
  ^js [jsx-element]
  (.getSourceFile ^js jsx-element))

(defn child-count
  (^js [jsx-element]
   (.getChildCount ^js jsx-element))
  (^js [jsx-element source-file]
   (.getChildCount ^js jsx-element source-file)))

(defn child-at
  (^js [jsx-element index]
   (.getChildAt ^js jsx-element index))
  (^js [jsx-element index source-file]
   (.getChildAt ^js jsx-element index source-file)))

(defn get-children
  (^js [jsx-element]
   (.getChildren ^js jsx-element))
  (^js [jsx-element source-file]
   (.getChildren ^js jsx-element source-file)))

(defn start
  (^js [jsx-element]
   (.getStart ^js jsx-element))
  (^js [jsx-element source-file]
   (.getStart ^js jsx-element source-file))
  (^js [jsx-element source-file include-js-doc-comment?]
   (.getStart ^js jsx-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-element]
  (.getFullStart ^js jsx-element))

(defn get-end
  ^js [jsx-element]
  (.getEnd ^js jsx-element))

(defn width
  (^js [jsx-element]
   (.getWidth ^js jsx-element))
  (^js [jsx-element source-file]
   (.getWidth ^js jsx-element source-file)))

(defn full-width
  ^js [jsx-element]
  (.getFullWidth ^js jsx-element))

(defn leading-trivia-width
  (^js [jsx-element]
   (.getLeadingTriviaWidth ^js jsx-element))
  (^js [jsx-element source-file]
   (.getLeadingTriviaWidth ^js jsx-element source-file)))

(defn full-text
  (^js [jsx-element]
   (.getFullText ^js jsx-element))
  (^js [jsx-element source-file]
   (.getFullText ^js jsx-element source-file)))

(defn text
  (^js [jsx-element]
   (.getText ^js jsx-element))
  (^js [jsx-element source-file]
   (.getText ^js jsx-element source-file)))

(defn first-token
  (^js [jsx-element]
   (.getFirstToken ^js jsx-element))
  (^js [jsx-element source-file]
   (.getFirstToken ^js jsx-element source-file)))

(defn last-token
  (^js [jsx-element]
   (.getLastToken ^js jsx-element))
  (^js [jsx-element source-file]
   (.getLastToken ^js jsx-element source-file)))

(defn for-each-child
  (^js [jsx-element cb-node]
   (.forEachChild ^js jsx-element cb-node))
  (^js [jsx-element cb-node cb-node-array]
   (.forEachChild ^js jsx-element cb-node cb-node-array)))

(defn pos
  ^js [jsx-element]
  (.-pos ^js jsx-element))

(defn end
  ^js [jsx-element]
  (.-end ^js jsx-element))
