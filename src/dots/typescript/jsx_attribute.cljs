(ns dots.typescript.jsx-attribute
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [jsx-attribute]
  (.-kind ^js jsx-attribute))

(defn parent
  ^js [jsx-attribute]
  (.-parent ^js jsx-attribute))

(defn name
  ^js [jsx-attribute]
  (.-name ^js jsx-attribute))

(defn initializer
  ^js [jsx-attribute]
  (.-initializer ^js jsx-attribute))

(defn flags
  ^js [jsx-attribute]
  (.-flags ^js jsx-attribute))

(defn source-file
  ^js [jsx-attribute]
  (.getSourceFile ^js jsx-attribute))

(defn child-count
  (^js [jsx-attribute]
   (.getChildCount ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getChildCount ^js jsx-attribute source-file)))

(defn child-at
  (^js [jsx-attribute index]
   (.getChildAt ^js jsx-attribute index))
  (^js [jsx-attribute index source-file]
   (.getChildAt ^js jsx-attribute index source-file)))

(defn children
  (^js [jsx-attribute]
   (.getChildren ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getChildren ^js jsx-attribute source-file)))

(defn start
  (^js [jsx-attribute]
   (.getStart ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getStart ^js jsx-attribute source-file))
  (^js [jsx-attribute source-file include-js-doc-comment?]
   (.getStart ^js jsx-attribute source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-attribute]
  (.getFullStart ^js jsx-attribute))

(defn get-end
  ^js [jsx-attribute]
  (.getEnd ^js jsx-attribute))

(defn width
  (^js [jsx-attribute]
   (.getWidth ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getWidth ^js jsx-attribute source-file)))

(defn full-width
  ^js [jsx-attribute]
  (.getFullWidth ^js jsx-attribute))

(defn leading-trivia-width
  (^js [jsx-attribute]
   (.getLeadingTriviaWidth ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getLeadingTriviaWidth ^js jsx-attribute source-file)))

(defn full-text
  (^js [jsx-attribute]
   (.getFullText ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getFullText ^js jsx-attribute source-file)))

(defn text
  (^js [jsx-attribute]
   (.getText ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getText ^js jsx-attribute source-file)))

(defn first-token
  (^js [jsx-attribute]
   (.getFirstToken ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getFirstToken ^js jsx-attribute source-file)))

(defn last-token
  (^js [jsx-attribute]
   (.getLastToken ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getLastToken ^js jsx-attribute source-file)))

(defn for-each-child
  (^js [jsx-attribute cb-node]
   (.forEachChild ^js jsx-attribute cb-node))
  (^js [jsx-attribute cb-node cb-node-array]
   (.forEachChild ^js jsx-attribute cb-node cb-node-array)))

(defn decorators
  ^js [jsx-attribute]
  (.-decorators ^js jsx-attribute))

(defn modifiers
  ^js [jsx-attribute]
  (.-modifiers ^js jsx-attribute))

(defn pos
  ^js [jsx-attribute]
  (.-pos ^js jsx-attribute))

(defn end
  ^js [jsx-attribute]
  (.-end ^js jsx-attribute))
