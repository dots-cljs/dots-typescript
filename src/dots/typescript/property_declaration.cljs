(ns dots.typescript.property-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [property-declaration]
  (.-kind ^js property-declaration))

(defn parent
  ^js [property-declaration]
  (.-parent ^js property-declaration))

(defn modifiers
  ^js [property-declaration]
  (.-modifiers ^js property-declaration))

(defn name
  ^js [property-declaration]
  (.-name ^js property-declaration))

(defn question-token
  ^js [property-declaration]
  (.-questionToken ^js property-declaration))

(defn exclamation-token
  ^js [property-declaration]
  (.-exclamationToken ^js property-declaration))

(defn type
  ^js [property-declaration]
  (.-type ^js property-declaration))

(defn initializer
  ^js [property-declaration]
  (.-initializer ^js property-declaration))

(defn flags
  ^js [property-declaration]
  (.-flags ^js property-declaration))

(defn source-file
  ^js [property-declaration]
  (.getSourceFile ^js property-declaration))

(defn child-count
  (^js [property-declaration]
   (.getChildCount ^js property-declaration))
  (^js [property-declaration source-file]
   (.getChildCount ^js property-declaration source-file)))

(defn child-at
  (^js [property-declaration index]
   (.getChildAt ^js property-declaration index))
  (^js [property-declaration index source-file]
   (.getChildAt ^js property-declaration index source-file)))

(defn children
  (^js [property-declaration]
   (.getChildren ^js property-declaration))
  (^js [property-declaration source-file]
   (.getChildren ^js property-declaration source-file)))

(defn start
  (^js [property-declaration]
   (.getStart ^js property-declaration))
  (^js [property-declaration source-file]
   (.getStart ^js property-declaration source-file))
  (^js [property-declaration source-file include-js-doc-comment?]
   (.getStart ^js property-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [property-declaration]
  (.getFullStart ^js property-declaration))

(defn get-end
  ^js [property-declaration]
  (.getEnd ^js property-declaration))

(defn width
  (^js [property-declaration]
   (.getWidth ^js property-declaration))
  (^js [property-declaration source-file]
   (.getWidth ^js property-declaration source-file)))

(defn full-width
  ^js [property-declaration]
  (.getFullWidth ^js property-declaration))

(defn leading-trivia-width
  (^js [property-declaration]
   (.getLeadingTriviaWidth ^js property-declaration))
  (^js [property-declaration source-file]
   (.getLeadingTriviaWidth ^js property-declaration source-file)))

(defn full-text
  (^js [property-declaration]
   (.getFullText ^js property-declaration))
  (^js [property-declaration source-file]
   (.getFullText ^js property-declaration source-file)))

(defn text
  (^js [property-declaration]
   (.getText ^js property-declaration))
  (^js [property-declaration source-file]
   (.getText ^js property-declaration source-file)))

(defn first-token
  (^js [property-declaration]
   (.getFirstToken ^js property-declaration))
  (^js [property-declaration source-file]
   (.getFirstToken ^js property-declaration source-file)))

(defn last-token
  (^js [property-declaration]
   (.getLastToken ^js property-declaration))
  (^js [property-declaration source-file]
   (.getLastToken ^js property-declaration source-file)))

(defn for-each-child
  (^js [property-declaration cb-node]
   (.forEachChild ^js property-declaration cb-node))
  (^js [property-declaration cb-node cb-node-array]
   (.forEachChild ^js property-declaration cb-node cb-node-array)))

(defn pos
  ^js [property-declaration]
  (.-pos ^js property-declaration))

(defn end
  ^js [property-declaration]
  (.-end ^js property-declaration))
