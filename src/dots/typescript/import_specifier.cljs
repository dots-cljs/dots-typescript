(ns dots.typescript.import-specifier
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [import-specifier]
  (.-kind ^js import-specifier))

(defn parent
  ^js [import-specifier]
  (.-parent ^js import-specifier))

(defn property-name
  ^js [import-specifier]
  (.-propertyName ^js import-specifier))

(defn name
  ^js [import-specifier]
  (.-name ^js import-specifier))

(defn type-only?
  ^js [import-specifier]
  (.-isTypeOnly ^js import-specifier))

(defn flags
  ^js [import-specifier]
  (.-flags ^js import-specifier))

(defn source-file
  ^js [import-specifier]
  (.getSourceFile ^js import-specifier))

(defn child-count
  (^js [import-specifier]
   (.getChildCount ^js import-specifier))
  (^js [import-specifier source-file]
   (.getChildCount ^js import-specifier source-file)))

(defn child-at
  (^js [import-specifier index]
   (.getChildAt ^js import-specifier index))
  (^js [import-specifier index source-file]
   (.getChildAt ^js import-specifier index source-file)))

(defn children
  (^js [import-specifier]
   (.getChildren ^js import-specifier))
  (^js [import-specifier source-file]
   (.getChildren ^js import-specifier source-file)))

(defn start
  (^js [import-specifier]
   (.getStart ^js import-specifier))
  (^js [import-specifier source-file]
   (.getStart ^js import-specifier source-file))
  (^js [import-specifier source-file include-js-doc-comment?]
   (.getStart ^js import-specifier source-file include-js-doc-comment?)))

(defn full-start
  ^js [import-specifier]
  (.getFullStart ^js import-specifier))

(defn get-end
  ^js [import-specifier]
  (.getEnd ^js import-specifier))

(defn width
  (^js [import-specifier]
   (.getWidth ^js import-specifier))
  (^js [import-specifier source-file]
   (.getWidth ^js import-specifier source-file)))

(defn full-width
  ^js [import-specifier]
  (.getFullWidth ^js import-specifier))

(defn leading-trivia-width
  (^js [import-specifier]
   (.getLeadingTriviaWidth ^js import-specifier))
  (^js [import-specifier source-file]
   (.getLeadingTriviaWidth ^js import-specifier source-file)))

(defn full-text
  (^js [import-specifier]
   (.getFullText ^js import-specifier))
  (^js [import-specifier source-file]
   (.getFullText ^js import-specifier source-file)))

(defn text
  (^js [import-specifier]
   (.getText ^js import-specifier))
  (^js [import-specifier source-file]
   (.getText ^js import-specifier source-file)))

(defn first-token
  (^js [import-specifier]
   (.getFirstToken ^js import-specifier))
  (^js [import-specifier source-file]
   (.getFirstToken ^js import-specifier source-file)))

(defn last-token
  (^js [import-specifier]
   (.getLastToken ^js import-specifier))
  (^js [import-specifier source-file]
   (.getLastToken ^js import-specifier source-file)))

(defn for-each-child
  (^js [import-specifier cb-node]
   (.forEachChild ^js import-specifier cb-node))
  (^js [import-specifier cb-node cb-node-array]
   (.forEachChild ^js import-specifier cb-node cb-node-array)))

(defn decorators
  ^js [import-specifier]
  (.-decorators ^js import-specifier))

(defn modifiers
  ^js [import-specifier]
  (.-modifiers ^js import-specifier))

(defn pos
  ^js [import-specifier]
  (.-pos ^js import-specifier))

(defn end
  ^js [import-specifier]
  (.-end ^js import-specifier))
