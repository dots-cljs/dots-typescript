(ns dots.typescript.property-like-declaration
  (:refer-clojure :exclude [name]))

(defn name
  ^js [property-like-declaration]
  (.-name ^js property-like-declaration))

(defn kind
  ^js [property-like-declaration]
  (.-kind ^js property-like-declaration))

(defn flags
  ^js [property-like-declaration]
  (.-flags ^js property-like-declaration))

(defn parent
  ^js [property-like-declaration]
  (.-parent ^js property-like-declaration))

(defn source-file
  ^js [property-like-declaration]
  (.getSourceFile ^js property-like-declaration))

(defn child-count
  (^js [property-like-declaration]
   (.getChildCount ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getChildCount ^js property-like-declaration source-file)))

(defn child-at
  (^js [property-like-declaration index]
   (.getChildAt ^js property-like-declaration index))
  (^js [property-like-declaration index source-file]
   (.getChildAt ^js property-like-declaration index source-file)))

(defn children
  (^js [property-like-declaration]
   (.getChildren ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getChildren ^js property-like-declaration source-file)))

(defn start
  (^js [property-like-declaration]
   (.getStart ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getStart ^js property-like-declaration source-file))
  (^js [property-like-declaration source-file include-js-doc-comment?]
   (.getStart ^js property-like-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [property-like-declaration]
  (.getFullStart ^js property-like-declaration))

(defn get-end
  ^js [property-like-declaration]
  (.getEnd ^js property-like-declaration))

(defn width
  (^js [property-like-declaration]
   (.getWidth ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getWidth ^js property-like-declaration source-file)))

(defn full-width
  ^js [property-like-declaration]
  (.getFullWidth ^js property-like-declaration))

(defn leading-trivia-width
  (^js [property-like-declaration]
   (.getLeadingTriviaWidth ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getLeadingTriviaWidth ^js property-like-declaration source-file)))

(defn full-text
  (^js [property-like-declaration]
   (.getFullText ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getFullText ^js property-like-declaration source-file)))

(defn text
  (^js [property-like-declaration]
   (.getText ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getText ^js property-like-declaration source-file)))

(defn first-token
  (^js [property-like-declaration]
   (.getFirstToken ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getFirstToken ^js property-like-declaration source-file)))

(defn last-token
  (^js [property-like-declaration]
   (.getLastToken ^js property-like-declaration))
  (^js [property-like-declaration source-file]
   (.getLastToken ^js property-like-declaration source-file)))

(defn for-each-child
  (^js [property-like-declaration cb-node]
   (.forEachChild ^js property-like-declaration cb-node))
  (^js [property-like-declaration cb-node cb-node-array]
   (.forEachChild ^js property-like-declaration cb-node cb-node-array)))

(defn decorators
  ^js [property-like-declaration]
  (.-decorators ^js property-like-declaration))

(defn modifiers
  ^js [property-like-declaration]
  (.-modifiers ^js property-like-declaration))

(defn pos
  ^js [property-like-declaration]
  (.-pos ^js property-like-declaration))

(defn end
  ^js [property-like-declaration]
  (.-end ^js property-like-declaration))
