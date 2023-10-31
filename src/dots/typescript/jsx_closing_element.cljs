(ns dots.typescript.jsx-closing-element)

(defn kind
  ^js [jsx-closing-element]
  (.-kind ^js jsx-closing-element))

(defn parent
  ^js [jsx-closing-element]
  (.-parent ^js jsx-closing-element))

(defn tag-name
  ^js [jsx-closing-element]
  (.-tagName ^js jsx-closing-element))

(defn flags
  ^js [jsx-closing-element]
  (.-flags ^js jsx-closing-element))

(defn source-file
  ^js [jsx-closing-element]
  (.getSourceFile ^js jsx-closing-element))

(defn child-count
  (^js [jsx-closing-element]
   (.getChildCount ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getChildCount ^js jsx-closing-element source-file)))

(defn child-at
  (^js [jsx-closing-element index]
   (.getChildAt ^js jsx-closing-element index))
  (^js [jsx-closing-element index source-file]
   (.getChildAt ^js jsx-closing-element index source-file)))

(defn children
  (^js [jsx-closing-element]
   (.getChildren ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getChildren ^js jsx-closing-element source-file)))

(defn start
  (^js [jsx-closing-element]
   (.getStart ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getStart ^js jsx-closing-element source-file))
  (^js [jsx-closing-element source-file include-js-doc-comment?]
   (.getStart ^js jsx-closing-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-closing-element]
  (.getFullStart ^js jsx-closing-element))

(defn get-end
  ^js [jsx-closing-element]
  (.getEnd ^js jsx-closing-element))

(defn width
  (^js [jsx-closing-element]
   (.getWidth ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getWidth ^js jsx-closing-element source-file)))

(defn full-width
  ^js [jsx-closing-element]
  (.getFullWidth ^js jsx-closing-element))

(defn leading-trivia-width
  (^js [jsx-closing-element]
   (.getLeadingTriviaWidth ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getLeadingTriviaWidth ^js jsx-closing-element source-file)))

(defn full-text
  (^js [jsx-closing-element]
   (.getFullText ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getFullText ^js jsx-closing-element source-file)))

(defn text
  (^js [jsx-closing-element]
   (.getText ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getText ^js jsx-closing-element source-file)))

(defn first-token
  (^js [jsx-closing-element]
   (.getFirstToken ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getFirstToken ^js jsx-closing-element source-file)))

(defn last-token
  (^js [jsx-closing-element]
   (.getLastToken ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getLastToken ^js jsx-closing-element source-file)))

(defn for-each-child
  (^js [jsx-closing-element cb-node]
   (.forEachChild ^js jsx-closing-element cb-node))
  (^js [jsx-closing-element cb-node cb-node-array]
   (.forEachChild ^js jsx-closing-element cb-node cb-node-array)))

(defn decorators
  ^js [jsx-closing-element]
  (.-decorators ^js jsx-closing-element))

(defn modifiers
  ^js [jsx-closing-element]
  (.-modifiers ^js jsx-closing-element))

(defn pos
  ^js [jsx-closing-element]
  (.-pos ^js jsx-closing-element))

(defn end
  ^js [jsx-closing-element]
  (.-end ^js jsx-closing-element))
