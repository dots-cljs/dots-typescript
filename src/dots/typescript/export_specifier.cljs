(ns dots.typescript.export-specifier
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [export-specifier]
  (.-kind ^js export-specifier))

(defn parent
  ^js [export-specifier]
  (.-parent ^js export-specifier))

(defn type-only?
  ^js [export-specifier]
  (.-isTypeOnly ^js export-specifier))

(defn property-name
  ^js [export-specifier]
  (.-propertyName ^js export-specifier))

(defn name
  ^js [export-specifier]
  (.-name ^js export-specifier))

(defn flags
  ^js [export-specifier]
  (.-flags ^js export-specifier))

(defn source-file
  ^js [export-specifier]
  (.getSourceFile ^js export-specifier))

(defn child-count
  (^js [export-specifier]
   (.getChildCount ^js export-specifier))
  (^js [export-specifier source-file]
   (.getChildCount ^js export-specifier source-file)))

(defn child-at
  (^js [export-specifier index]
   (.getChildAt ^js export-specifier index))
  (^js [export-specifier index source-file]
   (.getChildAt ^js export-specifier index source-file)))

(defn children
  (^js [export-specifier]
   (.getChildren ^js export-specifier))
  (^js [export-specifier source-file]
   (.getChildren ^js export-specifier source-file)))

(defn start
  (^js [export-specifier]
   (.getStart ^js export-specifier))
  (^js [export-specifier source-file]
   (.getStart ^js export-specifier source-file))
  (^js [export-specifier source-file include-js-doc-comment?]
   (.getStart ^js export-specifier source-file include-js-doc-comment?)))

(defn full-start
  ^js [export-specifier]
  (.getFullStart ^js export-specifier))

(defn get-end
  ^js [export-specifier]
  (.getEnd ^js export-specifier))

(defn width
  (^js [export-specifier]
   (.getWidth ^js export-specifier))
  (^js [export-specifier source-file]
   (.getWidth ^js export-specifier source-file)))

(defn full-width
  ^js [export-specifier]
  (.getFullWidth ^js export-specifier))

(defn leading-trivia-width
  (^js [export-specifier]
   (.getLeadingTriviaWidth ^js export-specifier))
  (^js [export-specifier source-file]
   (.getLeadingTriviaWidth ^js export-specifier source-file)))

(defn full-text
  (^js [export-specifier]
   (.getFullText ^js export-specifier))
  (^js [export-specifier source-file]
   (.getFullText ^js export-specifier source-file)))

(defn text
  (^js [export-specifier]
   (.getText ^js export-specifier))
  (^js [export-specifier source-file]
   (.getText ^js export-specifier source-file)))

(defn first-token
  (^js [export-specifier]
   (.getFirstToken ^js export-specifier))
  (^js [export-specifier source-file]
   (.getFirstToken ^js export-specifier source-file)))

(defn last-token
  (^js [export-specifier]
   (.getLastToken ^js export-specifier))
  (^js [export-specifier source-file]
   (.getLastToken ^js export-specifier source-file)))

(defn for-each-child
  (^js [export-specifier cb-node]
   (.forEachChild ^js export-specifier cb-node))
  (^js [export-specifier cb-node cb-node-array]
   (.forEachChild ^js export-specifier cb-node cb-node-array)))

(defn decorators
  ^js [export-specifier]
  (.-decorators ^js export-specifier))

(defn modifiers
  ^js [export-specifier]
  (.-modifiers ^js export-specifier))

(defn pos
  ^js [export-specifier]
  (.-pos ^js export-specifier))

(defn end
  ^js [export-specifier]
  (.-end ^js export-specifier))
