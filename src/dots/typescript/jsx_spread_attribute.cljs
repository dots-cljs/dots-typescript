(ns dots.typescript.jsx-spread-attribute
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [jsx-spread-attribute]
  (.-kind ^js jsx-spread-attribute))

(defn parent
  ^js [jsx-spread-attribute]
  (.-parent ^js jsx-spread-attribute))

(defn expression
  ^js [jsx-spread-attribute]
  (.-expression ^js jsx-spread-attribute))

(defn name
  ^js [jsx-spread-attribute]
  (.-name ^js jsx-spread-attribute))

(defn flags
  ^js [jsx-spread-attribute]
  (.-flags ^js jsx-spread-attribute))

(defn source-file
  ^js [jsx-spread-attribute]
  (.getSourceFile ^js jsx-spread-attribute))

(defn child-count
  (^js [jsx-spread-attribute]
   (.getChildCount ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getChildCount ^js jsx-spread-attribute source-file)))

(defn child-at
  (^js [jsx-spread-attribute index]
   (.getChildAt ^js jsx-spread-attribute index))
  (^js [jsx-spread-attribute index source-file]
   (.getChildAt ^js jsx-spread-attribute index source-file)))

(defn children
  (^js [jsx-spread-attribute]
   (.getChildren ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getChildren ^js jsx-spread-attribute source-file)))

(defn start
  (^js [jsx-spread-attribute]
   (.getStart ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getStart ^js jsx-spread-attribute source-file))
  (^js [jsx-spread-attribute source-file include-js-doc-comment?]
   (.getStart ^js jsx-spread-attribute source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-spread-attribute]
  (.getFullStart ^js jsx-spread-attribute))

(defn get-end
  ^js [jsx-spread-attribute]
  (.getEnd ^js jsx-spread-attribute))

(defn width
  (^js [jsx-spread-attribute]
   (.getWidth ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getWidth ^js jsx-spread-attribute source-file)))

(defn full-width
  ^js [jsx-spread-attribute]
  (.getFullWidth ^js jsx-spread-attribute))

(defn leading-trivia-width
  (^js [jsx-spread-attribute]
   (.getLeadingTriviaWidth ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getLeadingTriviaWidth ^js jsx-spread-attribute source-file)))

(defn full-text
  (^js [jsx-spread-attribute]
   (.getFullText ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getFullText ^js jsx-spread-attribute source-file)))

(defn text
  (^js [jsx-spread-attribute]
   (.getText ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getText ^js jsx-spread-attribute source-file)))

(defn first-token
  (^js [jsx-spread-attribute]
   (.getFirstToken ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getFirstToken ^js jsx-spread-attribute source-file)))

(defn last-token
  (^js [jsx-spread-attribute]
   (.getLastToken ^js jsx-spread-attribute))
  (^js [jsx-spread-attribute source-file]
   (.getLastToken ^js jsx-spread-attribute source-file)))

(defn for-each-child
  (^js [jsx-spread-attribute cb-node]
   (.forEachChild ^js jsx-spread-attribute cb-node))
  (^js [jsx-spread-attribute cb-node cb-node-array]
   (.forEachChild ^js jsx-spread-attribute cb-node cb-node-array)))

(defn pos
  ^js [jsx-spread-attribute]
  (.-pos ^js jsx-spread-attribute))

(defn end
  ^js [jsx-spread-attribute]
  (.-end ^js jsx-spread-attribute))
