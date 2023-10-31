(ns dots.typescript.jsx-opening-element)

(defn kind
  ^js [jsx-opening-element]
  (.-kind ^js jsx-opening-element))

(defn parent
  ^js [jsx-opening-element]
  (.-parent ^js jsx-opening-element))

(defn tag-name
  ^js [jsx-opening-element]
  (.-tagName ^js jsx-opening-element))

(defn type-arguments
  ^js [jsx-opening-element]
  (.-typeArguments ^js jsx-opening-element))

(defn attributes
  ^js [jsx-opening-element]
  (.-attributes ^js jsx-opening-element))

(defn flags
  ^js [jsx-opening-element]
  (.-flags ^js jsx-opening-element))

(defn source-file
  ^js [jsx-opening-element]
  (.getSourceFile ^js jsx-opening-element))

(defn child-count
  (^js [jsx-opening-element]
   (.getChildCount ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getChildCount ^js jsx-opening-element source-file)))

(defn child-at
  (^js [jsx-opening-element index]
   (.getChildAt ^js jsx-opening-element index))
  (^js [jsx-opening-element index source-file]
   (.getChildAt ^js jsx-opening-element index source-file)))

(defn children
  (^js [jsx-opening-element]
   (.getChildren ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getChildren ^js jsx-opening-element source-file)))

(defn start
  (^js [jsx-opening-element]
   (.getStart ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getStart ^js jsx-opening-element source-file))
  (^js [jsx-opening-element source-file include-js-doc-comment?]
   (.getStart ^js jsx-opening-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-opening-element]
  (.getFullStart ^js jsx-opening-element))

(defn get-end
  ^js [jsx-opening-element]
  (.getEnd ^js jsx-opening-element))

(defn width
  (^js [jsx-opening-element]
   (.getWidth ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getWidth ^js jsx-opening-element source-file)))

(defn full-width
  ^js [jsx-opening-element]
  (.getFullWidth ^js jsx-opening-element))

(defn leading-trivia-width
  (^js [jsx-opening-element]
   (.getLeadingTriviaWidth ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getLeadingTriviaWidth ^js jsx-opening-element source-file)))

(defn full-text
  (^js [jsx-opening-element]
   (.getFullText ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getFullText ^js jsx-opening-element source-file)))

(defn text
  (^js [jsx-opening-element]
   (.getText ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getText ^js jsx-opening-element source-file)))

(defn first-token
  (^js [jsx-opening-element]
   (.getFirstToken ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getFirstToken ^js jsx-opening-element source-file)))

(defn last-token
  (^js [jsx-opening-element]
   (.getLastToken ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getLastToken ^js jsx-opening-element source-file)))

(defn for-each-child
  (^js [jsx-opening-element cb-node]
   (.forEachChild ^js jsx-opening-element cb-node))
  (^js [jsx-opening-element cb-node cb-node-array]
   (.forEachChild ^js jsx-opening-element cb-node cb-node-array)))

(defn decorators
  ^js [jsx-opening-element]
  (.-decorators ^js jsx-opening-element))

(defn modifiers
  ^js [jsx-opening-element]
  (.-modifiers ^js jsx-opening-element))

(defn pos
  ^js [jsx-opening-element]
  (.-pos ^js jsx-opening-element))

(defn end
  ^js [jsx-opening-element]
  (.-end ^js jsx-opening-element))
